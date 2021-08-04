package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:25
 */
public class SendGroupMsgResult extends GenericResult {
    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("msgSeq")
    private Integer msgSeq;

    @Override
    public String toString() {
        return "SendGroupMsgResult{" +
                "msgTime=" + msgTime +
                ", msgSeq=" + msgSeq +
                '}';
    }
}
