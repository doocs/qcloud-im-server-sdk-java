package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 14:14
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberRequestItem {
    @JsonProperty("Member_Account")
    private String memberAccount;

    public MemberRequestItem() {
    }

    public MemberRequestItem(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }
}
