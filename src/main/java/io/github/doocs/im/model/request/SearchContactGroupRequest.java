package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 搜索会话分组标记-请求参数
 *
 * @author bingo
 * @since 2023/3/16 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchContactGroupRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 985597318730044569L;
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待搜索的会话对象列表，一次最多支持300个会话搜索
     */
    @JsonProperty("ContactItem")
    private List<ContactItem> contactItem;

    public SearchContactGroupRequest() {
    }

    public SearchContactGroupRequest(String fromAccount, List<ContactItem> contactItem) {
        this.fromAccount = fromAccount;
        this.contactItem = contactItem;
    }

    private SearchContactGroupRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.contactItem = builder.contactItem;
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

    public List<ContactItem> getContactItem() {
        return contactItem;
    }

    public void setContactItem(List<ContactItem> contactItem) {
        this.contactItem = contactItem;
    }


    public static final class Builder {
        private String fromAccount;
        private List<ContactItem> contactItem;

        private Builder() {
        }

        public SearchContactGroupRequest build() {
            return new SearchContactGroupRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder contactItem(List<ContactItem> contactItem) {
            this.contactItem = contactItem;
            return this;
        }
    }
}
