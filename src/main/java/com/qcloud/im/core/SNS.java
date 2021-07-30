package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.FriendImportRequest;
import com.qcloud.im.model.response.FriendImportResult;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class SNS {
    private static final String SERVICE_NAME = "sns";
    private static final String FRIEND_IMPORT_COMMAND = "friend_import";

    private final IMClient imClient;

    public FriendImportResult friendImport(FriendImportRequest friendImportRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, FRIEND_IMPORT_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(friendImportRequest), null);
        return JsonUtil.str2Obj(result, FriendImportResult.class);
    }

    public SNS(IMClient imClient) {
        this.imClient = imClient;
    }
}
