package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 抽象消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class TIMMsgElement {
    @JsonProperty("MsgType")
    private String msgType;

    public TIMMsgElement(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgType() {
        return msgType;
    }
}
