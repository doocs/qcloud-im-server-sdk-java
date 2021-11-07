package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.MemberProfile;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 19:18
 */
public class GetGroupMemberInfoResult extends GenericResult {
    @JsonProperty("MemberNum")
    private Integer memberNum;

    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public List<MemberProfile> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberProfile> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "GetGroupMemberInfoResult{" +
                "memberNum=" + memberNum +
                ", memberList=" + memberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
