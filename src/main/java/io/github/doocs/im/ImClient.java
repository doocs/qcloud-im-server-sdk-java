package io.github.doocs.im;

import io.github.doocs.im.constant.ContentType;
import io.github.doocs.im.constant.Domain;
import io.github.doocs.im.core.*;
import io.github.doocs.im.util.RandomUtil;
import io.github.doocs.im.util.SigUtil;


/**
 * IM 客户端
 *
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
    private volatile long userSigExpireTs;

    private static final String VERSION = "v4";
    private static final String DEFAULT_DOMAIN = Domain.CHINA;
    private static final ClientConfiguration DEFAULT_CLIENT_CONFIGURATION = new ClientConfiguration();
    private static final String FORMAT_URL = "https://%s/%s/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=%s";

    public final Account account;
    public final Message message;
    public final Member member;
    public final Profile profile;
    public final Group group;
    public final Sns sns;
    public final Operation operation;
    public final RecentContact recentContact;
    public final Robot robot;
    public final Audit audit;
    public final OfficialAccount officialAccount;

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
        this(sdkAppId, userId, key, null, null);
    }

    public ImClient(long sdkAppId, String userId, String key, String domain) {
        this(sdkAppId, userId, key, domain, null);
    }

    public ImClient(long sdkAppId, String userId, String key, ClientConfiguration config) {
        this(sdkAppId, userId, key, null, config);
    }

    public ImClient(long sdkAppId, String userId, String key, String domain, ClientConfiguration config) {
        if (config == null) {
            config = DEFAULT_CLIENT_CONFIGURATION;
        }
        if (domain == null) {
            domain = DEFAULT_DOMAIN;
        }

        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.key = key;
        this.domain = domain;
        this.config = config;
        this.expireTime = config.getExpireTime();
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
        robot = new Robot(this);
        audit = new Audit(this);
        officialAccount = new OfficialAccount(this);
    }

    /**
     * 获取签名
     *
     * @return 签名
     */
    private String getUserSig() {
        boolean renewSig = config.isAutoRenewSig();
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
        // 标识当前请求的随机数参数
        long random = RandomUtil.next();
        return getUrl(serviceName, command, random);
    }

    public String getUrl(String serviceName, String command, long random) {
        String sig = getUserSig();
        return String.format(FORMAT_URL, domain, VERSION, serviceName, command,
                sdkAppId, userId, sig, random, ContentType.JSON);
    }
}
