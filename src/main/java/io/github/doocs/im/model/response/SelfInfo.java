package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 指定的用户在某话题中的相关信息
 *
 * @author bingo
 * @since 2022/8/2 10:52
 */
public class SelfInfo {
    /**
     * 用户的禁言时间
     */
    @JsonProperty("ShutUpTime")
    private Long shutUpTime;

    /**
     * 成员已读消息
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    @JsonProperty("MsgFlag")
    private String msgFlag;

    public Long getShutUpTime() {
        return shutUpTime;
    }

    public void setShutUpTime(Long shutUpTime) {
        this.shutUpTime = shutUpTime;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public String getMsgFlag() {
        return msgFlag;
    }

    public void setMsgFlag(String msgFlag) {
        this.msgFlag = msgFlag;
    }

    @Override
    public String toString() {
        return "SelfInfo{" +
                "shutUpTime=" + shutUpTime +
                ", msgSeq=" + msgSeq +
                ", msgFlag='" + msgFlag + '\'' +
                '}';
    }
}
