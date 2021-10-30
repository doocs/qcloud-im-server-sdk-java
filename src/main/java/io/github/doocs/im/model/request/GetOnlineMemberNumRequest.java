package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOnlineMemberNumRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    public GetOnlineMemberNumRequest(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
