package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 直播群广播消息-结果
 *
 * @author bingo
 * @since 2022/7/20 11:25
 */
public class SendBroadcastMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3448962622334011090L;
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
