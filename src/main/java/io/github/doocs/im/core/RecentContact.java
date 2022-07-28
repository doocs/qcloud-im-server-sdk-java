package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.DeleteRecentContactRequest;
import io.github.doocs.im.model.request.GetRecentContactListRequest;
import io.github.doocs.im.model.response.DeleteRecentContactResult;
import io.github.doocs.im.model.response.GetRecentContactListResult;
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
}
