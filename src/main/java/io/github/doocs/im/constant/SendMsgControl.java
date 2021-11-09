package io.github.doocs.im.constant;

/**
 * 消息发送控制项
 *
 * @author bingo
 * @since 2021/11/9 16:32
 */
public class SendMsgControl {
    /**
     * 该条消息不计入未读数
     */
    public static final String NO_UNREAD = "NoUnread";

    /**
     * 该条消息不更新会话列表
     */
    public static final String NO_LAST_MSG = "NoLastMsg";

    /**
     * 该条消息的接收方对发送方设置的免打扰选项生效（默认不生效）
     */
    public static final String WITH_MUTE_NOTIFICATIONS = "WithMuteNotifications";

    private SendMsgControl() {

    }
}
