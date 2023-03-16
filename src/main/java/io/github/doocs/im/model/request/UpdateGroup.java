package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2023/3/16 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateGroup {
    /**
     * 更新类型：1 - 更新分组名； 2 - 更新会话分组
     */
    @JsonProperty("UpdateGroupType")
    private Integer updateGroupType;

    /**
     * 待更新的分组
     */
    @JsonProperty("OldGroupName")
    private String oldGroupName;

    /**
     * 更新后的分组名，最多支持32个字节
     */
    @JsonProperty("NewGroupName")
    private String newGroupName;

    /**
     * 指定更新的会话
     */
    @JsonProperty("ContactUpdateItem")
    private List<GroupContactUpdateItem> contactUpdateItem;

    private UpdateGroup(Builder builder) {
        this.updateGroupType = builder.updateGroupType;
        this.oldGroupName = builder.oldGroupName;
        this.newGroupName = builder.newGroupName;
        this.contactUpdateItem = builder.contactUpdateItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getUpdateGroupType() {
        return updateGroupType;
    }

    public void setUpdateGroupType(Integer updateGroupType) {
        this.updateGroupType = updateGroupType;
    }

    public String getOldGroupName() {
        return oldGroupName;
    }

    public void setOldGroupName(String oldGroupName) {
        this.oldGroupName = oldGroupName;
    }

    public String getNewGroupName() {
        return newGroupName;
    }

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    public List<GroupContactUpdateItem> getContactUpdateItem() {
        return contactUpdateItem;
    }

    public void setContactUpdateItem(List<GroupContactUpdateItem> contactUpdateItem) {
        this.contactUpdateItem = contactUpdateItem;
    }


    public static final class Builder {
        private Integer updateGroupType;
        private String oldGroupName;
        private String newGroupName;
        private List<GroupContactUpdateItem> contactUpdateItem;

        private Builder() {
        }

        public UpdateGroup build() {
            return new UpdateGroup(this);
        }

        public Builder updateGroupType(Integer updateGroupType) {
            this.updateGroupType = updateGroupType;
            return this;
        }

        public Builder oldGroupName(String oldGroupName) {
            this.oldGroupName = oldGroupName;
            return this;
        }

        public Builder newGroupName(String newGroupName) {
            this.newGroupName = newGroupName;
            return this;
        }

        public Builder contactUpdateItem(List<GroupContactUpdateItem> contactUpdateItem) {
            this.contactUpdateItem = contactUpdateItem;
            return this;
        }
    }
}
