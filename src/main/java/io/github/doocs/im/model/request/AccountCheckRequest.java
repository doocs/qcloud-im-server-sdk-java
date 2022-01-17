package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 查询帐号-请求参数
 *
 * @author bingo
 * @since 2021/7/30 17:26
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountCheckRequest extends GenericRequest {
    /**
     * 请求检查的帐号对象数组，单次请求最多支持100个帐号
     */
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
