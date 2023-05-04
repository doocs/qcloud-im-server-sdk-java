package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 添加黑名单-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:44
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListAddRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 1261637320116838075L;
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

    public BlackListAddRequest() {
    }

    public BlackListAddRequest(String fromAccount, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
    }

    private BlackListAddRequest(Builder builder) {
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

        public BlackListAddRequest build() {
            return new BlackListAddRequest(this);
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
