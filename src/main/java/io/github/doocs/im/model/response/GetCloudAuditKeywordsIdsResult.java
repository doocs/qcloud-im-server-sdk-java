package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核获取词库列表-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class GetCloudAuditKeywordsIdsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -113248727602659409L;

    /**
     * 当前请求唯一标识。
     */
    @JsonProperty("RequestId")
    private String requestId;

    /**
     * 词库总数。
     */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
     * 返回的词库数组。
     */
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
        return "GetCloudAuditKeywordsIdsResult{" +
                "requestId='" + requestId + '\'' +
                ", totalCount=" + totalCount +
                ", infos=" + infos +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
