package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 关系链管理
 *
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Sns {
    /**
     * 关系链管理服务名
     */
    public static final String SERVICE_NAME = "sns";
    public static final String SERVICE_NAME_FOLLOW = "follow";

    /**
     * 关系链管理相关命令字
     */
    public static final String FRIEND_ADD_COMMAND = "friend_add";
    public static final String FRIEND_IMPORT_COMMAND = "friend_import";
    public static final String FRIEND_UPDATE_COMMAND = "friend_update";
    public static final String FRIEND_DELETE_COMMAND = "friend_delete";
    public static final String FRIEND_DELETE_ALL_COMMAND = "friend_delete_all";
    public static final String FRIEND_CHECK_COMMAND = "friend_check";
    public static final String FRIEND_GET_COMMAND = "friend_get";
    public static final String FRIEND_GET_LIST_COMMAND = "friend_get_list";
    public static final String BLACK_LIST_ADD_COMMAND = "black_list_add";
    public static final String BLACK_LIST_DELETE_COMMAND = "black_list_delete";
    public static final String BLACK_LIST_GET_COMMAND = "black_list_get";
    public static final String BLACK_LIST_CHECK_COMMAND = "black_list_check";
    public static final String GROUP_ADD_COMMAND = "group_add";
    public static final String GROUP_DELETE_COMMAND = "group_delete";
    public static final String GROUP_GET_COMMAND = "group_get";
    public static final String FOLLOW_ADD_COMMAND = "follow_add";
    public static final String FOLLOW_DELETE_COMMAND = "follow_delete";
    public static final String FOLLOW_GET_COMMAND = "follow_get";
    public static final String FOLLOW_CHECK_COMMAND = "follow_check";
    public static final String FOLLOW_GET_INFO_COMMAND = "follow_get_info";

    private final ImClient imClient;

    public Sns(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 添加好友
     *
     * @param friendAddRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendAddResult friendAdd(FriendAddRequest friendAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_ADD_COMMAND);
        return HttpUtil.post(url, friendAddRequest, FriendAddResult.class, imClient.getConfig());
    }

    public FriendAddResult friendAdd(FriendAddRequest friendAddRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_ADD_COMMAND, random);
        return HttpUtil.post(url, friendAddRequest, FriendAddResult.class, imClient.getConfig());
    }

    /**
     * 导入好友
     *
     * @param friendImportRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendImportResult friendImport(FriendImportRequest friendImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND);
        return HttpUtil.post(url, friendImportRequest, FriendImportResult.class, imClient.getConfig());
    }

    public FriendImportResult friendImport(FriendImportRequest friendImportRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND, random);
        return HttpUtil.post(url, friendImportRequest, FriendImportResult.class, imClient.getConfig());
    }

    /**
     * 更新好友
     *
     * @param friendUpdateRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendUpdateResult friendUpdate(FriendUpdateRequest friendUpdateRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_UPDATE_COMMAND);
        return HttpUtil.post(url, friendUpdateRequest, FriendUpdateResult.class, imClient.getConfig());
    }

    public FriendUpdateResult friendUpdate(FriendUpdateRequest friendUpdateRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_UPDATE_COMMAND, random);
        return HttpUtil.post(url, friendUpdateRequest, FriendUpdateResult.class, imClient.getConfig());
    }

    /**
     * 删除好友
     *
     * @param friendDeleteRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendDeleteResult friendDelete(FriendDeleteRequest friendDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_COMMAND);
        return HttpUtil.post(url, friendDeleteRequest, FriendDeleteResult.class, imClient.getConfig());
    }

    public FriendDeleteResult friendDelete(FriendDeleteRequest friendDeleteRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_COMMAND, random);
        return HttpUtil.post(url, friendDeleteRequest, FriendDeleteResult.class, imClient.getConfig());
    }

    /**
     * 删除所有好友
     *
     * @param friendDeleteAllRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest friendDeleteAllRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_ALL_COMMAND);
        return HttpUtil.post(url, friendDeleteAllRequest, FriendDeleteAllResult.class, imClient.getConfig());
    }

    public FriendDeleteAllResult friendDeleteAll(FriendDeleteAllRequest friendDeleteAllRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_DELETE_ALL_COMMAND, random);
        return HttpUtil.post(url, friendDeleteAllRequest, FriendDeleteAllResult.class, imClient.getConfig());
    }

    /**
     * 校验好友
     *
     * @param friendCheckRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendCheckResult friendCheck(FriendCheckRequest friendCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_CHECK_COMMAND);
        return HttpUtil.post(url, friendCheckRequest, FriendCheckResult.class, imClient.getConfig());
    }

    public FriendCheckResult friendCheck(FriendCheckRequest friendCheckRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_CHECK_COMMAND, random);
        return HttpUtil.post(url, friendCheckRequest, FriendCheckResult.class, imClient.getConfig());
    }

    /**
     * 拉取好友
     *
     * @param friendGetRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendGetResult friendGet(FriendGetRequest friendGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_COMMAND);
        return HttpUtil.post(url, friendGetRequest, FriendGetResult.class, imClient.getConfig());
    }

    public FriendGetResult friendGet(FriendGetRequest friendGetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_COMMAND, random);
        return HttpUtil.post(url, friendGetRequest, FriendGetResult.class, imClient.getConfig());
    }

    /**
     * 拉取指定好友
     *
     * @param friendGetListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public FriendGetListResult friendGetList(FriendGetListRequest friendGetListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_LIST_COMMAND);
        return HttpUtil.post(url, friendGetListRequest, FriendGetListResult.class, imClient.getConfig());
    }

    public FriendGetListResult friendGetList(FriendGetListRequest friendGetListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_GET_LIST_COMMAND, random);
        return HttpUtil.post(url, friendGetListRequest, FriendGetListResult.class, imClient.getConfig());
    }

    /**
     * 添加黑名单
     *
     * @param blackListAddRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BlackListAddResult blackListAdd(BlackListAddRequest blackListAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_ADD_COMMAND);
        return HttpUtil.post(url, blackListAddRequest, BlackListAddResult.class, imClient.getConfig());
    }

    public BlackListAddResult blackListAdd(BlackListAddRequest blackListAddRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_ADD_COMMAND, random);
        return HttpUtil.post(url, blackListAddRequest, BlackListAddResult.class, imClient.getConfig());
    }

    /**
     * 删除黑名单
     *
     * @param blackListDeleteRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BlackListDeleteResult blackListDelete(BlackListDeleteRequest blackListDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_DELETE_COMMAND);
        return HttpUtil.post(url, blackListDeleteRequest, BlackListDeleteResult.class, imClient.getConfig());
    }

    public BlackListDeleteResult blackListDelete(BlackListDeleteRequest blackListDeleteRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_DELETE_COMMAND, random);
        return HttpUtil.post(url, blackListDeleteRequest, BlackListDeleteResult.class, imClient.getConfig());
    }

    /**
     * 拉取黑名单
     *
     * @param blackListGetRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BlackListGetResult blackListGet(BlackListGetRequest blackListGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_GET_COMMAND);
        return HttpUtil.post(url, blackListGetRequest, BlackListGetResult.class, imClient.getConfig());
    }

    public BlackListGetResult blackListGet(BlackListGetRequest blackListGetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_GET_COMMAND, random);
        return HttpUtil.post(url, blackListGetRequest, BlackListGetResult.class, imClient.getConfig());
    }

    /**
     * 校验黑名单
     *
     * @param blackListCheckRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BlackListCheckResult blackListCheck(BlackListCheckRequest blackListCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_CHECK_COMMAND);
        return HttpUtil.post(url, blackListCheckRequest, BlackListCheckResult.class, imClient.getConfig());
    }

    public BlackListCheckResult blackListCheck(BlackListCheckRequest blackListCheckRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BLACK_LIST_CHECK_COMMAND, random);
        return HttpUtil.post(url, blackListCheckRequest, BlackListCheckResult.class, imClient.getConfig());
    }

    /**
     * 添加分组
     *
     * @param groupAddRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupAddResult groupAdd(GroupAddRequest groupAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_ADD_COMMAND);
        return HttpUtil.post(url, groupAddRequest, GroupAddResult.class, imClient.getConfig());
    }

    public GroupAddResult groupAdd(GroupAddRequest groupAddRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_ADD_COMMAND, random);
        return HttpUtil.post(url, groupAddRequest, GroupAddResult.class, imClient.getConfig());
    }

    /**
     * 删除分组
     *
     * @param groupDeleteRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupDeleteResult groupDelete(GroupDeleteRequest groupDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_DELETE_COMMAND);
        return HttpUtil.post(url, groupDeleteRequest, GroupDeleteResult.class, imClient.getConfig());
    }

    public GroupDeleteResult groupDelete(GroupDeleteRequest groupDeleteRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_DELETE_COMMAND, random);
        return HttpUtil.post(url, groupDeleteRequest, GroupDeleteResult.class, imClient.getConfig());
    }

    /**
     * 拉取分组
     *
     * @param groupGetRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GroupGetResult groupGet(GroupGetRequest groupGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_GET_COMMAND);
        return HttpUtil.post(url, groupGetRequest, GroupGetResult.class, imClient.getConfig());
    }

    public GroupGetResult groupGet(GroupGetRequest groupGetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GROUP_GET_COMMAND, random);
        return HttpUtil.post(url, groupGetRequest, GroupGetResult.class, imClient.getConfig());
    }

    /**
     * 关注用户
     *
     * @param followAddRequest 关注用户请求参数
     * @return 关注用户结果
     * @throws IOException 关注用户异常
     */
    public FollowAddResult followAdd(FollowAddRequest followAddRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_ADD_COMMAND);
        return HttpUtil.post(url, followAddRequest, FollowAddResult.class, imClient.getConfig());
    }

    public FollowAddResult followAdd(FollowAddRequest followAddRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_ADD_COMMAND, random);
        return HttpUtil.post(url, followAddRequest, FollowAddResult.class, imClient.getConfig());
    }

    /**
     * 取消关注用户
     *
     * @param followDeleteRequest 取消关注用户请求参数
     * @return 取消关注用户结果
     * @throws IOException 取消关注用户异常
     */
    public FollowDeleteResult followDelete(FollowDeleteRequest followDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_DELETE_COMMAND);
        return HttpUtil.post(url, followDeleteRequest, FollowDeleteResult.class, imClient.getConfig());
    }

    public FollowDeleteResult followDelete(FollowDeleteRequest followDeleteRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_DELETE_COMMAND, random);
        return HttpUtil.post(url, followDeleteRequest, FollowDeleteResult.class, imClient.getConfig());
    }

    /**
     * 拉取关注、粉丝与互关列表
     *
     * @param followGetRequest 拉取关注请求参数
     * @return 拉取关注结果
     * @throws IOException 拉取关注异常
     */
    public FollowGetResult followGet(FollowGetRequest followGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_GET_COMMAND);
        return HttpUtil.post(url, followGetRequest, FollowGetResult.class, imClient.getConfig());
    }

    public FollowGetResult followGet(FollowGetRequest followGetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_GET_COMMAND, random);
        return HttpUtil.post(url, followGetRequest, FollowGetResult.class, imClient.getConfig());
    }

    /**
     * 检查关注关系
     *
     * @param followCheckRequest 检查关注关系请求参数
     * @return 检查关注关系结果
     * @throws IOException 检查关注关系异常
     */
    public FollowCheckResult followCheck(FollowCheckRequest followCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_CHECK_COMMAND);
        return HttpUtil.post(url, followCheckRequest, FollowCheckResult.class, imClient.getConfig());
    }

    public FollowCheckResult followCheck(FollowCheckRequest followCheckRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_CHECK_COMMAND, random);
        return HttpUtil.post(url, followCheckRequest, FollowCheckResult.class, imClient.getConfig());
    }

    /**
     * 获取用户的关注、粉丝与互关数
     *
     * @param followGetInfoRequest 获取用户的关注、粉丝与互关数请求参数
     * @return 获取用户的关注、粉丝与互关数结果
     * @throws IOException 拉取关注异常
     */
    public FollowGetInfoResult followGetInfo(FollowGetInfoRequest followGetInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_GET_INFO_COMMAND);
        return HttpUtil.post(url, followGetInfoRequest, FollowGetInfoResult.class, imClient.getConfig());
    }

    public FollowGetInfoResult followGetInfo(FollowGetInfoRequest followGetInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_FOLLOW, FOLLOW_GET_INFO_COMMAND, random);
        return HttpUtil.post(url, followGetInfoRequest, FollowGetInfoResult.class, imClient.getConfig());
    }

}
