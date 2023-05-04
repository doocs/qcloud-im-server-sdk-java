package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除用户所有标签-请求参数
 *
 * @author bingo
 * @since 2021/7/31 17:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImRemoveAllTagsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -6574990173350054487L;
    /**
     * 目标用户帐号
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public ImRemoveAllTagsRequest() {
    }

    public ImRemoveAllTagsRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    private ImRemoveAllTagsRequest(Builder builder) {
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

        public ImRemoveAllTagsRequest build() {
            return new ImRemoveAllTagsRequest(this);
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
