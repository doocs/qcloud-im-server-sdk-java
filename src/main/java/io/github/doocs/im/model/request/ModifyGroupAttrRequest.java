package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupAttr;

import java.util.List;

/**
 * 修改群自定义属性-请求参数
 *
 * @author bingo
 * @since 2021/12/31 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyGroupAttrRequest extends GenericRequest {
    /**
     * 修改自定义属性的群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 自定义属性列表，key 为自定义属性的键，value 为自定义属性的值
     */
    @JsonProperty("GroupAttr")
    private List<GroupAttr> groupAttrs;

    public ModifyGroupAttrRequest() {
    }

    public ModifyGroupAttrRequest(String groupId, List<GroupAttr> groupAttrs) {
        this.groupId = groupId;
        this.groupAttrs = groupAttrs;
    }

    private ModifyGroupAttrRequest(Builder builder) {
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

        public ModifyGroupAttrRequest build() {
            return new ModifyGroupAttrRequest(this);
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
