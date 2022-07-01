package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建群组之前回调
 *
 * @author bingo
 * @since 2021/11/16 17:11
 */
public class BeforeCreateGroupCallback {
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
    @JsonProperty("CreatedGroupNum")
    private Integer createdGroupNum;

    /**
     * 请求创建的群组的初始化成员列表
     */
    @JsonProperty("MemberList")
    private List<MemberAccount> memberList;

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

    public Integer getCreatedGroupNum() {
        return createdGroupNum;
    }

    public void setCreatedGroupNum(Integer createdGroupNum) {
        this.createdGroupNum = createdGroupNum;
    }

    public List<MemberAccount> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<MemberAccount> memberList) {
        this.memberList = memberList;
    }
}
