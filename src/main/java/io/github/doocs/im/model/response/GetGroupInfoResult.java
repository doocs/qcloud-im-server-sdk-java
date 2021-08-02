package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:47
 */
public class GetGroupInfoResult extends GenericResult {
    @JsonProperty("GroupInfo")
    private List<GroupInfoResultItem> groupInfo;

    public List<GroupInfoResultItem> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfoResultItem> groupInfo) {
        this.groupInfo = groupInfo;
    }

    @Override
    public String toString() {
        return "GetGroupInfoResult{" +
                "groupInfo=" + groupInfo +
                '}';
    }
}
