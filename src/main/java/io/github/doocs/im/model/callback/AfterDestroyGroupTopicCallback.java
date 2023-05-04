package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 话题解散之后回调
 *
 * @author bingo
 * @since 2022/8/2 14:05
 */
public class AfterDestroyGroupTopicCallback implements Serializable {


    private static final long serialVersionUID = -4430343981892146413L;
    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 解散的话题所在的群组
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 代表解散话题所属的群组类型，这里为Community
     */
    @JsonProperty("Type")
    private String type;

    /**
     * 被解散话题的列表
     */
    @JsonProperty("TopicIdList")
    private List<String> topicIdList;

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

    public List<String> getTopicIdList() {
        return topicIdList;
    }

    public void setTopicIdList(List<String> topicIdList) {
        this.topicIdList = topicIdList;
    }
}
