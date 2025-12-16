package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * <p>
 * 关注请求结构体对象
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class FollowRequestItem implements Serializable {
    private static final long serialVersionUID = -9020322405344913908L;

    /**
     * 待关注的用户的 UserID，单次请求的 To_Account 数不得超过20
     */
    @JsonProperty("To_Account")
    private String toAccount;

    public FollowRequestItem() {
    }

    public FollowRequestItem(String toAccount) {
        this.toAccount = toAccount;
    }

    private FollowRequestItem(FollowRequestItem.Builder builder) {
        this.toAccount = builder.toAccount;
    }

    public static FollowRequestItem.Builder builder() {
        return new FollowRequestItem.Builder();
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public static final class Builder {
        private String toAccount;

        private Builder() {
        }

        public FollowRequestItem build() {
            return new FollowRequestItem(this);
        }

        public FollowRequestItem.Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
