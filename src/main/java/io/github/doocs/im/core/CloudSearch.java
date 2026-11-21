package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * <p>
 * 云端搜索
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class CloudSearch {
    /**
     * 云端搜索服务名
     */
    public static final String SERVICE_NAME_USER = "user_search";
    public static final String SERVICE_NAME_GROUP = "group_search";
    public static final String SERVICE_NAME_GROUP_MEMBER = "group_member_search";
    public static final String SERVICE_NAME_IM_OPEN = "im_open_search";

    /**
     * 云端搜索相关命令字
     */
    public static final String SEARCH_COMMAND = "search";
    public static final String SET_VISIBILITY_COMMAND = "set_visibility";
    public static final String GET_NO_VISIBILITY_COMMAND = "get_no_visibility";

    private final ImClient imClient;

    public CloudSearch(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 用户搜索
     *
     * @param userSearchRequest 用户搜索请求参数
     * @return 用户搜索结果
     * @throws IOException 用户搜索异常
     */
    public UserSearchResult userSearch(UserSearchRequest userSearchRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_USER, SEARCH_COMMAND);
        return HttpUtil.post(url, userSearchRequest, UserSearchResult.class, imClient.getConfig());
    }

    public UserSearchResult userSearch(UserSearchRequest userSearchRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_USER, SEARCH_COMMAND, random);
        return HttpUtil.post(url, userSearchRequest, UserSearchResult.class, imClient.getConfig());
    }

    /**
     * 群组搜索
     *
     * @param groupSearchRequest 群组搜索请求参数
     * @return 群组搜索结果
     * @throws IOException 群组搜索异常
     */
    public GroupSearchResult groupSearch(GroupSearchRequest groupSearchRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP, SEARCH_COMMAND);
        return HttpUtil.post(url, groupSearchRequest, GroupSearchResult.class, imClient.getConfig());
    }

    public GroupSearchResult groupSearch(GroupSearchRequest groupSearchRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP, SEARCH_COMMAND, random);
        return HttpUtil.post(url, groupSearchRequest, GroupSearchResult.class, imClient.getConfig());
    }

    /**
     * 群成员搜索
     *
     * @param groupMemberSearchRequest 群成员搜索请求参数
     * @return 群成员搜索结果
     * @throws IOException 群成员搜索异常
     */
    public GroupMemberSearchResult groupMemberSearch(GroupMemberSearchRequest groupMemberSearchRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP_MEMBER, SEARCH_COMMAND);
        return HttpUtil.post(url, groupMemberSearchRequest, GroupMemberSearchResult.class, imClient.getConfig());
    }

    public GroupMemberSearchResult groupMemberSearch(GroupMemberSearchRequest groupMemberSearchRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP_MEMBER, SEARCH_COMMAND, random);
        return HttpUtil.post(url, groupMemberSearchRequest, GroupMemberSearchResult.class, imClient.getConfig());
    }

    /**
     * 隐藏搜索对象
     *
     * @param setVisibilityRequest 隐藏搜索对象请求参数
     * @return 隐藏搜索对象结果
     * @throws IOException 隐藏搜索对象异常
     */
    public SetVisibilitySearchResult setVisibility(SetVisibilityRequest setVisibilityRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_IM_OPEN, SET_VISIBILITY_COMMAND);
        return HttpUtil.post(url, setVisibilityRequest, SetVisibilitySearchResult.class, imClient.getConfig());
    }

    public SetVisibilitySearchResult setVisibility(SetVisibilityRequest setVisibilityRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_IM_OPEN, SET_VISIBILITY_COMMAND, random);
        return HttpUtil.post(url, setVisibilityRequest, SetVisibilitySearchResult.class, imClient.getConfig());
    }

    /**
     * 查询隐藏搜索对象
     *
     * @param getNoVisibilityRequest 查询隐藏搜索对象请求参数
     * @return 查询隐藏搜索对象结果
     * @throws IOException 查询隐藏搜索对象异常
     */
    public GetNoVisibilitySearchResult getNoVisibility(GetNoVisibilityRequest getNoVisibilityRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_IM_OPEN, GET_NO_VISIBILITY_COMMAND);
        return HttpUtil.post(url, getNoVisibilityRequest, GetNoVisibilitySearchResult.class, imClient.getConfig());
    }

    public GetNoVisibilitySearchResult getNoVisibility(GetNoVisibilityRequest getNoVisibilityRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_IM_OPEN, GET_NO_VISIBILITY_COMMAND, random);
        return HttpUtil.post(url, getNoVisibilityRequest, GetNoVisibilitySearchResult.class, imClient.getConfig());
    }

}
