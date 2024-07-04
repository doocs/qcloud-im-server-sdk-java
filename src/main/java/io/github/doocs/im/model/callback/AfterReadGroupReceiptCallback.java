package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupMsgReceiptItem;

import java.io.Serializable;
import java.util.List;

/**
 * 解散话题之后回调
 *
 * @author bingo
 * @since 2024/7/4 10:18
 */
public class AfterReadGroupReceiptCallback implements Serializable {
    private static final long serialVersionUID = -8370882337185872213L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群组类型
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 已读回执信息
     */
    @JsonProperty("GroupMsgReceiptList")
    private List<GroupMsgReceiptItem> groupMsgReceiptList;

    /**
     * 事件触发的毫秒级别时间戳
     */
    @JsonProperty("EventTime")
    private Long eventTime;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<GroupMsgReceiptItem> getGroupMsgReceiptList() {
        return groupMsgReceiptList;
    }

    public void setGroupMsgReceiptList(List<GroupMsgReceiptItem> groupMsgReceiptList) {
        this.groupMsgReceiptList = groupMsgReceiptList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
