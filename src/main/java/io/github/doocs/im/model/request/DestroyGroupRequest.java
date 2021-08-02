package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 16:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestroyGroupRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    public DestroyGroupRequest() {
    }

    public DestroyGroupRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
