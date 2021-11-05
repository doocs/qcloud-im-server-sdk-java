package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.doocs.im.constant.MsgType;

/**
 * 抽象消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "MsgType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TIMTextMsgElement.class, name = MsgType.TIM_TEXT_ELEM),
        @JsonSubTypes.Type(value = TIMVideoFileMsgElement.class, name = MsgType.TIM_VIDEO_FILE_ELEM),
        @JsonSubTypes.Type(value = TIMCustomMsgElement.class, name = MsgType.TIM_CUSTOM_ELEM),
        @JsonSubTypes.Type(value = TIMSoundMsgElement.class, name = MsgType.TIM_SOUND_ELEM),
        @JsonSubTypes.Type(value = TIMImageMsgElement.class, name = MsgType.TIM_IMAGE_ELEM),
        @JsonSubTypes.Type(value = TIMLocationMsgElement.class, name = MsgType.TIM_LOCATION_ELEM),
        @JsonSubTypes.Type(value = TIMFileMsgElement.class, name = MsgType.TIM_FILE_ELEM),
        @JsonSubTypes.Type(value = TIMFaceMsgElement.class, name = MsgType.TIM_FACE_ELEM)
})
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
