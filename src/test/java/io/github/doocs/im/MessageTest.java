package io.github.doocs.im;

import io.github.doocs.im.constant.MsgType;
import io.github.doocs.im.constant.SyncOtherMachine;
import io.github.doocs.im.model.message.TIMCustomMsgElement;
import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author bingo
 * @since 2021/7/31 10:37
 */
public class MessageTest {
    private static final Properties properties = new Properties();
    private static final ImClient client;

    static {
        InputStream resourceAsStream = MessageTest.class.getClassLoader().getResourceAsStream("app.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String key = properties.getProperty("key");
        String identifier = properties.getProperty("identifier");
        Long appId = Long.parseLong(properties.getProperty("appId"));
        client = ImClient.getInstance(appId, identifier, key);
    }

    @Test
    public void testSendMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        SendMsgRequest request = SendMsgRequest.builder()
                .fromAccount("test1")
                .toAccount("test2")
                .msgRandom(123)
                .msgBody(msgBody)
                .syncOtherMachine(SyncOtherMachine.YES)
                .msgTimeStamp(1631934058)
                .msgLifeTime(604800)
                .build();
      
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBatchSendMsg() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        TIMTextMsgElement msg = new TIMTextMsgElement("hi bingo");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        BatchSendMsgRequest request = BatchSendMsgRequest
                .builder()
                .toAccount(toAccount)
                .msgRandom(123)
                .msgBody(msgBody)
                .syncOtherMachine(SyncOtherMachine.NO)
                .msgSeq(28460)
                .build();
        BatchSendMsgResult result = client.message.batchSendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImportMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello bingo");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        ImportMsgRequest request = ImportMsgRequest.builder()
                .fromAccount("bingo")
                .toAccount("test1")
                .msgRandom(122)
                .msgTimeStamp(1557387418)
                .msgBody(msgBody)
                .build();
        ImportMsgResult result = client.message.importMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminGetRoamMsg() throws IOException {
        AdminGetRoamMsgRequest request = AdminGetRoamMsgRequest.builder()
                .fromAccount("test1")
                .toAccount("test2")
                .maxCnt(123)
                .minTime(1631934000)
                .maxTime(1631934060)
                .build();
        AdminRoamMsgResult result = client.message.getRoamMsg(request);
        List<TIMMsgElement> msgBody = result.getMsgList().get(0).getMsgBody();
        System.out.println(msgBody.get(0).getMsgType());

        for (TIMMsgElement ee : msgBody) {
            if (Objects.equals(ee.getMsgType(), MsgType.TIM_CUSTOM_ELEM)) {
                TIMCustomMsgElement t = (TIMCustomMsgElement) ee;
                System.out.println(t.getMsgContent().getData());
            }
        }
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminMsgWithdraw() throws IOException {
        AdminMsgWithdrawRequest request = AdminMsgWithdrawRequest.builder()
                .fromAccount("test1")
                .toAccount("bingo")
                .msgKey("31906_833502_1572869830")
                .build();
        AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminSetMsgRead() throws IOException {
        AdminSetMsgReadRequest request = AdminSetMsgReadRequest.builder()
                .reportAccount("test1")
                .peerAccount("test2")
                .build();
        AdminSetMsgReadResult result = client.message.setMsgRead(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGetC2CUnreadMsgNum() throws IOException {
        GetC2cUnreadMsgRequest request = new GetC2cUnreadMsgRequest("test2");
        request.setPeerAccount(Arrays.asList("test1", "bingo"));
        C2cUnreadMsgNumResult result = client.message.getC2cUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
