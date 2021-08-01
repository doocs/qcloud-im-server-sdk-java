package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 14:17
 */
public class AddGroupMemberResult extends GenericResult {
    @JsonProperty("MemberList")
    private List<MemberResultItem> memberList;

    public AddGroupMemberResult() {
    }

    public AddGroupMemberResult(List<MemberResultItem> memberList) {
        this.memberList = memberList;
    }

    public List<MemberResultItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberResultItem> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "AddGroupMemberResult{" +
                "memberList=" + memberList +
                '}';
    }
}
