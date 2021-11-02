package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

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


    private final ImClient imClient;

    public Operation(ImClient imClient) {
        this.imClient = imClient;
    }

    public SetNoSpeakingResult setNoSpeaking(SetNoSpeakingRequest setNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, SET_NO_SPEAKING_COMMAND);
        return HttpUtil.post(url, setNoSpeakingRequest, SetNoSpeakingResult.class, imClient.getConfig());
    }

    public GetNoSpeakingResult getNoSpeaking(GetNoSpeakingRequest getNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_NO_SPEAKING_COMMAND);
        return HttpUtil.post(url, getNoSpeakingRequest, GetNoSpeakingResult.class, imClient.getConfig());
    }

    public GetAppInfoResult getAppInfo(GetAppInfoRequest getAppInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_APP_INFO_COMMAND);
        return HttpUtil.post(url, getAppInfoRequest, GetAppInfoResult.class, imClient.getConfig());
    }

    public GetHistoryResult getHistory(GetHistoryRequest getHistoryRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_MSG, GET_HISTORY_COMMAND);
        return HttpUtil.post(url, getHistoryRequest, GetHistoryResult.class, imClient.getConfig());
    }

    public GetIpListResult getIpList(GetIpListRequest getIpListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CONFIG, GET_IP_LIST_COMMAND);
        return HttpUtil.post(url, getIpListRequest, GetIpListResult.class, imClient.getConfig());
    }
}
