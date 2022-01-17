package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取直播群在线人数-请求参数
 *
 * @author hyh
 * @since 2021/08/01 13:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOnlineMemberNumRequest extends GenericRequest {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    public GetOnlineMemberNumRequest() {
    }

    public GetOnlineMemberNumRequest(String groupId) {
        this.groupId = groupId;
    }

    private GetOnlineMemberNumRequest(Builder builder) {
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

        public GetOnlineMemberNumRequest build() {
            return new GetOnlineMemberNumRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
