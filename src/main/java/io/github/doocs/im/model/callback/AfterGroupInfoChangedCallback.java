package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群组资料修改之后回调
 *
 * @author bingo
 * @since 2021/11/16 20:27
 */
public class AfterGroupInfoChangedCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 群资料被修改的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群资料被修改的群的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 修改后的群名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 修改后的群简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 修改后的群公告
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 修改后的群头像 URL
     */
    @JsonProperty("FaceUrl")
    private String faceUrl;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }
}
