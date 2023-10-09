package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 删除账号-请求参数
 *
 * @author bingo
 * @since 2021/7/30 17:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDeleteRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -1136860412161667975L;
    /**
     * 请求删除的账号对象数组，单次请求最多支持100个账号
     */
    @JsonProperty("DeleteItem")
    private List<AccountDeleteItem> deleteItemList;

    public AccountDeleteRequest() {
    }

    public AccountDeleteRequest(List<AccountDeleteItem> deleteItemList) {
        this.deleteItemList = deleteItemList;
    }

    private AccountDeleteRequest(Builder builder) {
        this.deleteItemList = builder.deleteItemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<AccountDeleteItem> getDeleteItemList() {
        return deleteItemList;
    }

    public void setDeleteItemList(List<AccountDeleteItem> deleteItemList) {
        this.deleteItemList = deleteItemList;
    }


    public static final class Builder {
        private List<AccountDeleteItem> deleteItemList;

        private Builder() {
        }

        public AccountDeleteRequest build() {
            return new AccountDeleteRequest(this);
        }

        public Builder deleteItemList(List<AccountDeleteItem> deleteItemList) {
            this.deleteItemList = deleteItemList;
            return this;
        }
    }
}
