package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 批量发单聊消息-请求参数
 *
 * @author bingo
 * @since 2021/7/31 11:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchSendMsgRequest implements Serializable {
    private static final long serialVersionUID = -1471756979501343744L;
    /**
     * 1：把消息同步到 From_Account 在线终端和漫游上
     * 2：消息不同步至 From_Account；若不填写默认情况下会将消息存 From_Account 漫游
     * {@link io.github.doocs.im.constant.SyncOtherMachine}
     */
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

    /**
     * 管理员指定消息发送方账号（若需设置 From_Account 信息，则该参数取值不能为空）
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方用户 UserID
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 消息离线保存时长（单位：秒），最长为7天（604800秒）。若设置该字段为0，则消息只发在线用户，不保存离线及漫游
     */
    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * TIM 消息
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    /**
     * 消息发送控制选项，是一个 String 数组，只对本次请求有效。
     * "NoUnread"表示该条消息不计入未读数。
     * "NoLastMsg"表示该条消息不更新会话列表。
     * "WithMuteNotifications"表示该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）。
     * <p>
     * 示例："SendMsgControl": ["NoUnread","NoLastMsg","WithMuteNotifications"]
     */
    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    /**
     * 离线推送信息配置
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    /**
     * 该条消息是否需要已读回执，0为不需要，1为需要，默认
     */
    @JsonProperty("IsNeedReadReceipt")
    private Integer isNeedReadReceipt;

    public BatchSendMsgRequest() {
    }

    public BatchSendMsgRequest(List<String> toAccount, Long msgRandom, List<TIMMsgElement> msgBody) {
        this.toAccount = toAccount;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
    }

    public BatchSendMsgRequest(Integer syncOtherMachine, String fromAccount, List<String> toAccount,
                               Integer msgLifeTime, Long msgSeq, Long msgRandom, List<TIMMsgElement> msgBody,
                               String cloudCustomData, List<String> sendMsgControl,
                               OfflinePushInfo offlinePushInfo, Integer isNeedReadReceipt) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgLifeTime = msgLifeTime;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.sendMsgControl = sendMsgControl;
        this.offlinePushInfo = offlinePushInfo;
        this.isNeedReadReceipt = isNeedReadReceipt;
    }

    private BatchSendMsgRequest(Builder builder) {
        this.syncOtherMachine = builder.syncOtherMachine;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgLifeTime = builder.msgLifeTime;
        this.msgSeq = builder.msgSeq;
        this.msgRandom = builder.msgRandom;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
        this.sendMsgControl = builder.sendMsgControl;
        this.offlinePushInfo = builder.offlinePushInfo;
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

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
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

    public List<String> getSendMsgControl() {
        return sendMsgControl;
    }

    public void setSendMsgControl(List<String> sendMsgControl) {
        this.sendMsgControl = sendMsgControl;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
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
        private List<String> toAccount;
        private Integer msgLifeTime;
        private Long msgSeq;
        private Long msgRandom;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;
        private List<String> sendMsgControl;
        private OfflinePushInfo offlinePushInfo;
        private Integer isNeedReadReceipt;

        private Builder() {
        }

        public BatchSendMsgRequest build() {
            return new BatchSendMsgRequest(this);
        }

        public Builder syncOtherMachine(Integer syncOtherMachine) {
            this.syncOtherMachine = syncOtherMachine;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
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

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }

        public Builder sendMsgControl(List<String> sendMsgControl) {
            this.sendMsgControl = sendMsgControl;
            return this;
        }

        public Builder offlinePushInfo(OfflinePushInfo offlinePushInfo) {
            this.offlinePushInfo = offlinePushInfo;
            return this;
        }

        public Builder isNeedReadReceipt(Integer isNeedReadReceipt) {
            this.isNeedReadReceipt = isNeedReadReceipt;
            return this;
        }
    }
}
