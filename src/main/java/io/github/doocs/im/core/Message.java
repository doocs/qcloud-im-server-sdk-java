package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 单聊消息
 *
 * @author hyh
 * @since 2021/07/29 10:28
 */
public class Message {
    /**
     * 单聊消息服务名
     */
    public static final String SERVICE_NAME = "openim";

    public static final String SERVICE_NAME_MSG_EXT = "openim_msg_ext_http_svc";
    public static final String SERVICE_NAME_GROUP = "group_open_http_svc";

    /**
     * 单聊消息相关命令字
     */
    public static final String SEND_MSG_COMMAND = "sendmsg";
    public static final String IMPORT_MSG_COMMAND = "importmsg";
    public static final String BATCH_SEND_MSG_COMMAND = "batchsendmsg";
    public static final String ADMIN_GET_ROAM_MSG_COMMAND = "admin_getroammsg";
    public static final String ADMIN_MSG_WITHDRAW_COMMAND = "admin_msgwithdraw";
    public static final String ADMIN_SET_MSG_READ_COMMAND = "admin_set_msg_read";
    public static final String GET_C2C_UNREAD_MSG_NUM_COMMAND = "get_c2c_unread_msg_num";
    public static final String MODIFY_C2C_MSG_COMMAND = "modify_c2c_msg";
    public static final String GET_KEY_VALUES_COMMAND = "get_key_values";
    public static final String SET_KEY_VALUES_COMMAND = "set_key_values";
    public static final String DELETE_C2C_MSG_RAMBLE_COMMAND = "delete_c2c_msg_ramble";
    public static final String CLEAR_GROUP_MSG_COMMAND = "clear_group_msg";

    private final ImClient imClient;

