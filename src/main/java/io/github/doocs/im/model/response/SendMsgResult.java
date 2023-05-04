package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 单发单聊消息-结果
 *
 * @author bingo
 * @since 2021/7/27 15:49
 */
public class SendMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -2873898207985701199L;
    /**
     * 消息时间戳，UNIX 时间戳
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 消息唯一标识，用于撤回。长度不超过50个字符
     */
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
