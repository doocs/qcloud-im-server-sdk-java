package io.github.doocs.im;

import io.github.doocs.im.util.VersionInfoUtil;

/**
 * @author bingo
 * @since 2021/11/2 14:17
 */
public class ClientConfiguration {
    private static final String DEFAULT_USER_AGENT = VersionInfoUtil.getDefaultUserAgent();
    private static final int DEFAULT_MAX_RETRIES = 3;
    /**
     * default value, unit: milliseconds
     */
    private static final long DEFAULT_CONNECT_TIMEOUT = 3000L;
    private static final long DEFAULT_READ_TIMEOUT = 3000L;
    private static final long DEFAULT_WRITE_TIMEOUT = 3000L;

    private static final long DEFAULT_EXPIRE_TIME = 24 * 60 * 60L;

    private int maxRetries = DEFAULT_MAX_RETRIES;
    private long connectTimeout = DEFAULT_CONNECT_TIMEOUT;
    private long readTimeout = DEFAULT_READ_TIMEOUT;
    private long writeTimeout = DEFAULT_WRITE_TIMEOUT;
    private long expireTime = DEFAULT_EXPIRE_TIME;
    private String userAgent = DEFAULT_USER_AGENT;

    public ClientConfiguration() {
    }

    public ClientConfiguration(int maxRetries, long connectTimeout, long readTimeout,
                               long writeTimeout, long expireTime, String userAgent) {
        this.maxRetries = maxRetries;
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.writeTimeout = writeTimeout;
        this.expireTime = expireTime;
        this.userAgent = userAgent;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(long readTimeout) {
        this.readTimeout = readTimeout;
    }

    public long getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(long writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
