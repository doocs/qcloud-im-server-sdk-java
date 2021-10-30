package io.github.doocs.im.constant;

/**
 * 校验好友关系结果
 *
 * @author bingo
 * @since 2021/10/30 16:17
 */
public class CheckResultTypeRelation {
    /**
     * 单、双向校验好友关系
     * <p>
     * From_Account 的好友表中没有 To_Account，但无法确定 To_Account 的好友表中是否有 From_Account
     */
    public static final String NO_RELATION = "CheckResult_Type_NoRelation";

    /**
     * 单、双向校验好友关系
     * <p>
     * From_Account 的好友表中有 To_Account，但无法确定 To_Account 的好友表中是否有 From_Account
     */
    public static final String A_WITH_B = "CheckResult_Type_AWithB";

    /**
     * 双向校验好友关系
     * <p>
     * From_Account 的好友表中没有 To_Account，但 To_Account 的好友表中有 From_Account
     */
    public static final String B_WITH_A = "CheckResult_Type_BWithA";

    /**
     * 双向校验好友关系
     * <p>
     * From_Account 的好友表中有 To_Account，To_Account 的好友表中也有 From_Account
     */
    public static final String BOTH_WAY = "CheckResult_Type_BothWay";

    private CheckResultTypeRelation() {

    }
}
