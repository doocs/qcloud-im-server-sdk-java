package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2023/3/16 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupContactUpdateItem implements Serializable {
    private static final long serialVersionUID = -4339363816967156703L;
    /**
     * 更新类型: 1 - 分组添加会话; 2 - 分组删除会话
     */
    @JsonProperty("ContactOptType")
    private Integer contactOptType;

    /**
     * 会话对象
     */
    @JsonProperty("ContactItem")
    private ContactItem contactItem;

    private GroupContactUpdateItem(Builder builder) {
        this.contactOptType = builder.contactOptType;
        this.contactItem = builder.contactItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getContactOptType() {
        return contactOptType;
    }

    public void setContactOptType(Integer contactOptType) {
        this.contactOptType = contactOptType;
    }

    public ContactItem getContactItem() {
        return contactItem;
    }

    public void setContactItem(ContactItem contactItem) {
        this.contactItem = contactItem;
    }


    public static final class Builder {
        private Integer contactOptType;
        private ContactItem contactItem;

        private Builder() {
        }

        public GroupContactUpdateItem build() {
            return new GroupContactUpdateItem(this);
        }

        public Builder contactOptType(Integer contactOptType) {
            this.contactOptType = contactOptType;
            return this;
        }

        public Builder contactItem(ContactItem contactItem) {
            this.contactItem = contactItem;
            return this;
        }
    }
}
