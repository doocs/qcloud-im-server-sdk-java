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

    /**
     * 需要拉取成员信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要拉取指定群成员的UserID列表，数量不得超过50。
     */
    @JsonProperty("Member_List_Account")
    private List<String> memberListAccount;

    /**
     * 需要获取哪些信息，如果没有该字段则为群成员全部资料，成员信息字段详情请参见 群成员资料。
     */
    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    /**
     * 选填
     * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”。
     */
    @JsonProperty("MemberRoleFilter")
    private List<String> memberRoleFilter;

    /**
     * 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段
     */
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
