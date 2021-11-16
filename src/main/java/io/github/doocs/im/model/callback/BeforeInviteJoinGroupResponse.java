package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/11/16 20:54
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeforeInviteJoinGroupResponse extends CallbackResponse {
    @JsonProperty("RefusedMembers_Account")
    private List<String> refusedMembersAccount;

    public BeforeInviteJoinGroupResponse(List<String> refusedMembersAccount) {
        this.refusedMembersAccount = refusedMembersAccount;
    }

    public BeforeInviteJoinGroupResponse(String actionStatus, Integer errorCode, String errorInfo, List<String> refusedMembersAccount) {
        super(actionStatus, errorCode, errorInfo);
        this.refusedMembersAccount = refusedMembersAccount;
    }

    public List<String> getRefusedMembersAccount() {
        return refusedMembersAccount;
    }

    public void setRefusedMembersAccount(List<String> refusedMembersAccount) {
        this.refusedMembersAccount = refusedMembersAccount;
    }
}
