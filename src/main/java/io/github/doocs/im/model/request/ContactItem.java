package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 待添加的会话列表
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactItem {
    /**
     * 会话类型，c2c=1,group=2
     */
    @JsonProperty("Type")
    private Integer type;

    /**
     * 群ID
     */
    @JsonProperty("ToGroupId")
    private String toGroupId;

    /**
     * 	用户ID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    public ContactItem() {
    }

    public ContactItem(Integer type) {
        this.type = type;
    }

    public ContactItem(Integer type, String toGroupId, String toAccount) {
        this.type = type;
        this.toGroupId = toGroupId;
        this.toAccount = toAccount;
    }

    private ContactItem(Builder builder) {
        this.type = builder.type;
        this.toGroupId = builder.toGroupId;
        this.toAccount = builder.toAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getToGroupId() {
        return toGroupId;
    }

    public void setToGroupId(String toGroupId) {
        this.toGroupId = toGroupId;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }


    public static final class Builder {
        private Integer type;
        private String toGroupId;
        private String toAccount;

        private Builder() {
        }

        public ContactItem build() {
            return new ContactItem(this);
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder toGroupId(String toGroupId) {
            this.toGroupId = toGroupId;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
