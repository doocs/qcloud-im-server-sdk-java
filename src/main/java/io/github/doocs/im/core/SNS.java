package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;
import io.github.doocs.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class SNS {
    private static final String SERVICE_NAME = "sns";

    private static final String FRIEND_ADD_COMMAND = "friend_add";
    private static final String FRIEND_IMPORT_COMMAND = "friend_import";
    private static final String FRIEND_UPDATE_COMMAND = "friend_update";
    private static final String FRIEND_DELETE_COMMAND = "friend_delete";
    private static final String FRIEND_DELETE_ALL_COMMAND = "friend_delete_all";
    private static final String FRIEND_CHECK_COMMAND = "friend_check";
    private static final String FRIEND_GET_COMMAND = "friend_get";
    private static final String FRIEND_GET_LIST_COMMAND = "friend_get_list";
    private static final String BLACK_LIST_ADD_COMMAND = "black_list_add";
    private static final String BLACK_LIST_DELETE_COMMAND = "black_list_delete";
    private static final String BLACK_LIST_GET_COMMAND = "black_list_get";
    private static final String BLACK_LIST_CHECK_COMMAND = "black_list_check";
    private static final String GROUP_ADD_COMMAND = "group_add";
    private static final String GROUP_DELETE_COMMAND = "group_delete";
    private static final String GROUP_GET_COMMAND = "group_get";

    private final IMClient imClient;

    public SNS(IMClient imClient) {
        this.imClient = imClient;
    }

    public FriendAddResult friendAdd(FriendAddRequest friendAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_ADD_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendAddRequest), null);
        return JsonUtil.str2Obj(result, FriendAddResult.class);
    }

    public FriendImportResult friendImport(FriendImportRequest friendImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendImportRequest), null);
        return JsonUtil.str2Obj(result, FriendImportResult.class);
    }

    public FriendUpdateResult friendUpdate(FriendUpdateRequest friendUpdateRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_UPDATE_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendUpdateRequest), null);
        return JsonUtil.str2Obj(result, FriendUpdateResult.class);
    }

    public FriendDeleteResult friendDelete(FriendDeleteRequest friendDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendDeleteRequest), null);
        return JsonUtil.str2Obj(result, FriendDeleteResult.class);
    }

    public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest friendDeleteAllRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_ALL_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendDeleteAllRequest), null);
        return JsonUtil.str2Obj(result, FriendDeleteAllResult.class);
    }

    public FriendCheckResult friendCheck(FriendCheckRequest friendCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_CHECK_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendCheckRequest), null);
        return JsonUtil.str2Obj(result, FriendCheckResult.class);
    }

    public FriendGetResult friendGet(FriendGetRequest friendGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendGetRequest), null);
        return JsonUtil.str2Obj(result, FriendGetResult.class);
    }

    public FriendGetListResult friendGetList(FriendGetListRequest friendGetListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_LIST_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendGetListRequest), null);
        return JsonUtil.str2Obj(result, FriendGetListResult.class);
    }

    public BlackListAddResult blackListAdd(BlackListAddRequest blackListAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_ADD_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(blackListAddRequest), null);
        return JsonUtil.str2Obj(result, BlackListAddResult.class);
    }

    public BlackListDeleteResult blackListDelete(BlackListDeleteRequest blackListDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_DELETE_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(blackListDeleteRequest), null);
        return JsonUtil.str2Obj(result, BlackListDeleteResult.class);
    }

    public BlackListGetResult blackListGet(BlackListGetRequest blackListGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_GET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(blackListGetRequest), null);
        return JsonUtil.str2Obj(result, BlackListGetResult.class);
    }

    public BlackListCheckResult blackListCheck(BlackListCheckRequest blackListCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_CHECK_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(blackListCheckRequest), null);
        return JsonUtil.str2Obj(result, BlackListCheckResult.class);
    }

    public GroupAddResult groupAdd(GroupAddRequest groupAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_ADD_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(groupAddRequest), null);
        return JsonUtil.str2Obj(result, GroupAddResult.class);
    }

    public GroupDeleteResult groupDelete(GroupDeleteRequest groupDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_DELETE_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(groupDeleteRequest), null);
        return JsonUtil.str2Obj(result, GroupDeleteResult.class);
    }

    public GroupGetResult groupGet(GroupGetRequest groupGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_GET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(groupGetRequest), null);
        return JsonUtil.str2Obj(result, GroupGetResult.class);
    }
}
