package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 14:52
 */
public class Account {
    private static final String SERVICE_NAME = "im_open_login_svc";
    private static final String SERVICE_NAME_OPEN_IM = "openim";

    private static final String ACCOUNT_IMPORT_COMMAND = "account_import";
    private static final String MULTI_ACCOUNT_IMPORT_COMMAND = "multiaccount_import";
    private static final String ACCOUNT_DELETE_COMMAND = "account_delete";
    private static final String ACCOUNT_CHECK_COMMAND = "account_check";
    private static final String KICK_COMMAND = "kick";
    private static final String QUERY_ONLINE_STATUS_COMMAND = "query_online_status";

    private final ImClient imClient;

    public Account(ImClient imClient) {
        this.imClient = imClient;
    }

    public AccountImportResult accountImport(AccountImportRequest accountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_IMPORT_COMMAND);
        return HttpUtil.post(url, accountImportRequest, AccountImportResult.class);
    }

    public MultiAccountImportResult multiAccountImport(MultiAccountImportRequest multiAccountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MULTI_ACCOUNT_IMPORT_COMMAND);
        return HttpUtil.post(url, multiAccountImportRequest, MultiAccountImportResult.class);
    }

    public AccountDeleteResult accountDelete(AccountDeleteRequest accountDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_DELETE_COMMAND);
        return HttpUtil.post(url, accountDeleteRequest, AccountDeleteResult.class);
    }

    public AccountCheckResult accountCheck(AccountCheckRequest accountCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_CHECK_COMMAND);
        return HttpUtil.post(url, accountCheckRequest, AccountCheckResult.class);
    }

    public KickResult kick(KickRequest kickRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, KICK_COMMAND);
        return HttpUtil.post(url, kickRequest, KickResult.class);
    }

    public QueryOnlineStatusResult queryOnlineStatus(QueryOnlineStatusRequest queryOnlineStatusRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM, QUERY_ONLINE_STATUS_COMMAND);
        return HttpUtil.post(url, queryOnlineStatusRequest, QueryOnlineStatusResult.class);
    }
}
