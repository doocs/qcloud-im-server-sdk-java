package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.GetNoSpeakingRequest;
import com.qcloud.im.model.request.SetNoSpeakingRequest;
import com.qcloud.im.model.response.GetNoSpeakingResult;
import com.qcloud.im.model.response.SetNoSpeakingResult;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author xy
 * @since 2021/07/31 11:17
 */
public class Operation {
    private static final String SERVICE_NAME_OPEN_CONFIG = "openconfigsvr";
    private static final String SERVICE_NAME_OPEN_MSG = "open_msg_svc";
    private static final String SERVICE_NAME_CONFIG = "ConfigSvc";

    private static final String SET_NO_SPEAKING_COMMAND = "setnospeaking";
    private static final String GET_NO_SPEAKING_COMMAND = "getnospeaking";


    private final IMClient imClient;

    public SetNoSpeakingResult setNoSpeaking(SetNoSpeakingRequest setNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, SET_NO_SPEAKING_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(setNoSpeakingRequest), null);
        return JsonUtil.str2Obj(result, SetNoSpeakingResult.class);
    }

    public GetNoSpeakingResult getNoSpeaking(GetNoSpeakingRequest getNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_NO_SPEAKING_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getNoSpeakingRequest), null);
        return JsonUtil.str2Obj(result, GetNoSpeakingResult.class);
    }

    public Operation(IMClient imClient) {
        this.imClient = imClient;
    }
}
