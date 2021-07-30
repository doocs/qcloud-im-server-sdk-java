package com.qcloud.im;

import com.qcloud.im.model.core.Account;
import com.qcloud.im.model.core.Message;
import com.qcloud.im.model.core.Profile;
import com.qcloud.im.model.core.SNS;
import com.qcloud.im.util.SigUtil;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;


/**
 * @author hyh
 * @since 2021/07/29 16:11
 */
public class IMClient {
    private static ConcurrentHashMap<String, IMClient> imClient = new ConcurrentHashMap<>();
    private static String FORMAT_URL = "https://console.tim.qq.com/%s/%s/%s?sdkappid=%d&identifier=%s&usersig=%s&random=%d&contenttype=json";
    /**
     * core methods
     */
    public Account account;
    public Message message;
    public Profile profile;
    public SNS sns;
    /**
     * init property
     */
    private String version = "v4";
    private Long sdkAppId;
    private String userId;
    private String userSig;

    public static IMClient getInstance(Long sdkAppId, String userId, String key, Long expire) {
        String identify = sdkAppId + "_" + userId;
        if (imClient.get(identify) == null) {
            imClient.putIfAbsent(identify, new IMClient(sdkAppId, userId, key, expire));
        }
        return imClient.get(identify);
    }

    public static IMClient getInstance(Long sdkAppId, String userId, String key) {
        String identify = sdkAppId + "_" + userId;
        if (imClient.get(identify) == null) {
            imClient.putIfAbsent(identify, new IMClient(sdkAppId, userId, key, 24 * 60 * 60L));
        }
        return imClient.get(identify);
    }

    public IMClient(Long sdkAppId, String userId, String key, Long expire) {
        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.userSig = SigUtil.genUserSig(sdkAppId, key, userId, expire);
        account = new Account(this);
        message = new Message(this);
        profile = new Profile(this);
        sns = new SNS(this);
    }

    public String getUrl(String serviceName, String command) {
        // 随机生成32位无符号整数
        long random = ThreadLocalRandom.current().nextLong(0, 0x100000000L);
        return String.format(FORMAT_URL, this.version, serviceName, command,
                this.sdkAppId, this.userId, this.userSig, random);
    }
}
