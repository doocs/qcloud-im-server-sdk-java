package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 16:43
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupShuttedUinRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    public GetGroupShuttedUinRequest() {
    }

    public GetGroupShuttedUinRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
