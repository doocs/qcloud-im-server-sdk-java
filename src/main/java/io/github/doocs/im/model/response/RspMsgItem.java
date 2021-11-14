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

    /**
     * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

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

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
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
