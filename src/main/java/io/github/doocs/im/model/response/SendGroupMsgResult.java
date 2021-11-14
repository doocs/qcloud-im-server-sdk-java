package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:25
 */
public class SendGroupMsgResult extends GenericResult {
    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("msgSeq")
    private Long msgSeq;

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

    @Override
    public String toString() {
        return "SendGroupMsgResult{" +
                "msgTime=" + msgTime +
                ", msgSeq=" + msgSeq +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
