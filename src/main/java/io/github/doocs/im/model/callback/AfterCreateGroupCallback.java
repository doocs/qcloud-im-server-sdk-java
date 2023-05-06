package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 创建群组之后回调
 *
 * @author bingo
 * @since 2021/11/16 17:18
 */
public class AfterCreateGroupCallback implements Serializable {
    private static final long serialVersionUID = 2796288709194288752L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

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
     * 请求创建的群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 请求创建的群组的名称
     */
    @JsonProperty("Name")
    private String name;

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

    /**
     * 用户建群/话题时的自定义字段，这个字段默认是没有的，需要开通
     */
    @JsonProperty("UserDefinedDataList")
    private List<UserDefinedDataItem> userDefinedDataList;

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

    public List<MemberAccount> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberAccount> memberList) {
        this.memberList = memberList;
    }

    public List<UserDefinedDataItem> getUserDefinedDataList() {
        return userDefinedDataList;
    }

    public void setUserDefinedDataList(List<UserDefinedDataItem> userDefinedDataList) {
        this.userDefinedDataList = userDefinedDataList;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
