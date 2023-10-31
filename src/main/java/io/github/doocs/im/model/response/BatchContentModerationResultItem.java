package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核主动批量审核结果项
 *
 * @author bingo
 * @since 2023/10/31 10:25
 */
public class BatchContentModerationResultItem implements Serializable {
    private static final long serialVersionUID = -1502718880898835836L;

    /**
     * 错误码：
     * 0：表示成功
     * 非0：表示失败
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    /**
     * 错误信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 内容 ID，同步请求里面的 ContentId。
     */
    @JsonProperty("ContentId")
    private Integer contentId;

    /**
     * 图文审核建议，Pass/Review/Block
     */
    @JsonProperty("Result")
    private String result;

    /**
     * 违规时，命中的关键词，如果模型命中不会有关键词返回。
     */
    @JsonProperty("Keywords")
    private List<String> keywords;

    /**
     * 图文审核恶意值，0-100，恶意程度与 Score 成正比。
     */
    @JsonProperty("Score")
    private Integer score;

    /**
     * 送审内容命中的标签 Normal/Polity/Porn/Illegal/Abuse/Terror/Ad/Sexy/Composite
     */
    @JsonProperty("Label")
    private String label;

    /**
     * 命中的二级标签
     */
    @JsonProperty("SubLabel")
    private String subLabel;

    /**
     * 审核唯一标示
     */
    @JsonProperty("RequestId")
    private String requestId;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSubLabel() {
        return subLabel;
    }

    public void setSubLabel(String subLabel) {
        this.subLabel = subLabel;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "BatchContentModerationResultItem{" +
                "errorCode=" + errorCode +
                ", errorInfo='" + errorInfo + '\'' +
                ", contentId=" + contentId +
                ", result='" + result + '\'' +
                ", keywords=" + keywords +
                ", score=" + score +
                ", label='" + label + '\'' +
                ", subLabel='" + subLabel + '\'' +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
