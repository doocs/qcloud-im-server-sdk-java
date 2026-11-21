package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 群成员搜索-结果
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class GroupMemberSearchResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 1884672813872948553L;

    /**
     * 搜索是否结束
     */
    @JsonProperty("IsFinish")
    private Boolean isFinish;

    /**
     * 命中的搜索结果个数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 命中的用户数
     */
    @JsonProperty("GroupMembers")
    private List<GroupMemberItem> groupMembers;

    /**
     * 续拉参数，下个请求的 Response 中带回
     */
    @JsonProperty("Cursor")
    private String cursor;

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<GroupMemberItem> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<GroupMemberItem> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "GroupMemberSearchResult{" +
                "isFinish=" + isFinish +
                ", totalCount=" + totalCount +
                ", groupMembers=" + groupMembers +
                ", cursor='" + cursor + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
