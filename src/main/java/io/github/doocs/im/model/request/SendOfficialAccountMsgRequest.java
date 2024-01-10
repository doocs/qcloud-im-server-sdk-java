package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 公众号用户发送广播消息-请求参数
 *
 * @author hyh
 * @since 2024/01/09 16:22
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendOfficialAccountMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -511076816330563359L;


    /**
     * 发送消息的公众号用户。
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 无符号32位整数（取值范围：0 - 4294967295）。
     * 如果5分钟内两条消息的内容和 Random 随机值都相同的情况下，后一条消息将被当做重复消息而丢弃。
     */
    @JsonProperty("Random")
    private Integer random;

    /**
     * 消息体，详细可参阅 消息格式描述。
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 离线推送信息配置，详细可参见 消息格式描述。
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    /**
     * 消息回调禁止开关，只对单条消息有效
     * ForbidBeforeSendMsgCallback 表示禁止发消息前回调
     * ForbidAfterSendMsgCallback 表示禁止发消息后回调
     */
    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    /**
     * 1表示消息仅发送在线订阅者，默认0表示发送所有订阅者
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话
     * （如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）
     */
    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;


    public SendOfficialAccountMsgRequest() {
    }

    public SendOfficialAccountMsgRequest(String officialAccount, Integer random, List<TIMMsgElement> msgBody) {
        this.officialAccount = officialAccount;
        this.random = random;
        this.msgBody = msgBody;
    }

    public SendOfficialAccountMsgRequest(String officialAccount, Integer random, List<TIMMsgElement> msgBody, OfflinePushInfo offlinePushInfo, List<String> forbidCallbackControl, Integer onlineOnlyFlag, List<String> sendMsgControl, String cloudCustomData) {
        this.officialAccount = officialAccount;
        this.random = random;
        this.msgBody = msgBody;
        this.offlinePushInfo = offlinePushInfo;
        this.forbidCallbackControl = forbidCallbackControl;
        this.onlineOnlyFlag = onlineOnlyFlag;
        this.sendMsgControl = sendMsgControl;
        this.cloudCustomData = cloudCustomData;
    }

    private SendOfficialAccountMsgRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.random = builder.random;
        this.msgBody = builder.msgBody;
        this.offlinePushInfo = builder.offlinePushInfo;
        this.forbidCallbackControl = builder.forbidCallbackControl;
        this.onlineOnlyFlag = builder.onlineOnlyFlag;
        this.sendMsgControl = builder.sendMsgControl;
        this.cloudCustomData = builder.cloudCustomData;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String officialAccount;
        private Integer random;
        private List<TIMMsgElement> msgBody;
        private OfflinePushInfo offlinePushInfo;
        private List<String> forbidCallbackControl;
        private Integer onlineOnlyFlag;
        private List<String> sendMsgControl;
        private String cloudCustomData;

        private Builder() {
        }

        public SendOfficialAccountMsgRequest build() {
            return new SendOfficialAccountMsgRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder random(Integer random) {
            this.random = random;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder offlinePushInfo(OfflinePushInfo offlinePushInfo) {
            this.offlinePushInfo = offlinePushInfo;
            return this;
        }

        public Builder forbidCallbackControl(List<String> forbidCallbackControl) {
            this.forbidCallbackControl = forbidCallbackControl;
            return this;
        }

        public Builder onlineOnlyFlag(Integer onlineOnlyFlag) {
            this.onlineOnlyFlag = onlineOnlyFlag;
            return this;
        }

        public Builder sendMsgControl(List<String> sendMsgControl) {
            this.sendMsgControl = sendMsgControl;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }

    public List<String> getForbidCallbackControl() {
        return forbidCallbackControl;
    }

    public void setForbidCallbackControl(List<String> forbidCallbackControl) {
        this.forbidCallbackControl = forbidCallbackControl;
    }

    public Integer getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(Integer onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
    }

    public List<String> getSendMsgControl() {
        return sendMsgControl;
    }

    public void setSendMsgControl(List<String> sendMsgControl) {
        this.sendMsgControl = sendMsgControl;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }
}
