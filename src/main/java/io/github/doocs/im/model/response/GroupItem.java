package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class GroupItem implements Serializable {
    private static final long serialVersionUID = -4896685050211563112L;
    /**
     * 会话分组名称
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * 会话分组ID
     */
    @JsonProperty("GroupId")
    private Integer groupId;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "GroupItem{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
