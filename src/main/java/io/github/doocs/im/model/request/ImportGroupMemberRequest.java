package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 19:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupMemberRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MemberList")
    private List<MemberItem> memberList;

    public ImportGroupMemberRequest() {
    }

    public ImportGroupMemberRequest(String groupId, List<MemberItem> memberList) {
        this.groupId = groupId;
        this.memberList = memberList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MemberItem> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberItem> memberList) {
        this.memberList = memberList;
    }
}
