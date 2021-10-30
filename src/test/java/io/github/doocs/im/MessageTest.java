package io.github.doocs.im;

import io.github.doocs.im.constant.SyncOtherMachine;
import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 10:37
 */
public class MessageTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

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
        client = IMClient.getInstance(appId, identifier, key);
    }

    @Test
    public void testSendMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        SendMsgRequest request = new SendMsgRequest("test2", 123, Collections.singletonList(msg));
        request.setFromAccount("test1");
        request.setSyncOtherMachine(SyncOtherMachine.YES);
        request.setMsgTimeStamp(1631934058);
        request.setMsgLifeTime(604800);
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBatchSendMsg() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        TIMTextMsgElement msg = new TIMTextMsgElement("hi bingo");
        BatchSendMsgRequest request = new BatchSendMsgRequest(toAccount, 123, Collections.singletonList(msg));
        request.setSyncOtherMachine(SyncOtherMachine.NO);
        request.setMsgSeq(28460);
        BatchSendMsgResult result = client.message.batchSendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImportMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello bingo");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        ImportMsgRequest request = new ImportMsgRequest(1, "bingo", "test1", 122, 1557387418, msgBody);
        ImportMsgResult result = client.message.importMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminGetRoamMsg() throws IOException {
        AdminGetRoamMsgRequest request = new AdminGetRoamMsgRequest("test1", "test2", 123, 1631934000, 1631934060);
        AdminRoamMsgResult result = client.message.getRoamMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminMsgWithdraw() throws IOException {
        AdminMsgWithdrawRequest request = new AdminMsgWithdrawRequest("test1", "bingo", "31906_833502_1572869830");
        AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminSetMsgRead() throws IOException {
        AdminSetMsgReadRequest request = new AdminSetMsgReadRequest("test1", "test2");
        AdminSetMsgReadResult result = client.message.setMsgRead(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGetC2CUnreadMsgNum() throws IOException {
        GetC2CUnreadMsgRequest request = new GetC2CUnreadMsgRequest("test2");
        request.setPeerAccount(Arrays.asList("test1", "bingo"));
        C2CUnreadMsgNumResult result = client.message.getC2CUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
