package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取被禁言群成员列表-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMutedAccountRequest extends GenericRequest {
    /**
     * 需要获取被禁言成员列表的群组 ID。
     */
    @JsonProperty("GroupId")
    private String groupId;

    public GetGroupMutedAccountRequest() {
    }

    public GetGroupMutedAccountRequest(String groupId) {
        this.groupId = groupId;
    }

    private GetGroupMutedAccountRequest(Builder builder) {
        this.groupId = builder.groupId;
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


    public static final class Builder {
        private String groupId;

        private Builder() {
        }

        public GetGroupMutedAccountRequest build() {
            return new GetGroupMutedAccountRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
