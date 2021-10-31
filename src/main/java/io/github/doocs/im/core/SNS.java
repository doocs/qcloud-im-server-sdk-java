package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

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
        return HttpUtil.post(url, friendAddRequest, FriendAddResult.class);
    }

    public FriendImportResult friendImport(FriendImportRequest friendImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND);
        return HttpUtil.post(url, friendImportRequest, FriendImportResult.class);
    }

    public FriendUpdateResult friendUpdate(FriendUpdateRequest friendUpdateRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_UPDATE_COMMAND);
        return HttpUtil.post(url, friendUpdateRequest, FriendUpdateResult.class);
    }

    public FriendDeleteResult friendDelete(FriendDeleteRequest friendDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_COMMAND);
        return HttpUtil.post(url, friendDeleteRequest, FriendDeleteResult.class);
    }

    public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest friendDeleteAllRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_ALL_COMMAND);
        return HttpUtil.post(url, friendDeleteAllRequest, FriendDeleteAllResult.class);
    }

    public FriendCheckResult friendCheck(FriendCheckRequest friendCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_CHECK_COMMAND);
        return HttpUtil.post(url, friendCheckRequest, FriendCheckResult.class);
    }

    public FriendGetResult friendGet(FriendGetRequest friendGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_COMMAND);
        return HttpUtil.post(url, friendGetRequest, FriendGetResult.class);
    }

    public FriendGetListResult friendGetList(FriendGetListRequest friendGetListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_LIST_COMMAND);
        return HttpUtil.post(url, friendGetListRequest, FriendGetListResult.class);
    }

    public BlackListAddResult blackListAdd(BlackListAddRequest blackListAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_ADD_COMMAND);
        return HttpUtil.post(url, blackListAddRequest, BlackListAddResult.class);
    }

    public BlackListDeleteResult blackListDelete(BlackListDeleteRequest blackListDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_DELETE_COMMAND);
        return HttpUtil.post(url, blackListDeleteRequest, BlackListDeleteResult.class);
    }

    public BlackListGetResult blackListGet(BlackListGetRequest blackListGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_GET_COMMAND);
        return HttpUtil.post(url, blackListGetRequest, BlackListGetResult.class);
    }

    public BlackListCheckResult blackListCheck(BlackListCheckRequest blackListCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_CHECK_COMMAND);
        return HttpUtil.post(url, blackListCheckRequest, BlackListCheckResult.class);
    }

    public GroupAddResult groupAdd(GroupAddRequest groupAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_ADD_COMMAND);
        return HttpUtil.post(url, groupAddRequest, GroupAddResult.class);
    }

    public GroupDeleteResult groupDelete(GroupDeleteRequest groupDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_DELETE_COMMAND);
        return HttpUtil.post(url, groupDeleteRequest, GroupDeleteResult.class);
    }

    public GroupGetResult groupGet(GroupGetRequest groupGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_GET_COMMAND);
        return HttpUtil.post(url, groupGetRequest, GroupGetResult.class);
    }
}
