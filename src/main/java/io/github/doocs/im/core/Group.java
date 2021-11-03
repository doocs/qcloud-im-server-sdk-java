package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author bingo
 * @since 2021/7/31 20:45
 */
public class Group {
    private static final String SERVICE_NAME = "group_open_http_svc";

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

    private final ImClient imClient;

    public Group(ImClient imClient) {
        this.imClient = imClient;
    }

    public GetAppidGroupListResult getAppIdGroupList(GetAppidGroupListRequest getAppidGroupListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_APPID_GROUP_LIST_COMMAND);
        return HttpUtil.post(url, getAppidGroupListRequest, GetAppidGroupListResult.class, imClient.getConfig());
    }

    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_GROUP_COMMAND);
        return HttpUtil.post(url, createGroupRequest, CreateGroupResult.class, imClient.getConfig());
    }

    public GetGroupInfoResult getGroupInfo(GetGroupInfoRequest getGroupInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_INFO_COMMAND);
        return HttpUtil.post(url, getGroupInfoRequest, GetGroupInfoResult.class, imClient.getConfig());
    }

    public GetGroupMemberInfoResult getGroupMemberInfo(GetGroupMemberInfoRequest getGroupMemberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_MEMBER_INFO_COMMAND);
        return HttpUtil.post(url, getGroupMemberInfoRequest, GetGroupMemberInfoResult.class, imClient.getConfig());
    }

    public ModifyGroupBaseInfoResult modifyGroupBaseInfo(ModifyGroupBaseInfoRequest modifyGroupBaseInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_BASE_INFO_COMMAND);
        return HttpUtil.post(url, modifyGroupBaseInfoRequest, ModifyGroupBaseInfoResult.class, imClient.getConfig());
    }

    public AddGroupMemberResult addGroupMember(AddGroupMemberRequest addGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, addGroupMemberRequest, AddGroupMemberResult.class, imClient.getConfig());
    }

    public DeleteGroupMemberResult deleteGroupMember(DeleteGroupMemberRequest deleteGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, deleteGroupMemberRequest, DeleteGroupMemberResult.class, imClient.getConfig());
    }

    public ModifyGroupMemberInfoResult modifyGroupMemberInfo(ModifyGroupMemberInfoRequest modifyGroupMemberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_GROUP_MEMBER_INFO_COMMAND);
        return HttpUtil.post(url, modifyGroupMemberInfoRequest, ModifyGroupMemberInfoResult.class, imClient.getConfig());
    }

    public DestroyGroupResult destroyGroup(DestroyGroupRequest destroyGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_GROUP_COMMAND);
        return HttpUtil.post(url, destroyGroupRequest, DestroyGroupResult.class, imClient.getConfig());
    }

    public GetJoinGroupListResult getJoinGroupList(GetJoinedGroupListRequest getJoinedGroupListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_JOINED_GROUP_LIST_COMMAND);
        return HttpUtil.post(url, getJoinedGroupListRequest, GetJoinGroupListResult.class, imClient.getConfig());
    }

    public GetRoleInGroupResult getRoleInGroup(GetRoleInGroupRequest getRoleInGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ROLE_IN_GROUP_COMMAND);
        return HttpUtil.post(url, getRoleInGroupRequest, GetRoleInGroupResult.class, imClient.getConfig());
    }

    public ForbidSendMsgResult forbidSendMsg(ForbidSendMsgRequest forbidSendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FORBID_SEND_MSG_COMMAND);
        return HttpUtil.post(url, forbidSendMsgRequest, ForbidSendMsgResult.class, imClient.getConfig());
    }

    public GetGroupShuttedUinResult getGroupShuttedUin(GetGroupShuttedUinRequest getGroupShuttedUinRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_SHUTTED_UIN_COMMAND);
        return HttpUtil.post(url, getGroupShuttedUinRequest, GetGroupShuttedUinResult.class, imClient.getConfig());
    }

    public SendGroupMsgResult sendGroupMsg(SendGroupMsgRequest sendGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, sendGroupMsgRequest, SendGroupMsgResult.class, imClient.getConfig());
    }

    public SendGroupSystemNotificationResult sendGroupSystemNotification(SendGroupSystemNotificationRequest sendGroupSystemNotificationRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_GROUP_SYSTEM_NOTIFICATION_COMMAND);
        return HttpUtil.post(url, sendGroupSystemNotificationRequest, SendGroupSystemNotificationResult.class, imClient.getConfig());
    }

    public ChangeGroupOwnerResult changeGroupOwner(ChangeGroupOwnerRequest changeGroupOwnerRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CHANGE_GROUP_OWNER_COMMAND);
        return HttpUtil.post(url, changeGroupOwnerRequest, ChangeGroupOwnerResult.class, imClient.getConfig());
    }

    public GroupMsgRecallResult groupMsgRecall(GroupMsgRecallRequest groupMsgRecallRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_RECALL_COMMAND);
        return HttpUtil.post(url, groupMsgRecallRequest, GroupMsgRecallResult.class, imClient.getConfig());
    }

    public ImportGroupResult importGroup(ImportGroupRequest importGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_COMMAND);
        return HttpUtil.post(url, importGroupRequest, ImportGroupResult.class, imClient.getConfig());
    }

    public ImportGroupMsgResult importGroupMsg(ImportGroupMsgRequest importGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, importGroupMsgRequest, ImportGroupMsgResult.class, imClient.getConfig());
    }

    public ImportGroupMemberResult importGroupMember(ImportGroupMemberRequest importGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_GROUP_MEMBER_COMMAND);
        return HttpUtil.post(url, importGroupMemberRequest, ImportGroupMemberResult.class, imClient.getConfig());
    }

    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_UNREAD_MSG_NUM_COMMAND);
        return HttpUtil.post(url, setUnreadMsgNumRequest, SetUnreadMsgNumResult.class, imClient.getConfig());
    }

    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND);
        return HttpUtil.post(url, deleteGroupMsgBySenderRequest, DeleteGroupMsgBySenderResult.class, imClient.getConfig());
    }

    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_GET_SIMPLE_COMMAND);
        return HttpUtil.post(url, groupMsgGetSimpleRequest, GroupMsgGetSimpleResult.class, imClient.getConfig());
    }

    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ONLINE_MEMBER_NUM_COMMAND);
        return HttpUtil.post(url, getOnlineMemberNumRequest, GetOnlineMemberNumResult.class, imClient.getConfig());
    }
}
