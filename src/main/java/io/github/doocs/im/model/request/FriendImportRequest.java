package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 15:19
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendImportRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("AddFriendItem")
    private List<ImportFriendItem> importFriendItemList;

    public FriendImportRequest() {
    }

    public FriendImportRequest(String fromAccount, List<ImportFriendItem> importFriendItemList) {
        this.fromAccount = fromAccount;
        this.importFriendItemList = importFriendItemList;
    }

    private FriendImportRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.importFriendItemList = builder.importFriendItemList;
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

    public List<ImportFriendItem> getImportFriendItemList() {
        return importFriendItemList;
    }

    public void setImportFriendItemList(List<ImportFriendItem> importFriendItemList) {
        this.importFriendItemList = importFriendItemList;
    }


    public static final class Builder {
        private String fromAccount;
        private List<ImportFriendItem> importFriendItemList;

        private Builder() {
        }

        public FriendImportRequest build() {
            return new FriendImportRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder importFriendItemList(List<ImportFriendItem> importFriendItemList) {
            this.importFriendItemList = importFriendItemList;
            return this;
        }
    }
}
