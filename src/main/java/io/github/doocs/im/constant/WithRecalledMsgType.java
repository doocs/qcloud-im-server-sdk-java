package io.github.doocs.im.constant;

/**
 * 是否带撤回的消息
 *
 * @author bingo
 * @since 2022/8/8 15:42
 */
public class WithRecalledMsgType {
    /**
     * 需要拉取撤回后的消息
     */
    public static final int YES = 1;

    /**
     * 不拉取撤回后的消息(默认)
     */
    public static final int NO = 0;

    private WithRecalledMsgType() {
    }
}
