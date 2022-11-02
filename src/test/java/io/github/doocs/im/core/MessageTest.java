package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.MsgType;
import io.github.doocs.im.constant.SyncOtherMachine;
import io.github.doocs.im.model.message.TIMCustomMsgElement;
import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 单聊消息测试类 {@link io.github.doocs.im.core.Message}
 *
 * @author bingo
 * @since 2021/7/31 10:37
 */
class MessageTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testSendMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        SendMsgRequest request = SendMsgRequest.builder()
                .fromAccount("test1")
                .toAccount("test2")
                .msgRandom(123L)
                .msgBody(msgBody)
                .syncOtherMachine(SyncOtherMachine.YES)
                .msgTimeStamp(1631934058)
                .msgLifeTime(604800)
                .build();

        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testBatchSendMsg() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        TIMTextMsgElement msg = new TIMTextMsgElement("hi bingo");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        BatchSendMsgRequest request = BatchSendMsgRequest
                .builder()
                .toAccount(toAccount)
                .msgRandom(123L)
                .msgBody(msgBody)
                .syncOtherMachine(SyncOtherMachine.NO)
                .msgSeq(28460L)
                .build();
        BatchSendMsgResult result = client.message.batchSendMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testImportMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello bingo");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        ImportMsgRequest request = ImportMsgRequest.builder()
                .fromAccount("bingo")
                .toAccount("test1")
                .msgRandom(122L)
                .msgTimeStamp(1557387418)
                .msgBody(msgBody)
                .build();
        ImportMsgResult result = client.message.importMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testAdminGetRoamMsg() throws IOException {
        AdminGetRoamMsgRequest request = AdminGetRoamMsgRequest.builder()
                .fromAccount("test1")
                .toAccount("test2")
                .maxCnt(123)
                .minTime(1631934000)
                .maxTime(1631934060)
                .build();
        AdminRoamMsgResult result = client.message.getRoamMsg(request);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());

        List<MsgListItem> msgList = result.getMsgList();
        if (msgList != null && msgList.size() > 0) {
            for (MsgListItem item : msgList) {
                List<TIMMsgElement> msgBody = item.getMsgBody();
                if (msgBody != null && msgList.size() > 0) {
                    for (TIMMsgElement msgElement : msgBody) {
                        // 根据 msgType 强转为对应的子类
                        if (Objects.equals(msgElement.getMsgType(), MsgType.TIM_CUSTOM_ELEM)) {
                            TIMCustomMsgElement t = (TIMCustomMsgElement) msgElement;
                            System.out.println(t.getMsgContent().getDesc());
                        } else if (Objects.equals(msgElement.getMsgType(), MsgType.TIM_TEXT_ELEM)) {
                            TIMTextMsgElement t = (TIMTextMsgElement) msgElement;
                            System.out.println(t.getMsgContent().getText());
                        }
                    }
                }
            }
        }
    }

    @Test
    void testAdminMsgWithdraw() throws IOException {
        AdminMsgWithdrawRequest request = AdminMsgWithdrawRequest.builder()
                .fromAccount("test1")
                .toAccount("bingo")
                .msgKey("31906_833502_1572869830")
                .build();
        AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testAdminSetMsgRead() throws IOException {
        AdminSetMsgReadRequest request = AdminSetMsgReadRequest.builder()
                .reportAccount("test1")
                .peerAccount("test2")
                .build();
        AdminSetMsgReadResult result = client.message.setMsgRead(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetC2cUnreadMsgNum() throws IOException {
        GetC2cUnreadMsgRequest request = new GetC2cUnreadMsgRequest("test2");
        List<String> peerAccount = Arrays.asList("test1", "bingo");
        request.setPeerAccount(peerAccount);
        C2cUnreadMsgNumResult result = client.message.getC2cUnreadMsgNum(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testModifyC2cMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("test modify c2c msg");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        ModifyC2cMsgRequest request = ModifyC2cMsgRequest.builder()
                .fromAccount("test1")
                .toAccount("test2")
                .msgKey("1353691732_123_1653995506")
                .msgBody(msgBody)
                .build();
        ModifyC2cMsgResult result = client.message.modifyC2cMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetKeyValues() throws IOException {
        GetKeyValuesRequest request = GetKeyValuesRequest.builder()
                .fromAccount("test1")
                .toAccount("bingo")
                .msgKey("1353691732_123_1653995506")
                .startSeq(1L)
                .build();
        GetKeyValuesResult result = client.message.getKeyValues(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testSetKeyValues() throws IOException {
        SetKeyValuesRequest request = SetKeyValuesRequest.builder()
                .fromAccount("test1")
                .toAccount("bingo")
                .msgKey("1353691732_123_1653995506")
                .build();
        SetKeyValuesResult result = client.message.setKeyValues(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
