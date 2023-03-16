package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2023/3/16 10:59
 */
public class GroupItem {
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
