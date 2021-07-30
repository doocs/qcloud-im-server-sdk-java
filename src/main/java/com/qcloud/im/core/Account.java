package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

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
    private static final String ACCOUNT_DELETE = "account_delete";
    private static final String ACCOUNT_CHECK = "account_check";
    private static final String KICK = "kick";
    private static final String QUERY_STATE = "querystate";

    private final IMClient imClient;

    public Account(IMClient imClient) {
        this.imClient = imClient;
    }

    public AccountImportResult accountImport(AccountImportRequest accountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_IMPORT_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(accountImportRequest), null);
        return JsonUtil.str2Obj(result, AccountImportResult.class);
    }

    public MultiAccountImportResult multiAccountImport(MultiAccountImportRequest multiAccountImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MULTI_ACCOUNT_IMPORT_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(multiAccountImportRequest), null);
        return JsonUtil.str2Obj(result, MultiAccountImportResult.class);
    }

    public AccountDeleteResult accountDelete(AccountDeleteRequest accountDeleteRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_DELETE);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(accountDeleteRequest), null);
        return JsonUtil.str2Obj(result, AccountDeleteResult.class);
    }

    public AccountCheckResult accountCheck(AccountCheckRequest accountCheckRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_CHECK);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(accountCheckRequest), null);
        return JsonUtil.str2Obj(result, AccountCheckResult.class);
    }

    public KickResult kick(KickRequest kickRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, KICK);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(kickRequest), null);
        return JsonUtil.str2Obj(result, KickResult.class);
    }

    public QueryStateResult queryState(QueryStateRequest queryStateRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_IM, QUERY_STATE);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(queryStateRequest), null);
        return JsonUtil.str2Obj(result, QueryStateResult.class);
    }
}
