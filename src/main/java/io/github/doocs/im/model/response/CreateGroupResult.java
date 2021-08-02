package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/1 11:24
 */
public class CreateGroupResult extends GenericResult {
    @JsonProperty("GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "CreateGroupResult{" +
                "groupId='" + groupId + '\'' +
                '}';
    }
}
