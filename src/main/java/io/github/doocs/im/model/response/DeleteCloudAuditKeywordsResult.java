package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核删除敏感词-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class DeleteCloudAuditKeywordsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -124411252959014920L;

    /**
     * 当前请求唯一标识。
     */
    @JsonProperty("RequestId")
    private String requestId;

    /**
     * 删除成功的总数。
     */
    @JsonProperty("Count")
    private Integer count;

    /**
     * 删除敏感词信息数组。
     */
    @JsonProperty("Details")
    private List<CloudAuditKeywordDetail> details;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<CloudAuditKeywordDetail> getDetails() {
        return details;
    }

    public void setDetails(List<CloudAuditKeywordDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "DeleteCloudAuditKeywordsResult{" +
                "requestId='" + requestId + '\'' +
                ", count=" + count +
                ", details=" + details +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
