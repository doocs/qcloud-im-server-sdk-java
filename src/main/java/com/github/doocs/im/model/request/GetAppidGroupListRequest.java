package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 21:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAppidGroupListRequest extends GenericRequest {
    @JsonProperty("Limit")
    private Integer limit;

    @JsonProperty("Next")
    private Integer next;

    @JsonProperty("GroupType")
    private String groupType;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
