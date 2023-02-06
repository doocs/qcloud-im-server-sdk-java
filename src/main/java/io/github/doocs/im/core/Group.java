package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 群组管理
 *
 * @author bingo
 * @since 2021/7/31 20:45
 */
public class Group {
    /**
     * 群组管理服务名
     */
    public static final String SERVICE_NAME = "group_open_http_svc";
    public static final String SERVICE_NAME_ATTR = "group_open_attr_http_svc";
    public static final String SERVICE_NAME_CHATROOM = "group_open_avchatroom_http_svc";
    public static final String SERVICE_NAME_OPEN_IM = "openim";
    public static final String SERVICE_NAME_MILLION_GROUP = "million_group_open_http_svc";
    public static final String SERVICE_NAME_OPEN_IM_MSG_EXT = "openim_msg_ext_http_svc";

    /**
     * 群组管理相关命令字
     */
    public static final String GET_APPID_GROUP_LIST_COMMAND = "get_appid_group_list";
    public static final String CREATE_GROUP_COMMAND = "create_group";
    public static final String GET_GROUP_INFO_COMMAND = "get_group_info";
    public static final String GET_GROUP_MEMBER_INFO_COMMAND = "get_group_member_info";
    public static final String MODIFY_GROUP_BASE_INFO_COMMAND = "modify_group_base_info";
    public static final String ADD_GROUP_MEMBER_COMMAND = "add_group_member";
    public static final String DELETE_GROUP_MEMBER_COMMAND = "delete_group_member";
    public static final String MODIFY_GROUP_MEMBER_INFO_COMMAND = "modify_group_member_info";
    public static final String DESTROY_GROUP_COMMAND = "destroy_group";
    public static final String GET_JOINED_GROUP_LIST_COMMAND = "get_joined_group_list";
    public static final String GET_ROLE_IN_GROUP_COMMAND = "get_role_in_group";
    public static final String FORBID_SEND_MSG_COMMAND = "forbid_send_msg";
    public static final String GET_GROUP_MUTED_ACCOUNT_COMMAND = "get_group_muted_account";
    public static final String SEND_GROUP_MSG_COMMAND = "send_group_msg";
    public static final String SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND = "send_group_system_notification";
    public static final String CHANGE_GROUP_OWNER_COMMAND = "change_group_owner";
    public static final String GROUP_MSG_RECALL_COMMAND = "group_msg_recall";
    public static final String IMPORT_GROUP_COMMAND = "import_group";
    public static final String IMPORT_GROUP_MSG_COMMAND = "import_group_msg";
    public static final String IMPORT_GROUP_MEMBER_COMMAND = "import_group_member";
    public static final String SET_UNREAD_MSG_NUM_COMMAND = "set_unread_msg_num";
    public static final String DELETE_GROUP_MSG_BY_SENDER_COMMAND = "delete_group_msg_by_sender";
    public static final String GROUP_MSG_GET_SIMPLE_COMMAND = "group_msg_get_simple";
    public static final String GET_ONLINE_MEMBER_NUM_COMMAND = "get_online_member_num";
    public static final String GET_MEMBERS_COMMAND = "get_members";
    public static final String MODIFY_USER_INFO_COMMAND = "modify_user_info";
    public static final String GET_GROUP_ATTR_COMMAND = "get_group_attr";
    public static final String MODIFY_GROUP_ATTR_COMMAND = "modify_group_attr";
    public static final String CLEAR_GROUP_ATTR_COMMAND = "clear_group_attr";
    public static final String SET_GROUP_ATTR_COMMAND = "set_group_attr";
    public static final String MODIFY_GROUP_MSG_COMMAND = "modify_group_msg";
    public static final String SEND_BROADCAST_MSG_COMMAND = "send_broadcast_msg";
    public static final String GET_GROUP_MSG_RECEIPT_COMMAND = "get_group_msg_receipt";
    public static final String GET_GROUP_MSG_RECEIPT_DETAIL_COMMAND = "get_group_msg_receipt_detail";
    public static final String CREATE_GROUP_TOPIC_COMMAND = "create_topic";
    public static final String GET_GROUP_TOPIC_COMMAND = "get_topic";
    public static final String MODIFY_GROUP_TOPIC_COMMAND = "modify_topic";
    public static final String IMPORT_GROUP_TOPIC_COMMAND = "import_topic";
    public static final String DESTROY_GROUP_TOPIC_COMMAND = "destroy_topic";
    public static final String GET_GROUP_BAN_MEMBER_COMMAND = "get_group_ban_member";
    public static final String BAN_GROUP_MEMBER_COMMAND = "ban_group_member";
    public static final String UNBAN_GROUP_MEMBER_COMMAND = "unban_group_member";
    public static final String GROUP_GET_KEY_VALUES_COMMAND = "group_get_key_values";
    public static final String GROUP_SET_KEY_VALUES_COMMAND = "group_set_key_values";
    public static final String GET_GROUP_COUNTER_COMMAND = "get_group_counter";
    public static final String UPDATE_GROUP_COUNTER_COMMAND = "update_group_counter";
    public static final String DELETE_GROUP_COUNTER_COMMAND = "delete_group_counter";


