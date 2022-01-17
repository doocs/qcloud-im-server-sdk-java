package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取群自定义属性-请求参数
 *
 * @author bingo
 * @since 2021/12/31 10:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupAttrRequest extends GenericRequest {
    /**
     * 获取自定义属性的群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    public GetGroupAttrRequest() {
    }

    public GetGroupAttrRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    private GetGroupAttrRequest(Builder builder) {
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String groupId;

        private Builder() {
        }

        public GetGroupAttrRequest build() {
            return new GetGroupAttrRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
