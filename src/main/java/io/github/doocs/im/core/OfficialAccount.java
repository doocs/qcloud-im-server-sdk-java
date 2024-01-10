package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 公众号
 *
 * @author hyh
 * @since 2024/01/09 21:50
 */
public class OfficialAccount {
    /**
     * 公众号服务名
     */
    public static final String SERVICE_NAME = "official_account_open_http_svc";

    /**
     * 公众号相关命令字
     */
    public static final String CREATE_OFFICIAL_ACCOUNT = "create_official_account";
    public static final String DESTROY_OFFICIAL_ACCOUNT = "destroy_official_account";
    public static final String MODIFY_OFFICIAL_ACCOUNT_BASE_INFO = "modify_official_account_base_info";
    public static final String SEND_OFFICIAL_ACCOUNT_MSG_COMMAND = "send_official_account_msg";
    public static final String GET_OFFICIAL_ACCOUNT_INFO_COMMAND = "get_official_account_info";
    public static final String GET_SUBSCRIBER_INFO_COMMAND = "get_subscriber_info";
    public static final String OFFICIAL_ACCOUNT_MSG_RECALL_COMMAND = "official_account_msg_recall";
    public static final String OFFICIAL_ACCOUNT_MSG_GET_SIMPLE_COMMAND = "official_account_msg_get_simple";

    private final ImClient imClient;

    public OfficialAccount(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 创建公众号
     *
     * @param createOfficialAccountRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public CreateOfficialAccountResult createOfficialAccount(CreateOfficialAccountRequest createOfficialAccountRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_OFFICIAL_ACCOUNT);
        return HttpUtil.post(url, createOfficialAccountRequest, CreateOfficialAccountResult.class, imClient.getConfig());
    }

    public CreateOfficialAccountResult createOfficialAccount(CreateOfficialAccountRequest createOfficialAccountRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_OFFICIAL_ACCOUNT, random);
        return HttpUtil.post(url, createOfficialAccountRequest, CreateOfficialAccountResult.class, imClient.getConfig());
    }

    /**
     * 销毁公众号
     *
     * @param destroyOfficialAccountRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DestroyOfficialAccountResult destroyOfficialAccount(DestroyOfficialAccountRequest destroyOfficialAccountRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_OFFICIAL_ACCOUNT);
        return HttpUtil.post(url, destroyOfficialAccountRequest, DestroyOfficialAccountResult.class, imClient.getConfig());
    }

    public DestroyOfficialAccountResult destroyOfficialAccount(DestroyOfficialAccountRequest destroyOfficialAccountRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_OFFICIAL_ACCOUNT, random);
        return HttpUtil.post(url, destroyOfficialAccountRequest, DestroyOfficialAccountResult.class, imClient.getConfig());
    }

    /**
     * 修改公众号资料
     *
     * @param modifyOfficialAccountBaseInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyOfficialAccountBaseInfoResult modifyOfficialAccountBaseInfo(ModifyOfficialAccountBaseInfoRequest modifyOfficialAccountBaseInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_OFFICIAL_ACCOUNT_BASE_INFO);
        return HttpUtil.post(url, modifyOfficialAccountBaseInfoRequest, ModifyOfficialAccountBaseInfoResult.class, imClient.getConfig());
    }

    public ModifyOfficialAccountBaseInfoResult modifyOfficialAccountBaseInfo(ModifyOfficialAccountBaseInfoRequest modifyOfficialAccountBaseInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_OFFICIAL_ACCOUNT_BASE_INFO, random);
        return HttpUtil.post(url, modifyOfficialAccountBaseInfoRequest, ModifyOfficialAccountBaseInfoResult.class, imClient.getConfig());
    }

    /**
     * 公众号用户发送广播消息
     *
     * @param sendOfficialAccountMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendOfficialAccountMsgResult sendOfficialAccountMsg(SendOfficialAccountMsgRequest sendOfficialAccountMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_OFFICIAL_ACCOUNT_MSG_COMMAND);
        return HttpUtil.post(url, sendOfficialAccountMsgRequest, SendOfficialAccountMsgResult.class, imClient.getConfig());
    }

    public SendOfficialAccountMsgResult sendOfficialAccountMsg(SendOfficialAccountMsgRequest sendOfficialAccountMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_OFFICIAL_ACCOUNT_MSG_COMMAND, random);
        return HttpUtil.post(url, sendOfficialAccountMsgRequest, SendOfficialAccountMsgResult.class, imClient.getConfig());
    }

    /**
     * 获取公众号详细资料
     *
     * @param getOfficialAccountInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetOfficialAccountInfoResult getOfficialAccountInfo(GetOfficialAccountInfoRequest getOfficialAccountInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_OFFICIAL_ACCOUNT_INFO_COMMAND);
        return HttpUtil.post(url, getOfficialAccountInfoRequest, GetOfficialAccountInfoResult.class, imClient.getConfig());
    }

    public GetOfficialAccountInfoResult getOfficialAccountInfo(GetOfficialAccountInfoRequest getOfficialAccountInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_OFFICIAL_ACCOUNT_INFO_COMMAND, random);
        return HttpUtil.post(url, getOfficialAccountInfoRequest, GetOfficialAccountInfoResult.class, imClient.getConfig());
    }

    /**
     * 获取公众号订阅者列表
     *
     * @param getSubscriberInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetSubscriberInfoResult getSubscriberInfo(GetSubscriberInfoRequest getSubscriberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_SUBSCRIBER_INFO_COMMAND);
        return HttpUtil.post(url, getSubscriberInfoRequest, GetSubscriberInfoResult.class, imClient.getConfig());
    }

    public GetSubscriberInfoResult getSubscriberInfo(GetSubscriberInfoRequest getSubscriberInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_SUBSCRIBER_INFO_COMMAND, random);
        return HttpUtil.post(url, getSubscriberInfoRequest, GetSubscriberInfoResult.class, imClient.getConfig());
    }

    /**
     * 撤回公众号消息
     *
     * @param officialAccountMsgRecallRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public OfficialAccountMsgRecallResult msgRecall(OfficialAccountMsgRecallRequest officialAccountMsgRecallRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, OFFICIAL_ACCOUNT_MSG_RECALL_COMMAND);
        return HttpUtil.post(url, officialAccountMsgRecallRequest, OfficialAccountMsgRecallResult.class, imClient.getConfig());
    }

    public OfficialAccountMsgRecallResult msgRecall(OfficialAccountMsgRecallRequest officialAccountMsgRecallRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, OFFICIAL_ACCOUNT_MSG_RECALL_COMMAND, random);
        return HttpUtil.post(url, officialAccountMsgRecallRequest, OfficialAccountMsgRecallResult.class, imClient.getConfig());
    }

    /**
     * 拉取公众号用户历史消息
     *
     * @param officialAccountMsgGetSimpleRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public OfficialAccountMsgGetSimpleResult msgGetSimple(OfficialAccountMsgGetSimpleRequest officialAccountMsgGetSimpleRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, OFFICIAL_ACCOUNT_MSG_GET_SIMPLE_COMMAND);
        return HttpUtil.post(url, officialAccountMsgGetSimpleRequest, OfficialAccountMsgGetSimpleResult.class, imClient.getConfig());
    }

    public OfficialAccountMsgGetSimpleResult msgGetSimple(OfficialAccountMsgGetSimpleRequest officialAccountMsgGetSimpleRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, OFFICIAL_ACCOUNT_MSG_GET_SIMPLE_COMMAND, random);
        return HttpUtil.post(url, officialAccountMsgGetSimpleRequest, OfficialAccountMsgGetSimpleResult.class, imClient.getConfig());
    }
}
