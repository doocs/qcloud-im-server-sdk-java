package io.github.doocs.im.constant;

/**
 * 消息回调禁止开关，只对单条消息有效
 *
 * @author bingo
 * @since 2021/10/30 19:12
 */
public class ForbidCallbackControl {
    /**
     * 禁止发消息前回调
     */
    public static final String BEFORE = "ForbidBeforeSendMsgCallback";

    /**
     * 禁止发消息后回调
     */
    public static final String AFTER = "ForbidAfterSendMsgCallback";

    private ForbidCallbackControl() {

    }
}
