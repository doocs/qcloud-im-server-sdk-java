package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.im.model.response.MsgBodyItem;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 11:31
 */
public class SendMsgRequest extends GenericRequest {
    @JsonProperty("SyncOtherMachine")
    private Integer syncOtherMachine;

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

    @JsonProperty("MsgBody")
    private List<MsgBodyItem> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public SendMsgRequest() {
    }

    public SendMsgRequest(Integer syncOtherMachine, String toAccount, Integer msgLifeTime, Integer msgSeq, Integer msgRandom, Integer msgTimeStamp, List<MsgBodyItem> msgBody, String cloudCustomData) {
        this.syncOtherMachine = syncOtherMachine;
        this.toAccount = toAccount;
        this.msgLifeTime = msgLifeTime;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    public Integer getSyncOtherMachine() {
        return syncOtherMachine;
    }

    public void setSyncOtherMachine(Integer syncOtherMachine) {
        this.syncOtherMachine = syncOtherMachine;
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
}
