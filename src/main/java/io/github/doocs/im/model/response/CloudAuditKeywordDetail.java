package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 */
public class CloudAuditKeywordDetail implements Serializable {
    private static final long serialVersionUID = 4822803853925482134L;

    /**
     * 删除敏感词 ID。
     */
    @JsonProperty("KeywordID")
    private String keywordId;

    /**
     * 删除敏感词内容。
     */
    @JsonProperty("Keyword")
    private String keyword;

    /**
     * 删除是否成功。
     */
    @JsonProperty("Deleted")
    private Boolean deleted;

    /**
     * 删除失败的错误信息。
     */
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
