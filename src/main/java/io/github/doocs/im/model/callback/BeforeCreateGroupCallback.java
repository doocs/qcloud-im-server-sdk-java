package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 创建群组之前回调
 *
 * @author bingo
 * @since 2021/11/16 17:11
 */
public class BeforeCreateGroupCallback implements Serializable {
    private static final long serialVersionUID = 1766596869590486226L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 发起创建群组请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 请求创建的群的群主 UserID
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 产生群消息的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 请求创建的群组的名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 该用户已创建的同类的群组个数
     */
    @JsonProperty("CreateGroupNum")
    private Integer createGroupNum;

    /**
     * 该用户已创建的不同类的群组个数
     */
    @JsonProperty("CreatedGroupNum")
    private Map<String, Integer> createdGroupNum;

    /**
     * 选项
     * DisableInvite
     */
    @JsonProperty("InviteOption")
    private String inviteOption;

    /**
     * 请求创建的群组的初始化成员列表
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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreateGroupNum() {
        return createGroupNum;
    }

    public void setCreateGroupNum(Integer createGroupNum) {
        this.createGroupNum = createGroupNum;
    }

    public Map<String, Integer> getCreatedGroupNum() {
        return createdGroupNum;
    }

    public void setCreatedGroupNum(Map<String, Integer> createdGroupNum) {
        this.createdGroupNum = createdGroupNum;
    }

    public String getInviteOption() {
        return inviteOption;
    }

    public void setInviteOption(String inviteOption) {
        this.inviteOption = inviteOption;
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
