package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 14:57
 */
public class PortraitGetResult extends GenericResult {
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    @JsonProperty("UserProfileItem")
    private List<UserProfileItem> userProfileItemList;

    @JsonProperty("Fail_Account")
    private List<String> failAccount;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    public List<UserProfileItem> getUserProfileItemList() {
        return userProfileItemList;
    }

    public void setUserProfileItemList(List<UserProfileItem> userProfileItemList) {
        this.userProfileItemList = userProfileItemList;
    }

    public List<String> getFailAccount() {
        return failAccount;
    }

    public void setFailAccount(List<String> failAccount) {
        this.failAccount = failAccount;
    }
}
