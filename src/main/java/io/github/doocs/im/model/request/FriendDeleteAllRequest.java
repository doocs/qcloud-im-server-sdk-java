package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除所有好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:30
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDeleteAllRequest extends GenericRequest {
    /**
     * 指定要清除好友数据的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 删除模式，默认删除单向好友，详情可参见 删除好友
     */
    @JsonProperty("DeleteType")
    private String deleteType;

    public FriendDeleteAllRequest() {
    }

    public FriendDeleteAllRequest(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public FriendDeleteAllRequest(String fromAccount, String deleteType) {
        this.fromAccount = fromAccount;
        this.deleteType = deleteType;
    }

    private FriendDeleteAllRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.deleteType = builder.deleteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }


    public static final class Builder {
        private String fromAccount;
        private String deleteType;

        private Builder() {
        }

        public FriendDeleteAllRequest build() {
            return new FriendDeleteAllRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder deleteType(String deleteType) {
            this.deleteType = deleteType;
            return this;
        }
    }
}
