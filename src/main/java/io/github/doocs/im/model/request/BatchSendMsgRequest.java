package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 11:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchSendMsgRequest {
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public BatchSendMsgRequest() {
    }

    public BatchSendMsgRequest(List<String> toAccount, Integer msgRandom, List<TIMMsgElement> msgBody) {
        this.toAccount = toAccount;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
    }

    public BatchSendMsgRequest(Integer syncOtherMachine, String fromAccount, List<String> toAccount, Integer msgSeq,
                               Integer msgRandom, List<TIMMsgElement> msgBody, String cloudCustomData,
                               List<String> sendMsgControl, OfflinePushInfo offlinePushInfo) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.sendMsgControl = sendMsgControl;
        this.offlinePushInfo = offlinePushInfo;
    }

    private BatchSendMsgRequest(Builder builder) {
        this.syncOtherMachine = builder.syncOtherMachine;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgSeq = builder.msgSeq;
        this.msgRandom = builder.msgRandom;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
        this.sendMsgControl = builder.sendMsgControl;
        this.offlinePushInfo = builder.offlinePushInfo;
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

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
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


    public static final class Builder {
        private Integer syncOtherMachine;
        private String fromAccount;
        private List<String> toAccount;
        private Integer msgSeq;
        private Integer msgRandom;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;
        private List<String> sendMsgControl;
        private OfflinePushInfo offlinePushInfo;

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

        public Builder msgSeq(Integer msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder msgRandom(Integer msgRandom) {
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
    }
}
