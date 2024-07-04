package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 群成员资料变更后回调
 *
 * @author bingo
 * @since 2024/7/14 10:18
 */
public class AfterGroupMemberFieldChangedCallback implements Serializable {
    private static final long serialVersionUID = -7463001570593065039L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 发起变更请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 变更成员 UserID
     */
    @JsonProperty("Modified_Account")
    private String modifiedAccount;

    /**
     * 变更后成员身份，Admin/Member 分别为设置/取消管理员
     */
    @JsonProperty("Role")
    private String role;

    /**
     * 变更后群名片
     */
    @JsonProperty("NameCard")
    private String nameCard;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

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

    public String getModifiedAccount() {
        return modifiedAccount;
    }

    public void setModifiedAccount(String modifiedAccount) {
        this.modifiedAccount = modifiedAccount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
