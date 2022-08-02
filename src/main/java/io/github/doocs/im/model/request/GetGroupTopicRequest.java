package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取话题资料-请求参数
 *
 * @author bingo
 * @since 2022/8/2 10:40
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupTopicRequest extends GenericRequest {
    /**
     * 需要获取话题所在的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 获取指定用户在话题中的信息
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 需要获取的话题列表，若不填，则获取群组下所有的话题信息
     */
    @JsonProperty("TopicIdList")
    private List<String> topicIdList;

    /**
     * 返回信息的过滤器，指定需要获取的话题信息
     */
    @JsonProperty("ResponseFilter")
    private List<String> responseFilter;

    /**
     * 话题维度的自定义信息，TopicDefinedData 和群共享自定义字段，可以通过 即时通信 IM 控制台 进行配置，详情请参阅 自定义字段
     */
    @JsonProperty("TopicDefinedData")
    private List<TopicDefinedDataItem> topicDefinedData;

    public GetGroupTopicRequest() {
    }

    public GetGroupTopicRequest(String groupId, String fromAccount) {
        this.groupId = groupId;
        this.fromAccount = fromAccount;
    }

    public GetGroupTopicRequest(String groupId, String fromAccount, List<String> topicIdList,
                                List<String> responseFilter, List<TopicDefinedDataItem> topicDefinedData) {
        this.groupId = groupId;
        this.fromAccount = fromAccount;
        this.topicIdList = topicIdList;
        this.responseFilter = responseFilter;
        this.topicDefinedData = topicDefinedData;
    }

    private GetGroupTopicRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.fromAccount = builder.fromAccount;
        this.topicIdList = builder.topicIdList;
        this.responseFilter = builder.responseFilter;
        this.topicDefinedData = builder.topicDefinedData;
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

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getTopicIdList() {
        return topicIdList;
    }

    public void setTopicIdList(List<String> topicIdList) {
        this.topicIdList = topicIdList;
    }

    public List<String> getResponseFilter() {
        return responseFilter;
    }

    public void setResponseFilter(List<String> responseFilter) {
        this.responseFilter = responseFilter;
    }

    public List<TopicDefinedDataItem> getTopicDefinedData() {
        return topicDefinedData;
    }

    public void setTopicDefinedData(List<TopicDefinedDataItem> topicDefinedData) {
        this.topicDefinedData = topicDefinedData;
    }


    public static final class Builder {
        private String groupId;
        private String fromAccount;
        private List<String> topicIdList;
        private List<String> responseFilter;
        private List<TopicDefinedDataItem> topicDefinedData;

        private Builder() {
        }

        public GetGroupTopicRequest build() {
            return new GetGroupTopicRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder topicIdList(List<String> topicIdList) {
            this.topicIdList = topicIdList;
            return this;
        }

        public Builder responseFilter(List<String> responseFilter) {
            this.responseFilter = responseFilter;
            return this;
        }

        public Builder topicDefinedData(List<TopicDefinedDataItem> topicDefinedData) {
            this.topicDefinedData = topicDefinedData;
            return this;
        }
    }
}
