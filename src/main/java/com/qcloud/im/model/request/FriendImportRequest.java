package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qcloud.im.model.response.GenericResult;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 15:19
 */
public class FriendImportRequest extends GenericResult {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("AddFriendItem")
    private List<AddFriendItem> addFriendItemList;

    public FriendImportRequest() {
    }

    public FriendImportRequest(String fromAccount, List<AddFriendItem> addFriendItemList) {
        this.fromAccount = fromAccount;
        this.addFriendItemList = addFriendItemList;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<AddFriendItem> getAddFriendItemList() {
        return addFriendItemList;
    }

    public void setAddFriendItemList(List<AddFriendItem> addFriendItemList) {
        this.addFriendItemList = addFriendItemList;
    }
}
