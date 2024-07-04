package io.github.doocs.im.model.group;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.callback.MemberAccount;

import java.io.Serializable;
import java.util.List;

/**
 * 群回执信息
 *
 * @author bingo
 * @since 2024/7/4 11:02
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgReceiptItem implements Serializable {
    private static final long serialVersionUID = -3039181995609048682L;

    /**
     * 消息 Seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 已读成员数
     */
    @JsonProperty("ReadNum")
    private Integer readNum;

    /**
     * 未读成员数
     */
    @JsonProperty("UnreadNum")
    private Integer unreadNum;

    /**
     * 已读成员列表，Member_Account 为已读成员 UserID
     */
    @JsonProperty("ReadReceiptMembers")
    private List<MemberAccount> readReceiptMembers;

    public GroupMsgReceiptItem() {
    }

    public GroupMsgReceiptItem(Long msgSeq, Integer readNum, Integer unreadNum, List<MemberAccount> readReceiptMembers) {
        this.msgSeq = msgSeq;
        this.readNum = readNum;
        this.unreadNum = unreadNum;
        this.readReceiptMembers = readReceiptMembers;
    }

    private GroupMsgReceiptItem(Builder builder) {
        this.msgSeq = builder.msgSeq;
        this.readNum = builder.readNum;
        this.unreadNum = builder.unreadNum;
        this.readReceiptMembers = builder.readReceiptMembers;
    }

    public static Builder builder() {
        return new Builder();
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

    public List<MemberAccount> getReadReceiptMembers() {
        return readReceiptMembers;
    }

    public void setReadReceiptMembers(List<MemberAccount> readReceiptMembers) {
        this.readReceiptMembers = readReceiptMembers;
    }


    public static final class Builder {
        private Long msgSeq;
        private Integer readNum;
        private Integer unreadNum;
        private List<MemberAccount> readReceiptMembers;

        private Builder() {
        }

        public GroupMsgReceiptItem build() {
            return new GroupMsgReceiptItem(this);
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder readNum(Integer readNum) {
            this.readNum = readNum;
            return this;
        }

        public Builder unreadNum(Integer unreadNum) {
            this.unreadNum = unreadNum;
            return this;
        }

        public Builder readReceiptMembers(List<MemberAccount> readReceiptMembers) {
            this.readReceiptMembers = readReceiptMembers;
            return this;
        }
    }
}
