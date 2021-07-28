package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 20:42
 */
public class MsgBodyItem {
    @JsonProperty("MsgType")
    private String msgType;

    @JsonProperty("MsgContent")
    private List<MsgContentItem> msgContent;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public List<MsgContentItem> getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(List<MsgContentItem> msgContent) {
        this.msgContent = msgContent;
    }
}
