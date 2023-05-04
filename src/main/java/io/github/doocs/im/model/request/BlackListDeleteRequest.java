package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除黑名单-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListDeleteRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -3382303724022499500L;
    /**
     * 请求为该 UserID 添加黑名单
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待添加为黑名单的用户 UserID 列表，单次请求的 To_Account 数不得超过1000
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public BlackListDeleteRequest() {
    }

    public BlackListDeleteRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    private BlackListDeleteRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
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


    public static final class Builder {
        private String fromAccount;
        private List<String> toAccount;

        private Builder() {
        }

        public BlackListDeleteRequest build() {
            return new BlackListDeleteRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
