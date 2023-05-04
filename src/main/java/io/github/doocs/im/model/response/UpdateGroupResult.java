package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2023/3/16 11:33
 */
public class UpdateGroupResult implements Serializable {
    private static final long serialVersionUID = -7696297513131952473L;
    /**
     * 更新类型
     */
    @JsonProperty("UpdateGroupType")
    private Integer updateGroupType;

    /**
     * 当前操作的分组名称
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * 当前操作的分组ID
     */
    @JsonProperty("GroupId")
    private Integer groupId;

    /**
     * 当前操作老的分组名称
     */
    @JsonProperty("OldGroupName")
    private String oldGroupName;

    /**
     * 会话操作结果
     */
    @JsonProperty("ContactResultItem")
    private List<ContactGroupResultItem> contactGroupResultItem;

    public Integer getUpdateGroupType() {
        return updateGroupType;
    }

    public void setUpdateGroupType(Integer updateGroupType) {
        this.updateGroupType = updateGroupType;
    }

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

    public String getOldGroupName() {
        return oldGroupName;
    }

    public void setOldGroupName(String oldGroupName) {
        this.oldGroupName = oldGroupName;
    }

    public List<ContactGroupResultItem> getContactGroupResultItem() {
        return contactGroupResultItem;
    }

    public void setContactGroupResultItem(List<ContactGroupResultItem> contactGroupResultItem) {
        this.contactGroupResultItem = contactGroupResultItem;
    }

    @Override
    public String toString() {
        return "UpdateGroupResult{" +
                "updateGroupType=" + updateGroupType +
                ", groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", oldGroupName='" + oldGroupName + '\'' +
                ", contactGroupResultItem=" + contactGroupResultItem +
                '}';
    }
}
