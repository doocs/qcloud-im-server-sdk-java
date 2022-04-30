package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.MsgSeqItem;

import java.util.List;

/**
 * 撤回群消息之后回调
 *
 * @author hyh
 * @since 2022/04/30 20:59
 */
public class AfterRecallMsgCallback {
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 撤回群聊消息的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 群组类型，例如 Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 撤回消息 MsgSeq 列表
     */
    @JsonProperty("MsgSeqList")
    private List<MsgSeqItem> msgSeqList;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
