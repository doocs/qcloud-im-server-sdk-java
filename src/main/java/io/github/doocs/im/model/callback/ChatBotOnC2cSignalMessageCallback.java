package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 智能机器人单聊消息自定义回调
 *
 * @author bingo
 * @since 2024/7/4 10:18
 */
public class ChatBotOnC2cSignalMessageCallback implements Serializable {
    private static final long serialVersionUID = 2087957453268227482L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 消息发送者 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收者 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息序列号，用于标记该条消息（32位无符号整数）
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息（32位无符号整数）
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 该条消息的唯一标识，可根据该标识进行 REST API 撤回单聊消息
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    /**
     * “自定义透传内容” 协议中的 data 字段
     */
    @JsonProperty("Data")
    private String data;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
