package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 在群组中发送普通消息-结果
 *
 * @author bingo
 * @since 2021/8/4 11:25
 */
public class SendGroupMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7647346204402045388L;
    /**
     * 消息发送的时间戳，对应后台 server 时间
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息丢弃原因；默认为空，否则表明消息被丢弃原因，当前只支持消息频控丢弃
     */
    @JsonProperty("MsgDropReason")
    private String msgDropReason;

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getMsgDropReason() {
        return msgDropReason;
    }

    public void setMsgDropReason(String msgDropReason) {
        this.msgDropReason = msgDropReason;
    }

    @Override
    public String toString() {
        return "SendGroupMsgResult{" +
                "msgTime=" + msgTime +
                ", msgSeq=" + msgSeq +
                ", msgDropReason='" + msgDropReason + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
