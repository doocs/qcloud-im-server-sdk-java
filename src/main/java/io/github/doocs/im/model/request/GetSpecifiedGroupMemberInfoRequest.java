package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取指定群成员详细资料-请求参数
 *
 * @author bingo
 * @since 2024/12/02 08:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSpecifiedGroupMemberInfoRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -1588717038990106029L;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Member_List_Account")
    private List<String> memberListAccount;

    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    @JsonProperty("MemberRoleFilter")
    private List<String> memberRoleFilter;

    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    public GetSpecifiedGroupMemberInfoRequest() {
    }

    public GetSpecifiedGroupMemberInfoRequest(String groupId, List<String> memberListAccount) {
        this.groupId = groupId;
        this.memberListAccount = memberListAccount;
    }

    public GetSpecifiedGroupMemberInfoRequest(String groupId, List<String> memberListAccount,
                                              List<String> memberInfoFilter, List<String> memberRoleFilter,
                                              List<String> appDefinedDataFilterGroupMember) {
        this.groupId = groupId;
        this.memberListAccount = memberListAccount;
        this.memberInfoFilter = memberInfoFilter;
        this.memberRoleFilter = memberRoleFilter;
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMemberListAccount() {
        return memberListAccount;
    }

    public void setMemberListAccount(List<String> memberListAccount) {
        this.memberListAccount = memberListAccount;
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

    private GetSpecifiedGroupMemberInfoRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.memberListAccount = builder.memberListAccount;
        this.memberInfoFilter = builder.memberInfoFilter;
        this.memberRoleFilter = builder.memberRoleFilter;
        this.appDefinedDataFilterGroupMember = builder.appDefinedDataFilterGroupMember;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String groupId;
        private List<String> memberListAccount;
        private List<String> memberInfoFilter;
        private List<String> memberRoleFilter;
        private List<String> appDefinedDataFilterGroupMember;

        private Builder() {
        }

        public GetSpecifiedGroupMemberInfoRequest build() {
            return new GetSpecifiedGroupMemberInfoRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder memberListAccount(List<String> memberListAccount) {
            this.memberListAccount = memberListAccount;
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
    }
}
