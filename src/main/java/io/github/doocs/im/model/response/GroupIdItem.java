package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/31 21:04
 */
public class GroupIdItem implements Serializable {
    private static final long serialVersionUID = -1277194592253248357L;
    /**
     * 群ID
     */
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
        return "GroupIdItem{" +
                "groupId='" + groupId + '\'' +
                '}';
    }
}
