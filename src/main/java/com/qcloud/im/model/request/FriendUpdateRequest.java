package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendUpdateRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("UpdateItem")
    private List<UpdateItem> updateItemList;

    public FriendUpdateRequest() {
    }

    public FriendUpdateRequest(String fromAccount, List<UpdateItem> updateItemList) {
        this.fromAccount = fromAccount;
        this.updateItemList = updateItemList;
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
}
