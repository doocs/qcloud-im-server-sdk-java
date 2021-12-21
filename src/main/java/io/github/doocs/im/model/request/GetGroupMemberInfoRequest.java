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

    @JsonProperty("Next")
    private String next;

    public GetGroupMemberInfoRequest() {
    }

    public GetGroupMemberInfoRequest(String groupId) {
        this.groupId = groupId;
    }

    public GetGroupMemberInfoRequest(String groupId, List<String> memberInfoFilter,
                                     List<String> memberRoleFilter, List<String> appDefinedDataFilterGroupMember,
                                     Integer limit, Integer offset, String next) {
        this.groupId = groupId;
        this.memberInfoFilter = memberInfoFilter;
        this.memberRoleFilter = memberRoleFilter;
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
        this.limit = limit;
        this.offset = offset;
        this.next = next;
    }

    private GetGroupMemberInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberInfoFilter = builder.memberInfoFilter;
        this.memberRoleFilter = builder.memberRoleFilter;
        this.appDefinedDataFilterGroupMember = builder.appDefinedDataFilterGroupMember;
        this.limit = builder.limit;
        this.offset = builder.offset;
        this.next = builder.next;
    }

    public static Builder builder() {
        return new Builder();
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

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }


    public static final class Builder {
        private String groupId;
        private List<String> memberInfoFilter;
        private List<String> memberRoleFilter;
        private List<String> appDefinedDataFilterGroupMember;
        private Integer limit;
        private Integer offset;
        private String next;

        private Builder() {
        }

        public GetGroupMemberInfoRequest build() {
            return new GetGroupMemberInfoRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberInfoFilter(List<String> memberInfoFilter) {
            this.memberInfoFilter = memberInfoFilter;
            return this;
        }

        public Builder memberRoleFilter(List<String> memberRoleFilter) {
            this.memberRoleFilter = memberRoleFilter;
            return this;
        }

        public Builder appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
            this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder next(String next) {
            this.next = next;
            return this;
        }
    }
}
