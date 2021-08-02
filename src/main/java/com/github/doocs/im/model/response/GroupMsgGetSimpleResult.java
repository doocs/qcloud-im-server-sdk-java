package com.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/01 13:35
 */
public class GroupMsgGetSimpleResult extends GenericResult {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("IsFinished")
    private Integer isFinished;

    @JsonProperty("RspMsgList")
    private List<RspMsgItem> rspMsgList;

    public GroupMsgGetSimpleResult() {
    }

    public GroupMsgGetSimpleResult(String groupId, Integer isFinished, List<RspMsgItem> rspMsgList) {
        this.groupId = groupId;
        this.isFinished = isFinished;
        this.rspMsgList = rspMsgList;
    }

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
                '}';
    }
}
