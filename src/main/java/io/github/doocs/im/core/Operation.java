package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 运营管理、全局禁言管理
 *
 * @author xy
 * @since 2021/07/31 11:17
 */
public class Operation {
    /**
     * 运营管理、全局禁言管理服务名
     */
    private static final String SERVICE_NAME_OPEN_CONFIG = "openconfigsvr";
    private static final String SERVICE_NAME_OPEN_MSG = "open_msg_svc";
    private static final String SERVICE_NAME_CONFIG = "ConfigSvc";

    /**
     * 运营管理、全局禁言管理相关命令字
     */
    private static final String SET_NO_SPEAKING_COMMAND = "setnospeaking";
    private static final String GET_NO_SPEAKING_COMMAND = "getnospeaking";
    private static final String GET_APP_INFO_COMMAND = "getappinfo";
    private static final String GET_HISTORY_COMMAND = "get_history";
    private static final String GET_IP_LIST_COMMAND = "GetIPList";


    private final ImClient imClient;

    public Operation(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 设置全局禁言
     *
     * @param setNoSpeakingRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetNoSpeakingResult setNoSpeaking(SetNoSpeakingRequest setNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, SET_NO_SPEAKING_COMMAND);
        return HttpUtil.post(url, setNoSpeakingRequest, SetNoSpeakingResult.class, imClient.getConfig());
    }

    /**
     * 查询全局禁言
     *
     * @param getNoSpeakingRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetNoSpeakingResult getNoSpeaking(GetNoSpeakingRequest getNoSpeakingRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_NO_SPEAKING_COMMAND);
        return HttpUtil.post(url, getNoSpeakingRequest, GetNoSpeakingResult.class, imClient.getConfig());
    }

    /**
     * 拉取运营数据
     *
     * @param getAppInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetAppInfoResult getAppInfo(GetAppInfoRequest getAppInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_APP_INFO_COMMAND);
        return HttpUtil.post(url, getAppInfoRequest, GetAppInfoResult.class, imClient.getConfig());
    }

    /**
     * 下载最近消息记录
     *
     * @param getHistoryRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetHistoryResult getHistory(GetHistoryRequest getHistoryRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_MSG, GET_HISTORY_COMMAND);
        return HttpUtil.post(url, getHistoryRequest, GetHistoryResult.class, imClient.getConfig());
    }

    /**
     * 获取服务器 IP 地址
     *
     * @param getIpListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetIpListResult getIpList(GetIpListRequest getIpListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CONFIG, GET_IP_LIST_COMMAND);
        return HttpUtil.post(url, getIpListRequest, GetIpListResult.class, imClient.getConfig());
    }
}
