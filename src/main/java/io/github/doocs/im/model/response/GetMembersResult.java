package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取直播群在线列表-结果
 *
 * @author bingo
 * @since 2022/7/15 14:45
 */
public class GetMembersResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 1947362551098497237L;
    /**
     * 该群组的在线账号，Member_Account 为用户的 UserID，JoinTime 为该成员进群时间
     */
    @JsonProperty("MemberList")
    private List<MemberListItem> memberList;

    /**
     * 分页拉取标志，非0表示还有更多成员未返回，需要将该数字设置到请求参数 Timestamp 中拉取更多成员；0表示已经返回所有成员
     */
    @JsonProperty("NextTimestamp")
    private Integer nextTimestamp;

    public List<MemberListItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberListItem> memberList) {
        this.memberList = memberList;
    }

    public Integer getNextTimestamp() {
        return nextTimestamp;
    }

    public void setNextTimestamp(Integer nextTimestamp) {
        this.nextTimestamp = nextTimestamp;
    }

    @Override
    public String toString() {
        return "GetMembersResult{" +
                "memberList=" + memberList +
                ", nextTimestamp=" + nextTimestamp +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
