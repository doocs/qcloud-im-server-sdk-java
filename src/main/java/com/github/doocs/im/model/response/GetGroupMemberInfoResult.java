package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 19:18
 */
public class GetGroupMemberInfoResult extends GenericResult {
    @JsonProperty("MemberNum")
    private Integer memberNum;

    @JsonProperty("MemberList")
    private List<MemberInfoItem> memberList;

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public List<MemberInfoItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberInfoItem> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "GetGroupMemberInfoResult{" +
                "memberNum=" + memberNum +
                ", memberList=" + memberList +
                '}';
    }
}
