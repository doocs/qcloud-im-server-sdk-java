package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.MemberProfile;

import java.io.Serializable;
import java.util.List;

/**
 * 获取群成员详细资料-结果
 *
 * @author bingo
 * @since 2024/12/02 08:18
 */
public class GetSpecifiedGroupMemberInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5466167278504273597L;

    /**
     * 需要拉取成员信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 获取到的群成员列表，其中包含了全部或者指定字段的群成员信息
     */
    @JsonProperty("MemberList")
    private List<MemberProfile> memberList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MemberProfile> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberProfile> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "GetSpecifiedGroupMemberInfoResult{" +
                "groupId='" + groupId + '\'' +
                ", memberList=" + memberList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
