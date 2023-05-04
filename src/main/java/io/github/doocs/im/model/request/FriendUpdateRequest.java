package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 更新好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendUpdateRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 7955752755662491847L;
    /**
     * 需要更新该 UserID 的关系链数据
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 需要更新的好友对象数组
     */
    @JsonProperty("UpdateItem")
    private List<UpdateItem> updateItemList;

    public FriendUpdateRequest() {
    }

    public FriendUpdateRequest(String fromAccount, List<UpdateItem> updateItemList) {
        this.fromAccount = fromAccount;
        this.updateItemList = updateItemList;
    }

    private FriendUpdateRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.updateItemList = builder.updateItemList;
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

    public List<UpdateItem> getUpdateItemList() {
        return updateItemList;
    }

    public void setUpdateItemList(List<UpdateItem> updateItemList) {
        this.updateItemList = updateItemList;
    }


    public static final class Builder {
        private String fromAccount;
        private List<UpdateItem> updateItemList;

        private Builder() {
        }

        public FriendUpdateRequest build() {
            return new FriendUpdateRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder updateItemList(List<UpdateItem> updateItemList) {
            this.updateItemList = updateItemList;
            return this;
        }
    }
}
