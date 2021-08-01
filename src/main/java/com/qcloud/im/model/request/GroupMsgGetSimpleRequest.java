package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgGetSimpleRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("ReqMsgSeq")
    private Integer reqMsgSeq;

    @JsonProperty("ReqMsgNumber")
    private Integer reqMsgNumber;

    public GroupMsgGetSimpleRequest() {
    }

    public GroupMsgGetSimpleRequest(String groupId, Integer reqMsgSeq, Integer reqMsgNumber) {
        this.groupId = groupId;
        this.reqMsgSeq = reqMsgSeq;
        this.reqMsgNumber = reqMsgNumber;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Integer getReqMsgSeq() {
        return reqMsgSeq;
    }

    public void setReqMsgSeq(Integer reqMsgSeq) {
        this.reqMsgSeq = reqMsgSeq;
    }

    public Integer getReqMsgNumber() {
        return reqMsgNumber;
    }

    public void setReqMsgNumber(Integer reqMsgNumber) {
        this.reqMsgNumber = reqMsgNumber;
    }

    @Override
    public String toString() {
        return "GroupMsgGetSimpleRequest{" +
                "groupId='" + groupId + '\'' +
                ", reqMsgSeq=" + reqMsgSeq +
                ", reqMsgNumber=" + reqMsgNumber +
                '}';
    }
}
