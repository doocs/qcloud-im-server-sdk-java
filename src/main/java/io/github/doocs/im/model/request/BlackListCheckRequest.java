package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 15:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlackListCheckRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    @JsonProperty("CheckType")
    private String checkType;

    public BlackListCheckRequest() {
    }

    public BlackListCheckRequest(String fromAccount, List<String> toAccount, String checkType) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.checkType = checkType;
    }

    private BlackListCheckRequest(Builder builder) {
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

        public BlackListCheckRequest build() {
            return new BlackListCheckRequest(this);
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
