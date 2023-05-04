package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 查询单聊消息-请求参数
 *
 * @author hyh
 * @since 2021/07/28 17:56
 */
public class AdminRoamMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 3666649198140327478L;
    /**
     * 是否全部拉取，0表示未全部拉取，需要续拉，1表示已全部拉取
     */
    @JsonProperty("Complete")
    private Integer complete;

    /**
     * 本次拉取到的消息条数
     */
    @JsonProperty("MsgCnt")
    private Integer msgCnt;

    /**
     * 本次拉取到的消息里的最后一条消息的时间
     */
    @JsonProperty("LastMsgTime")
    private Integer lastMsgTime;

    /**
     * 本次拉取到的消息里的最后一条消息的标识
     */
    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

    /**
     * 返回的消息列表
     */
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
