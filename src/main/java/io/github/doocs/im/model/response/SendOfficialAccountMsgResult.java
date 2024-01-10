package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 公众号用户发送广播消息-结果
 *
 * @author hyh
 * @since 2024/01/09 19:39
 */
public class SendOfficialAccountMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4691540073143009818L;
    /**
     * 消息发送的时间戳，对应后台 server 时间
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
        return "SendOfficialAccountMsgResult{" +
                "msgTime=" + msgTime +
                ", msgKey='" + msgKey + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
