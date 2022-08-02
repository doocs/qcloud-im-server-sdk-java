package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 话题信息
 *
 * @author bingo
 * @since 2022/8/2 10:45
 */
public class TopicAndSelfInfoItem {
    /**
     * 错误码
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    /**
     * 错误信息
     */
    @JsonProperty("ErrorInfo")
    private String errorInfo;

    /**
     * 指定的用户在此话题中的相关信息
     */
    @JsonProperty("SelfInfo")
    private SelfInfo selfInfo;

    /**
     * 返回的话题信息
     */
    @JsonProperty("TopicInfo")
    private TopicInfo topicInfo;

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

    public SelfInfo getSelfInfo() {
        return selfInfo;
    }

    public void setSelfInfo(SelfInfo selfInfo) {
        this.selfInfo = selfInfo;
    }

    public TopicInfo getTopicInfo() {
        return topicInfo;
    }

    public void setTopicInfo(TopicInfo topicInfo) {
        this.topicInfo = topicInfo;
    }

    @Override
    public String toString() {
        return "TopicAndSelfInfoItem{" +
                "errorCode=" + errorCode +
                ", errorInfo='" + errorInfo + '\'' +
                ", selfInfo=" + selfInfo +
                ", topicInfo=" + topicInfo +
                '}';
    }
}
