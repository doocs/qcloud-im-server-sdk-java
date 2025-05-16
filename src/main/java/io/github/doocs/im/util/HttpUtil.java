package io.github.doocs.im.util;

import io.github.doocs.im.ClientConfiguration;
import io.github.doocs.im.model.response.BaseGenericResult;
import io.github.doocs.im.model.response.GenericResult;
import okhttp3.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * HTTP 工具类
 *
 * @author bingo
 * @since 2021/10/31 15:57
 */
public class HttpUtil {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private static final String USER_AGENT_KEY = "User-Agent";
    private static final ClientConfiguration DEFAULT_CONFIG = new ClientConfiguration();
    private static final String DEFAULT_USER_AGENT = DEFAULT_CONFIG.getUserAgent();
    private static final Map<ClientConfiguration, OkHttpClient> CLIENT_CACHE = new ConcurrentHashMap<>();

    private static final OkHttpClient DEFAULT_CLIENT = new OkHttpClient.Builder()
            .connectionPool(DEFAULT_CONFIG.getConnectionPool())
            .connectTimeout(DEFAULT_CONFIG.getConnectTimeout(), TimeUnit.MILLISECONDS)
            .readTimeout(DEFAULT_CONFIG.getReadTimeout(), TimeUnit.MILLISECONDS)
            .writeTimeout(DEFAULT_CONFIG.getWriteTimeout(), TimeUnit.MILLISECONDS)
            .callTimeout(DEFAULT_CONFIG.getCallTimeout(), TimeUnit.MILLISECONDS)
            .retryOnConnectionFailure(false)
            .addInterceptor(new RetryInterceptor(DEFAULT_CONFIG.getMaxRetries(), DEFAULT_CONFIG.getRetryIntervalMs(), DEFAULT_CONFIG.getBusinessRetryCodes(), DEFAULT_CONFIG.isEnableBusinessRetry(), BaseGenericResult.class))
            .build();

    private HttpUtil() {

    }

    public static String post(String url, String json, ClientConfiguration config) throws IOException {
        OkHttpClient httpClient = getClient(config);
        Map<String, String> headers = new HashMap<>(2);
        boolean emptyAgent = Objects.isNull(config) || Objects.isNull(config.getUserAgent());
        headers.put(USER_AGENT_KEY, emptyAgent ? DEFAULT_USER_AGENT : config.getUserAgent());
        return post(url, json, httpClient, headers);
    }

    private static OkHttpClient getClient(ClientConfiguration config) {
        if (config == null) {
            return DEFAULT_CLIENT;
        }

        return CLIENT_CACHE.computeIfAbsent(config, cfg -> new OkHttpClient.Builder()
                .connectionPool(cfg.getConnectionPool())
                .connectTimeout(cfg.getConnectTimeout(), TimeUnit.MILLISECONDS)
                .readTimeout(cfg.getReadTimeout(), TimeUnit.MILLISECONDS)
                .writeTimeout(cfg.getWriteTimeout(), TimeUnit.MILLISECONDS)
                .callTimeout(cfg.getCallTimeout(), TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(false)
                .addInterceptor(new RetryInterceptor(cfg.getMaxRetries(), cfg.getRetryIntervalMs(), cfg.getBusinessRetryCodes(), cfg.isEnableBusinessRetry(), BaseGenericResult.class))
                .build());
    }

    public static String post(String url, String json, OkHttpClient httpClient, Map<String, String> headers) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Headers.Builder hb = new Headers.Builder();
        if (headers != null && !headers.isEmpty()) {
            headers.forEach(hb::add);
        }
        Request request = new Request.Builder()
                .url(url)
                .headers(hb.build())
                .post(body)
                .build();
        try (Response response = httpClient.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    public static <T> T post(String url, Object data, Class<T> cls, ClientConfiguration config) throws IOException {
        String result = post(url, JsonUtil.obj2Str(data), config);
        return JsonUtil.str2Obj(result, cls);
    }

    public static <T> T post(String url, Object data, Class<T> cls) throws IOException {
        return post(url, data, cls, null);
    }

    public static String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = DEFAULT_CLIENT.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }
}

class RetryInterceptor implements Interceptor {
    private static final Set<Integer> RETRYABLE_STATUS_CODES = Collections.unmodifiableSet(
            Stream.of(408, 429, 500, 502, 503, 504).collect(Collectors.toSet())
    );
    private static final int MAX_DELAY_MS = 10000;
    private static final int MAX_BODY_SIZE = 1024 * 1024;
    private final int maxRetries;
    private final long retryIntervalMs;
    private final Set<Integer> businessRetryCodes;
    private final boolean enableBusinessRetry;
    private final Class<? extends GenericResult> resultType;
    private final Random random = new Random();

    public RetryInterceptor(int maxRetries, long retryIntervalMs, Set<Integer> businessRetryCodes, boolean enableBusinessRetry, Class<? extends GenericResult> resultType) {
        this.maxRetries = maxRetries + 1;
        this.retryIntervalMs = retryIntervalMs;
        this.businessRetryCodes = businessRetryCodes;
        this.enableBusinessRetry = enableBusinessRetry;
        this.resultType = Objects.requireNonNull(resultType);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = null;
        IOException exception = null;
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            if (response != null)
                response.close();
            try {
                response = chain.proceed(request);
                if (response.isSuccessful()) {
                    if (shouldRetryForBusiness(response)) {
                        waitForRetry(attempt);
                        continue;
                    }
                    return response;
                } else {
                    if (shouldRetryForHttp(response)) {
                        waitForRetry(attempt);
                        continue;
                    }
                    return response;
                }
            } catch (IOException e) {
                exception = e;
                if (attempt == maxRetries) throw e;
                waitForRetry(attempt);
            }
        }

        if (exception != null) {
            throw exception;
        }
        if (response != null) {
            return response;
        }
        throw new IOException("Failed after all retries with no response");
    }

    private boolean shouldRetryForHttp(Response response) {
        int code = response.code();
        return code >= 500 || RETRYABLE_STATUS_CODES.contains(code);
    }

    private void waitForRetry(int attempt) throws IOException {
        try {
            long delay = calculateBackoff(attempt);
            TimeUnit.MILLISECONDS.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Retry interrupted", e);
        }
    }

    private long calculateBackoff(int attempt) {
        double jitter = 0.8 + random.nextDouble() * 0.4;
        long calculated = (long) (retryIntervalMs * Math.pow(2, attempt) * jitter);
        return Math.min(calculated, MAX_DELAY_MS);
    }

    private boolean shouldRetryForBusiness(Response response) {
        if (!enableBusinessRetry) {
            return false;
        }
        if (businessRetryCodes == null || businessRetryCodes.isEmpty()) {
            return false;
        }
        try {
            ResponseBody peekBody = response.peekBody(MAX_BODY_SIZE);
            String responseBody = peekBody.source().readByteString().utf8();
            GenericResult result = JsonUtil.str2Obj(responseBody, resultType);
            if (result == null || result.getErrorCode() == null) {
                return false;
            }
            return businessRetryCodes.contains(result.getErrorCode());
        } catch (Exception e) {
            return false;
        }
    }
}
