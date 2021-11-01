package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/31 17:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImGetTagRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private List<String> toAccount;

    public ImGetTagRequest() {
    }

    public ImGetTagRequest(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    private ImGetTagRequest(Builder builder) {
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

        public ImGetTagRequest build() {
            return new ImGetTagRequest(this);
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