    private final ImClient imClient;

    public Group(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 获取 App 中的所有群组
     *
     * @param getAppIdGroupListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetAppIdGroupListResult getAppIdGroupList(GetAppIdGroupListRequest getAppIdGroupListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_APPID_GROUP_LIST_COMMAND);
        return HttpUtil.post(url, getAppIdGroupListRequest, GetAppIdGroupListResult.class, imClient.getConfig());
    }

    public GetAppIdGroupListResult getAppIdGroupList(GetAppIdGroupListRequest getAppIdGroupListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_APPID_GROUP_LIST_COMMAND, random);
        return HttpUtil.post(url, getAppIdGroupListRequest, GetAppIdGroupListResult.class, imClient.getConfig());
    }

    /**
     * 创建群组
     *
     * @param createGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_GROUP_COMMAND);
        return HttpUtil.post(url, createGroupRequest, CreateGroupResult.class, imClient.getConfig());
    }

    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_GROUP_COMMAND, random);
        return HttpUtil.post(url, createGroupRequest, CreateGroupResult.class, imClient.getConfig());
    }

    /**
     * 获取群详细资料
     *
     * @param getGroupInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupInfoResult getGroupInfo(GetGroupInfoRequest getGroupInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_INFO_COMMAND);
        return HttpUtil.post(url, getGroupInfoRequest, GetGroupInfoResult.class, imClient.getConfig());
    }

    public GetGroupInfoResult getGroupInfo(GetGroupInfoRequest getGroupInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_INFO_COMMAND, random);
        return HttpUtil.post(url, getGroupInfoRequest, GetGroupInfoResult.class, imClient.getConfig());
    }


    /**
     * 获取群成员详细资料
     *
     * @param getGroupMemberInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest getGroupMemberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MEMBER_INFO_COMMAND);
        return HttpUtil.post(url, getGroupMemberInfoRequest, GetGroupMemberInfoResult.class, imClient.getConfig());
    }

    public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest getGroupMemberInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MEMBER_INFO_COMMAND, random);
        return HttpUtil.post(url, getGroupMemberInfoRequest, GetGroupMemberInfoResult.class, imClient.getConfig());
    }

    /**
     * 修改群基础资料
     *
     * @param modifyGroupBaseInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_BASE_INFO_COMMAND);
        return HttpUtil.post(url, modifyGroupBaseInfoRequest, ModifyGroupBaseInfoResult.class, imClient.getConfig());
    }

    public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_BASE_INFO_COMMAND, random);
        return HttpUtil.post(url, modifyGroupBaseInfoRequest, ModifyGroupBaseInfoResult.class, imClient.getConfig());
    }

    /**
     * 增加群成员
     *
     * @param addGroupMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AddGroupMemberResult addGroupMember(AddGroupMemberRequest addGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, addGroupMemberRequest, AddGroupMemberResult.class, imClient.getConfig());
    }

    public AddGroupMemberResult addGroupMember(AddGroupMemberRequest addGroupMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_GROUP_MEMBER_COMMAND, random);
        return HttpUtil.post(url, addGroupMemberRequest, AddGroupMemberResult.class, imClient.getConfig());
    }

    /**
     * 删除群成员
     *
     * @param deleteGroupMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest deleteGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, deleteGroupMemberRequest, DeleteGroupMemberResult.class, imClient.getConfig());
    }

    public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest deleteGroupMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MEMBER_COMMAND, random);
        return HttpUtil.post(url, deleteGroupMemberRequest, DeleteGroupMemberResult.class, imClient.getConfig());
    }

    /**
     * 修改群成员资料
     *
     * @param modifyGroupMemberInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_MEMBER_INFO_COMMAND);
        return HttpUtil.post(url, modifyGroupMemberInfoRequest, ModifyGroupMemberInfoResult.class, imClient.getConfig());
    }

    public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_MEMBER_INFO_COMMAND, random);
        return HttpUtil.post(url, modifyGroupMemberInfoRequest, ModifyGroupMemberInfoResult.class, imClient.getConfig());
    }

    /**
     * 解散群组
     *
     * @param destroyGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DestroyGroupResult destroyGroup(DestroyGroupRequest destroyGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_GROUP_COMMAND);
        return HttpUtil.post(url, destroyGroupRequest, DestroyGroupResult.class, imClient.getConfig());
    }

    public DestroyGroupResult destroyGroup(DestroyGroupRequest destroyGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_GROUP_COMMAND, random);
        return HttpUtil.post(url, destroyGroupRequest, DestroyGroupResult.class, imClient.getConfig());
    }

    /**
     * 获取用户所加入的群组
     *
     * @param getJoinedGroupListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetJoinGroupListResult getJoinGroupList(GetJoinedGroupListRequest getJoinedGroupListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_JOINED_GROUP_LIST_COMMAND);
        return HttpUtil.post(url, getJoinedGroupListRequest, GetJoinGroupListResult.class, imClient.getConfig());
    }

    public GetJoinGroupListResult getJoinGroupList(GetJoinedGroupListRequest getJoinedGroupListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_JOINED_GROUP_LIST_COMMAND, random);
        return HttpUtil.post(url, getJoinedGroupListRequest, GetJoinGroupListResult.class, imClient.getConfig());
    }

    /**
     * 查询用户在群组中的身份
     *
     * @param getRoleInGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest getRoleInGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ROLE_IN_GROUP_COMMAND);
        return HttpUtil.post(url, getRoleInGroupRequest, GetRoleInGroupResult.class, imClient.getConfig());
    }

    public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest getRoleInGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ROLE_IN_GROUP_COMMAND, random);
        return HttpUtil.post(url, getRoleInGroupRequest, GetRoleInGroupResult.class, imClient.getConfig());
    }

    /**
     * 批量禁言和取消禁言
     *
     * @param forbidSendMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest forbidSendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FORBID_SEND_MSG_COMMAND);
        return HttpUtil.post(url, forbidSendMsgRequest, ForbidSendMsgResult.class, imClient.getConfig());
    }

    public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest forbidSendMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FORBID_SEND_MSG_COMMAND, random);
        return HttpUtil.post(url, forbidSendMsgRequest, ForbidSendMsgResult.class, imClient.getConfig());
    }

    /**
     * 获取被禁言群成员列表
     *
     * @param getGroupMutedAccountRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupMutedAccountResult getGroupMutedAccount(GetGroupMutedAccountRequest getGroupMutedAccountRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MUTED_ACCOUNT_COMMAND);
        return HttpUtil.post(url, getGroupMutedAccountRequest, GetGroupMutedAccountResult.class, imClient.getConfig());
    }

    public GetGroupMutedAccountResult getGroupMutedAccount(GetGroupMutedAccountRequest getGroupMutedAccountRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MUTED_ACCOUNT_COMMAND, random);
        return HttpUtil.post(url, getGroupMutedAccountRequest, GetGroupMutedAccountResult.class, imClient.getConfig());
    }

    /**
     * 在群组中发送普通消息
     *
     * @param sendGroupMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest sendGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, sendGroupMsgRequest, SendGroupMsgResult.class, imClient.getConfig());
    }

    public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest sendGroupMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_MSG_COMMAND, random);
        return HttpUtil.post(url, sendGroupMsgRequest, SendGroupMsgResult.class, imClient.getConfig());
    }

    /**
     * 在群组中发送系统消息
     *
     * @param sendGroupSystemNotificationRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND);
        return HttpUtil.post(url, sendGroupSystemNotificationRequest, SendGroupSystemNotificationResult.class, imClient.getConfig());
    }

    public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND, random);
        return HttpUtil.post(url, sendGroupSystemNotificationRequest, SendGroupSystemNotificationResult.class, imClient.getConfig());
    }

    /**
     * 转让群主
     *
     * @param changeGroupOwnerRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ChangeGroupOwnerResult changeGroupOwner(ChangeGroupOwnerRequest changeGroupOwnerRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CHANGE_GROUP_OWNER_COMMAND);
        return HttpUtil.post(url, changeGroupOwnerRequest, ChangeGroupOwnerResult.class, imClient.getConfig());
    }

    public ChangeGroupOwnerResult changeGroupOwner(ChangeGroupOwnerRequest changeGroupOwnerRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CHANGE_GROUP_OWNER_COMMAND, random);
        return HttpUtil.post(url, changeGroupOwnerRequest, ChangeGroupOwnerResult.class, imClient.getConfig());
    }

    /**
     * 撤回群消息
     *
     * @param groupMsgRecallRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupMsgRecallResult groupMsgRecall(GroupMsgRecallRequest groupMsgRecallRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_RECALL_COMMAND);
        return HttpUtil.post(url, groupMsgRecallRequest, GroupMsgRecallResult.class, imClient.getConfig());
    }

    public GroupMsgRecallResult groupMsgRecall(GroupMsgRecallRequest groupMsgRecallRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_RECALL_COMMAND, random);
        return HttpUtil.post(url, groupMsgRecallRequest, GroupMsgRecallResult.class, imClient.getConfig());
    }

    /**
     * 导入群基础资料
     *
     * @param importGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportGroupResult importGroup(ImportGroupRequest importGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_COMMAND);
        return HttpUtil.post(url, importGroupRequest, ImportGroupResult.class, imClient.getConfig());
    }

    public ImportGroupResult importGroup(ImportGroupRequest importGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_COMMAND, random);
        return HttpUtil.post(url, importGroupRequest, ImportGroupResult.class, imClient.getConfig());
    }

    /**
     * 导入群消息
     *
     * @param importGroupMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest importGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, importGroupMsgRequest, ImportGroupMsgResult.class, imClient.getConfig());
    }

    public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest importGroupMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MSG_COMMAND, random);
        return HttpUtil.post(url, importGroupMsgRequest, ImportGroupMsgResult.class, imClient.getConfig());
    }

    /**
     * 导入群成员
     *
     * @param importGroupMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest importGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, importGroupMemberRequest, ImportGroupMemberResult.class, imClient.getConfig());
    }

    public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest importGroupMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MEMBER_COMMAND, random);
        return HttpUtil.post(url, importGroupMemberRequest, ImportGroupMemberResult.class, imClient.getConfig());
    }

    /**
     * 设置成员未读消息计数
     *
     * @param setUnreadMsgNumRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_UNREAD_MSG_NUM_COMMAND);
        return HttpUtil.post(url, setUnreadMsgNumRequest, SetUnreadMsgNumResult.class, imClient.getConfig());
    }

    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest setUnreadMsgNumRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_UNREAD_MSG_NUM_COMMAND, random);
        return HttpUtil.post(url, setUnreadMsgNumRequest, SetUnreadMsgNumResult.class, imClient.getConfig());
    }

    /**
     * 删除指定用户发送的消息
     *
     * @param deleteGroupMsgBySenderRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND);
        return HttpUtil.post(url, deleteGroupMsgBySenderRequest, DeleteGroupMsgBySenderResult.class, imClient.getConfig());
    }

    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND, random);
        return HttpUtil.post(url, deleteGroupMsgBySenderRequest, DeleteGroupMsgBySenderResult.class, imClient.getConfig());
    }

    /**
     * 拉取群历史消息
     *
     * @param groupMsgGetSimpleRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_GET_SIMPLE_COMMAND);
        return HttpUtil.post(url, groupMsgGetSimpleRequest, GroupMsgGetSimpleResult.class, imClient.getConfig());
    }

    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest groupMsgGetSimpleRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_GET_SIMPLE_COMMAND, random);
        return HttpUtil.post(url, groupMsgGetSimpleRequest, GroupMsgGetSimpleResult.class, imClient.getConfig());
    }

    /**
     * 获取直播群在线人数
     *
     * @param getOnlineMemberNumRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ONLINE_MEMBER_NUM_COMMAND);
        return HttpUtil.post(url, getOnlineMemberNumRequest, GetOnlineMemberNumResult.class, imClient.getConfig());
    }

    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest getOnlineMemberNumRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ONLINE_MEMBER_NUM_COMMAND, random);
        return HttpUtil.post(url, getOnlineMemberNumRequest, GetOnlineMemberNumResult.class, imClient.getConfig());
    }

    /**
     * 获取直播群在线列表
     *
     * @param getMembersRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetMembersResult getMembers(GetMembersRequest getMembersRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CHATROOM, GET_MEMBERS_COMMAND);
        return HttpUtil.post(url, getMembersRequest, GetMembersResult.class, imClient.getConfig());
    }

    public GetMembersResult getMembers(GetMembersRequest getMembersRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CHATROOM, GET_MEMBERS_COMMAND, random);
        return HttpUtil.post(url, getMembersRequest, GetMembersResult.class, imClient.getConfig());
    }

    /**
     * 设置直播群成员标记
     *
     * @param modifyGroupUserInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupUserInfoResult modifyGroupUserInfo(ModifyGroupUserInfoRequest modifyGroupUserInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CHATROOM, MODIFY_USER_INFO_COMMAND);
        return HttpUtil.post(url, modifyGroupUserInfoRequest, ModifyGroupUserInfoResult.class, imClient.getConfig());
    }

    public ModifyGroupUserInfoResult modifyGroupUserInfo(ModifyGroupUserInfoRequest modifyGroupUserInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CHATROOM, MODIFY_USER_INFO_COMMAND, random);
        return HttpUtil.post(url, modifyGroupUserInfoRequest, ModifyGroupUserInfoResult.class, imClient.getConfig());
    }

    /**
     * 获取群自定义属性
     *
     * @param getGroupAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupAttrResult getGroupAttr(GetGroupAttrRequest getGroupAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_ATTR, GET_GROUP_ATTR_COMMAND);
        return HttpUtil.post(url, getGroupAttrRequest, GetGroupAttrResult.class, imClient.getConfig());
    }

    public GetGroupAttrResult getGroupAttr(GetGroupAttrRequest getGroupAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_ATTR, GET_GROUP_ATTR_COMMAND, random);
        return HttpUtil.post(url, getGroupAttrRequest, GetGroupAttrResult.class, imClient.getConfig());
    }

    /**
     * 修改群自定义属性
     *
     * @param modifyGroupAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupAttrResult modifyGroupAttr(ModifyGroupAttrRequest modifyGroupAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_ATTR_COMMAND);
        return HttpUtil.post(url, modifyGroupAttrRequest, ModifyGroupAttrResult.class, imClient.getConfig());
    }

    public ModifyGroupAttrResult modifyGroupAttr(ModifyGroupAttrRequest modifyGroupAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_ATTR_COMMAND, random);
        return HttpUtil.post(url, modifyGroupAttrRequest, ModifyGroupAttrResult.class, imClient.getConfig());
    }

    /**
     * 清空群自定义属性
     *
     * @param clearGroupAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ClearGroupAttrResult clearGroupAttr(ClearGroupAttrRequest clearGroupAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CLEAR_GROUP_ATTR_COMMAND);
        return HttpUtil.post(url, clearGroupAttrRequest, ClearGroupAttrResult.class, imClient.getConfig());
    }

    public ClearGroupAttrResult clearGroupAttr(ClearGroupAttrRequest clearGroupAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CLEAR_GROUP_ATTR_COMMAND, random);
        return HttpUtil.post(url, clearGroupAttrRequest, ClearGroupAttrResult.class, imClient.getConfig());
    }

    /**
     * 重置群自定义属性
     *
     * @param setGroupAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetGroupAttrResult setGroupAttr(SetGroupAttrRequest setGroupAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_GROUP_ATTR_COMMAND);
        return HttpUtil.post(url, setGroupAttrRequest, SetGroupAttrResult.class, imClient.getConfig());
    }

    public SetGroupAttrResult setGroupAttr(SetGroupAttrRequest setGroupAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_GROUP_ATTR_COMMAND, random);
        return HttpUtil.post(url, setGroupAttrRequest, SetGroupAttrResult.class, imClient.getConfig());
    }

    /**
     * 修改群聊历史消息
     *
     * @param modifyGroupMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupMsgResult modifyGroupMsg(ModifyGroupMsgRequest modifyGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM, MODIFY_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, modifyGroupMsgRequest, ModifyGroupMsgResult.class, imClient.getConfig());
    }

    public ModifyGroupMsgResult modifyGroupMsg(ModifyGroupMsgRequest modifyGroupMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM, MODIFY_GROUP_MSG_COMMAND, random);
        return HttpUtil.post(url, modifyGroupMsgRequest, ModifyGroupMsgResult.class, imClient.getConfig());
    }

    /**
     * 直播群广播消息
     *
     * @param sendBroadcastMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendBroadcastMsgResult sendBroadcastMsg(SendBroadcastMsgRequest sendBroadcastMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_BROADCAST_MSG_COMMAND);
        return HttpUtil.post(url, sendBroadcastMsgRequest, SendBroadcastMsgResult.class, imClient.getConfig());
    }

    public SendBroadcastMsgResult sendBroadcastMsg(SendBroadcastMsgRequest sendBroadcastMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_BROADCAST_MSG_COMMAND, random);
        return HttpUtil.post(url, sendBroadcastMsgRequest, SendBroadcastMsgResult.class, imClient.getConfig());
    }

    /**
     * 拉取群消息已读回执信息
     *
     * @param getGroupMsgReceiptRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupMsgReceiptResult getGroupMsgReceipt(GetGroupMsgReceiptRequest getGroupMsgReceiptRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MSG_RECEIPT_COMMAND);
        return HttpUtil.post(url, getGroupMsgReceiptRequest, GetGroupMsgReceiptResult.class, imClient.getConfig());
    }

    public GetGroupMsgReceiptResult getGroupMsgReceipt(GetGroupMsgReceiptRequest getGroupMsgReceiptRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MSG_RECEIPT_COMMAND, random);
        return HttpUtil.post(url, getGroupMsgReceiptRequest, GetGroupMsgReceiptResult.class, imClient.getConfig());
    }

    /**
     * 拉取群消息已读回执详情
     *
     * @param getGroupMsgReceiptDetailRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupMsgReceiptDetailResult getGroupMsgReceiptDetail(GetGroupMsgReceiptDetailRequest getGroupMsgReceiptDetailRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MSG_RECEIPT_DETAIL_COMMAND);
        return HttpUtil.post(url, getGroupMsgReceiptDetailRequest, GetGroupMsgReceiptDetailResult.class, imClient.getConfig());
    }

    public GetGroupMsgReceiptDetailResult getGroupMsgReceiptDetail(GetGroupMsgReceiptDetailRequest getGroupMsgReceiptDetailRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MSG_RECEIPT_DETAIL_COMMAND, random);
        return HttpUtil.post(url, getGroupMsgReceiptDetailRequest, GetGroupMsgReceiptDetailResult.class, imClient.getConfig());
    }

    /**
     * 创建话题
     *
     * @param createGroupTopicRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public CreateGroupTopicResult createGroupTopic(CreateGroupTopicRequest createGroupTopicRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, CREATE_GROUP_TOPIC_COMMAND);
        return HttpUtil.post(url, createGroupTopicRequest, CreateGroupTopicResult.class, imClient.getConfig());
    }

    public CreateGroupTopicResult createGroupTopic(CreateGroupTopicRequest createGroupTopicRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, CREATE_GROUP_TOPIC_COMMAND, random);
        return HttpUtil.post(url, createGroupTopicRequest, CreateGroupTopicResult.class, imClient.getConfig());
    }

    /**
     * 获取话题资料
     *
     * @param getGroupTopicRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupTopicResult getGroupTopic(GetGroupTopicRequest getGroupTopicRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, GET_GROUP_TOPIC_COMMAND);
        return HttpUtil.post(url, getGroupTopicRequest, GetGroupTopicResult.class, imClient.getConfig());
    }

    public GetGroupTopicResult getGroupTopic(GetGroupTopicRequest getGroupTopicRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, GET_GROUP_TOPIC_COMMAND, random);
        return HttpUtil.post(url, getGroupTopicRequest, GetGroupTopicResult.class, imClient.getConfig());
    }

    /**
     * 修改话题资料
     *
     * @param modifyGroupTopicRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyGroupTopicResult modifyGroupTopic(ModifyGroupTopicRequest modifyGroupTopicRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, MODIFY_GROUP_TOPIC_COMMAND);
        return HttpUtil.post(url, modifyGroupTopicRequest, ModifyGroupTopicResult.class, imClient.getConfig());
    }

    public ModifyGroupTopicResult modifyGroupTopic(ModifyGroupTopicRequest modifyGroupTopicRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, MODIFY_GROUP_TOPIC_COMMAND, random);
        return HttpUtil.post(url, modifyGroupTopicRequest, ModifyGroupTopicResult.class, imClient.getConfig());
    }

    /**
     * 导入话题基础资料
     *
     * @param importGroupTopicRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportGroupTopicResult importGroupTopic(ImportGroupTopicRequest importGroupTopicRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_TOPIC_COMMAND);
        return HttpUtil.post(url, importGroupTopicRequest, ImportGroupTopicResult.class, imClient.getConfig());
    }

    public ImportGroupTopicResult importGroupTopic(ImportGroupTopicRequest importGroupTopicRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_TOPIC_COMMAND, random);
        return HttpUtil.post(url, importGroupTopicRequest, ImportGroupTopicResult.class, imClient.getConfig());
    }

    /**
     * 解散话题
     *
     * @param destroyGroupTopicRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DestroyGroupTopicResult destroyGroupTopic(DestroyGroupTopicRequest destroyGroupTopicRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, DESTROY_GROUP_TOPIC_COMMAND);
        return HttpUtil.post(url, destroyGroupTopicRequest, DestroyGroupTopicResult.class, imClient.getConfig());
    }

    public DestroyGroupTopicResult destroyGroupTopic(DestroyGroupTopicRequest destroyGroupTopicRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MILLION_GROUP, DESTROY_GROUP_TOPIC_COMMAND, random);
        return HttpUtil.post(url, destroyGroupTopicRequest, DestroyGroupTopicResult.class, imClient.getConfig());
    }

    /**
     * 获取封禁群成员列表
     *
     * @param getGroupBanMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupBanMemberResult getGroupBanMember(GetGroupBanMemberRequest getGroupBanMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_BAN_MEMBER_COMMAND);
        return HttpUtil.post(url, getGroupBanMemberRequest, GetGroupBanMemberResult.class, imClient.getConfig());
    }

    public GetGroupBanMemberResult getGroupBanMember(GetGroupBanMemberRequest getGroupBanMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_BAN_MEMBER_COMMAND, random);
        return HttpUtil.post(url, getGroupBanMemberRequest, GetGroupBanMemberResult.class, imClient.getConfig());
    }

    /**
     * 群成员封禁
     *
     * @param banGroupMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BanGroupMemberResult banGroupMember(BanGroupMemberRequest banGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BAN_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, banGroupMemberRequest, BanGroupMemberResult.class, imClient.getConfig());
    }

    public BanGroupMemberResult banGroupMember(BanGroupMemberRequest banGroupMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BAN_GROUP_MEMBER_COMMAND, random);
        return HttpUtil.post(url, banGroupMemberRequest, BanGroupMemberResult.class, imClient.getConfig());
    }

    /**
     * 群成员解封
     *
     * @param unbanGroupMemberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public UnbanGroupMemberResult unbanGroupMember(UnbanGroupMemberRequest unbanGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UNBAN_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, unbanGroupMemberRequest, UnbanGroupMemberResult.class, imClient.getConfig());
    }

    public UnbanGroupMemberResult unbanGroupMember(UnbanGroupMemberRequest unbanGroupMemberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UNBAN_GROUP_MEMBER_COMMAND, random);
        return HttpUtil.post(url, unbanGroupMemberRequest, UnbanGroupMemberResult.class, imClient.getConfig());
    }

    /**
     * 拉取群消息扩展
     *
     * @param groupGetKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupGetKeyValuesResult groupGetKeyValues(GroupGetKeyValuesRequest groupGetKeyValuesRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM_MSG_EXT, GROUP_GET_KEY_VALUES_COMMAND);
        return HttpUtil.post(url, groupGetKeyValuesRequest, GroupGetKeyValuesResult.class, imClient.getConfig());
    }

    public GroupGetKeyValuesResult groupGetKeyValues(GroupGetKeyValuesRequest groupGetKeyValuesRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM_MSG_EXT, GROUP_GET_KEY_VALUES_COMMAND, random);
        return HttpUtil.post(url, groupGetKeyValuesRequest, GroupGetKeyValuesResult.class, imClient.getConfig());
    }

    /**
     * 设置群消息扩展
     *
     * @param groupSetKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupSetKeyValuesResult groupSetKeyValues(GroupSetKeyValuesRequest groupSetKeyValuesRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM_MSG_EXT, GROUP_SET_KEY_VALUES_COMMAND);
        return HttpUtil.post(url, groupSetKeyValuesRequest, GroupSetKeyValuesResult.class, imClient.getConfig());
    }

    public GroupSetKeyValuesResult groupSetKeyValues(GroupSetKeyValuesRequest groupSetKeyValuesRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM_MSG_EXT, GROUP_SET_KEY_VALUES_COMMAND, random);
        return HttpUtil.post(url, groupSetKeyValuesRequest, GroupSetKeyValuesResult.class, imClient.getConfig());
    }

    /**
     * 获取群计数器
     *
     * @param getGroupCounterRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupCounterResult getGroupCounter(GetGroupCounterRequest getGroupCounterRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_COUNTER_COMMAND);
        return HttpUtil.post(url, getGroupCounterRequest, GetGroupCounterResult.class, imClient.getConfig());
    }

    public GetGroupCounterResult getGroupCounter(GetGroupCounterRequest getGroupCounterRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_COUNTER_COMMAND, random);
        return HttpUtil.post(url, getGroupCounterRequest, GetGroupCounterResult.class, imClient.getConfig());
    }

    /**
     * 更新群计数器
     *
     * @param updateGroupCounterRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public UpdateGroupCounterResult updateGroupCounter(UpdateGroupCounterRequest updateGroupCounterRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UPDATE_GROUP_COUNTER_COMMAND);
        return HttpUtil.post(url, updateGroupCounterRequest, UpdateGroupCounterResult.class, imClient.getConfig());
    }

    public UpdateGroupCounterResult updateGroupCounter(UpdateGroupCounterRequest updateGroupCounterRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UPDATE_GROUP_COUNTER_COMMAND, random);
        return HttpUtil.post(url, updateGroupCounterRequest, UpdateGroupCounterResult.class, imClient.getConfig());
    }

    /**
     * 删除群计数器
     *
     * @param deleteGroupCounterRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteGroupCounterResult deleteGroupCounter(DeleteGroupCounterRequest deleteGroupCounterRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_COUNTER_COMMAND);
        return HttpUtil.post(url, deleteGroupCounterRequest, DeleteGroupCounterResult.class, imClient.getConfig());
    }

    public DeleteGroupCounterResult deleteGroupCounter(DeleteGroupCounterRequest deleteGroupCounterRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_COUNTER_COMMAND, random);
        return HttpUtil.post(url, deleteGroupCounterRequest, DeleteGroupCounterResult.class, imClient.getConfig());
    }
}
