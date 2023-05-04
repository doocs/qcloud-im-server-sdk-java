package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取群消息已读回执信息-请求参数
 *
 * @author bingo
 * @since 2022/7/24 20:00
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupMsgReceiptRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8465078486156319042L;
    /**
     * 要拉取已读回执详情的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 拉取消息的 seq 列表
     */
    @JsonProperty("MsgSeqList")
    private List<MsgSeqItem> msgSeqList;

    public GetGroupMsgReceiptRequest() {
    }

    public GetGroupMsgReceiptRequest(String groupId, List<MsgSeqItem> msgSeqList) {
        this.groupId = groupId;
        this.msgSeqList = msgSeqList;
    }

    private GetGroupMsgReceiptRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeqList = builder.msgSeqList;
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

    public List<MsgSeqItem> getMsgSeqList() {
        return msgSeqList;
    }

    public void setMsgSeqList(List<MsgSeqItem> msgSeqList) {
        this.msgSeqList = msgSeqList;
    }


    public static final class Builder {
        private String groupId;
        private List<MsgSeqItem> msgSeqList;

        private Builder() {
        }

        public GetGroupMsgReceiptRequest build() {
            return new GetGroupMsgReceiptRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeqList(List<MsgSeqItem> msgSeqList) {
            this.msgSeqList = msgSeqList;
            return this;
        }
    }
}
