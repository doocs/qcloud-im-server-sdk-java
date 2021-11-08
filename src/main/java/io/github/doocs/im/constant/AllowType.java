package io.github.doocs.im.constant;

/**
 * 加好友验证方式
 *
 * @author bingo
 * @since 2021/11/8 15:50
 */
public class AllowType {
    /**
     * 需要经过自己确认对方才能添加自己为好友
     */
    public static final String NEED_CONFIRM = "AllowType_Type_NeedConfirm";

    /**
     * 允许任何人添加自己为好友
     */
    public static final String ALLOW_ANY = "AllowType_Type_AllowAny";

    /**
     * 不允许任何人添加自己为好友
     */
    public static final String DENY_ANY = "AllowType_Type_DenyAny";

    private AllowType() {

    }
}
