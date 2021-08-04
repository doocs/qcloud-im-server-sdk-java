package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:41
 */
public class RecallRetItem {
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("RetCode")
    private Integer retCode;

    @Override
    public String toString() {
        return "RecallRetItem{" +
                "msgSeq=" + msgSeq +
                ", retCode=" + retCode +
                '}';
    }
}
