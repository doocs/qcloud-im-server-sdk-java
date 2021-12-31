package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/12/31 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClearGroupAttrRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    public ClearGroupAttrRequest() {
    }

    public ClearGroupAttrRequest(String groupId) {
        this.groupId = groupId;
    }

    private ClearGroupAttrRequest(Builder builder) {
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

        public ClearGroupAttrRequest build() {
            return new ClearGroupAttrRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
