package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取直播群在线列表-请求参数
 *
 * @author bingo
 * @since 2022/07/15 14:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMembersRequest extends GenericRequest {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 首次请求传0，当直播群中人数较多时，后台返回非0的 Timestamp 表示需要分页拉取，后续请求将 Timestamp 传回，直到后台返回0
     */
    @JsonProperty("Timestamp")
    private Integer timestamp;

    public GetMembersRequest() {
    }

    public GetMembersRequest(String groupId, Integer timestamp) {
        this.groupId = groupId;
        this.timestamp = timestamp;
    }

    private GetMembersRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.timestamp = builder.timestamp;
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

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }


    public static final class Builder {
        private String groupId;
        private Integer timestamp;

        private Builder() {
        }

        public GetMembersRequest build() {
            return new GetMembersRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder timestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
    }
}
