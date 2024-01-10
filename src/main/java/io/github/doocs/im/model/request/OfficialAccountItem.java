package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2024/01/10 10:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialAccountItem implements Serializable {
    private static final long serialVersionUID = 1193395857815508620L;
    @JsonProperty("Official_Account")
    private String officialAccount;

    public OfficialAccountItem() {
    }

    public OfficialAccountItem(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    private OfficialAccountItem(Builder builder) {
        this.officialAccount = builder.officialAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public static final class Builder {
        private String officialAccount;

        private Builder() {
        }

        public OfficialAccountItem build() {
            return new OfficialAccountItem(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }
    }
}
