package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 11:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendMsgRequest extends GenericRequest {
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public SendMsgRequest() {
    }

    public SendMsgRequest(String toAccount, Integer msgRandom, List<TIMMsgElement> msgBody) {
        this.toAccount = toAccount;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
    }

    public SendMsgRequest(Integer syncOtherMachine, String fromAccount, String toAccount, Integer msgLifeTime,
                          Integer msgSeq, Integer msgRandom, Integer msgTimeStamp, List<String> forbidCallbackControl,
                          List<String> sendMsgControl, List<TIMMsgElement> msgBody, String cloudCustomData,
                          OfflinePushInfo offlinePushInfo) {
        this.syncOtherMachine = syncOtherMachine;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgLifeTime = msgLifeTime;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.forbidCallbackControl = forbidCallbackControl;
        this.sendMsgControl = sendMsgControl;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
        this.offlinePushInfo = offlinePushInfo;
    }

    private SendMsgRequest(Builder builder) {
        this.syncOtherMachine = builder.syncOtherMachine;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgLifeTime = builder.msgLifeTime;
        this.msgSeq = builder.msgSeq;
        this.msgRandom = builder.msgRandom;
        this.msgTimeStamp = builder.msgTimeStamp;
        this.forbidCallbackControl = builder.forbidCallbackControl;
        this.sendMsgControl = builder.sendMsgControl;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
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

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
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


    public static final class Builder {
        private Integer syncOtherMachine;
        private String fromAccount;
        private String toAccount;
        private Integer msgLifeTime;
        private Integer msgSeq;
        private Integer msgRandom;
        private Integer msgTimeStamp;
        private List<String> forbidCallbackControl;
        private List<String> sendMsgControl;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;
        private OfflinePushInfo offlinePushInfo;

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

        public Builder msgLifeTime(Integer msgLifeTime) {
            this.msgLifeTime = msgLifeTime;
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
    }
}
