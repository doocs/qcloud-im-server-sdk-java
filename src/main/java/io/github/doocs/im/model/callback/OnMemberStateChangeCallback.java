package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 直播群成员在线状态回调
 *
 * @author bingo
 * @since 2022/7/1 10:13
 */
public class OnMemberStateChangeCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 产生群消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 产生群消息的 群组类型介绍，固定为 AVChatRoom
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 事件类型：Offline - 掉线、Online - 重新上线
     */
    @JsonProperty("EventType")
    private String eventType;

    /**
     * 产生事件的成员列表
     */
    @JsonProperty("MemberList")
    private List<MemberAccount> memberList;

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

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<MemberAccount> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberAccount> memberList) {
        this.memberList = memberList;
    }
}
