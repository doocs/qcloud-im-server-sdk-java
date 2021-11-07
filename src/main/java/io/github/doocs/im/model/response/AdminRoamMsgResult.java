package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 17:56
 */
public class AdminRoamMsgResult extends GenericResult {
    @JsonProperty("Complete")
    private Integer complete;

    @JsonProperty("MsgCnt")
    private Integer msgCnt;

    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

    @JsonProperty("MsgList")
    private List<MsgListItem> msgList;

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Integer getMsgCnt() {
        return msgCnt;
    }

    public void setMsgCnt(Integer msgCnt) {
        this.msgCnt = msgCnt;
    }

    public Integer getLastMsgTime() {
        return lastMsgTime;
    }

    public void setLastMsgTime(Integer lastMsgTime) {
        this.lastMsgTime = lastMsgTime;
    }

    public String getLastMsgKey() {
        return lastMsgKey;
    }

    public void setLastMsgKey(String lastMsgKey) {
        this.lastMsgKey = lastMsgKey;
    }

    public List<MsgListItem> getMsgList() {
        return msgList;
    }

    public void setMsgList(List<MsgListItem> msgList) {
        this.msgList = msgList;
    }

    @Override
    public String toString() {
        return "AdminRoamMsgResult{" +
                "complete=" + complete +
                ", msgCnt=" + msgCnt +
                ", lastMsgTime=" + lastMsgTime +
                ", lastMsgKey='" + lastMsgKey + '\'' +
                ", msgList=" + msgList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
