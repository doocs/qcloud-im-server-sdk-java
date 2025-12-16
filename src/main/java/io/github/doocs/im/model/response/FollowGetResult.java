package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 拉取关注、粉丝与互关列表-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowGetResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -374927471394227839L;

    /**
     * 粉丝/关注/互关列表
     */
    @JsonProperty("FollowItem")
    private List<FollowResultItem> followItemList;

    /**
     * 下一页的起始位置，为空时表示已拉到全量数据
     */
    @JsonProperty("NextCursor")
    private String nextCursor;

    public List<FollowResultItem> getFollowItemList() {
        return followItemList;
    }

    public void setFollowItemList(List<FollowResultItem> followItemList) {
        this.followItemList = followItemList;
    }

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    @Override
    public String toString() {
        return "FollowGetResult{" +
                "followItemList=" + followItemList +
                ", nextCursor='" + nextCursor + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
