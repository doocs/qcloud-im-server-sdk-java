package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:40
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRoleInGroupRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("User_Account")
    private List<String> userAccount;

    public GetRoleInGroupRequest() {
    }

    public GetRoleInGroupRequest(String groupId, List<String> userAccount) {
        this.groupId = groupId;
        this.userAccount = userAccount;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(List<String> userAccount) {
        this.userAccount = userAccount;
    }
}
