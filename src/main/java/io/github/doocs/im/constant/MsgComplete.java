package io.github.doocs.im.constant;

/**
 * 消息是否全部拉取
 *
 * @author bingo
 * @since 2021/11/9 16:37
 */
public class MsgComplete {
    /**
     * 已全部拉取
     */
    public static final int YES = 1;

    /**
     * 未全部拉取，需要记录拉
     */
    public static final int NO = 0;

    private MsgComplete() {

    }
}
