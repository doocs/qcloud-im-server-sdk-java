package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

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

    private final IMClient imClient;

    public Group(IMClient imClient) {
        this.imClient = imClient;
    }

    public GetAppidGroupListResult getAppIdGroupList(GetAppidGroupListRequest getAppidGroupListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_APPID_GROUP_LIST_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getAppidGroupListRequest), null);
        return JsonUtil.str2Obj(result, GetAppidGroupListResult.class);
    }

    public CreateGroupResult createGroup(CreateGroupRequest createGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_GROUP_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(createGroupRequest), null);
        return JsonUtil.str2Obj(result, CreateGroupResult.class);
    }

    public GetGroupInfoResult getGroupInfo(GetGroupInfoRequest getGroupInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_GROUP_INFO_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getGroupInfoRequest), null);
        return JsonUtil.str2Obj(result, GetGroupInfoResult.class);
    }

    public AddGroupMemberResult addGroupMember(AddGroupMemberRequest addGroupMemberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_GROUP_MEMBER_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(addGroupMemberRequest), null);
        return JsonUtil.str2Obj(result, AddGroupMemberResult.class);
    }

    public SetUnreadMsgNumResult setUnreadMsgNum(SetUnreadMsgNumRequest setUnreadMsgNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SET_UNREAD_MSG_NUM_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(setUnreadMsgNumRequest), null);
        return JsonUtil.str2Obj(result, SetUnreadMsgNumResult.class);
    }

    public DeleteGroupMsgBySenderResult deleteGroupMsgBySender(DeleteGroupMsgBySenderRequest deleteGroupMsgBySenderRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_GROUP_MSG_BY_SENDER_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(deleteGroupMsgBySenderRequest), null);
        return JsonUtil.str2Obj(result, DeleteGroupMsgBySenderResult.class);
    }

    public GroupMsgGetSimpleResult groupMsgGetSimple(GroupMsgGetSimpleRequest groupMsgGetSimpleRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_MSG_GET_SIMPLE_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(groupMsgGetSimpleRequest), null);
        return JsonUtil.str2Obj(result, GroupMsgGetSimpleResult.class);
    }

    public GetOnlineMemberNumResult getOnlineMemberNum(GetOnlineMemberNumRequest getOnlineMemberNumRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_ONLINE_MEMBER_NUM_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getOnlineMemberNumRequest), null);
        return JsonUtil.str2Obj(result, GetOnlineMemberNumResult.class);
    }
}
