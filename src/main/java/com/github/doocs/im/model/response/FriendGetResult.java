package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 16:47
 */
public class FriendGetResult extends GenericResult {
    @JsonProperty("UserDataItem")
    private List<UserDataItem> userDataItemList;

    @JsonProperty("StandardSequence")
    private Integer standardSequence;

    @JsonProperty("CustomSequence")
    private Integer customSequence;

    @JsonProperty("FriendNum")
    private Integer friendNum;

    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    @JsonProperty("NextStartIndex")
    private Integer nextStartIndex;

    @JsonProperty("ErrorDisplay")
    private Integer errorDisplay;

    public List<UserDataItem> getUserDataItemList() {
        return userDataItemList;
    }

    public void setUserDataItemList(List<UserDataItem> userDataItemList) {
        this.userDataItemList = userDataItemList;
    }

    public Integer getStandardSequence() {
        return standardSequence;
    }

    public void setStandardSequence(Integer standardSequence) {
        this.standardSequence = standardSequence;
    }

    public Integer getCustomSequence() {
        return customSequence;
    }

    public void setCustomSequence(Integer customSequence) {
        this.customSequence = customSequence;
    }

    public Integer getFriendNum() {
        return friendNum;
    }

    public void setFriendNum(Integer friendNum) {
        this.friendNum = friendNum;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(Integer nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public Integer getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(Integer errorDisplay) {
        this.errorDisplay = errorDisplay;
    }
}
