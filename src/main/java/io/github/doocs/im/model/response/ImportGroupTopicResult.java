package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 导入话题资料-结果
 *
 * @author bingo
 * @since 2023/1/10 16:29
 */
public class ImportGroupTopicResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -8074572312691577646L;
    /**
     * 创建成功之后的话题 ID，由 IM 云后台分配或者用户指定
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
        return "ImportGroupTopicResult{" +
                "topicId='" + topicId + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
