package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/8/4 11:46
 */
public class ImportMsgResultItem implements Serializable {
    private static final long serialVersionUID = -1631503574002054776L;
    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息的时间戳
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 单条消息导入结果
     * 0表示单条消息成功
     * 10004表示单条消息发送时间无效
     * 80002表示为消息内容过长，目前支持8000字节的消息，请调整消息长度
     */
    @JsonProperty("Result")
    private Integer result;

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
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
