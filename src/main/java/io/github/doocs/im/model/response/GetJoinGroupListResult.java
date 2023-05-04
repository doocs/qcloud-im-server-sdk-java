package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取用户所加入的群组-结果
 *
 * @author bingo
 * @since 2021/8/4 10:45
 */
public class GetJoinGroupListResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -723444011815913182L;
    /**
     * 用户所加入的群组个数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 拉取到的群组信息，返回的结果是根据过滤器中设置的过滤字段进行过滤后的信息，字段详情请参阅 群组数据结构介绍
     */
    @JsonProperty("GroupIdList")
    private List<GroupIdListResultItem> groupIdList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<GroupIdListResultItem> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<GroupIdListResultItem> groupIdList) {
        this.groupIdList = groupIdList;
    }

    @Override
    public String toString() {
        return "GetJoinGroupListResult{" +
                "totalCount=" + totalCount +
                ", groupIdList=" + groupIdList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
