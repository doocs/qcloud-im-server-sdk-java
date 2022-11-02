package io.github.doocs.im.constant;

/**
 * 消息是否支持扩展
 *
 * @author bingo
 * @since 2022/11/1 16:32
 */
public class OperateType {
    /**
     * 设置消息扩展KV
     */
    public static final int SET = 1;

    /**
     * 删除消息扩展KV
     */
    public static final int DELETE = 2;

    /**
     * 清空所有消息扩展KV
     */
    public static final int CLEAR = 3;

    private OperateType() {
    }
}
