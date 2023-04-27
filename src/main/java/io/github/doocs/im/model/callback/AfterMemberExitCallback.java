package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群成员离开之后回调
 *
 * @author bingo
 * @since 2021/11/16 19:29
 */
public class AfterMemberExitCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 产生群消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 产生群消息的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 成员离开方式：Kicked 为被群主移出群聊；Quit 为主动退群
     */
    @JsonProperty("ExitType")
    private String exitType;

    /**
     * 退群者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 退出群的成员列表
     */
    @JsonProperty("ExitMemberList")
    private List<MemberAccount> exitMemberList;

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

    public String getExitType() {
        return exitType;
    }

    public void setExitType(String exitType) {
        this.exitType = exitType;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public List<MemberAccount> getExitMemberList() {
        return exitMemberList;
    }

    public void setExitMemberList(List<MemberAccount> exitMemberList) {
        this.exitMemberList = exitMemberList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
