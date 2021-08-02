package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 16:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetJoinedGroupListRequest extends GenericRequest {
    @JsonProperty("Member_Account")
    private String memberAccount;

    public GetJoinedGroupListRequest() {
    }

    public GetJoinedGroupListRequest(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }
}
