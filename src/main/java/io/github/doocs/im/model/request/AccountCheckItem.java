package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/30 17:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountCheckItem implements Serializable {
    private static final long serialVersionUID = 1772994579121597085L;
    /**
     * 请求检查的账号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    public AccountCheckItem() {
    }

    public AccountCheckItem(String userId) {
        this.userId = userId;
    }

    private AccountCheckItem(Builder builder) {
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

        public AccountCheckItem build() {
            return new AccountCheckItem(this);
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
    }
}
