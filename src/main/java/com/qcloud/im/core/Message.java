package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.ImportMsgRequest;
import com.qcloud.im.model.request.SendMsgRequest;
import com.qcloud.im.model.response.ImportMsgResult;
import com.qcloud.im.model.response.SendMsgResult;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 10:28
 */
public class Message {
    private final String SERVICE_NAME = "openim";
    private final String SEND_MSG_COMMAND = "sendmsg";
    private final String IMPORT_MSG_COMMAND = "importmsg";

    private IMClient imClient;

    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_MSG_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(sendMsgRequest), null);
        return JsonUtil.str2Obj(result, SendMsgResult.class);
    }

    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(importMsgRequest), null);
        return JsonUtil.str2Obj(result, ImportMsgResult.class);
    }

    public Message(IMClient imClient) {
        this.imClient = imClient;
    }
}
