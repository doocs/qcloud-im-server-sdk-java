package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/02 17:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgSeqItem {
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    public MsgSeqItem() {
    }

    public MsgSeqItem(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }
}
