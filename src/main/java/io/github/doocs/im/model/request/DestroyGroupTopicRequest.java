package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 解散话题-请求参数
 *
 * @author bingo
 * @since 2022/8/2 11:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestroyGroupTopicRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -2058739892738626978L;
    /**
     * 需要解散话题所属的群组ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 表示需要解散的话题列表，可以有多个
     */
    @JsonProperty("TopicIdList")
    private List<String> topicIdList;

    public DestroyGroupTopicRequest() {
    }

    public DestroyGroupTopicRequest(String groupId, List<String> topicIdList) {
        this.groupId = groupId;
        this.topicIdList = topicIdList;
    }

    private DestroyGroupTopicRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.topicIdList = builder.topicIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getTopicIdList() {
        return topicIdList;
    }

    public void setTopicIdList(List<String> topicIdList) {
        this.topicIdList = topicIdList;
    }


    public static final class Builder {
        private String groupId;
        private List<String> topicIdList;

        private Builder() {
        }

        public DestroyGroupTopicRequest build() {
            return new DestroyGroupTopicRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder topicIdList(List<String> topicIdList) {
            this.topicIdList = topicIdList;
            return this;
        }
    }
}
