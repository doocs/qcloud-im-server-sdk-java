package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群组资料修改之后回调
 *
 * @author bingo
 * @since 2021/11/16 20:27
 */
public class AfterGroupInfoChangedCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Operator_Account")
    private String operatorAccount;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Introduction")
    private String introduction;

    @JsonProperty("Notification")
    private String notification;

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
