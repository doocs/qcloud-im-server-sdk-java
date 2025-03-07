package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 群消息已读回执-请求参数
 *
 * @author bingo
 * @since 2025/3/11 10:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgReceiptRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 2935798209818566660L;

    /**
     * 要拉取已读回执详情的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 回执用户 ID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 回执消息列表，上限为50条消息
     */
    @JsonProperty("MsgSeqList")
    private List<MsgSeqItem> msgSeqList;

    public GroupMsgReceiptRequest() {
    }

    public GroupMsgReceiptRequest(String groupId, String fromAccount, List<MsgSeqItem> msgSeqList) {
        this.groupId = groupId;
        this.fromAccount = fromAccount;
        this.msgSeqList = msgSeqList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<MsgSeqItem> getMsgSeqList() {
        return msgSeqList;
    }

    public void setMsgSeqList(List<MsgSeqItem> msgSeqList) {
        this.msgSeqList = msgSeqList;
    }

    private GroupMsgReceiptRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.fromAccount = builder.fromAccount;
        this.msgSeqList = builder.msgSeqList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String groupId;
        private String fromAccount;
        private List<MsgSeqItem> msgSeqList;

        private Builder() {
        }

        public GroupMsgReceiptRequest build() {
            return new GroupMsgReceiptRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder msgSeqList(List<MsgSeqItem> msgSeqList) {
            this.msgSeqList = msgSeqList;
            return this;
        }
    }
}
