package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 待添加的会话分组
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupContactItem implements Serializable {
    private static final long serialVersionUID = -6140714665163783340L;
    /**
     * 待添加的会话分组名称，最多32个字节
     */
    @JsonProperty("GroupName")
    private String groupName;

    /**
     * 待添加的会话列表
     */
    @JsonProperty("ContactItem")
    private List<ContactItem> contactItem;

    public GroupContactItem() {
    }

    public GroupContactItem(String groupName, List<ContactItem> contactItem) {
        this.groupName = groupName;
        this.contactItem = contactItem;
    }

    private GroupContactItem(Builder builder) {
        this.groupName = builder.groupName;
        this.contactItem = builder.contactItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<ContactItem> getContactItem() {
        return contactItem;
    }

    public void setContactItem(List<ContactItem> contactItem) {
        this.contactItem = contactItem;
    }


    public static final class Builder {
        private String groupName;
        private List<ContactItem> contactItem;

        private Builder() {
        }

        public GroupContactItem build() {
            return new GroupContactItem(this);
        }

        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder contactItem(List<ContactItem> contactItem) {
            this.contactItem = contactItem;
            return this;
        }
    }
}
