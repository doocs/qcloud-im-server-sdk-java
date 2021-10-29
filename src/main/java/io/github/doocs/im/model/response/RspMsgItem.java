package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

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
    private List<TIMMsgElement> msgBody;

    @JsonProperty("MsgPriority")
    private Integer msgPriority;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    public RspMsgItem() {
    }

    public RspMsgItem(String fromAccount, Integer isPlaceMsg, List<TIMMsgElement> msgBody, Integer msgPriority, Integer msgRandom, Integer msgSeq, Integer msgTimeStamp) {
        this.fromAccount = fromAccount;
        this.isPlaceMsg = isPlaceMsg;
        this.msgBody = msgBody;
        this.msgPriority = msgPriority;
        this.msgRandom = msgRandom;
        this.msgSeq = msgSeq;
        this.msgTimeStamp = msgTimeStamp;
    }

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

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
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
}
