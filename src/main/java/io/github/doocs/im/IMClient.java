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
    public Account account;
    public Message message;
    public Member member;
    public Profile profile;
    public Group group;
    public SNS sns;
    public Operation operation;
    public RecentContact recentContact;
    /**
     * init property
     */
    private final String version = "v4";
    private final Long sdkAppId;
    private final String userId;
    private final String userSig;

    public static IMClient getInstance(Long sdkAppId, String userId, String key, Long expire) {
        String identify = sdkAppId + "_" + userId;
        if (IM_CLIENT.get(identify) == null) {
            IM_CLIENT.putIfAbsent(identify, new IMClient(sdkAppId, userId, key, expire));
        }
        return IM_CLIENT.get(identify);
    }

    public static IMClient getInstance(Long sdkAppId, String userId, String key) {
        String identify = sdkAppId + "_" + userId;
        if (IM_CLIENT.get(identify) == null) {
            IM_CLIENT.putIfAbsent(identify, new IMClient(sdkAppId, userId, key, 24 * 60 * 60L));
        }
        return IM_CLIENT.get(identify);
    }

    public IMClient(Long sdkAppId, String userId, String key, Long expire) {
        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.userSig = SigUtil.genUserSig(sdkAppId, key, userId, expire);
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
        return String.format(FORMAT_URL, this.version, serviceName, command,
                this.sdkAppId, this.userId, this.userSig, random);
    }

    @Override
    public String toString() {
        return "IMClient{" +
                "sdkAppId=" + sdkAppId +
                ", userId='" + userId + '\'' +
                '}';
    }
}
