package io.github.doocs.im.constant;

/**
 * 待删除的敏感词类型
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class AuditWordType {
    /**
     * 敏感词
     */
    public static final int SENSITIVE_WORDS = 1;

    /**
     * 正则表达式
     */
    public static final int REGEX = 2;

    private AuditWordType() {
    }
}
