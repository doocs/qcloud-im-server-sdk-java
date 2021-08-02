package com.github.doocs.im.core;

import com.github.doocs.im.IMClient;
import com.github.doocs.im.model.request.*;
import com.github.doocs.im.model.response.*;
import com.github.doocs.im.util.HttpUtil;
import com.github.doocs.im.util.JsonUtil;

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
    private static final String GET_APP_INFO_COMMAND = "getappinfo";
    private static final String GET_HISTORY_COMMAND = "get_history";
    private static final String GET_IP_LIST_COMMAND = "GetIPList";


    private final IMClient imClient;

    public Operation(IMClient imClient) {
        this.imClient = imClient;
    }

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

    public GetAppInfoResult getAppInfo(GetAppInfoRequest getAppInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_APP_INFO_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getAppInfoRequest), null);
        return JsonUtil.str2Obj(result, GetAppInfoResult.class);
    }

    public GetHistoryResult getHistory(GetHistoryRequest getHistoryRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_MSG, GET_HISTORY_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getHistoryRequest), null);
        return JsonUtil.str2Obj(result, GetHistoryResult.class);
    }

    public GetIpListResult getIpList(GetIpListRequest getIpListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CONFIG, GET_IP_LIST_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(getIpListRequest), null);
        return JsonUtil.str2Obj(result, GetIpListResult.class);
    }
}
