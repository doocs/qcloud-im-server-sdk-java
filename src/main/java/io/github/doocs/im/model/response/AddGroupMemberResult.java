package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 增加群成员-结果
 *
 * @author hyh
 * @since 2021/08/01 14:17
 */
public class AddGroupMemberResult extends GenericResult {
    /**
     * 返回添加的群成员结果
     */
    @JsonProperty("MemberList")
    private List<MemberResultItem> memberList;

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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
