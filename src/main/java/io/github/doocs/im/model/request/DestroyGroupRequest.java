package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 解散群组-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestroyGroupRequest extends GenericRequest {
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    public DestroyGroupRequest() {
    }

    public DestroyGroupRequest(String groupId) {
        this.groupId = groupId;
    }

    private DestroyGroupRequest(Builder builder) {
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

        public DestroyGroupRequest build() {
            return new DestroyGroupRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
