package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:46
 */
public class ImportMsgResultItem {
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("Result")
    private Integer result;

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ImportMsgResultItem{" +
                "msgSeq=" + msgSeq +
                ", msgTime=" + msgTime +
                ", result=" + result +
                '}';
    }
}
