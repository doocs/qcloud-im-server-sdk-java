package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建话题-结果
 *
 * @author bingo
 * @since 2022/8/2 10:30
 */
public class CreateGroupTopicResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -384572983542963330L;
    /**
     * 创建成功之后的话题 ID，由用户自定义或者即时通信 IM 后台分配
     */
    @JsonProperty("TopicId")
    private String topicId;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "CreateGroupTopicResult{" +
                "topicId='" + topicId + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
