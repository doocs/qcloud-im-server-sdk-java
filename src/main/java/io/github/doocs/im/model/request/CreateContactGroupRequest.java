package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 创建会话分组数据-请求参数
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateContactGroupRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 2392023496691769178L;
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待添加的会话分组，当前仅支持单个添加
     */
    @JsonProperty("GroupContactItem")
    private List<GroupContactItem> groupContactItem;

    public CreateContactGroupRequest() {
    }

    public CreateContactGroupRequest(String fromAccount, List<GroupContactItem> groupContactItem) {
        this.fromAccount = fromAccount;
        this.groupContactItem = groupContactItem;
    }

    private CreateContactGroupRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.groupContactItem = builder.groupContactItem;
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

    public List<GroupContactItem> getGroupContactItem() {
        return groupContactItem;
    }

    public void setGroupContactItem(List<GroupContactItem> groupContactItem) {
        this.groupContactItem = groupContactItem;
    }


    public static final class Builder {
        private String fromAccount;
        private List<GroupContactItem> groupContactItem;

        private Builder() {
        }

        public CreateContactGroupRequest build() {
            return new CreateContactGroupRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder groupContactItem(List<GroupContactItem> groupContactItem) {
            this.groupContactItem = groupContactItem;
            return this;
        }
    }
}
