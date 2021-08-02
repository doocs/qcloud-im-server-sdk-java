package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 21:03
 */
public class GetAppidGroupListResult extends GenericResult {
    @JsonProperty("TotalCount")
    private Integer totalCount;

    @JsonProperty("GroupIdList")
    private List<GroupIdItem> groupIdList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<GroupIdItem> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<GroupIdItem> groupIdList) {
        this.groupIdList = groupIdList;
    }

    @Override
    public String toString() {
        return "GetAppidGroupListResult{" +
                "totalCount=" + totalCount +
                ", groupIdList=" + groupIdList +
                '}';
    }
}
