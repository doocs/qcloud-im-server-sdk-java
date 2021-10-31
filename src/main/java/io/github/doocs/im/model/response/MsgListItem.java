package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:07
 */
public class MsgListItem {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    @JsonProperty("MsgFlagBits")
    private Integer msgFlagBits;

    @JsonProperty("MsgKey")
    private String msgKey;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public MsgListItem() {
    }

    public MsgListItem(String fromAccount, String toAccount, Integer msgSeq, Integer msgRandom, Integer msgTimeStamp, Integer msgFlagBits, String msgKey, List<TIMMsgElement> msgBody, String cloudCustomData) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.msgFlagBits = msgFlagBits;
        this.msgKey = msgKey;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
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

    public Integer getMsgFlagBits() {
        return msgFlagBits;
    }

    public void setMsgFlagBits(Integer msgFlagBits) {
        this.msgFlagBits = msgFlagBits;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
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

    @Override
    public String toString() {
        return "MsgListItem{" +
                "fromAccount='" + fromAccount + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", msgSeq=" + msgSeq +
                ", msgRandom=" + msgRandom +
                ", msgTimeStamp=" + msgTimeStamp +
                ", msgFlagBits=" + msgFlagBits +
                ", msgKey='" + msgKey + '\'' +
                ", msgBody=" + msgBody +
                ", cloudCustomData='" + cloudCustomData + '\'' +
                '}';
    }
}
