package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/28 20:42
 */
public class MsgBodyItem {
    @JsonProperty("MsgType")
    private String msgType;

    @JsonProperty("MsgContent")
    private Object msgContent;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public Object getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(Object msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "MsgBodyItem{" +
                "msgType='" + msgType + '\'' +
                ", msgContent=" + msgContent +
                '}';
    }
}
