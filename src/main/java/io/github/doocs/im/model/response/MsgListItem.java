package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:07
 */
public class MsgListItem {
    /**
     * 消息发送方 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 会话其中一方的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息时间戳
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    /**
     * 该条消息的属性，0表示正常消息，8表示被撤回的消息
     */
    @JsonProperty("MsgFlagBits")
    private Integer msgFlagBits;

    /**
     * 标识该条消息，可用于 REST API 撤回单聊消息
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 消息内容
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

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

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
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
