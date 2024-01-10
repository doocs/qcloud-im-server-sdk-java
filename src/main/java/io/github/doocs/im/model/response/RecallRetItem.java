package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/8/4 11:41
 */
public class RecallRetItem implements Serializable {
    private static final long serialVersionUID = 4345721447627867731L;
    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 单个消息的被撤回结果：0表示成功；其它表示失败
     */
    @JsonProperty("RetCode")
    private Integer retCode;

    /**
     * 单个被撤回消息的 MsgKey
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    @Override
    public String toString() {
        return "RecallRetItem{" +
                "msgSeq=" + msgSeq +
                ", retCode=" + retCode +
                ", msgKey='" + msgKey + '\'' +
                '}';
    }
}
