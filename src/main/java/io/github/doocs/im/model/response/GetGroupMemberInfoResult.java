package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.MemberProfile;

import java.util.List;

/**
 * 获取群成员详细资料-结果
 *
 * @author hyh
 * @since 2021/08/02 19:18
 */
public class GetGroupMemberInfoResult extends GenericResult {
    /**
     * 本群组的群成员总数
     */
    @JsonProperty("MemberNum")
    private Integer memberNum;

    /**
     * 获取到的群成员列表，其中包含了全部或者指定的群成员信息，成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    /**
     * 下一次请求应该传的 Next 值，仅查询 Community（社群）时会返回该字段
     */
    @JsonProperty("Next")
    private String next;

    public GetGroupMemberInfoResult() {
    }

    public GetGroupMemberInfoResult(Integer memberNum, List<MemberProfile> memberList, String next) {
        this.memberNum = memberNum;
        this.memberList = memberList;
        this.next = next;
    }

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

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GetGroupMemberInfoResult{" +
                "memberNum=" + memberNum +
                ", memberList=" + memberList +
                ", next='" + next + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
