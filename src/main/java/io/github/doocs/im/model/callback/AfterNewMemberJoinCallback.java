package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 新成员入群之后回调
 *
 * @author bingo
 * @since 2021/11/16 19:26
 */
public class AfterNewMemberJoinCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 要将其他用户拉入的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 请求创建的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 入群方式：Apply（申请入群）；Invited（邀请入群）
     */
    @JsonProperty("JoinType")
    private String joinType;

    /**
     * 请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 新入群成员 UserID 集合
     */
    @JsonProperty("NewMemberList")
    private List<NewMemberItem> newMemberList;

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

    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public List<NewMemberItem> getNewMemberList() {
        return newMemberList;
    }

    public void setNewMemberList(List<NewMemberItem> newMemberList) {
        this.newMemberList = newMemberList;
    }

    public static class NewMemberItem {
        @JsonProperty("Member_Account")
        private String memberAccount;

        public String getMemberAccount() {
            return memberAccount;
        }

        public void setMemberAccount(String memberAccount) {
            this.memberAccount = memberAccount;
        }
    }
}
