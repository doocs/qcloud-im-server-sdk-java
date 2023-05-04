package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 校验好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendCheckRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -6565388817389300109L;
    /**
     * 需要校验该 UserID 的好友
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 请求校验的好友的 UserID 列表，单次请求的 To_Account 数不得超过1000
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 校验模式，详情可参见 校验好友
     * {@link io.github.doocs.im.constant.CheckResultType}
     */
    @JsonProperty("CheckType")
    private String checkType;

    public FriendCheckRequest() {
    }

    public FriendCheckRequest(String fromAccount, List<String> toAccount, String checkType) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.checkType = checkType;
    }

    private FriendCheckRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.checkType = builder.checkType;
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

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> toAccount;
        private String checkType;

        private Builder() {
        }

        public FriendCheckRequest build() {
            return new FriendCheckRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder checkType(String checkType) {
            this.checkType = checkType;
            return this;
        }
    }
}
