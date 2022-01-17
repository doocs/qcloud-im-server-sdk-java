package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 删除好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDeleteRequest extends GenericRequest {
    /**
     * 需要删除该 UserID 的好友
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待删除的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 删除模式，详情可参见 删除好友
     */
    @JsonProperty("DeleteType")
    private String deleteType;

    public FriendDeleteRequest() {
    }

    public FriendDeleteRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    public FriendDeleteRequest(String fromAccount, List<String> toAccount, String deleteType) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.deleteType = deleteType;
    }

    private FriendDeleteRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
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

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> toAccount;
        private String deleteType;

        private Builder() {
        }

        public FriendDeleteRequest build() {
            return new FriendDeleteRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder deleteType(String deleteType) {
            this.deleteType = deleteType;
            return this;
        }
    }
}
