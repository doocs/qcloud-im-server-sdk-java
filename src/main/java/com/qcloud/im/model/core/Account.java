package com.qcloud.im.model.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.ImportMsgRequest;
import com.qcloud.im.model.response.AccountImportResult;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 14:52
 */
public class Account {
    private final String SERVICE_NAME = "im_open_login_svc";
    private final String ACCOUNT_IMPORT_COMMAND = "account_import";

    private IMClient imClient;

    public AccountImportResult accountImport(ImportMsgRequest importMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ACCOUNT_IMPORT_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(importMsgRequest), null);
        return JsonUtil.str2Obj(result, AccountImportResult.class);
    }

    public Account(IMClient imClient) {
        this.imClient = imClient;
    }
}
