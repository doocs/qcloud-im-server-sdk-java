package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 解散话题结果项
 *
 * @author bingo
 * @since 2021/8/4 10:48
 */
public class DestroyGroupTopicResultItem {
    /**
     * 错误码，0表示成功，非0表示失败
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    /**
     * 错误信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 话题 ID
     */
    @JsonProperty("TopicId")
    private String topicId;

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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "DestroyGroupTopicResultItem{" +
                "errorCode=" + errorCode +
                ", errorInfo='" + errorInfo + '\'' +
                ", topicId='" + topicId + '\'' +
                '}';
    }
}
