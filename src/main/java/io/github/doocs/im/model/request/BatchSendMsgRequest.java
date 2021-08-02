package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.MsgBodyItem;

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
    private List<MsgBodyItem> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public BatchSendMsgRequest() {
    }

    public BatchSendMsgRequest(Integer syncOtherMachine, String fromAccount, List<String> toAccount, Integer msgSeq, Integer msgRandom, List<MsgBodyItem> msgBody, String cloudCustomData, List<String> sendMsgControl, OfflinePushInfo offlinePushInfo) {
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

    public List<MsgBodyItem> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBodyItem> msgBody) {
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
}
