package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 最近联系人
 *
 * @author bingo
 * @since 2021/10/11 10:25
 */
public class RecentContact {
    /**
     * 最近联系人服务名
     */
    public static final String SERVICE_NAME = "recentcontact";

    /**
     * 最近联系人相关命令字
     */
    public static final String GET_RECENT_CONTACT_LIST = "get_list";
    public static final String DELETE_RECENT_CONTACT = "delete";
    public static final String CREATE_CONTACT_GROUP = "create_contact_group";
    public static final String UPDATE_CONTACT_GROUP = "update_contact_group";
    public static final String DEL_CONTACT_GROUP = "del_contact_group";
    public static final String MARK_CONTACT = "mark_contact";
    public static final String SEARCH_CONTACT_GROUP = "search_contact_group";
    public static final String GET_CONTACT_GROUP = "get_contact_group";

    private final ImClient imClient;

    public RecentContact(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 拉取会话列表
     *
     * @param recentContactListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetRecentContactListResult recentContactList(GetRecentContactListRequest recentContactListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_RECENT_CONTACT_LIST);
        return HttpUtil.post(url, recentContactListRequest, GetRecentContactListResult.class, imClient.getConfig());
    }

    public GetRecentContactListResult recentContactList(GetRecentContactListRequest recentContactListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_RECENT_CONTACT_LIST, random);
        return HttpUtil.post(url, recentContactListRequest, GetRecentContactListResult.class, imClient.getConfig());
    }

    /**
     * 删除单个会话
     *
     * @param deleteRecentContactRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteRecentContactResult deleteRecentContact(DeleteRecentContactRequest deleteRecentContactRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_RECENT_CONTACT);
        return HttpUtil.post(url, deleteRecentContactRequest, DeleteRecentContactResult.class, imClient.getConfig());
    }

    public DeleteRecentContactResult deleteRecentContact(DeleteRecentContactRequest deleteRecentContactRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_RECENT_CONTACT, random);
        return HttpUtil.post(url, deleteRecentContactRequest, DeleteRecentContactResult.class, imClient.getConfig());
    }

    /**
     * 创建会话分组数据
     *
     * @param createContactGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public CreateContactGroupResult createContactGroup(CreateContactGroupRequest createContactGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_CONTACT_GROUP);
        return HttpUtil.post(url, createContactGroupRequest, CreateContactGroupResult.class, imClient.getConfig());
    }

    public CreateContactGroupResult createContactGroup(CreateContactGroupRequest createContactGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_CONTACT_GROUP, random);
        return HttpUtil.post(url, createContactGroupRequest, CreateContactGroupResult.class, imClient.getConfig());
    }

    /**
     * 更新会话分组数据
     *
     * @param updateContactGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public UpdateContactGroupResult updateContactGroup(UpdateContactGroupRequest updateContactGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UPDATE_CONTACT_GROUP);
        return HttpUtil.post(url, updateContactGroupRequest, UpdateContactGroupResult.class, imClient.getConfig());
    }

    public UpdateContactGroupResult updateContactGroup(UpdateContactGroupRequest updateContactGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, UPDATE_CONTACT_GROUP, random);
        return HttpUtil.post(url, updateContactGroupRequest, UpdateContactGroupResult.class, imClient.getConfig());
    }

    /**
     * 删除会话分组数据
     *
     * @param delContactGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常信息
     */
    public DelContactGroupResult delContactGroup(DelContactGroupRequest delContactGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DEL_CONTACT_GROUP);
        return HttpUtil.post(url, delContactGroupRequest, DelContactGroupResult.class, imClient.getConfig());
    }

    public DelContactGroupResult delContactGroup(DelContactGroupRequest delContactGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DEL_CONTACT_GROUP, random);
        return HttpUtil.post(url, delContactGroupRequest, DelContactGroupResult.class, imClient.getConfig());
    }

    /**
     * 创建或更新会话标记数据
     *
     * @param markContactRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public MarkContactResult markContact(MarkContactRequest markContactRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MARK_CONTACT);
        return HttpUtil.post(url, markContactRequest, MarkContactResult.class, imClient.getConfig());
    }

    public MarkContactResult markContact(MarkContactRequest markContactRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MARK_CONTACT, random);
        return HttpUtil.post(url, markContactRequest, MarkContactResult.class, imClient.getConfig());
    }

    /**
     * 搜索会话分组标记
     *
     * @param searchContactGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SearchContactGroupResult searchContactGroup(SearchContactGroupRequest searchContactGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEARCH_CONTACT_GROUP);
        return HttpUtil.post(url, searchContactGroupRequest, SearchContactGroupResult.class, imClient.getConfig());
    }

    public SearchContactGroupResult searchContactGroup(SearchContactGroupRequest searchContactGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEARCH_CONTACT_GROUP, random);
        return HttpUtil.post(url, searchContactGroupRequest, SearchContactGroupResult.class, imClient.getConfig());
    }

    /**
     * 拉取会话分组标记数据
     *
     * @param getContactGroupRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetContactGroupResult getContactGroup(GetContactGroupRequest getContactGroupRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_CONTACT_GROUP);
        return HttpUtil.post(url, getContactGroupRequest, GetContactGroupResult.class, imClient.getConfig());
    }

    public GetContactGroupResult getContactGroup(GetContactGroupRequest getContactGroupRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_CONTACT_GROUP, random);
        return HttpUtil.post(url, getContactGroupRequest, GetContactGroupResult.class, imClient.getConfig());
    }
}
