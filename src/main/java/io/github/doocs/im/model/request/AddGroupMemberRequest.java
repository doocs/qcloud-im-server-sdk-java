package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 14:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddGroupMemberRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Silence")
    private Integer silence;

    @JsonProperty("MemberList")
    private List<MemberRequestItem> memberList;

    public AddGroupMemberRequest(String groupId, List<MemberRequestItem> memberList) {
        this(groupId, null, memberList);
    }

    public AddGroupMemberRequest(String groupId, Integer silence, List<MemberRequestItem> memberList) {
        this.groupId = groupId;
        this.silence = silence;
        this.memberList = memberList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getSilence() {
        return silence;
    }

    public void setSilence(Integer silence) {
        this.silence = silence;
    }

    public List<MemberRequestItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberRequestItem> memberList) {
        this.memberList = memberList;
    }
}
