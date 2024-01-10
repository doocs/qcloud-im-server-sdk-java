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
    public static final String CREATE_OFFICIAL_ACCOUNT_COMMAND = "create_official_account";
    public static final String DESTROY_OFFICIAL_ACCOUNT_COMMAND = "destroy_official_account";
    public static final String MODIFY_OFFICIAL_ACCOUNT_BASE_INFO_COMMAND = "modify_official_account_base_info";
    public static final String SEND_OFFICIAL_ACCOUNT_MSG_COMMAND = "send_official_account_msg";
    public static final String GET_OFFICIAL_ACCOUNT_INFO_COMMAND = "get_official_account_info";
    public static final String GET_SUBSCRIBER_INFO_COMMAND = "get_subscriber_info";
    public static final String OFFICIAL_ACCOUNT_MSG_RECALL_COMMAND = "official_account_msg_recall";
    public static final String OFFICIAL_ACCOUNT_MSG_GET_SIMPLE_COMMAND = "official_account_msg_get_simple";
    public static final String ADD_SUBSCRIBER_COMMAND = "add_subscriber";
    public static final String DELETE_SUBSCRIBER_COMMAND = "delete_subscriber";
    public static final String MODIFY_SUBSCRIBER_INFO_COMMAND = "modify_subscriber_info";
    public static final String GET_SUBSCRIBED_OFFICIAL_ACCOUNT_LIST_COMMAND = "get_subscribed_official_account_list";


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
        String url = imClient.getUrl(SERVICE_NAME, CREATE_OFFICIAL_ACCOUNT_COMMAND);
        return HttpUtil.post(url, createOfficialAccountRequest, CreateOfficialAccountResult.class, imClient.getConfig());
    }

    public CreateOfficialAccountResult createOfficialAccount(CreateOfficialAccountRequest createOfficialAccountRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CREATE_OFFICIAL_ACCOUNT_COMMAND, random);
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
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_OFFICIAL_ACCOUNT_COMMAND);
        return HttpUtil.post(url, destroyOfficialAccountRequest, DestroyOfficialAccountResult.class, imClient.getConfig());
    }

    public DestroyOfficialAccountResult destroyOfficialAccount(DestroyOfficialAccountRequest destroyOfficialAccountRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DESTROY_OFFICIAL_ACCOUNT_COMMAND, random);
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
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_OFFICIAL_ACCOUNT_BASE_INFO_COMMAND);
        return HttpUtil.post(url, modifyOfficialAccountBaseInfoRequest, ModifyOfficialAccountBaseInfoResult.class, imClient.getConfig());
    }

    public ModifyOfficialAccountBaseInfoResult modifyOfficialAccountBaseInfo(ModifyOfficialAccountBaseInfoRequest modifyOfficialAccountBaseInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_OFFICIAL_ACCOUNT_BASE_INFO_COMMAND, random);
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

    /**
     * 公众号添加订阅者
     *
     * @param addSubscriberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AddSubscriberResult addSubscriber(AddSubscriberRequest addSubscriberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_SUBSCRIBER_COMMAND);
        return HttpUtil.post(url, addSubscriberRequest, AddSubscriberResult.class, imClient.getConfig());
    }

    public AddSubscriberResult addSubscriber(AddSubscriberRequest addSubscriberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADD_SUBSCRIBER_COMMAND, random);
        return HttpUtil.post(url, addSubscriberRequest, AddSubscriberResult.class, imClient.getConfig());
    }

    /**
     * 公众号删除订阅者
     *
     * @param deleteSubscriberRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_SUBSCRIBER_COMMAND);
        return HttpUtil.post(url, deleteSubscriberRequest, DeleteSubscriberResult.class, imClient.getConfig());
    }

    public DeleteSubscriberResult deleteSubscriber(DeleteSubscriberRequest deleteSubscriberRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_SUBSCRIBER_COMMAND, random);
        return HttpUtil.post(url, deleteSubscriberRequest, DeleteSubscriberResult.class, imClient.getConfig());
    }

    /**
     * 修改订阅者信息
     *
     * @param modifySubscriberInfoRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifySubscriberInfoResult modifySubscriberInfo(ModifySubscriberInfoRequest modifySubscriberInfoRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_SUBSCRIBER_INFO_COMMAND);
        return HttpUtil.post(url, modifySubscriberInfoRequest, ModifySubscriberInfoResult.class, imClient.getConfig());
    }

    public ModifySubscriberInfoResult modifySubscriberInfo(ModifySubscriberInfoRequest modifySubscriberInfoRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_SUBSCRIBER_INFO_COMMAND, random);
        return HttpUtil.post(url, modifySubscriberInfoRequest, ModifySubscriberInfoResult.class, imClient.getConfig());
    }

    /**
     * 获取订阅公众号列表
     *
     * @param getSubscribedOfficialAccountListRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetSubscribedOfficialAccountListResult getSubscribedOfficialAccountList(GetSubscribedOfficialAccountListRequest getSubscribedOfficialAccountListRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_SUBSCRIBED_OFFICIAL_ACCOUNT_LIST_COMMAND);
        return HttpUtil.post(url, getSubscribedOfficialAccountListRequest, GetSubscribedOfficialAccountListResult.class, imClient.getConfig());
    }

    public GetSubscribedOfficialAccountListResult getSubscribedOfficialAccountList(GetSubscribedOfficialAccountListRequest getSubscribedOfficialAccountListRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_SUBSCRIBED_OFFICIAL_ACCOUNT_LIST_COMMAND, random);
        return HttpUtil.post(url, getSubscribedOfficialAccountListRequest, GetSubscribedOfficialAccountListResult.class, imClient.getConfig());
    }
}
