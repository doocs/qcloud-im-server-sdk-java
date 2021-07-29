package com.qcloud.im;

import com.qcloud.im.model.core.Account;
import com.qcloud.im.model.core.Message;
import com.qcloud.im.model.core.Profile;
import com.qcloud.im.model.core.SNS;
import com.qcloud.im.util.SigUtil;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author hyh
 * @since 2021/07/29 16:11
 */
public class IMClient {
    private static ConcurrentHashMap<String, IMClient> imClient = new ConcurrentHashMap<String, IMClient>();
    private static String FORMAT_URL = "https://console.tim.qq.com/%s/%s/%s?sdkappid=%s&identifier=%s&usersig=%s&random=%d&contenttype=json";
    /**
     * core methods
     */
    private Account account;
    private Message message;
    private Profile profile;
    private SNS sns;
    /**
     * init property
     */
    private String ver = "v4";
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

    public IMClient(Long sdkAppId, String userId, String key, Long expire) {
        this.sdkAppId = sdkAppId;
        this.userId = userId;
        this.userSig = SigUtil.genUserSig(sdkAppId, userId, key, expire);
        account = new Account(this);
        message = new Message(this);
        profile = new Profile(this);
        sns = new SNS(this);
    }

    public IMClient() {
    }

    public String getUrl(String serviceName, String command) {
        return String.format(FORMAT_URL, this.ver, serviceName, command,
                this.sdkAppId, this.userId, this.userSig, new Random().nextInt());
    }
}
