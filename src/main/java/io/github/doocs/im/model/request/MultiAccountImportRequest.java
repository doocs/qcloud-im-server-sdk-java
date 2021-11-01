package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:07
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiAccountImportRequest extends GenericRequest {
    @JsonProperty("Accounts")
    private List<String> accounts;

    public MultiAccountImportRequest() {
    }

    public MultiAccountImportRequest(List<String> accounts) {
        this.accounts = accounts;
    }

    private MultiAccountImportRequest(Builder builder) {
        this.accounts = builder.accounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }


    public static final class Builder {
        private List<String> accounts;

        private Builder() {
        }

        public MultiAccountImportRequest build() {
            return new MultiAccountImportRequest(this);
        }

        public Builder accounts(List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
    }
}
