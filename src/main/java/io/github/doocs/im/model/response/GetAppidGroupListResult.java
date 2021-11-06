package io.github.doocs.im.model.response;

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

    @JsonProperty("Next")
    private Integer next;

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

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "GetAppidGroupListResult{" +
                "totalCount=" + totalCount +
                ", groupIdList=" + groupIdList +
                ", next=" + next +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
