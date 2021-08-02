package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMemberInfoRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    @JsonProperty("MemberRoleFilter")
    private List<String> memberRoleFilter;

    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    @JsonProperty("Limit")
    private Integer limit;

    @JsonProperty("Offset")
    private Integer offset;

    public GetGroupMemberInfoRequest() {
    }

    public GetGroupMemberInfoRequest(String groupId, List<String> memberInfoFilter, List<String> memberRoleFilter, List<String> appDefinedDataFilterGroupMember, Integer limit, Integer offset) {
        this.groupId = groupId;
        this.memberInfoFilter = memberInfoFilter;
        this.memberRoleFilter = memberRoleFilter;
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
        this.limit = limit;
        this.offset = offset;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMemberInfoFilter() {
        return memberInfoFilter;
    }

    public void setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter;
    }

    public List<String> getMemberRoleFilter() {
        return memberRoleFilter;
    }

    public void setMemberRoleFilter(List<String> memberRoleFilter) {
        this.memberRoleFilter = memberRoleFilter;
    }

    public List<String> getAppDefinedDataFilterGroupMember() {
        return appDefinedDataFilterGroupMember;
    }

    public void setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
