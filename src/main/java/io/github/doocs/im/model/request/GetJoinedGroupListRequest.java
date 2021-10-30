package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 16:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetJoinedGroupListRequest extends GenericRequest {
    @JsonProperty("Member_Account")
    private String memberAccount;

    @JsonProperty("WithHugeGroups")
    private Integer withHugeGroups;

    @JsonProperty("WithNoActiveGroups")
    private Integer withNoActiveGroups;

    @JsonProperty("Limit")
    private Integer limit;

    @JsonProperty("Offset")
    private Integer offset;

    @JsonProperty("GroupType")
    private String groupType;

    @JsonProperty("ResponseFilter")
    private ResponseFilter responseFilter;

    public GetJoinedGroupListRequest(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public GetJoinedGroupListRequest(String memberAccount, Integer withHugeGroups, Integer withNoActiveGroups,
                                     Integer limit, Integer offset, String groupType, ResponseFilter responseFilter) {
        this.memberAccount = memberAccount;
        this.withHugeGroups = withHugeGroups;
        this.withNoActiveGroups = withNoActiveGroups;
        this.limit = limit;
        this.offset = offset;
        this.groupType = groupType;
        this.responseFilter = responseFilter;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public Integer getWithHugeGroups() {
        return withHugeGroups;
    }

    public void setWithHugeGroups(Integer withHugeGroups) {
        this.withHugeGroups = withHugeGroups;
    }

    public Integer getWithNoActiveGroups() {
        return withNoActiveGroups;
    }

    public void setWithNoActiveGroups(Integer withNoActiveGroups) {
        this.withNoActiveGroups = withNoActiveGroups;
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

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ResponseFilter getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(ResponseFilter responseFilter) {
        this.responseFilter = responseFilter;
    }
}
