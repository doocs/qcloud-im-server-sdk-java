package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 17:45
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportGroupMsgRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("RecentContactFlag")
    private Integer recentContactFlag;

    @JsonProperty("MsgList")
    private List<GroupMsgItem> msgList;

    public ImportGroupMsgRequest(String groupId, List<GroupMsgItem> msgList) {
        this(groupId, null, msgList);
    }

    public ImportGroupMsgRequest(String groupId, Integer recentContactFlag, List<GroupMsgItem> msgList) {
        this.groupId = groupId;
        this.recentContactFlag = recentContactFlag;
        this.msgList = msgList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getRecentContactFlag() {
        return recentContactFlag;
    }

    public void setRecentContactFlag(Integer recentContactFlag) {
        this.recentContactFlag = recentContactFlag;
    }

    public List<GroupMsgItem> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<GroupMsgItem> msgList) {
        this.msgList = msgList;
    }
}
