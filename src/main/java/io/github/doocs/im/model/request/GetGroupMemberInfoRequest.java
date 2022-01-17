package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取群成员详细资料-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMemberInfoRequest extends GenericRequest {
    /**
     * 需要拉取成员信息的群组的 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    /**
     * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”
     */
    @JsonProperty("MemberRoleFilter")
    private List<String> memberRoleFilter;

    /**
     * 默认情况是没有的。该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，
     * 群成员维度的自定义字段详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    /**
     * 一次最多获取多少个成员的资料，不得超过6000。如果不填，则获取群内全部成员的信息
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取
     */
    @JsonProperty("Offset")
    private Integer offset;

    /**
     * 上一次拉取到的成员位置，社群必填，社群不支持 Offset 参数，使用 Next 参数，首次调用填写""，续拉使用返回中的 Next 值
     */
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
