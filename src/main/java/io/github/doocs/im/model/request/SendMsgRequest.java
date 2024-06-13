package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 单发单聊消息-请求参数
 *
 * @author hyh
 * @since 2021/07/29 11:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8284631643133267488L;
    /**
     * 1. 把消息同步到 From_Account 在线终端和漫游上
     * 2. 消息不同步至 From_Account
     * <p>
     * 若不填写默认情况下会将消息存 From_Account 漫游
     * {@link io.github.doocs.im.constant.SyncOtherMachine}
     */
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

    /**
     * 消息发送方 UserID（用于指定发送消息方账号）
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 默认为 0，表示消息存历史聊天记录
     * 1表示消息不存历史聊天记录，即发送消息时，若接收方在线，则能收到此消息，若接收方不在线，则收不到该消息。适用于实现一些实时状态类的功能，如实现“对方正在输入”功能
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息离线保存时长（单位：秒），最长为7天（604800秒）
     * 若设置该字段为0，则消息只发在线用户，不保存离线
     * 若设置该字段超过7天（604800秒），仍只保存7天
     * 若不设置该字段，则默认保存7天
     */
    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，后台用于同一秒内的消息去重。请确保该字段填的是随机数
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息时间戳，UNIX 时间戳（单位：秒）
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    /**
     * 消息回调禁止开关，只对本条消息有效，
     * <p>
     * ForbidBeforeSendMsgCallback 表示禁止发消息前回调，
     * ForbidAfterSendMsgCallback 表示禁止发消息后回调
     */
    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    /**
     * 消息发送控制选项，是一个 String 数组，只对本条消息有效。
     * <p>
     * "NoUnread"表示该条消息不计入未读数。
     * "NoLastMsg"表示该条消息不更新会话列表。
     * "WithMuteNotifications"表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。
     * <p>
     * 示例："SendMsgControl": ["NoUnread","NoLastMsg","WithMuteNotifications"]
     */
    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    /**
     * 消息内容
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 离线推送信息配置
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    /**
     * 该条消息是否支持消息扩展，0为不支持，1为支持
     * {@link io.github.doocs.im.constant.SupportMessageExtension}
     */
    @JsonProperty("SupportMessageExtension")
    private Integer supportMessageExtension;

    /**
     * 该条消息是否需要已读回执，0为不需要，1为需要，默认为0
     */
    @JsonProperty("IsNeedReadReceipt")
    private Integer isNeedReadReceipt;

    public SendMsgRequest() {
    }

    public SendMsgRequest(String toAccount, Long msgRandom, List<TIMMsgElement> msgBody) {
        this.toAccount = toAccount;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
    }

    public SendMsgRequest(Integer syncOtherMachine, String fromAccount, String toAccount, Integer onlineOnlyFlag, Integer msgLifeTime, Long msgSeq, Long msgRandom, Integer msgTimeStamp, List<String> forbidCallbackControl, List<String> sendMsgControl, List<TIMMsgElement> msgBody, String cloudCustomData, OfflinePushInfo offlinePushInfo, Integer supportMessageExtension, Integer isNeedReadReceipt) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.onlineOnlyFlag = onlineOnlyFlag;
        this.msgLifeTime = msgLifeTime;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.forbidCallbackControl = forbidCallbackControl;
        this.sendMsgControl = sendMsgControl;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.offlinePushInfo = offlinePushInfo;
        this.supportMessageExtension = supportMessageExtension;
        this.isNeedReadReceipt = isNeedReadReceipt;
    }

    private SendMsgRequest(Builder builder) {
        this.syncOtherMachine = builder.syncOtherMachine;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.onlineOnlyFlag = builder.onlineOnlyFlag;
        this.msgLifeTime = builder.msgLifeTime;
        this.msgSeq = builder.msgSeq;
        this.msgRandom = builder.msgRandom;
        this.msgTimeStamp = builder.msgTimeStamp;
        this.forbidCallbackControl = builder.forbidCallbackControl;
        this.sendMsgControl = builder.sendMsgControl;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
        this.offlinePushInfo = builder.offlinePushInfo;
        this.supportMessageExtension = builder.supportMessageExtension;
        this.isNeedReadReceipt = builder.isNeedReadReceipt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public void setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(Integer onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
    }

    public List<String> getForbidCallbackControl() {
        return forbidCallbackControl;
    }

    public void setForbidCallbackControl(List<String> forbidCallbackControl) {
        this.forbidCallbackControl = forbidCallbackControl;
    }

    public List<String> getSendMsgControl() {
        return sendMsgControl;
    }

    public void setSendMsgControl(List<String> sendMsgControl) {
        this.sendMsgControl = sendMsgControl;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }

    public Integer getSupportMessageExtension() {
        return supportMessageExtension;
    }

    public void setSupportMessageExtension(Integer supportMessageExtension) {
        this.supportMessageExtension = supportMessageExtension;
    }

    public Integer getIsNeedReadReceipt() {
        return isNeedReadReceipt;
    }

    public void setIsNeedReadReceipt(Integer isNeedReadReceipt) {
        this.isNeedReadReceipt = isNeedReadReceipt;
    }


    public static final class Builder {
        private Integer syncOtherMachine;
        private String fromAccount;
        private String toAccount;
        private Integer onlineOnlyFlag;
        private Integer msgLifeTime;
        private Long msgSeq;
        private Long msgRandom;
        private Integer msgTimeStamp;
        private List<String> forbidCallbackControl;
        private List<String> sendMsgControl;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;
        private OfflinePushInfo offlinePushInfo;
        private Integer supportMessageExtension;
        private Integer isNeedReadReceipt;

        private Builder() {
        }

        public SendMsgRequest build() {
            return new SendMsgRequest(this);
        }

        public Builder syncOtherMachine(Integer syncOtherMachine) {
            this.syncOtherMachine = syncOtherMachine;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder onlineOnlyFlag(Integer onlineOnlyFlag) {
            this.onlineOnlyFlag = onlineOnlyFlag;
            return this;
        }

        public Builder msgLifeTime(Integer msgLifeTime) {
            this.msgLifeTime = msgLifeTime;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder msgRandom(Long msgRandom) {
            this.msgRandom = msgRandom;
            return this;
        }

        public Builder msgTimeStamp(Integer msgTimeStamp) {
            this.msgTimeStamp = msgTimeStamp;
            return this;
        }

        public Builder forbidCallbackControl(List<String> forbidCallbackControl) {
            this.forbidCallbackControl = forbidCallbackControl;
            return this;
        }

        public Builder sendMsgControl(List<String> sendMsgControl) {
            this.sendMsgControl = sendMsgControl;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }

        public Builder offlinePushInfo(OfflinePushInfo offlinePushInfo) {
            this.offlinePushInfo = offlinePushInfo;
            return this;
        }

        public Builder supportMessageExtension(Integer supportMessageExtension) {
            this.supportMessageExtension = supportMessageExtension;
            return this;
        }

        public Builder isNeedReadReceipt(Integer isNeedReadReceipt) {
            this.isNeedReadReceipt = isNeedReadReceipt;
            return this;
        }
    }
}
