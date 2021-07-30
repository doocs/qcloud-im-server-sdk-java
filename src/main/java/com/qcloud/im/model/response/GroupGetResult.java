package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 17:38
 */
public class GroupGetResult extends GenericResult {
    @JsonProperty("ResultItem")
    private List<GroupGetResultItem> resultItemList;

    @JsonProperty("CurrentSequence")
    private Integer currentSequence;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<GroupGetResultItem> getResultItemList() {
        return resultItemList;
    }

    public void setResultItemList(List<GroupGetResultItem> resultItemList) {
        this.resultItemList = resultItemList;
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
}
