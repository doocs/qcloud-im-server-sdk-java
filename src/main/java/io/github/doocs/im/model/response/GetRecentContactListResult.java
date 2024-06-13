package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取会话列表-结果
 *
 * @author bingo
 * @since 2021/10/11 10:31
 */
public class GetRecentContactListResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8335606803016423379L;
    /**
     * 会话对象数组
     */
    @JsonProperty("SessionItem")
    private List<RecentContactSessionItem> sessionItem;

    /**
     * 结束标识：1 表示已返回全量会话，0 表示还有会话没拉完
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 普通会话下一页拉取的起始时间，分页拉取时通过请求包的 TimeStamp 字段带给移动通信后台
     */
    @JsonProperty("TimeStamp")
    private Long timestamp;

    /**
     * 普通会话下一页拉取的起始位置，分页拉取时通过请求包的 StartIndex 字段带给移动通信后台
     */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /**
     * 置顶会话下一页拉取的起始时间，分页拉取时通过请求包的 TopTimeStamp 字段带给移动通信后台
     */
    @JsonProperty("TopTimeStamp")
    private Long topTimestamp;

    /**
     * 置顶会话下一页拉取的起始位置，分页拉取时通过请求包的 TopStartIndex 字段带给移动通信后台
     */
    @JsonProperty("TopStartIndex")
    private Integer topStartIndex;

    /**
     * 详细的客户端展示信息
     */
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Long getTopTimestamp() {
        return topTimestamp;
    }

    public void setTopTimestamp(Long topTimestamp) {
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
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
