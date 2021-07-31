package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 20:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHistoryRequest extends GenericRequest {
    @JsonProperty("ChatType")
    private String chatType;

    @JsonProperty("MsgTime")
    private String msgTime;

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }
}
