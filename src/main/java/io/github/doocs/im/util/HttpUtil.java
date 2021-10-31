package io.github.doocs.im.util;

import okhttp3.*;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author bingo
 * @since 2021/10/31 15:57
 */
public class HttpUtil {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private static final OkHttpClient DEFAULT_CLIENT = new OkHttpClient.Builder()
            .retryOnConnectionFailure(true)
            .connectTimeout(1000, TimeUnit.MICROSECONDS)
            .readTimeout(1000, TimeUnit.MILLISECONDS)
            .writeTimeout(1000, TimeUnit.MILLISECONDS)
            .build();

    private HttpUtil() {

    }

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = DEFAULT_CLIENT.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    public static String post(String url, Object data) throws IOException {
        return post(url, JsonUtil.obj2Str(data));
    }

    public static <T> T post(String url, Object data, Class<T> cls) throws IOException {
        String result = post(url, JsonUtil.obj2Str(data));
        return JsonUtil.str2Obj(result, cls);
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
