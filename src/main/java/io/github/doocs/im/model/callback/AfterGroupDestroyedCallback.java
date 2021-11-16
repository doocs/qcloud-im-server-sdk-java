package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群组解散之后回调
 *
 * @author bingo
 * @since 2021/11/16 20:18
 */
public class AfterGroupDestroyedCallback {
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Owner_Account")
    private String ownerAccount;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("MemberList")
    private List<MemberItem> memberList;

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

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
