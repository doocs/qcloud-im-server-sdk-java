package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 10:28
 */
public class Message {
    private static final String SERVICE_NAME = "openim";

    private static final String SEND_MSG_COMMAND = "sendmsg";
    private static final String IMPORT_MSG_COMMAND = "importmsg";
    private static final String BATCH_SEND_MSG_COMMAND = "batchsendmsg";
    private static final String ADMIN_GET_ROAM_MSG_COMMAND = "admin_getroammsg";
    private static final String ADMIN_MSG_WITHDRAW_COMMAND = "admin_msgwithdraw";
    private static final String ADMIN_SET_MSG_READ_COMMAND = "admin_set_msg_read";
    private static final String GET_C2C_UNREAD_MSG_NUM_COMMAND = "get_c2c_unread_msg_num";

    private final IMClient imClient;

    public Message(IMClient imClient) {
        this.imClient = imClient;
    }

    public SendMsgResult sendMsg(SendMsgRequest sendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, SEND_MSG_COMMAND);
        return HttpUtil.post(url, sendMsgRequest, SendMsgResult.class);
    }

    public BatchSendMsgResult batchSendMsg(BatchSendMsgRequest batchSendMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BATCH_SEND_MSG_COMMAND);
        return HttpUtil.post(url, batchSendMsgRequest, BatchSendMsgResult.class);
    }

    public ImportMsgResult importMsg(ImportMsgRequest importMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IMPORT_MSG_COMMAND);
        return HttpUtil.post(url, importMsgRequest, ImportMsgResult.class);
    }

    public AdminRoamMsgResult getRoamMsg(AdminGetRoamMsgRequest adminGetRoamMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_GET_ROAM_MSG_COMMAND);
        return HttpUtil.post(url, adminGetRoamMsgRequest, AdminRoamMsgResult.class);
    }

    public AdminMsgWithdrawResult msgWithdraw(AdminMsgWithdrawRequest adminMsgWithdrawRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_MSG_WITHDRAW_COMMAND);
        return HttpUtil.post(url, adminMsgWithdrawRequest, AdminMsgWithdrawResult.class);
    }

    public AdminSetMsgReadResult setMsgRead(AdminSetMsgReadRequest adminSetMsgReadRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, ADMIN_SET_MSG_READ_COMMAND);
        return HttpUtil.post(url, adminSetMsgReadRequest, AdminSetMsgReadResult.class);
    }

    public C2cUnreadMsgNumResult getC2cUnreadMsgRequest(GetC2cUnreadMsgRequest getC2cUnreadMsgRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, GET_C2C_UNREAD_MSG_NUM_COMMAND);
        return HttpUtil.post(url, getC2cUnreadMsgRequest, C2cUnreadMsgNumResult.class);
    }
}
