package io.github.doocs.im.constant;

/**
 * 消息元素类别
 *
 * @author bingo
 * @since 2021/10/29 11:19
 */
public class MsgType {
    /**
     * 文本消息
     */
    public static final String TIM_TEXT_ELEM = "TIMTextElem";

    /**
     * 地理位置消息
     */
    public static final String TIM_LOCATION_ELEM = "TIMLocationElem";

    /**
     * 表情消息
     */
    public static final String TIM_FACE_ELEM = "TIMFaceElem";

    /**
     * 自定义消息，当接收方为 iOS 系统且应用处在后台时，此消息类型可携带除文本以外的字段到 APNs。一条组合消息中只能包含一个 TIMCustomElem 自定义消息元素
     */
    public static final String TIM_CUSTOM_ELEM = "TIMCustomElem";

    /**
     * 语音消息
     */
    public static final String TIM_SOUND_ELEM = "TIMSoundElem";

    /**
     * 图像消息
     */
    public static final String TIM_IMAGE_ELEM = "TIMImageElem";

    /**
     * 文件消息
     */
    public static final String TIM_FILE_ELEM = "TIMFileElem";

    /**
     * 视频消息
     */
    public static final String TIM_VIDEO_FILE_ELEM = "TIMVideoFileElem";
}
