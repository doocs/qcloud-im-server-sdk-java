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
    public static final String SERVICE_NAME_OPEN_CONFIG = "openconfigsvr";
    public static final String SERVICE_NAME_OPEN_MSG = "open_msg_svc";
    public static final String SERVICE_NAME_CONFIG = "ConfigSvc";
    public static final String SERVICE_NAME_COS_MSG = "im_cos_msg";

    /**
     * 运营管理、全局禁言管理相关命令字
     */
    public static final String SET_NO_SPEAKING_COMMAND = "setnospeaking";
    public static final String GET_NO_SPEAKING_COMMAND = "getnospeaking";
    public static final String GET_APP_INFO_COMMAND = "getappinfo";
    public static final String GET_HISTORY_COMMAND = "get_history";
    public static final String GET_IP_LIST_COMMAND = "GetIPList";
    public static final String FORBID_ILLEGAL_OBJECT = "forbid_illegal_object";
    public static final String ALLOW_BANNED_OBJECT = "allow_banned_object";
    public static final String GET_COS_SIG = "get_cos_sig";

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

    public SetNoSpeakingResult setNoSpeaking(SetNoSpeakingRequest setNoSpeakingRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, SET_NO_SPEAKING_COMMAND, random);
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

    public GetNoSpeakingResult getNoSpeaking(GetNoSpeakingRequest getNoSpeakingRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_NO_SPEAKING_COMMAND, random);
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

    public GetAppInfoResult getAppInfo(GetAppInfoRequest getAppInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_CONFIG, GET_APP_INFO_COMMAND, random);
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

    public GetHistoryResult getHistory(GetHistoryRequest getHistoryRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_OPEN_MSG, GET_HISTORY_COMMAND, random);
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

    public GetIpListResult getIpList(GetIpListRequest getIpListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_CONFIG, GET_IP_LIST_COMMAND, random);
        return HttpUtil.post(url, getIpListRequest, GetIpListResult.class, imClient.getConfig());
    }


    /**
     * 聊天文件封禁
     *
     * @param forbidIllegalObjectRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ForbidIllegalObjectResult forbidIllegalObject(ForbidIllegalObjectRequest forbidIllegalObjectRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, FORBID_ILLEGAL_OBJECT);
        return HttpUtil.post(url, forbidIllegalObjectRequest, ForbidIllegalObjectResult.class, imClient.getConfig());
    }

    public ForbidIllegalObjectResult forbidIllegalObject(ForbidIllegalObjectRequest forbidIllegalObjectRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, FORBID_ILLEGAL_OBJECT, random);
        return HttpUtil.post(url, forbidIllegalObjectRequest, ForbidIllegalObjectResult.class, imClient.getConfig());
    }

    /**
     * 聊天文件解封
     *
     * @param allowBannedObjectRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AllowBannedObjectResult allowBannedObject(AllowBannedObjectRequest allowBannedObjectRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, ALLOW_BANNED_OBJECT);
        return HttpUtil.post(url, allowBannedObjectRequest, AllowBannedObjectResult.class, imClient.getConfig());
    }

    public AllowBannedObjectResult allowBannedObject(AllowBannedObjectRequest allowBannedObjectRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, ALLOW_BANNED_OBJECT, random);
        return HttpUtil.post(url, allowBannedObjectRequest, AllowBannedObjectResult.class, imClient.getConfig());
    }

    /**
     * 聊天文件签名
     *
     * @param getCosSigRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetCosSigResult getCosSig(GetCosSigRequest getCosSigRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, GET_COS_SIG);
        return HttpUtil.post(url, getCosSigRequest, GetCosSigResult.class, imClient.getConfig());
    }

    public GetCosSigResult getCosSig(GetCosSigRequest getCosSigRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_COS_MSG, GET_COS_SIG, random);
        return HttpUtil.post(url, getCosSigRequest, GetCosSigResult.class, imClient.getConfig());
    }
}
