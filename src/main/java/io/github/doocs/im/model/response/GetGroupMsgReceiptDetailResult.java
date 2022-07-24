package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取群消息已读回执详情-结果
 *
 * @author bingo
 * @since 2022/7/24 20:05
 */
public class GetGroupMsgReceiptDetailResult extends GenericResult {
    /**
     * 是否已经拉取完毕，0表示未拉取完毕，1表示拉取完毕
     */
    @JsonProperty("IsFinished")
    private Integer isFinished;

    /**
     * 拉取消息的 seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 已读成员列表
     */
    @JsonProperty("ReadList")
    private List<ReadAccountItem> readList;

    /**
     * 未读成员列表
     */
    @JsonProperty("UnreadList")
    private List<UnreadAccountItem> unreadList;

    /**
     * 下一次请求应该传的 Cursor 值
     */
    @JsonProperty("Cursor")
    private String cursor;

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public List<ReadAccountItem> getReadList() {
        return readList;
    }

    public void setReadList(List<ReadAccountItem> readList) {
        this.readList = readList;
    }

    public List<UnreadAccountItem> getUnreadList() {
        return unreadList;
    }

    public void setUnreadList(List<UnreadAccountItem> unreadList) {
        this.unreadList = unreadList;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "GetGroupMsgReceiptDetailResult{" +
                "isFinished=" + isFinished +
                ", msgSeq=" + msgSeq +
                ", readList=" + readList +
                ", unreadList=" + unreadList +
                ", cursor='" + cursor + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
