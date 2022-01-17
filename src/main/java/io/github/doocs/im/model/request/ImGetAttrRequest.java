package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取用户属性-请求参数
 *
 * @author bingo
 * @since 2021/7/31 16:50
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImGetAttrRequest extends GenericRequest {
    /**
     * 目标用户帐号列表
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public ImGetAttrRequest() {
    }

    public ImGetAttrRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    private ImGetAttrRequest(Builder builder) {
        this.toAccount = builder.toAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }


    public static final class Builder {
        private List<String> toAccount;

        private Builder() {
        }

        public ImGetAttrRequest build() {
            return new ImGetAttrRequest(this);
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
