package io.github.doocs.im.util;

import io.github.doocs.im.model.response.BaseGenericResult;
import okhttp3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

public class RetryInterceptorTest {

    private RetryInterceptor interceptor;
    private TestChain testChain;
    private Request request;

    @BeforeEach
    public void setup() {
        // Use virtual URL
        request = new Request.Builder()
                .url("http://example.com")
                .build();

        interceptor = new RetryInterceptor(
                2, 1000,
                Collections.unmodifiableSet(new java.util.HashSet<Integer>() {{
                    add(10002);
                    add(20004);
                    add(20005);
                }}),
                true,
                BaseGenericResult.class
        );

        // Constructor using default timeout parameter
        testChain = new TestChain(request);
    }

    // Custom Test Chain Implementation
    private static class TestChain implements Interceptor.Chain {
        private final Request request;
        private final AtomicInteger callCount = new AtomicInteger(0);
        private final java.util.function.IntFunction<Response> responseSupplier;
        private final java.util.function.IntFunction<IOException> exceptionSupplier;
        private final int connectTimeoutMs;
        private final int readTimeoutMs;

        public TestChain(Request request) {
            this(request, i -> null, i -> null, 10000, 10000);
        }

        public TestChain(Request request,
                         java.util.function.IntFunction<Response> responseSupplier,
                         java.util.function.IntFunction<IOException> exceptionSupplier,
                         int connectTimeoutMs,
                         int readTimeoutMs) {
            this.request = request;
            this.responseSupplier = responseSupplier;
            this.exceptionSupplier = exceptionSupplier;
            this.connectTimeoutMs = connectTimeoutMs;
            this.readTimeoutMs = readTimeoutMs;
        }

        @Override
        public Request request() {
            return request;
        }

        @Override
        public Response proceed(Request request) throws IOException {
            int count = callCount.incrementAndGet();
            IOException exception = exceptionSupplier.apply(count);
            if (exception != null) {
                throw exception;
            }
            Response response = responseSupplier.apply(count);
            if (response == null) {
                throw new AssertionError("No response configured for call " + count);
            }
            return response;
        }

        @Override
        public Connection connection() {
            // No actual connection is required during testing, return null
            return null;
        }

        @Override
        public Call call() {
            // No actual Call object is required during testing, return null
            return null;
        }

        @Override
        public int connectTimeoutMillis() {
            return connectTimeoutMs;
        }

        @Override
        public Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            return new TestChain(
                    request,
                    responseSupplier,
                    exceptionSupplier,
                    (int) unit.toMillis(timeout),
                    readTimeoutMs
            );
        }

        @Override
        public int readTimeoutMillis() {
            return readTimeoutMs;
        }

        @Override
        public Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            return new TestChain(
                    request,
                    responseSupplier,
                    exceptionSupplier,
                    connectTimeoutMs,
                    (int) unit.toMillis(timeout)
            );
        }

        @Override
        public int writeTimeoutMillis() {
            // Default write timeout
            return 10000;
        }

        @Override
        public Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit) {
            // No need to implement during testing
            return this;
        }

        public int getCallCount() {
            return callCount.get();
        }
    }

    //---------------- Tool method: Create simulated response ----------------//
    private Response createResponse(int code, String body) {
        return new Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(code)
                .message("")
                .body(ResponseBody.create(
                        body,
                        MediaType.get("application/json")
                ))
                .build();
    }

    //---------------- Normal response test ----------------//
    @Test
    public void testNormalResponse_Http200() throws IOException {
        // Simulate a successful response with a constructor that includes all parameters
        testChain = new TestChain(
                request,
                i -> createResponse(200, "{ \"ErrorCode\": 0 }"),
                i -> null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        // Verify a single request
        assertEquals(1, testChain.getCallCount());
    }

    //---------------- HTTP error retry test ----------------//
    @Test
    public void testHttpRetry_SuccessAfterRetries() throws IOException {
        // Use counters to control retry logic, including a constructor with all parameters
        testChain = new TestChain(
                request,
                i -> i <= 2 ? createResponse(500, "") : createResponse(200, "{ \"ErrorCode\": 0 }"),
                i -> null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        assertEquals(3, testChain.getCallCount()); // Verify the number of retries
    }

    //---------------- Business error retry test ----------------//
    @Test
    public void testBusinessRetry_SuccessAfterRetries() throws IOException {
        // Constructor containing all parameters
        testChain = new TestChain(
                request,
                i -> createResponse(200, i < 3 ? "{ \"ErrorCode\": 10002 }" : "{ \"ErrorCode\": 0 }"),
                i -> null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        assertEquals(3, testChain.getCallCount());
    }

    //---------------- Abnormal scenario testing ----------------//
    @Test
    public void testHttpRetry_MaxRetriesExceeded() {
        // Constructor containing all parameters
        testChain = new TestChain(
                request,
                i -> createResponse(500, ""),
                i -> null,
                10000,
                10000
        );

        assertThrows(IOException.class, () -> interceptor.intercept(testChain));
        assertEquals(3, testChain.getCallCount()); // Verify the number of retries
    }

    //---------------- Timeout retry test ----------------//
    @Test
    public void testConnectTimeoutRetry() throws IOException {
        // Simulate the first two connection timeouts and the third one is successful
        testChain = new TestChain(
                request,
                i -> i > 2 ? createResponse(200, "{}") : null,
                i -> i <= 2 ? new SocketTimeoutException("Connect timed out") : null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        assertEquals(3, testChain.getCallCount());
    }

    //---------------- ReadTime retry test ----------------//
    @Test
    public void testReadTimeoutRetry() throws IOException {
        // Simulate the first two reads timed out, the third one succeeded
        testChain = new TestChain(
                request,
                i -> i > 2 ? createResponse(200, "{}") : null,
                i -> i <= 2 ? new SocketTimeoutException("Read timed out") : null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        assertEquals(3, testChain.getCallCount());
    }

    @Test
    public void testConnectTimeoutExceedMaxRetries() {
        // Simulate connection timeout every time, exceeding the maximum retry count
        testChain = new TestChain(
                request,
                i -> null,
                i -> new SocketTimeoutException("Connect timed out"),
                10000,
                10000
        );

        assertThrows(SocketTimeoutException.class, () -> interceptor.intercept(testChain));
        assertEquals(3, testChain.getCallCount());
    }

    //---------------- Similar adjustments to other test cases (example)----------------//
    @Test
    public void testIOExceptionRetry() throws IOException {
        // Constructor containing all parameters
        testChain = new TestChain(
                request,
                i -> i > 2 ? createResponse(200, "{}") : null,
                i -> i <= 2 ? new IOException("Simulate network errors") : null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(200, response.code());
        assertEquals(3, testChain.getCallCount());
    }

    @Test
    public void testMaxRetriesZero() throws IOException {
        interceptor = new RetryInterceptor(0, 1000, Collections.emptySet(), false, BaseGenericResult.class);

        // Constructor containing all parameters
        testChain = new TestChain(
                request,
                i -> createResponse(500, ""),
                i -> null,
                10000,
                10000
        );

        Response response = interceptor.intercept(testChain);
        assertEquals(500, response.code());
        assertEquals(1, testChain.getCallCount());
    }
}
