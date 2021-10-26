package io.github.doocs.im;

import io.github.doocs.im.core.*;
import io.github.doocs.im.util.SigUtil;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;


/**
 * @author hyh
 * @since 2021/07/29 16:11
 */
public class IMClient {
    private static final ConcurrentHashMap<String, IMClient> IM_CLIENT = new ConcurrentHashMap<>();
    private static final String FORMAT_URL = "https://console.tim.qq.com/%s/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=json";
    /**
     * core methods
     */
    public final Account account;
    public final Message message;
    public final Member member;
    public final Profile profile;
    public final Group group;
    public final SNS sns;
    public final Operation operation;
    public final RecentContact recentContact;
    /**
     * init property
     */
    private String userSig;
    private long userSigExpireTs;
    private final Long sdkAppId;
    private final String userId;
    private final String key;

    private static final String VERSION = "v4";
    private static final long EXPIRE_TIME = 24 * 60 * 60L;

    public static IMClient getInstance(Long sdkAppId, String userId, String key) {
        String identify = sdkAppId + "_" + userId;
        if (!IM_CLIENT.containsKey(identify)) {
            IM_CLIENT.putIfAbsent(identify, new IMClient(sdkAppId, userId, key));
        }
        return IM_CLIENT.get(identify);
    }

    public IMClient(Long sdkAppId, String userId, String key) {
        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.key = key;
        this.userSig = SigUtil.genUserSig(sdkAppId, key, userId, EXPIRE_TIME);
        this.userSigExpireTs = System.currentTimeMillis() / 1000 + EXPIRE_TIME - 100;
        account = new Account(this);
        message = new Message(this);
        member = new Member(this);
        profile = new Profile(this);
        group = new Group(this);
        operation = new Operation(this);
        sns = new SNS(this);
        recentContact = new RecentContact(this);
    }

    public String getUrl(String serviceName, String command) {
        // 随机生成32位无符号整数
        long random = ThreadLocalRandom.current().nextLong(0, 0x100000000L);
        String sig = getUserSig();
        return String.format(FORMAT_URL, VERSION, serviceName, command,
                sdkAppId, userId, sig, random);
    }

    private String getUserSig() {
        long currentTs = System.currentTimeMillis() / 1000;
        if (currentTs >= userSigExpireTs) {
            synchronized (this) {
                if (currentTs >= userSigExpireTs) {
                    userSig = SigUtil.genUserSig(sdkAppId, key, userId, EXPIRE_TIME);
                    userSigExpireTs = currentTs + EXPIRE_TIME - 100;
                }
            }
        }
        return userSig;
    }

    @Override
    public String toString() {
        return "IMClient{" +
                "sdkAppId=" + sdkAppId +
                ", userId='" + userId + '\'' +
                '}';
    }
}
