package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:35
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseFilter implements Serializable {
    private static final long serialVersionUID = -3035478560299114873L;
    /**
     * 基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情请参阅 群基础资料
     */
    @JsonProperty("GroupBaseInfoFilter")
    private List<String> groupBaseInfoFilter;

    /**
     * 成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情请参阅 群成员资料
     */
    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    /**
     * 该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段，详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedDataFilter_Group")
    private List<String> appDefinedDataFilterGroup;

    /**
     * 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段，详情请参阅 自定义字段
     */
    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

    public ResponseFilter() {
    }

    public ResponseFilter(List<String> groupBaseInfoFilter, List<String> memberInfoFilter,
                          List<String> appDefinedDataFilterGroup, List<String> appDefinedDataFilterGroupMember) {
        this.groupBaseInfoFilter = groupBaseInfoFilter;
        this.memberInfoFilter = memberInfoFilter;
        this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    }

    private ResponseFilter(Builder builder) {
        this.groupBaseInfoFilter = builder.groupBaseInfoFilter;
        this.memberInfoFilter = builder.memberInfoFilter;
        this.appDefinedDataFilterGroup = builder.appDefinedDataFilterGroup;
        this.appDefinedDataFilterGroupMember = builder.appDefinedDataFilterGroupMember;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getGroupBaseInfoFilter() {
        return groupBaseInfoFilter;
    }

    public void setGroupBaseInfoFilter(List<String> groupBaseInfoFilter) {
        this.groupBaseInfoFilter = groupBaseInfoFilter;
    }

    public List<String> getMemberInfoFilter() {
        return memberInfoFilter;
    }

    public void setMemberInfoFilter(List<String> memberInfoFilter) {
        this.memberInfoFilter = memberInfoFilter;
    }

    public List<String> getAppDefinedDataFilterGroup() {
        return appDefinedDataFilterGroup;
    }

    public void setAppDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
        this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
    }

    public List<String> getAppDefinedDataFilterGroupMember() {
        return appDefinedDataFilterGroupMember;
    }

    public void setAppDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
        this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
    }


    public static final class Builder {
        private List<String> groupBaseInfoFilter;
        private List<String> memberInfoFilter;
        private List<String> appDefinedDataFilterGroup;
        private List<String> appDefinedDataFilterGroupMember;

        private Builder() {
        }

        public ResponseFilter build() {
            return new ResponseFilter(this);
        }

        public Builder groupBaseInfoFilter(List<String> groupBaseInfoFilter) {
            this.groupBaseInfoFilter = groupBaseInfoFilter;
            return this;
        }

        public Builder memberInfoFilter(List<String> memberInfoFilter) {
            this.memberInfoFilter = memberInfoFilter;
            return this;
        }

        public Builder appDefinedDataFilterGroup(List<String> appDefinedDataFilterGroup) {
            this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
            return this;
        }

        public Builder appDefinedDataFilterGroupMember(List<String> appDefinedDataFilterGroupMember) {
            this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
            return this;
        }
    }
}
