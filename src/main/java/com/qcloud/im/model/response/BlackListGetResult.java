package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:21
 */
public class BlackListGetResult extends GenericResult {
    @JsonProperty("BlackListItem")
    private List<BlackListItem> blackListItemList;

    @JsonProperty("StartIndex")
    private Integer startIndex;

    @JsonProperty("CurruentSequence")
    private Integer currentSequence;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<BlackListItem> getBlackListItemList() {
        return blackListItemList;
    }

    public void setBlackListItemList(List<BlackListItem> blackListItemList) {
        this.blackListItemList = blackListItemList;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(Integer currentSequence) {
        this.currentSequence = currentSequence;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "BlackListGetResult{" +
                "blackListItemList=" + blackListItemList +
                ", startIndex=" + startIndex +
                ", currentSequence=" + currentSequence +
                ", errorDisplay='" + errorDisplay + '\'' +
                '}';
    }
}
