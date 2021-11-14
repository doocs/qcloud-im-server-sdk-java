package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 17:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgSeqItem {
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
