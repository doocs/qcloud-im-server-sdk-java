package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:35
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseFilter {
    @JsonProperty("GroupBaseInfoFilter")
    private List<String> groupBaseInfoFilter;

    @JsonProperty("MemberInfoFilter")
    private List<String> memberInfoFilter;

    @JsonProperty("AppDefinedDataFilter_Group")
    private List<String> appDefinedDataFilterGroup;

    @JsonProperty("AppDefinedDataFilter_GroupMember")
    private List<String> appDefinedDataFilterGroupMember;

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
}
