package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取被禁言群成员列表-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMutedAccountRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 7056198606412057975L;
    /**
     * 需要获取被禁言成员列表的群组 ID。
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public GetGroupMutedAccountRequest() {
    }

    public GetGroupMutedAccountRequest(String groupId) {
        this.groupId = groupId;
    }

    public GetGroupMutedAccountRequest(String groupId, String topicId) {
        this.groupId = groupId;
        this.topicId = topicId;
    }

    private GetGroupMutedAccountRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.topicId = builder.topicId;
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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public static final class Builder {
        private String groupId;
        private String topicId;

        private Builder() {
        }

        public GetGroupMutedAccountRequest build() {
            return new GetGroupMutedAccountRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
