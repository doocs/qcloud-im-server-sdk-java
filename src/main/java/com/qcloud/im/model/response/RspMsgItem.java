package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 13:40
 */
public class RspMsgItem {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("IsPlaceMsg")
    private Integer isPlaceMsg;

    @JsonProperty("MsgBody")
    private List<MsgBodyItem> msgBody;

    @JsonProperty("MsgPriority")
    private Integer msgPriority;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getIsPlaceMsg() {
        return isPlaceMsg;
    }

    public void setIsPlaceMsg(Integer isPlaceMsg) {
        this.isPlaceMsg = isPlaceMsg;
    }

    public List<MsgBodyItem> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBodyItem> msgBody) {
        this.msgBody = msgBody;
    }

    public Integer getMsgPriority() {
        return msgPriority;
    }

    public void setMsgPriority(Integer msgPriority) {
        this.msgPriority = msgPriority;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
    }

    @Override
    public String toString() {
        return "RspMsgItem{" +
                "fromAccount='" + fromAccount + '\'' +
                ", isPlaceMsg=" + isPlaceMsg +
                ", msgBody=" + msgBody +
                ", msgPriority=" + msgPriority +
                ", msgRandom=" + msgRandom +
                ", msgSeq=" + msgSeq +
                ", msgTimeStamp=" + msgTimeStamp +
                '}';
    }
}
