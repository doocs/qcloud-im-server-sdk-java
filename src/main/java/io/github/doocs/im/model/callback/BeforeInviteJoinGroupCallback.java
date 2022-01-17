package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉人入群之前回调
 *
 * @author bingo
 * @since 2021/11/16 17:39
 */
public class BeforeInviteJoinGroupCallback {
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
     * 请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 要拉入群组的 UserID 集合
     */
    @JsonProperty("DestinationMembers")
    private List<DestinationMember> destinationMembers;

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

    public List<DestinationMember> getDestinationMembers() {
        return destinationMembers;
    }

    public void setDestinationMembers(List<DestinationMember> destinationMembers) {
        this.destinationMembers = destinationMembers;
    }

    public static class DestinationMember {
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
