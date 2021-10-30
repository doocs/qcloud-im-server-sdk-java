package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

/**
 * 文本消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMTextMsgElement extends TIMMsgElement {
    @JsonProperty("MsgContent")
    private TextMsgContent msgContent;

    public TIMTextMsgElement() {
        super(MsgType.TIM_TEXT_ELEM);
    }

    public TIMTextMsgElement(TextMsgContent msgContent) {
        this();
        this.msgContent = msgContent;
    }

    public TIMTextMsgElement(String text) {
        this(new TextMsgContent(text));
    }

    public TextMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(TextMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TextMsgContent {
        @JsonProperty("Text")
        private String text;

        public TextMsgContent() {
        }

        public TextMsgContent(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
