package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/30 17:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDeleteItem implements Serializable {
    private static final long serialVersionUID = -8176275123666544945L;
    /**
     * 请求删除的账号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    public AccountDeleteItem() {
    }

    public AccountDeleteItem(String userId) {
        this.userId = userId;
    }

    private AccountDeleteItem(Builder builder) {
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public static final class Builder {
        private String userId;

        private Builder() {
        }

        public AccountDeleteItem build() {
            return new AccountDeleteItem(this);
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
    }
}
