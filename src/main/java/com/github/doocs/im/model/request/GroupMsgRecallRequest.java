package com.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 17:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgRecallRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("MsgSeqList")
    private List<MsgSeqItem> msgSeqList;

    public GroupMsgRecallRequest() {
    }

    public GroupMsgRecallRequest(String groupId, List<MsgSeqItem> msgSeqList) {
        this.groupId = groupId;
        this.msgSeqList = msgSeqList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<MsgSeqItem> getMsgSeqList() {
        return msgSeqList;
    }

    public void setMsgSeqList(List<MsgSeqItem> msgSeqList) {
        this.msgSeqList = msgSeqList;
    }
}
