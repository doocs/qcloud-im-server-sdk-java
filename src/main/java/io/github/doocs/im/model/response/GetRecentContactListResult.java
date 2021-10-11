package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/10/11 10:31
 */
public class GetRecentContactListResult extends GenericResult {
    @JsonProperty("SessionItem")
    private List<RecentContactSessionItem> sessionItem;

    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    @JsonProperty("TimeStamp")
    private Integer timestamp;

    @JsonProperty("StartIndex")
    private Integer startIndex;

    @JsonProperty("TopTimeStamp")
    private Integer topTimestamp;

    @JsonProperty("TopStartIndex")
    private Integer topStartIndex;

    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public List<RecentContactSessionItem> getSessionItem() {
        return sessionItem;
    }

    public void setSessionItem(List<RecentContactSessionItem> sessionItem) {
        this.sessionItem = sessionItem;
    }

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getTopTimestamp() {
        return topTimestamp;
    }

    public void setTopTimestamp(Integer topTimestamp) {
        this.topTimestamp = topTimestamp;
    }

    public Integer getTopStartIndex() {
        return topStartIndex;
    }

    public void setTopStartIndex(Integer topStartIndex) {
        this.topStartIndex = topStartIndex;
    }

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "GetRecentContactListResult{" +
                "sessionItem=" + sessionItem +
                ", completeFlag=" + completeFlag +
                ", timestamp=" + timestamp +
                ", startIndex=" + startIndex +
                ", topTimestamp=" + topTimestamp +
                ", topStartIndex=" + topStartIndex +
                ", errorDisplay='" + errorDisplay + '\'' +
                '}';
    }
}
