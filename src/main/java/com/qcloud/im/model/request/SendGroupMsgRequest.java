package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.im.model.response.MsgBodyItem;

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
    private List<MsgBodyItem> msgBody;

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

    public SendGroupMsgRequest(String groupId, Integer random, String msgPriority, List<MsgBodyItem> msgBody, String fromAccount, OfflinePushInfo offlinePushInfo, List<String> forbidCallbackControl, Integer onlineOnlyFlag, List<String> sendMsgControl, String cloudCustomData) {
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

    public List<MsgBodyItem> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBodyItem> msgBody) {
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
}
