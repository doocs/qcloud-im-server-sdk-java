package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/31 14:30
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendDeleteAllRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("DeleteType")
    private String deleteType;

    public FriendDeleteAllRequest(String fromAccount) {
        this(fromAccount, null);
    }

    public FriendDeleteAllRequest(String fromAccount, String deleteType) {
        this.fromAccount = fromAccount;
        this.deleteType = deleteType;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType;
    }
}
