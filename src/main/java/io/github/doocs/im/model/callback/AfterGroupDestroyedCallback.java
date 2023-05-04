package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 群组解散之后回调
 *
 * @author bingo
 * @since 2021/11/16 20:18
 */
public class AfterGroupDestroyedCallback implements Serializable {


    private static final long serialVersionUID = 4171542131600974621L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 被解散的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 被解散群的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群主 UserID
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 群组名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 被解散群的成员列表
     */
    @JsonProperty("MemberList")
    private List<MemberAccount> memberList;

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

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MemberAccount> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberAccount> memberList) {
        this.memberList = memberList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
