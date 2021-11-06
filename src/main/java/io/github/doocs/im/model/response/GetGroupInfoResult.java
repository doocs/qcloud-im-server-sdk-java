package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupInfo;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/1 11:47
 */
public class GetGroupInfoResult extends GenericResult {
    @JsonProperty("GroupInfo")
    private List<GroupInfo> groupInfo;

    public List<GroupInfo> getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(List<GroupInfo> groupInfo) {
        this.groupInfo = groupInfo;
    }

    @Override
    public String toString() {
        return "GetGroupInfoResult{" +
                "groupInfo=" + groupInfo +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
