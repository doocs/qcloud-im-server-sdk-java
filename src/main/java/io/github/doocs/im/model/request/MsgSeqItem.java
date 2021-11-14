package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 17:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgSeqItem {
    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    public MsgSeqItem() {
    }

    public MsgSeqItem(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    private MsgSeqItem(Builder builder) {
        this.msgSeq = builder.msgSeq;
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


    public static final class Builder {
        /**
         * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
         */
        private Long msgSeq;

        private Builder() {
        }

        public MsgSeqItem build() {
            return new MsgSeqItem(this);
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }
    }
}
