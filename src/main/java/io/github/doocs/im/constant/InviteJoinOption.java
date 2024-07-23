package io.github.doocs.im.constant;

/**
 * 邀请加群权限
 *
 * @author Joel
 * @since 2024/07/23 13:48
 */
public class InviteJoinOption {
    /**
     * 直接邀请用户进群，不需要审批等操作
     */
    public static final String FREE_ACCESS = "FreeAccess";

    /**
     * 需要群管理员或者群主审批
     */
    public static final String NEED_PERMISSION = "NeedPermission";

    /**
     * 不允许 SDK 邀请进群
     */
    public static final String DISABLE_INVITE = "DisableInvite";

    private InviteJoinOption() {

    }
}
