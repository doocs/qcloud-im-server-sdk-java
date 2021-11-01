package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendGroupMsgRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Random")
    private Integer random;

    @JsonProperty("MsgPriority")
    private String msgPriority;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    @JsonProperty("cloudCustomData")
    private String cloudCustomData;

    public SendGroupMsgRequest() {
    }

    public SendGroupMsgRequest(String groupId, Integer random, List<TIMMsgElement> msgBody) {
        this.groupId = groupId;
        this.random = random;
        this.msgBody = msgBody;
    }

    public SendGroupMsgRequest(String groupId, Integer random, String msgPriority, List<TIMMsgElement> msgBody,
                               String fromAccount, OfflinePushInfo offlinePushInfo, List<String> forbidCallbackControl,
                               Integer onlineOnlyFlag, List<String> sendMsgControl, String cloudCustomData) {
        this.groupId = groupId;
        this.random = random;
        this.msgPriority = msgPriority;
        this.msgBody = msgBody;
        this.fromAccount = fromAccount;
        this.offlinePushInfo = offlinePushInfo;
        this.forbidCallbackControl = forbidCallbackControl;
        this.onlineOnlyFlag = onlineOnlyFlag;
        this.sendMsgControl = sendMsgControl;
        this.cloudCustomData = cloudCustomData;
    }

    private SendGroupMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.random = builder.random;
        this.msgPriority = builder.msgPriority;
        this.msgBody = builder.msgBody;
        this.fromAccount = builder.fromAccount;
        this.offlinePushInfo = builder.offlinePushInfo;
        this.forbidCallbackControl = builder.forbidCallbackControl;
        this.onlineOnlyFlag = builder.onlineOnlyFlag;
        this.sendMsgControl = builder.sendMsgControl;
        this.cloudCustomData = builder.cloudCustomData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public String getMsgPriority() {
        return msgPriority;
    }

    public void setMsgPriority(String msgPriority) {
        this.msgPriority = msgPriority;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
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


    public static final class Builder {
        private String groupId;
        private Integer random;
        private String msgPriority;
        private List<TIMMsgElement> msgBody;
        private String fromAccount;
        private OfflinePushInfo offlinePushInfo;
        private List<String> forbidCallbackControl;
        private Integer onlineOnlyFlag;
        private List<String> sendMsgControl;
        private String cloudCustomData;

        private Builder() {
        }

        public SendGroupMsgRequest build() {
            return new SendGroupMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder random(Integer random) {
            this.random = random;
            return this;
        }

        public Builder msgPriority(String msgPriority) {
            this.msgPriority = msgPriority;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
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
}
