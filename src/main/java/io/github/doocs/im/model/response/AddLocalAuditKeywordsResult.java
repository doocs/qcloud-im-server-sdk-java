package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 本地审核添加敏感词-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class AddLocalAuditKeywordsResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 3256696338828847221L;

    /**
     * 当前请求唯一标识
     */
    @JsonProperty("RequestId")
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "AddLocalAuditKeywordsResult{" +
                "requestId='" + requestId + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
