package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 云端审核主动审核-结果
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class ContentModerationResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3694611178862709644L;

    /**
     * 当前请求唯一标识
     */
    @JsonProperty("RequestId")
    private String requestId;

    /**
     * 图文审核建议，Pass/Review/Block
     */
    @JsonProperty("Result")
    private String result;

    /**
     * 图文审核恶意值：0 - 100，恶意程度与 Score 成正比。
     */
    @JsonProperty("Score")
    private Integer score;

    /**
     * 送审内容命中的标签，Normal/Polity/Porn/Illegal/Abuse/Terror/Ad/Sexy/Composite
     */
    @JsonProperty("Label")
    private String label;

    /**
     * 违规时，命中的关键词，如果模型命中不会有关键词返回。
     */
    @JsonProperty("Keywords")
    private List<String> keywords;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "ContentModerationResult{" +
                "requestId='" + requestId + '\'' +
                ", result='" + result + '\'' +
                ", score=" + score +
                ", label='" + label + '\'' +
                ", keywords=" + keywords +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
