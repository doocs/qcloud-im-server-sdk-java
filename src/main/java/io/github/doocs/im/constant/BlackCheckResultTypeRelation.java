package io.github.doocs.im.constant;

/**
 * 校验黑名单关系结果
 *
 * @author bingo
 * @since 2021/10/30 16:20
 */
public class BlackCheckResultTypeRelation {
    /**
     * 单、双向校验黑名单关系
     * <p>
     * From_Account 的黑名单中有 To_Account，但无法确定 To_Account 的黑名单中是否有 From_Account
     */
    public static final String A_WITH_B = "BlackCheckResult_Type_AWithB";

    /**
     * 双向校验黑名单关系
     * <p>
     * From_Account 的黑名单中没有 To_Account，但 To_Account 的黑名单中有 From_Account
     */
    public static final String B_WITH_A = "BlackCheckResult_Type_BWithA";

    /**
     * 单、双向校验黑名单关系
     * <p>
     * From_Account 的黑名单中没有 To_Account，但无法确定 To_Account 的黑名单中是否有 From_Account
     */
    public static final String NO = "BlackCheckResult_Type_NO";

    /**
     * 双向校验黑名单关系
     * <p>
     * From_Account 的黑名单中有 To_Account，To_Account 的黑名单中也有 From_Account
     */
    public static final String BOTH_WAY = "BlackCheckResult_Type_BothWay";

    private BlackCheckResultTypeRelation() {

    }
}
