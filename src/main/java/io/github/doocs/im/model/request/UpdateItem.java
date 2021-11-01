package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:22
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("SnsItem")
    private List<SnsItem> snsItemList;

    public UpdateItem() {
    }

    public UpdateItem(String toAccount, List<SnsItem> snsItemList) {
        this.toAccount = toAccount;
        this.snsItemList = snsItemList;
    }

    private UpdateItem(Builder builder) {
        this.toAccount = builder.toAccount;
        this.snsItemList = builder.snsItemList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<SnsItem> getSnsItemList() {
        return snsItemList;
    }

    public void setSnsItemList(List<SnsItem> snsItemList) {
        this.snsItemList = snsItemList;
    }


    public static final class Builder {
        private String toAccount;
        private List<SnsItem> snsItemList;

        private Builder() {
        }

        public UpdateItem build() {
            return new UpdateItem(this);
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder snsItemList(List<SnsItem> snsItemList) {
            this.snsItemList = snsItemList;
            return this;
        }
    }
}
