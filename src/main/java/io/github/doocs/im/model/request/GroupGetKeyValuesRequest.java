package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取群消息扩展-请求参数
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetKeyValuesRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8395305952081063115L;
    /**
     * 群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要设置的群消息的Seq
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 拉取大于等于StartSeq的消息扩展
     */
    @JsonProperty("StartSeq")
    private Long startSeq;

    public GroupGetKeyValuesRequest() {
    }

    public GroupGetKeyValuesRequest(String groupId, Long msgSeq) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
    }

    public GroupGetKeyValuesRequest(String groupId, Long msgSeq, Long startSeq) {
        this.groupId = groupId;
        this.msgSeq = msgSeq;
        this.startSeq = startSeq;
    }

    private GroupGetKeyValuesRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.msgSeq = builder.msgSeq;
        this.startSeq = builder.startSeq;
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

    public Long getStartSeq() {
        return startSeq;
    }

    public void setStartSeq(Long startSeq) {
        this.startSeq = startSeq;
    }


    public static final class Builder {
        private String groupId;
        private Long msgSeq;
        private Long startSeq;

        private Builder() {
        }

        public GroupGetKeyValuesRequest build() {
            return new GroupGetKeyValuesRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder startSeq(Long startSeq) {
            this.startSeq = startSeq;
            return this;
        }
    }
}
