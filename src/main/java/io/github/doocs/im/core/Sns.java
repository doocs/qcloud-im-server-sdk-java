package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Sns {
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

    private final ImClient imClient;

    public Sns(ImClient imClient) {
        this.imClient = imClient;
    }

    public FriendAddResult friendAdd(FriendAddRequest friendAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_ADD_COMMAND);
        return HttpUtil.post(url, friendAddRequest, FriendAddResult.class, imClient.getConfig());
    }

    public FriendImportResult friendImport(FriendImportRequest friendImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND);
        return HttpUtil.post(url, friendImportRequest, FriendImportResult.class, imClient.getConfig());
    }

    public FriendUpdateResult friendUpdate(FriendUpdateRequest friendUpdateRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_UPDATE_COMMAND);
        return HttpUtil.post(url, friendUpdateRequest, FriendUpdateResult.class, imClient.getConfig());
    }

    public FriendDeleteResult friendDelete(FriendDeleteRequest friendDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_COMMAND);
        return HttpUtil.post(url, friendDeleteRequest, FriendDeleteResult.class, imClient.getConfig());
    }

    public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest friendDeleteAllRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_ALL_COMMAND);
        return HttpUtil.post(url, friendDeleteAllRequest, FriendDeleteAllResult.class, imClient.getConfig());
    }

    public FriendCheckResult friendCheck(FriendCheckRequest friendCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_CHECK_COMMAND);
        return HttpUtil.post(url, friendCheckRequest, FriendCheckResult.class, imClient.getConfig());
    }

    public FriendGetResult friendGet(FriendGetRequest friendGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_COMMAND);
        return HttpUtil.post(url, friendGetRequest, FriendGetResult.class, imClient.getConfig());
    }

    public FriendGetListResult friendGetList(FriendGetListRequest friendGetListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_LIST_COMMAND);
        return HttpUtil.post(url, friendGetListRequest, FriendGetListResult.class, imClient.getConfig());
    }

    public BlackListAddResult blackListAdd(BlackListAddRequest blackListAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_ADD_COMMAND);
        return HttpUtil.post(url, blackListAddRequest, BlackListAddResult.class, imClient.getConfig());
    }

    public BlackListDeleteResult blackListDelete(BlackListDeleteRequest blackListDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_DELETE_COMMAND);
        return HttpUtil.post(url, blackListDeleteRequest, BlackListDeleteResult.class, imClient.getConfig());
    }

    public BlackListGetResult blackListGet(BlackListGetRequest blackListGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_GET_COMMAND);
        return HttpUtil.post(url, blackListGetRequest, BlackListGetResult.class, imClient.getConfig());
    }

    public BlackListCheckResult blackListCheck(BlackListCheckRequest blackListCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_CHECK_COMMAND);
        return HttpUtil.post(url, blackListCheckRequest, BlackListCheckResult.class, imClient.getConfig());
    }

    public GroupAddResult groupAdd(GroupAddRequest groupAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_ADD_COMMAND);
        return HttpUtil.post(url, groupAddRequest, GroupAddResult.class, imClient.getConfig());
    }

    public GroupDeleteResult groupDelete(GroupDeleteRequest groupDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_DELETE_COMMAND);
        return HttpUtil.post(url, groupDeleteRequest, GroupDeleteResult.class, imClient.getConfig());
    }

    public GroupGetResult groupGet(GroupGetRequest groupGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_GET_COMMAND);
        return HttpUtil.post(url, groupGetRequest, GroupGetResult.class, imClient.getConfig());
    }
}
