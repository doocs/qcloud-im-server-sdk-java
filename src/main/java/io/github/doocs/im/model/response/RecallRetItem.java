package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:41
 */
public class RecallRetItem {
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    @JsonProperty("RetCode")
    private Integer retCode;

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

    @Override
    public String toString() {
        return "RecallRetItem{" +
                "msgSeq=" + msgSeq +
                ", retCode=" + retCode +
                '}';
    }
}
