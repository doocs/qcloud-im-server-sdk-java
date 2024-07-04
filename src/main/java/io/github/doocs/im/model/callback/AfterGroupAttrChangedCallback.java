package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupAttr;

import java.io.Serializable;
import java.util.List;

/**
 * 群自定义属性变更后回调
 *
 * @author bingo
 * @since 2024/7/14 10:18
 */
public class AfterGroupAttrChangedCallback implements Serializable {

    private static final long serialVersionUID = -8602621515102445503L;

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
     * 群组类型 群组类型介绍，例如：Public
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 发起群自定义属性变更请求的操作者 UserID
     */
    @JsonProperty("Operator_Account")
    private String operatorAccount;

    /**
     * "set" : 重置自定义属性; "modify": 修改自定义属性;  "clear": 清空自定义属性;  "delete" : 删除自定义属性
     */
    @JsonProperty("OptionType")
    private String optionType;

    /**
     * 自定义属性列表，key 为自定义属性的键，value 为自定义属性的值
     */
    @JsonProperty("GroupAttr")
    private List<GroupAttr> groupAttr;

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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public List<GroupAttr> getGroupAttr() {
        return groupAttr;
    }

    public void setGroupAttr(List<GroupAttr> groupAttr) {
        this.groupAttr = groupAttr;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }
}
