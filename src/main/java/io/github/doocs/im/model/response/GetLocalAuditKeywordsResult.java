package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.LocalAuditWord;

import java.io.Serializable;
import java.util.List;

/**
 * 本地审核获取敏感词-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class GetLocalAuditKeywordsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 6174939751682164879L;

    /**
     * 当前请求唯一标识
     */
    @JsonProperty("RequestId")
    private String requestId;

    /**
     * 返回的敏感词以及相关属性
     */
    @JsonProperty("LocalAuditWords")
    private List<LocalAuditWord> localAuditWords;

    /**
     * 应用敏感词总数
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 正则类型的敏感词总数
     */
    @JsonProperty("TotalRegCount")
    private Integer totalRegCount;

    /**
     * 以 FilterType，Keyword 为过滤条件下，应用敏感词总数
     */
    @JsonProperty("CurCount")
    private Integer curCount;

    /**
     * 以 FilterType，Keyword 为过滤条件下，正则类型的敏感词总数
     */
    @JsonProperty("CurRegCount")
    private Integer curRegCount;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<LocalAuditWord> getLocalAuditWords() {
        return localAuditWords;
    }

    public void setLocalAuditWords(List<LocalAuditWord> localAuditWords) {
        this.localAuditWords = localAuditWords;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalRegCount() {
        return totalRegCount;
    }

    public void setTotalRegCount(Integer totalRegCount) {
        this.totalRegCount = totalRegCount;
    }

    public Integer getCurCount() {
        return curCount;
    }

    public void setCurCount(Integer curCount) {
        this.curCount = curCount;
    }

    public Integer getCurRegCount() {
        return curRegCount;
    }

    public void setCurRegCount(Integer curRegCount) {
        this.curRegCount = curRegCount;
    }

    @Override
    public String toString() {
        return "GetLocalAuditKeywordsResult{" +
                "requestId='" + requestId + '\'' +
                ", localAuditWords=" + localAuditWords +
                ", totalCount=" + totalCount +
                ", totalRegCount=" + totalRegCount +
                ", curCount=" + curCount +
                ", curRegCount=" + curRegCount +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
