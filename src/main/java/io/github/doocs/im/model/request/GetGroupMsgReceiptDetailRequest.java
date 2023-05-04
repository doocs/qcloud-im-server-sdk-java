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
    @JsonProperty("Flag")
    private Integer flag;

    /**
     * 上一次拉取到的成员位置，第一次填写""
     */
    @JsonProperty("Cursor")
    private String cursor;

    /**
     * 一次最多拉取多少个成员数，最高可填200，超过按200算
     */
    @JsonProperty("Num")
    private Integer num;

    public GetGroupMsgReceiptDetailRequest() {
    }

    public GetGroupMsgReceiptDetailRequest(String groupId, Integer flag, String cursor, Integer num) {
        this.groupId = groupId;
        this.flag = flag;
        this.cursor = cursor;
        this.num = num;
    }

    public GetGroupMsgReceiptDetailRequest(String groupId, Long msgSeq, Integer flag, String cursor, Integer num) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.flag = flag;
        this.cursor = cursor;
        this.num = num;
    }

    private GetGroupMsgReceiptDetailRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
        this.flag = builder.flag;
        this.cursor = builder.cursor;
        this.num = builder.num;
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

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    public static final class Builder {
        private String groupId;
        private Long msgSeq;
        private Integer flag;
        private String cursor;
        private Integer num;

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

        public Builder flag(Integer flag) {
            this.flag = flag;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder num(Integer num) {
            this.num = num;
            return this;
        }
    }
}
