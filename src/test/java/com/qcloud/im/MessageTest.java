package com.qcloud.im;

import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 10:37
 */
public class MessageTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = AccountTest.class.getClassLoader().getResourceAsStream("app.properties");
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
        SendMsgRequest request = new SendMsgRequest();
        request.setFromAccount("test1");
        request.setToAccount("test2");
        request.setSyncOtherMachine(1);
        request.setMsgRandom(123);
        request.setMsgTimeStamp(1557387418);
        request.setMsgLifeTime(604800);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hello world");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        SendMsgResult result = client.message.sendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBatchSendMsg() throws IOException {
        BatchSendMsgRequest request = new BatchSendMsgRequest();
        request.setSyncOtherMachine(2);
        request.setToAccount(Arrays.asList("test1", "test2"));
        request.setMsgSeq(28460);
        request.setMsgRandom(1992121);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hi bingo");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        BatchSendMsgResult result = client.message.batchSendMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImportMsg() throws IOException {
        ImportMsgRequest request = new ImportMsgRequest();
        request.setSyncFromOldSystem(1);
        request.setFromAccount("bingo");
        request.setToAccount("test1");
        request.setMsgSeq(123);
        request.setMsgRandom(122);
        request.setMsgTimeStamp(1557387418);
        MsgBodyItem item = new MsgBodyItem();
        item.setMsgType("TIMTextElem");
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hello bingo");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        ImportMsgResult result = client.message.importMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminGetRoamMsg() throws IOException {
        AdminRoamMsgRequest request = new AdminRoamMsgRequest();
        request.setFromAccount("test1");
        request.setToAccount("test2");
        request.setMaxCnt(123);
        request.setMinTime(1584669600);
        request.setMaxTime(1584673200);
        AdminRoamMsgResult result = client.message.getRoamMsg(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminMsgWithdraw() throws IOException {
        AdminMsgWithdrawRequest request = new AdminMsgWithdrawRequest();
        request.setFromAccount("test1");
        request.setMsgKey("31906_833502_1572869830");
        request.setToAccount("bingo");
        AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAdminSetMsgRead() throws IOException {
        AdminSetMsgReadRequest request = new AdminSetMsgReadRequest();
        request.setPeerAccount("test1");
        request.setReportAccount("test2");
        AdminSetMsgReadResult result = client.message.setMsgRead(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGetC2CUnreadMsgNum() throws IOException {
        GetC2CUnreadMsgRequest request = new GetC2CUnreadMsgRequest();
        request.setPeerAccount(Arrays.asList("test1", "bingo"));
        request.setToAccount("test2");
        C2CUnreadMsgNumResult result = client.message.getC2CUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
