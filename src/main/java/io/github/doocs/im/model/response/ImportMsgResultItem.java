package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/8/4 11:46
 */
public class ImportMsgResultItem {
    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgTime")
    private Integer msgTime;

    @JsonProperty("Result")
    private Integer result;

    @Override
    public String toString() {
        return "ImportMsgResultItem{" +
                "msgSeq=" + msgSeq +
                ", msgTime=" + msgTime +
                ", result=" + result +
                '}';
    }
}
