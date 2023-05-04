package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取群历史消息-结果
 *
 * @author hyh
 * @since 2021/08/01 13:35
 */
public class GroupMsgGetSimpleResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -5371321790104935593L;
    /**
     * 请求中的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 是否返回了请求区间的全部消息
     * 当成功返回了请求区间的全部消息时，值为1
     * 当消息长度太长或者区间太大（超过20）导致无法返回全部消息时，值为0
     * 当消息长度太长或者区间太大（超过20）且所有消息都过期时，值为2
     */
    @JsonProperty("IsFinished")
    private Integer isFinished;

    /**
     * 返回的消息列表
     */
    @JsonProperty("RspMsgList")
    private List<RspMsgItem> rspMsgList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public List<RspMsgItem> getRspMsgList() {
        return rspMsgList;
    }

    public void setRspMsgList(List<RspMsgItem> rspMsgList) {
        this.rspMsgList = rspMsgList;
    }

    @Override
    public String toString() {
        return "GroupMsgGetSimpleResult{" +
                "groupId='" + groupId + '\'' +
                ", isFinished=" + isFinished +
                ", rspMsgList=" + rspMsgList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
