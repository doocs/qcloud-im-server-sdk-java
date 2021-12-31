package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupAttr;

import java.util.List;

/**
 * @author bingo
 * @since 2021/12/31 11:04
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetGroupAttrRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("GroupAttr")
    private List<GroupAttr> groupAttrs;

    public SetGroupAttrRequest() {
    }

    public SetGroupAttrRequest(String groupId, List<GroupAttr> groupAttrs) {
        this.groupId = groupId;
        this.groupAttrs = groupAttrs;
    }

    private SetGroupAttrRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.groupAttrs = builder.groupAttrs;
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

    public List<GroupAttr> getGroupAttrs() {
        return groupAttrs;
    }

    public void setGroupAttrs(List<GroupAttr> groupAttrs) {
        this.groupAttrs = groupAttrs;
    }


    public static final class Builder {
        private String groupId;
        private List<GroupAttr> groupAttrs;

        private Builder() {
        }

        public SetGroupAttrRequest build() {
            return new SetGroupAttrRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder groupAttrs(List<GroupAttr> groupAttrs) {
            this.groupAttrs = groupAttrs;
            return this;
        }
    }
}