    public Message(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 单发单聊消息
     *
     * @param sendMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_MSG_COMMAND);
        return HttpUtil.post(url, sendMsgRequest, SendMsgResult.class, imClient.getConfig());
    }

    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_MSG_COMMAND, random);
        return HttpUtil.post(url, sendMsgRequest, SendMsgResult.class, imClient.getConfig());
    }

    /**
     * 批量发单聊消息
     *
     * @param batchSendMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BATCH_SEND_MSG_COMMAND);
        return HttpUtil.post(url, batchSendMsgRequest, BatchSendMsgResult.class, imClient.getConfig());
    }

    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BATCH_SEND_MSG_COMMAND, random);
        return HttpUtil.post(url, batchSendMsgRequest, BatchSendMsgResult.class, imClient.getConfig());
    }

    /**
     * 导入单聊消息
     *
     * @param importMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND);
        return HttpUtil.post(url, importMsgRequest, ImportMsgResult.class, imClient.getConfig());
    }

    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND, random);
        return HttpUtil.post(url, importMsgRequest, ImportMsgResult.class, imClient.getConfig());
    }

    /**
     * 查询单聊消息
     *
     * @param adminGetRoamMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_GET_ROAM_MSG_COMMAND);
        return HttpUtil.post(url, adminGetRoamMsgRequest, AdminRoamMsgResult.class, imClient.getConfig());
    }

    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_GET_ROAM_MSG_COMMAND, random);
        return HttpUtil.post(url, adminGetRoamMsgRequest, AdminRoamMsgResult.class, imClient.getConfig());
    }

    /**
     * 撤回单聊消息
     *
     * @param adminMsgWithdrawRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_MSG_WITHDRAW_COMMAND);
        return HttpUtil.post(url, adminMsgWithdrawRequest, AdminMsgWithdrawResult.class, imClient.getConfig());
    }

    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_MSG_WITHDRAW_COMMAND, random);
        return HttpUtil.post(url, adminMsgWithdrawRequest, AdminMsgWithdrawResult.class, imClient.getConfig());
    }

    /**
     * 设置单聊消息已读
     *
     * @param adminSetMsgReadRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_SET_MSG_READ_COMMAND);
        return HttpUtil.post(url, adminSetMsgReadRequest, AdminSetMsgReadResult.class, imClient.getConfig());
    }

    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_SET_MSG_READ_COMMAND, random);
        return HttpUtil.post(url, adminSetMsgReadRequest, AdminSetMsgReadResult.class, imClient.getConfig());
    }

    /**
     * 查询单聊未读消息计数
     *
     * @param getC2cUnreadMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_C2C_UNREAD_MSG_NUM_COMMAND);
        return HttpUtil.post(url, getC2cUnreadMsgRequest, C2cUnreadMsgNumResult.class, imClient.getConfig());
    }

    public C2cUnreadMsgNumResult getC2cUnreadMsgNum(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_C2C_UNREAD_MSG_NUM_COMMAND, random);
        return HttpUtil.post(url, getC2cUnreadMsgRequest, C2cUnreadMsgNumResult.class, imClient.getConfig());
    }

    /**
     * 修改单聊历史消息
     *
     * @param modifyC2cMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_C2C_MSG_COMMAND);
        return HttpUtil.post(url, modifyC2cMsgRequest, ModifyC2cMsgResult.class, imClient.getConfig());
    }

    public ModifyC2cMsgResult modifyC2cMsg(ModifyC2cMsgRequest modifyC2cMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, MODIFY_C2C_MSG_COMMAND, random);
        return HttpUtil.post(url, modifyC2cMsgRequest, ModifyC2cMsgResult.class, imClient.getConfig());
    }

    /**
     * 拉取单聊消息扩展
     *
     * @param getKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MSG_EXT, GET_KEY_VALUES_COMMAND);
        return HttpUtil.post(url, getKeyValuesRequest, GetKeyValuesResult.class, imClient.getConfig());
    }

    public GetKeyValuesResult getKeyValues(GetKeyValuesRequest getKeyValuesRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MSG_EXT, GET_KEY_VALUES_COMMAND, random);
        return HttpUtil.post(url, getKeyValuesRequest, GetKeyValuesResult.class, imClient.getConfig());
    }

    /**
     * 设置单聊消息扩展
     *
     * @param setKeyValuesRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MSG_EXT, SET_KEY_VALUES_COMMAND);
        return HttpUtil.post(url, setKeyValuesRequest, SetKeyValuesResult.class, imClient.getConfig());
    }

    public SetKeyValuesResult setKeyValues(SetKeyValuesRequest setKeyValuesRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MSG_EXT, SET_KEY_VALUES_COMMAND, random);
        return HttpUtil.post(url, setKeyValuesRequest, SetKeyValuesResult.class, imClient.getConfig());
    }

    /**
     * 单向删除单聊历史消息
     *
     * @param deleteC2cMsgRambleRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteC2cMsgRambleResult deleteC2cMsgRamble(DeleteC2cMsgRambleRequest deleteC2cMsgRambleRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_C2C_MSG_RAMBLE_COMMAND);
        return HttpUtil.post(url, deleteC2cMsgRambleRequest, DeleteC2cMsgRambleResult.class, imClient.getConfig());
    }

    public DeleteC2cMsgRambleResult deleteC2cMsgRamble(DeleteC2cMsgRambleRequest deleteC2cMsgRambleRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, DELETE_C2C_MSG_RAMBLE_COMMAND, random);
        return HttpUtil.post(url, deleteC2cMsgRambleRequest, DeleteC2cMsgRambleResult.class, imClient.getConfig());
    }

    /**
     * 清空群聊历史消息
     *
     * @param clearGroupMsgRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ClearGroupMsgResult clearGroupMsg(ClearGroupMsgRequest clearGroupMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP, CLEAR_GROUP_MSG_COMMAND);
        return HttpUtil.post(url, clearGroupMsgRequest, ClearGroupMsgResult.class, imClient.getConfig());
    }

    public ClearGroupMsgResult clearGroupMsg(ClearGroupMsgRequest clearGroupMsgRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_GROUP, CLEAR_GROUP_MSG_COMMAND, random);
        return HttpUtil.post(url, clearGroupMsgRequest, ClearGroupMsgResult.class, imClient.getConfig());
    }
}
