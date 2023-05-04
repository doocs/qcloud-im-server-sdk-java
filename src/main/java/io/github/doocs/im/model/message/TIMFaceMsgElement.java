package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

import java.io.Serializable;

/**
 * 表情消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMFaceMsgElement extends TIMMsgElement implements Serializable {
    private static final long serialVersionUID = -7102796968963047885L;

    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private FaceMsgContent msgContent;

    public TIMFaceMsgElement() {
        this(null);
    }

    public TIMFaceMsgElement(FaceMsgContent msgContent) {
        super(MsgType.TIM_FACE_ELEM);
        this.msgContent = msgContent;
    }

    public TIMFaceMsgElement(Integer index, String data) {
        this(new FaceMsgContent(index, data));
    }

    public FaceMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(FaceMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FaceMsgContent {
        @JsonProperty("Index")
        private Integer index;

        @JsonProperty("Data")
        private String data;

        public FaceMsgContent() {
        }

        public FaceMsgContent(Integer index, String data) {
            this.index = index;
            this.data = data;
        }

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
