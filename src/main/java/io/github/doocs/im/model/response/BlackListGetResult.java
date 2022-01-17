package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取黑名单-结果
 *
 * @author hyh
 * @since 2021/07/30 17:21
 */
public class BlackListGetResult extends GenericResult {
    /**
     * 黑名单对象数组，每一个黑名单对象都包括了 To_Account 和 AddBlackTimeStamp
     */
    @JsonProperty("BlackListItem")
    private List<BlackListItem> blackListItemList;

    /**
     * 下页拉取的起始位置，0表示已拉完
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 黑名单最新的 Seq
     */
    @JsonProperty("CurruentSequence")
    private Integer currentSequence;

    /**
     * 详细的客户端展示信息
     */
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
