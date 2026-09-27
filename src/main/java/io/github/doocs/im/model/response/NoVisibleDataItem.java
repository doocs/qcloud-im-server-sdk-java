package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 隐藏搜索对象数据
 *
 * @author MC.Yang
 * @version V1.0
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoVisibleDataItem implements Serializable {
    private static final long serialVersionUID = -842842556497106534L;

    /**
     * 隐藏群成员/用户的 UserID，当 SetType 为2时，表示群成员的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 隐藏群组 GroupID，当 SetType 为2时，表示群成员所属群组 GroupID
     */
    @JsonProperty("GroupID")
    private String groupId;

    public NoVisibleDataItem() {
    }

    public NoVisibleDataItem(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "NoVisibleData{" +
                "userID='" + userId + '\'' +
                ", groupID='" + groupId + '\'' +
                '}';
    }
}