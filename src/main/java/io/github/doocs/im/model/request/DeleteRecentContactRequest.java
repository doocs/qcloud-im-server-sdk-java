package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/11 10:49
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRecentContactRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("Type")
    private Integer type;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ClearRamble")
    private Integer clearRamble;

    public DeleteRecentContactRequest() {
    }

    public DeleteRecentContactRequest(String fromAccount, Integer type, String toAccount) {
        this.fromAccount = fromAccount;
        this.type = type;
        this.toAccount = toAccount;
    }

    public DeleteRecentContactRequest(String fromAccount, Integer type, String toAccount, Integer clearRamble) {
        this.fromAccount = fromAccount;
        this.type = type;
        this.toAccount = toAccount;
        this.clearRamble = clearRamble;
    }

    private DeleteRecentContactRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.type = builder.type;
        this.toAccount = builder.toAccount;
        this.clearRamble = builder.clearRamble;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getClearRamble() {
        return clearRamble;
    }

    public void setClearRamble(Integer clearRamble) {
        this.clearRamble = clearRamble;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer type;
        private String toAccount;
        private Integer clearRamble;

        private Builder() {
        }

        public DeleteRecentContactRequest build() {
            return new DeleteRecentContactRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder clearRamble(Integer clearRamble) {
            this.clearRamble = clearRamble;
            return this;
        }
    }
}
