package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 全员推送结果回调
 *
 * @author bingo
 * @since 2024/7/4 10:18
 */
public class AllMemberPushCallback implements Serializable {
    private static final long serialVersionUID = 3699118050157347391L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 事件类型：
     * EventType = 1表示离线推送
     */
    @JsonProperty("EventType")
    private Integer eventType;

    /**
     * 全员推送发送时返回的任务 ID
     */
    @JsonProperty("TaskId")
    private String taskId;

    /**
     * 全员推送任务发起时间戳，单位为秒
     */
    @JsonProperty("TaskTime")
    private Integer taskTime;

    /**
     * 事件发生时间戳，单位为秒
     */
    @JsonProperty("EventTime")
    private Long eventTime;

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
     * PushStage = 1表示推送发送
     * PushStage = 2表示推送触达
     * PushStage = 3表示推送点击
     */
    @JsonProperty("PushStage")
    private Integer pushStage;

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

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Integer taskTime) {
        this.taskTime = taskTime;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
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
