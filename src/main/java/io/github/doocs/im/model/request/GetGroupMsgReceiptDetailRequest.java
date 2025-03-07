package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取群消息已读回执详情-请求参数
 *
 * @author bingo
 * @since 2022/7/24 20:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMsgReceiptDetailRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 8422315941795557874L;
    /**
     * 要拉取已读回执详情的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 拉取消息的 seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 拉取已读，未读成员列表，0表示拉取已读成员列表，1表示拉取未读列表
     */
    @JsonProperty("Filter")
    private Integer filter;

    /**
     * 上一次拉取到的成员位置，第一次填写""
     */
    @JsonProperty("Cursor")
    private String cursor;

    /**
     * 一次最多拉取多少个成员数，最高可填200，超过按200算
     */
    @JsonProperty("Count")
    private Integer count;

    public GetGroupMsgReceiptDetailRequest() {
    }

    public GetGroupMsgReceiptDetailRequest(String groupId, Integer filter, String cursor, Integer count) {
        this.groupId = groupId;
        this.filter = filter;
        this.cursor = cursor;
        this.count = count;
    }

    public GetGroupMsgReceiptDetailRequest(String groupId, Long msgSeq, Integer filter, String cursor, Integer count) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.filter = filter;
        this.cursor = cursor;
        this.count = count;
    }

    private GetGroupMsgReceiptDetailRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
        this.filter = builder.filter;
        this.cursor = builder.cursor;
        this.count = builder.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getFilter() {
        return filter;
    }

    public void setFilter(Integer filter) {
        this.filter = filter;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public static final class Builder {
        private String groupId;
        private Long msgSeq;
        private Integer filter;
        private String cursor;
        private Integer count;

        private Builder() {
        }

        public GetGroupMsgReceiptDetailRequest build() {
            return new GetGroupMsgReceiptDetailRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder flag(Integer filter) {
            this.filter = filter;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder num(Integer count) {
            this.count = count;
            return this;
        }
    }
}
