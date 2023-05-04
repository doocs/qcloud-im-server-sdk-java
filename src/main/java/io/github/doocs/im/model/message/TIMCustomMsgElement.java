package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

import java.io.Serializable;

/**
 * 自定义消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:42
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMCustomMsgElement extends TIMMsgElement implements Serializable {
    private static final long serialVersionUID = -7102796968963047885L;

    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private CustomMsgContent msgContent;

    public TIMCustomMsgElement() {
        this(null);
    }

    public TIMCustomMsgElement(CustomMsgContent msgContent) {
        super(MsgType.TIM_CUSTOM_ELEM);
        this.msgContent = msgContent;
    }

    public TIMCustomMsgElement(String data, String desc, String ext, String sound) {
        this(new CustomMsgContent(data, desc, ext, sound));
    }

    public CustomMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(CustomMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CustomMsgContent {
        @JsonProperty("Data")
        private String data;

        @JsonProperty("Desc")
        private String desc;

        @JsonProperty("Ext")
        private String ext;

        @JsonProperty("Sound")
        private String sound;

        public CustomMsgContent() {
        }

        public CustomMsgContent(String data, String desc, String ext, String sound) {
            this.data = data;
            this.desc = desc;
            this.ext = ext;
            this.sound = sound;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }
    }
}
