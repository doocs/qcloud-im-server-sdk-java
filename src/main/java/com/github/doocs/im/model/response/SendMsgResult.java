package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/27 15:49
 */
public class SendMsgResult extends GenericResult {
    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("MsgKey")
    private String msgKey;

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    @Override
    public String toString() {
        return "SendMsgResult{" +
                "msgTime=" + msgTime +
                ", msgKey='" + msgKey + '\'' +
                '}';
    }
}
