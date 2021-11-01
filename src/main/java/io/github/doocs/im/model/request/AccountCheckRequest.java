package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/30 17:26
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountCheckRequest extends GenericRequest {
    @JsonProperty("CheckItem")
    private List<AccountCheckItem> checkItemList;

    public AccountCheckRequest() {
    }

    public AccountCheckRequest(List<AccountCheckItem> checkItemList) {
        this.checkItemList = checkItemList;
    }

    private AccountCheckRequest(Builder builder) {
        this.checkItemList = builder.checkItemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<AccountCheckItem> getCheckItemList() {
        return checkItemList;
    }

    public void setCheckItemList(List<AccountCheckItem> checkItemList) {
        this.checkItemList = checkItemList;
    }

    public static final class Builder {
        private List<AccountCheckItem> checkItemList;

        private Builder() {
        }

        public AccountCheckRequest build() {
            return new AccountCheckRequest(this);
        }

        public Builder checkItemList(List<AccountCheckItem> checkItemList) {
            this.checkItemList = checkItemList;
            return this;
        }
    }
}
