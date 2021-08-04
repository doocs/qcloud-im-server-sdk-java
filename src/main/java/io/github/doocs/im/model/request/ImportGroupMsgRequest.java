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

    @JsonProperty("MsgList")
    private List<ImportGroupMsgListItem> msgList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<ImportGroupMsgListItem> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<ImportGroupMsgListItem> msgList) {
        this.msgList = msgList;
    }
}
