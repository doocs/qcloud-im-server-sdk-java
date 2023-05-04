package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 创建话题之后回调
 *
 * @author bingo
 * @since 2022/8/2 11:41
 */
public class AfterCreateGroupTopicCallback implements Serializable {
    private static final long serialVersionUID = 527584691317599470L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 操作的话题所属的群组ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 操作的话题ID
     */
    @JsonProperty("TopicId")
    private String topicId;

    /**
     * 发起创建话题请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * 请求创建话题所属群的群主 UserID
     */
    @JsonProperty("Owner_Account")
    private String ownerAccount;

    /**
     * 代表创建话题所属的群组类型，这里为Community
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 请求创建的话题的名称
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 用户创建话题时的自定义字段，这个字段默认是没有的，需要开通
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

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
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

    public List<UserDefinedDataItem> getUserDefinedDataList() {
        return userDefinedDataList;
    }

    public void setUserDefinedDataList(List<UserDefinedDataItem> userDefinedDataList) {
        this.userDefinedDataList = userDefinedDataList;
    }
}
