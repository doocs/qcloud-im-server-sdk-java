package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建群组之前回调
 *
 * @author bingo
 * @since 2021/11/16 17:11
 */
public class BeforeCreateGroupCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("Operator_Account")
    private String operatorAccount;

    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("CreatedGroupNum")
    private Integer createdGroupNum;

    @JsonProperty("MemberList")
    private List<MemberItem> memberList;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreatedGroupNum() {
        return createdGroupNum;
    }

    public void setCreatedGroupNum(Integer createdGroupNum) {
        this.createdGroupNum = createdGroupNum;
    }

    public List<MemberItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberItem> memberList) {
        this.memberList = memberList;
    }

    public static class MemberItem {
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
