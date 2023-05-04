package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取话题资料-结果
 *
 * @author bingo
 * @since 2022/8/2 10:44
 */
public class GetGroupTopicResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4709815573743494860L;
    /**
     * 话题信息
     */
    @JsonProperty("TopicAndSelfInfo")
    private List<TopicAndSelfInfoItem> topicAndSelfInfo;

    public List<TopicAndSelfInfoItem> getTopicAndSelfInfo() {
        return topicAndSelfInfo;
    }

    public void setTopicAndSelfInfo(List<TopicAndSelfInfoItem> topicAndSelfInfo) {
        this.topicAndSelfInfo = topicAndSelfInfo;
    }

    @Override
    public String toString() {
        return "GetGroupTopicResult{" +
                "topicAndSelfInfo=" + topicAndSelfInfo +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
