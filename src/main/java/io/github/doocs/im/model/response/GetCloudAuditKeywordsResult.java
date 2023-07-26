package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核获取敏感词-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class GetCloudAuditKeywordsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6872558362985051084L;

    @JsonProperty("RequestId")
    private String requestId;

    @JsonProperty("TotalCount")
    private Integer totalCount;

    @JsonProperty("Infos")
    private List<CloudAuditKeyword> infos;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<CloudAuditKeyword> getInfos() {
        return infos;
    }

    public void setInfos(List<CloudAuditKeyword> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "GetCloudAuditKeywordsResult{" +
                "requestId='" + requestId + '\'' +
                ", totalCount=" + totalCount +
                ", infos=" + infos +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
