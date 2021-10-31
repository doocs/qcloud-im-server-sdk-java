package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.DeleteRecentContactRequest;
import io.github.doocs.im.model.request.GetRecentContactListRequest;
import io.github.doocs.im.model.response.DeleteRecentContactResult;
import io.github.doocs.im.model.response.GetRecentContactListResult;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author bingo
 * @since 2021/10/11 10:25
 */
public class RecentContact {
    private static final String SERVICE_NAME = "recentcontact";

    private static final String GET_RECENT_CONTACT_LIST = "get_list";
    private static final String DELETE_RECENT_CONTACT = "delete";

    private final IMClient imClient;

    public RecentContact(IMClient imClient) {
        this.imClient = imClient;
    }

    public GetRecentContactListResult recentContactList(GetRecentContactListRequest recentContactListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_RECENT_CONTACT_LIST);
        return HttpUtil.post(url, recentContactListRequest, GetRecentContactListResult.class);
    }

    public DeleteRecentContactResult deleteRecentContact(DeleteRecentContactRequest deleteRecentContactRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_RECENT_CONTACT);
        return HttpUtil.post(url, deleteRecentContactRequest, DeleteRecentContactResult.class);
    }
}
