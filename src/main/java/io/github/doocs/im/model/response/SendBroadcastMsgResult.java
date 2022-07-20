package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 直播群广播消息-结果
 *
 * @author bingo
 * @since 2022/7/20 11:25
 */
public class SendBroadcastMsgResult extends GenericResult {
    /**
     * 消息序列号，唯一标示一条消息
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    @Override
    public String toString() {
        return "SendBroadcastMsgResult{" +
                "msgSeq=" + msgSeq +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
