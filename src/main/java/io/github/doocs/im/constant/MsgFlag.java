package io.github.doocs.im.constant;

/**
 * 消息接收选项
 *
 * @author bingo
 * @since 2021/10/30 19:50
 */
public class MsgFlag {
    /**
     * 接收并提示
     */
    public static final String ACCEPT_AND_NOTIFY = "AcceptAndNotify";

    /**
     * 接收不提示
     */
    public static final String ACCEPT_NOT_NOTIFY = "AcceptNotNotify";

    /**
     * 屏蔽群消息
     */
    public static final String DISCARD = "Discard";

    private MsgFlag() {

    }
}
