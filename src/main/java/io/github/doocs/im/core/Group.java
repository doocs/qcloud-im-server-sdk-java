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
    private static final String SERVICE_NAME = "group_open_http_svc";
    private static final String SERVICE_NAME_ATTR = "group_open_attr_http_svc";
    private static final String SERVICE_NAME_CHATROOM = "group_open_avchatroom_http_svc";

    /**
     * 群组管理相关命令字
     */
    private static final String GET_APPID_GROUP_LIST_COMMAND = "get_appid_group_list";
    private static final String CREATE_GROUP_COMMAND = "create_group";
    private static final String GET_GROUP_INFO_COMMAND = "get_group_info";
    private static final String GET_GROUP_MEMBER_INFO_COMMAND = "get_group_member_info";
    private static final String MODIFY_GROUP_BASE_INFO_COMMAND = "modify_group_base_info";
    private static final String ADD_GROUP_MEMBER_COMMAND = "add_group_member";
    private static final String DELETE_GROUP_MEMBER_COMMAND = "delete_group_member";
    private static final String MODIFY_GROUP_MEMBER_INFO_COMMAND = "modify_group_member_info";
    private static final String DESTROY_GROUP_COMMAND = "destroy_group";
    private static final String GET_JOINED_GROUP_LIST_COMMAND = "get_joined_group_list";
    private static final String GET_ROLE_IN_GROUP_COMMAND = "get_role_in_group";
    private static final String FORBID_SEND_MSG_COMMAND = "forbid_send_msg";
    private static final String GET_GROUP_SHUTTED_UIN_COMMAND = "get_group_shutted_uin";
    private static final String SEND_GROUP_MSG_COMMAND = "send_group_msg";
    private static final String SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND = "send_group_system_notification";
    private static final String CHANGE_GROUP_OWNER_COMMAND = "change_group_owner";
    private static final String GROUP_MSG_RECALL_COMMAND = "group_msg_recall";
    private static final String IMPORT_GROUP_COMMAND = "import_group";
    private static final String IMPORT_GROUP_MSG_COMMAND = "import_group_msg";
    private static final String IMPORT_GROUP_MEMBER_COMMAND = "import_group_member";
    private static final String SET_UNREAD_MSG_NUM_COMMAND = "set_unread_msg_num";
    private static final String DELETE_GROUP_MSG_BY_SENDER_COMMAND = "delete_group_msg_by_sender";
    private static final String GROUP_MSG_GET_SIMPLE_COMMAND = "group_msg_get_simple";
    private static final String GET_ONLINE_MEMBER_NUM_COMMAND = "get_online_member_num";
    private static final String GET_MEMBERS_COMMAND = "get_members";
    private static final String GET_GROUP_ATTR_COMMAND = "get_group_attr";
    private static final String MODIFY_GROUP_ATTR_COMMAND = "modify_group_attr";
    private static final String CLEAR_GROUP_ATTR_COMMAND = "clear_group_attr";
    private static final String SET_GROUP_ATTR_COMMAND = "set_group_attr";

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

    /**
     * 获取被禁言群成员列表
     *
     * @param getGroupShuttedUinRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetGroupShuttedUinResult getGroupShuttedUin(GetGroupShuttedUinRequest getGroupShuttedUinRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_SHUTTED_UIN_COMMAND);
        return HttpUtil.post(url, getGroupShuttedUinRequest, GetGroupShuttedUinResult.class, imClient.getConfig());
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

    /**
     * 撤回指定用户发送的消息
     *
     * @param deleteGroupMsgBySenderRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND);
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
}
