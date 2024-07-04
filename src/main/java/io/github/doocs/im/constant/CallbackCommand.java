package io.github.doocs.im.constant;

/**
 * 回调命令字
 *
 * @author bingo
 * @since 2021/11/16 11:27
 */
public class CallbackCommand {

    /**
     * 接口超频告警回调
     */
    public static final String REQUEST_OVER_LIMIT = "Alert.RequestOverLimit";

    /**
     * 状态变更回调（在线状态）
     */
    public static final String STATE_CHANGE = "State.StateChange";

    /**
     * 更新资料之后回调
     */
    public static final String PROFILE_CALLBACK_PORTRAIT_SET = "Profile.CallbackPortraitSet";

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
     * 单聊机器人消息回调
     */
    public static final String BOT_CALLBACK_ON_C2C_MESSAGE = "Bot.OnC2CMessage";

    // --------------------------------------------------------------------------------------------------------

    /**
     * 群组日净增上限阈值告警回调
     */
    public static final String GROUP_CALLBACK_ON_DAILY_GROUP_QUOTA_ALARM = "Group.CallbackOnDailyGroupQuotaAlarm";

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
     * 群组资料变动之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_GROUP_INFO_CHANGED = "Group.CallbackAfterGroupInfoChanged";

    /**
     * 直播群成员在线状态回调
     */
    public static final String GROUP_CALLBACK_ON_MEMBER_STATE_CHANGE = "Group.CallbackOnMemberStateChange";

    /**
     * 发送群聊消息异常回调
     */
    public static final String GROUP_CALLBACK_SEND_MSG_EXCEPTION = "Group.CallbackSendMsgException";

    /**
     * 撤回群消息之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_RECALL_MSG = "Group.CallbackAfterRecallMsg";

    /**
     * 创建话题之前回调
     */
    public static final String GROUP_CALLBACK_BEFORE_CREATE_TOPIC = "Group.CallbackBeforeCreateTopic";

    /**
     * 创建话题之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_CREATE_TOPIC = "Group.CallbackAfterCreateTopic";

    /**
     * 解散话题之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_TOPIC_DESTROYED = "Group.CallbackAfterTopicDestroyed";

    /**
     * 话题资料修改之后回调
     */
    public static final String GROUP_CALLBACK_AFTER_TOPIC_INFO_CHANGED = "Group.CallbackAfterTopicInfoChanged";

    /**
     * 群成员资料变更后回调
     */
    public static final String GROUP_CALLBACK_AFTER_MEMBER_FIELD_CHANGED = "Group.CallbackAfterMemberFieldChanged";

    /**
     * 群自定义属性变更后回调
     */
    public static final String GROUP_CALLBACK_AFTER_GROUP_ATTR_CHANGED = "Group.CallbackAfterGroupAttrChanged";

    /**
     * 已读回执后回调
     */
    public static final String GROUP_CALLBACK_AFTER_READ_RECEIPT = "Group.CallbackAfterReadReceipt";

    /**
     * 转让群主后回调
     */
    public static final String GROUP_CALLBACK_AFTER_CHANGE_GROUP_OWNER = "Group.CallbackAfterChangeGroupOwner";

    /**
     * 群内@机器人之后回调
     */
    public static final String BOT_CALLBACK_ON_GROUP_MESSAGE = "Bot.OnGroupMessage";

    /**
     * 智能机器人单聊消息自定义回调
     */
    public static final String CHAT_BOT_ON_C2C_SIGNAL_MESSAGE = "Chatbot.OnC2CSignalMessage";

    // --------------------------------------------------------------------------------------------------------

    /**
     * 审核结果回调
     */
    public static final String CONTENT_CALLBACK_RESULT_NOTIFY = "ContentCallback.ResultNotify";

    // --------------------------------------------------------------------------------------------------------

    /**
     * 创建公众号之前回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_BEFORE_CREATE_OFFICIAL_ACCOUNT = "OfficialAccount.CallbackBeforeCreateOfficialAccount";

    /**
     * 创建公众号之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_CREATE_OFFICIAL_ACCOUNT = "OfficialAccount.CallbackAfterCreateOfficialAccount";

    /**
     * 公众号资料变动之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_OFFICIAL_ACCOUNT_INFO_CHANGED = "OfficialAccount.CallbackAfterOfficialAccountInfoChanged";

    /**
     * 销毁公众号之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_OFFICIAL_ACCOUNT_DESTROYED = "OfficialAccount.CallbackAfterOfficialAccountDestroyed";

    /**
     * 订阅公众号之前回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_BEFORE_ADD_SUBSCRIBER = "OfficialAccount.CallbackBeforeAddSubscriber";

    /**
     * 订阅公众号之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_ADD_SUBSCRIBER = "OfficialAccount.CallbackAfterAddSubscriber";

    /**
     * 公众号可订阅的人数已满之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_OFFICIAL_ACCOUNT_FULL = "OfficialAccount.CallbackAfterOfficialAccountFull";

    /**
     * 删除订阅者之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_DELETE_SUBSCRIBER = "OfficialAccount.CallbackAfterDeleteSubscriber";

    /**
     * 发公众号消息之前回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_BEFORE_SEND_MSG = "OfficialAccount.CallbackBeforeSendMsg";

    /**
     * 发公众号消息之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_SEND_MSG = "OfficialAccount.CallbackAfterSendMsg";

    /**
     * 撤回公众号消息之后回调
     */
    public static final String OFFICIAL_ACCOUNT_CALLBACK_AFTER_MSG_WITHDRAW = "OfficialAccount.CallbackAfterMsgWithDraw";

    // --------------------------------------------------------------------------------------------------------

    /**
     * 普通推送结果回调
     */
    public static final String PUSH_OFFLINE_PUSH = "Push.OfflinePush";

    /**
     * 全员推送结果回调
     */
    public static final String PUSH_ALL_MEMBER_PUSH = "Push.AllMemberPush";


    private CallbackCommand() {

    }
}
