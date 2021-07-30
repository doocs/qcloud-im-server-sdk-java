package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:39
 */
public class FriendCheckResult extends GenericResult {
    @JsonProperty("InfoItem")
    private List<FriendCheckInfoItem> friendCheckInfoItemList;

    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<FriendCheckInfoItem> getFriendCheckInfoItemList() {
        return friendCheckInfoItemList;
    }

    public void setFriendCheckInfoItemList(List<FriendCheckInfoItem> friendCheckInfoItemList) {
        this.friendCheckInfoItemList = friendCheckInfoItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }
}
