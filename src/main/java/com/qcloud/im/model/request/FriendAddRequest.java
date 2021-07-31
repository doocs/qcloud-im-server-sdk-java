package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 14:08
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendAddRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("AddFriendItem")
    private List<AddFriendItem> addFriendItemList;

    @JsonProperty("AddType")
    private String addType;

    @JsonProperty("ForceAddFlags")
    private Integer forceAddFlags;

    public FriendAddRequest() {
    }

    public FriendAddRequest(String fromAccount, List<AddFriendItem> addFriendItemList, String addType, Integer forceAddFlags) {
        this.fromAccount = fromAccount;
        this.addFriendItemList = addFriendItemList;
        this.addType = addType;
        this.forceAddFlags = forceAddFlags;
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

    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public Integer getForceAddFlags() {
        return forceAddFlags;
    }

    public void setForceAddFlags(Integer forceAddFlags) {
        this.forceAddFlags = forceAddFlags;
    }
}
