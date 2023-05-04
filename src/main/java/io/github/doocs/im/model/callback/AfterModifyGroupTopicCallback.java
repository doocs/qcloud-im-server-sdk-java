package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 话题资料修改之后回调
 *
 * @author bingo
 * @since 2022/8/2 14:05
 */
public class AfterModifyGroupTopicCallback implements Serializable {
    private static final long serialVersionUID = 8276896737000193941L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 被变动的话题资料所属的群组ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 代表解散话题所属的群组类型，这里为Community
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 变动后的话题名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 变动后的话题简介
     */
    @JsonProperty("Introduction")
    private String introduction;

    /**
     * 变动后的话题公告
     */
    @JsonProperty("Notification")
    private String notification;

    /**
     * 变动后的话题头像 URL
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
