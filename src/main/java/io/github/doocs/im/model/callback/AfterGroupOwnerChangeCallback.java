package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 转让群主后回调
 *
 * @author bingo
 * @since 2024/7/14 10:18
 */
public class AfterGroupOwnerChangeCallback implements Serializable {
    private static final long serialVersionUID = -7568910574700522317L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 操作用户 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 原群主 UserID
     */
    @JsonProperty("OldOwner_Account")
    private String oldOwnerAccount;

    /**
     * 新群主 UserID
     */
    @JsonProperty("NewOwner_Account")
    private String newOwnerAccount;

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

    public String getOldOwnerAccount() {
        return oldOwnerAccount;
    }

    public void setOldOwnerAccount(String oldOwnerAccount) {
        this.oldOwnerAccount = oldOwnerAccount;
    }

    public String getNewOwnerAccount() {
        return newOwnerAccount;
    }

    public void setNewOwnerAccount(String newOwnerAccount) {
        this.newOwnerAccount = newOwnerAccount;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
