package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核主动批量审核结果
 *
 * @author bingo
 * @since 2023/10/31 10:25
 */
public class BatchContentModerationResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 2158637502606683308L;

    @JsonProperty("AuditResults")
    private List<BatchContentModerationResultItem> auditResults;

    public List<BatchContentModerationResultItem> getAuditResults() {
        return auditResults;
    }

    public void setAuditResults(List<BatchContentModerationResultItem> auditResults) {
        this.auditResults = auditResults;
    }

    @Override
    public String toString() {
        return "BatchContentModerationResult{" +
                "auditResults=" + auditResults +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
