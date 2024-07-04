package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 普通推送结果回调
 *
 * @author bingo
 * @since 2024/7/4 10:18
 */
public class OfflinePushCallback implements Serializable {
    private static final long serialVersionUID = 762318564429809490L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 事件类型：
     * EventType = 1表示单聊
     * EventType = 2表示群聊
     */
    @JsonProperty("EventType")
    private Integer eventType;

    /**
     * 事件发生时间戳, 单位为秒
     */
    @JsonProperty("EventTime")
    private Long eventTime;

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
     * 推送厂商：
     * PushPlatform = 0表示未知厂商
     * PushPlatform = 1表示 Apple APNS 推送
     * PushPlatform = 2表示小米推送
     * PushPlatform = 3表示华为推送
     * PushPlatform = 4表示 Google FCM 推送
     * PushPlatform = 5表示魅族推送
     * PushPlatform = 6表示 OPPO 推送
     * PushPlatform = 7表示 vivo 推送
     * PushPlatform = 8表示荣耀推送
     */
    @JsonProperty("PushPlatform")
    private Integer pushPlatform;

    /**
     * 推送阶段：
     * PushStage = 1表示推送发送阶段
     * PushStage = 2表示推送触达阶段
     * PushStage = 3表示推送点击阶段
     */
    @JsonProperty("PushStage")
    private Integer pushStage;

    /**
     * 单聊消息的唯一标识，仅在 EventType = 1时有效。群聊时该字段为空
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 群聊的群组 ID，仅在 EventType = 2时有效。单聊时该字段为空
     */
    @JsonProperty("GroupID")
    private String groupId;

    /**
     * 消息序列号，用于标记该条消息（32位无符号整数）
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息（32位无符号整数）。群聊时该字段为空
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息的发送时间戳，单位为秒
     */
    @JsonProperty("MsgTime")
    private Integer msgTime;

    /**
     * 推送事件结果：
     * ErrCode = 0表示成功
     * ErrCode 非0表示失败
     */
    @JsonProperty("ErrCode")
    private Integer errCode;

    /**
     * 推送事件结果描述，可能为空
     */
    @JsonProperty("ErrInfo")
    private String errInfo;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
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

    public Integer getPushPlatform() {
        return pushPlatform;
    }

    public void setPushPlatform(Integer pushPlatform) {
        this.pushPlatform = pushPlatform;
    }

    public Integer getPushStage() {
        return pushStage;
    }

    public void setPushStage(Integer pushStage) {
        this.pushStage = pushStage;
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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

    public Integer getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(Integer msgTime) {
        this.msgTime = msgTime;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }
}
