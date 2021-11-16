package io.github.doocs.im.constant;

/**
 * 回调命令字
 *
 * @author bingo
 * @since 2021/11/16 11:27
 */
public class CallbackCommand {
    /**
     * 状态变更回调（在线状态）
     */
    public static final String STATE_CHANGE = "State.StateChange";

    /**
     * 添加好友之前回调（资料关系链）
     */
    public static final String SNS_CALLBACK_PREV_FRIEND_ADD = "Sns.CallbackPrevFriendAdd";

    /**
     * 添加好友回应之前回调
     */
    public static final String SNS_CALLBACK_PREV_FRIEND_RESPONSE = "Sns.CallbackPrevFriendResponse";

    /**
     * 添加好友之后回调
     */
    public static final String SNS_CALLBACK_FRIEND_ADD = "Sns.CallbackFriendAdd";

    /**
     * 删除好友之后回调
     */
    public static final String SNS_CALLBACK_FRIEND_DELETE = "Sns.CallbackFriendDelete";

    /**
     * 添加黑名单之后回调
     */
    public static final String SNS_CALLBACK_BLACKLIST_ADD = "Sns.CallbackBlackListAdd";

    /**
     * 删除黑名单之后回调
     */
    public static final String SNS_CALLBACK_BLACKLIST_DELETE = "Sns.CallbackBlackListDelete";

    /**
     * 发单聊消息之前回调（单聊消息）
     */
    public static final String C2C_CALLBACK_BEFORE_SEND_MSG = "C2C.CallbackBeforeSendMsg";

    /**
     * 发单聊消息之后回调
     */
    public static final String C2C_CALLBACK_AFTER_SEND_MSG = "C2C.CallbackAfterSendMsg";

    /**
     * 单聊消息已读上报后回调
     */
    public static final String C2C_CALLBACK_AFTER_MSG_REPORT = "C2C.CallbackAfterMsgReport";

    /**
     * 单聊消息撤回后回调
     */
    public static final String C2C_CALLBACK_AFTER_MSG_WITHDRAW = "C2C.CallbackAfterMsgWithDraw";

    /**
     * 创建群组之前回调（群组系统）
     */
    public static final String GROUP_CALLBACK_BEFORE_CREATE_GROUP = "Group.CallbackBeforeCreateGroup";

    /**
     * 创建群组之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_CREATE_GROUP = "Group.CallbackAfterCreateGroup";

    /**
     * 申请入群之前回调
     */
    public static final String GROUP_CALLBACK_BEFORE_APPLY_JOIN_GROUP = "Group.CallbackBeforeApplyJoinGroup";

    /**
     * 拉人入群之前回调
     */
    public static final String GROUP_CALLBACK_BEFORE_INVITE_JOIN_GROUP = "Group.CallbackBeforeInviteJoinGroup";

    /**
     * 新成员入群之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_NEW_MEMBER_JOIN = "Group.CallbackAfterNewMemberJoin";

    /**
     * 群成员离开之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_MEMBER_EXIT = "Group.CallbackAfterMemberExit";

    /**
     * 群内发言之前回调
     */
    public static final String GROUP_CALLBACK_BEFORE_SEND_MSG = "Group.CallbackBeforeSendMsg";

    /**
     * 群内发言之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_SEND_MSG = "Group.CallbackAfterSendMsg";

    /**
     * 群组满员之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_GROUP_FULL = "Group.CallbackAfterGroupFull";

    /**
     * 群组解散之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_GROUP_DESTROYED = "Group.CallbackAfterGroupDestroyed";

    /**
     * 群组资料修改之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_GROUP_INFO_CHANGED = "Group.CallbackAfterGroupInfoChanged";

    private CallbackCommand() {

    }
}
