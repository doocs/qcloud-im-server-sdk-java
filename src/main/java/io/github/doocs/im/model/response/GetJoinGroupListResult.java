package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 10:45
 */
public class GetJoinGroupListResult extends GenericResult {
    @JsonProperty("TotalCount")
    private Integer totalCount;

    @JsonProperty("GroupIdList")
    private List<GroupIdListResultItem> groupIdList;

    @Override
    public String toString() {
        return "GetJoinGroupListResult{" +
                "totalCount=" + totalCount +
                ", groupIdList=" + groupIdList +
                '}';
    }
}
