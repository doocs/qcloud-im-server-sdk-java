package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 */
public class CloudAuditKeywordDetail implements Serializable {
    private static final long serialVersionUID = 4822803853925482134L;

    @JsonProperty("KeywordID")
    private String keywordId;

    @JsonProperty("Keyword")
    private String keyword;

    @JsonProperty("Deleted")
    private Boolean deleted;

    @JsonProperty("ErrorInfo")
    private String errorInfo;

    public String getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(String keywordId) {
        this.keywordId = keywordId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Override
    public String toString() {
        return "CloudAuditKeywordDetail{" +
                "keywordId='" + keywordId + '\'' +
                ", keyword='" + keyword + '\'' +
                ", deleted=" + deleted +
                ", errorInfo='" + errorInfo + '\'' +
                '}';
    }
}
