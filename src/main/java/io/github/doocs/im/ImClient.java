package io.github.doocs.im;

import io.github.doocs.im.constant.Domain;
import io.github.doocs.im.core.*;
import io.github.doocs.im.util.SigUtil;

import java.util.concurrent.ThreadLocalRandom;


/**
 * @author hyh
 * @since 2021/07/29 16:11
 */
public class ImClient {
    private final long sdkAppId;
    private final String key;
    private final String userId;
    private final String domain;
    private final ClientConfiguration config;
    private final long expireTime;

    private String userSig;
    private long userSigExpireTs;

    private static final String VERSION = "v4";
    private static final String DEFAULT_DOMAIN = Domain.CHINA;
    private static final String FORMAT_URL = "https://%s/%s/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=json";

    public final Account account;
    public final Message message;
    public final Member member;
    public final Profile profile;
    public final Group group;
    public final Sns sns;
    public final Operation operation;
    public final RecentContact recentContact;

    public static ImClient getInstance(long sdkAppId, String userId, String key) {
        return new ImClient(sdkAppId, userId, key);
    }

    public static ImClient getInstance(long sdkAppId, String userId, String key, String domain) {
        return new ImClient(sdkAppId, userId, key, domain);
    }

    public static ImClient getInstance(long sdkAppId, String userId, String key, ClientConfiguration config) {
        return new ImClient(sdkAppId, userId, key, config);
    }

    public static ImClient getInstance(long sdkAppId, String userId, String key, String domain, ClientConfiguration config) {
        return new ImClient(sdkAppId, userId, key, domain, config);
    }

    public ImClient(long sdkAppId, String userId, String key) {
        this(sdkAppId, userId, key, DEFAULT_DOMAIN);
    }

    public ImClient(long sdkAppId, String userId, String key, String domain) {
        this(sdkAppId, userId, key, domain, null);
    }

    public ImClient(long sdkAppId, String userId, String key, ClientConfiguration config) {
        this(sdkAppId, userId, key, DEFAULT_DOMAIN, config);
    }

    public ImClient(long sdkAppId, String userId, String key, String domain, ClientConfiguration config) {
        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.key = key;
        this.domain = domain;
        this.config = config;
        this.expireTime = config == null ? ClientConfiguration.DEFAULT_EXPIRE_TIME : config.getExpireTime();
        this.userSig = SigUtil.genUserSig(sdkAppId, key, userId, expireTime);
        this.userSigExpireTs = System.currentTimeMillis() / 1000 + expireTime - 100;

        account = new Account(this);
        message = new Message(this);
        member = new Member(this);
        profile = new Profile(this);
        group = new Group(this);
        operation = new Operation(this);
        sns = new Sns(this);
        recentContact = new RecentContact(this);
    }

    /**
     * 获取签名
     *
     * @return 签名
     */
    private String getUserSig() {
        boolean renewSig = config == null || config.isAutoRenewSig();
        if (renewSig) {
            long currentTs = System.currentTimeMillis() / 1000;
            if (currentTs >= userSigExpireTs) {
                synchronized (this) {
                    if (currentTs >= userSigExpireTs) {
                        userSig = SigUtil.genUserSig(sdkAppId, key, userId, expireTime);
                        userSigExpireTs = currentTs + expireTime - 100;
                    }
                }
            }
        }
        return userSig;
    }

    public ClientConfiguration getConfig() {
        return config;
    }

    /**
     * 获取请求 URL
     *
     * @param serviceName 内部服务名
     * @param command     命令字
     * @return url
     */
    public String getUrl(String serviceName, String command) {
        String sig = getUserSig();
        long random = ThreadLocalRandom.current().nextLong(0, 0x100000000L);
        return String.format(FORMAT_URL, domain, VERSION, serviceName, command,
                sdkAppId, userId, sig, random);
    }
}
