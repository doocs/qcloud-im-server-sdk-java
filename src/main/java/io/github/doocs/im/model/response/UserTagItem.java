package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 14:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTagItem implements Serializable {
    private static final long serialVersionUID = 8753699301897294891L;
    /**
     * 目标用户账号
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 标签集合
     */
    @JsonProperty("Tags")
    private List<String> tags;

    public UserTagItem() {
    }

    public UserTagItem(String toAccount, List<String> tags) {
        this.toAccount = toAccount;
        this.tags = tags;
    }

    private UserTagItem(Builder builder) {
        this.toAccount = builder.toAccount;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static final class Builder {
        private String toAccount;
        private List<String> tags;

        private Builder() {
        }

        public UserTagItem build() {
            return new UserTagItem(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }
    }

    @Override
    public String toString() {
        return "UserTagItem{" +
                "toAccount='" + toAccount + '\'' +
                ", tags=" + tags +
                '}';
    }
}
