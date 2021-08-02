package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.doocs.im.model.request.ProfileItem;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 15:04
 */
public class UserProfileItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItemList;

    @JsonProperty("ResultCode")
    private Integer resultCode;

    @JsonProperty("ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<ProfileItem> getProfileItemList() {
        return profileItemList;
    }

    public void setProfileItemList(List<ProfileItem> profileItemList) {
        this.profileItemList = profileItemList;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    @Override
    public String toString() {
        return "UserProfileItem{" +
                "toAccount='" + toAccount + '\'' +
                ", profileItemList=" + profileItemList +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
