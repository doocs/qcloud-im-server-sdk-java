package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 群消息已读回执信息
 *
 * @author bingo
 * @since 2022/7/24 20:06
 */
public class GroupMsgReceiptResultItem {
    /**
     * 对应已读回执信息错误码，例如：10062代表已读回执信息不存在
     */
    @JsonProperty("Code")
    private Integer code;

    /**
     * 拉取消息的 seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 群消息已读数
     */
    @JsonProperty("ReadNum")
    private Integer readNum;

    /**
     * 群消息未读数
     */
    @JsonProperty("UnreadNum")
    private Integer unreadNum;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public Integer getUnreadNum() {
        return unreadNum;
    }

    public void setUnreadNum(Integer unreadNum) {
        this.unreadNum = unreadNum;
    }

    @Override
    public String toString() {
        return "GroupMsgReceiptResultItem{" +
                "code=" + code +
                ", msgSeq=" + msgSeq +
                ", readNum=" + readNum +
                ", unreadNum=" + unreadNum +
                '}';
    }
}
