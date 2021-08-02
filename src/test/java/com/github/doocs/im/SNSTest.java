package com.github.doocs.im;

import com.github.doocs.im.model.request.*;
import com.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

/**
 * @author hyh
 * @since 2021/07/31 16:14
 */
public class SNSTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = SNSTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testFriendAdd() throws IOException {
        AddFriendItem addFriendItem = new AddFriendItem();
        addFriendItem.setToAccount("test2");
        addFriendItem.setRemark("Mr.A");
        addFriendItem.setGroupName("schoolmate");
        addFriendItem.setAddSource("AddSource_Type_XXXXXXXX");
        addFriendItem.setAddWording("Hi");

        FriendAddRequest request = new FriendAddRequest();
        request.setFromAccount("test1");
        request.setAddFriendItemList(Collections.singletonList(addFriendItem));
        request.setAddType("Add_Type_Both");
        request.setForceAddFlags(1);
        FriendAddResult result = client.sns.friendAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendImport() throws IOException {
        ImportFriendItem importFriendItem = new ImportFriendItem();
        importFriendItem.setToAccount("test2");
        importFriendItem.setAddSource("AddSource_Type_XXXXXXXX");

        FriendImportRequest request = new FriendImportRequest();
        request.setFromAccount("test1");
        request.setImportFriendItemList(Collections.singletonList(importFriendItem));
        FriendImportResult result = client.sns.friendImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendUpdate() throws IOException {
        SnsItem snsItem = new SnsItem();
        snsItem.setTag("Tag_SNS_Custom_testTag");
        snsItem.setValue("Tag_SNS_IM_AddWording");

        UpdateItem updateItem = new UpdateItem();
        updateItem.setToAccount("test2");
        updateItem.setSnsItemList(Collections.singletonList(snsItem));

        FriendUpdateRequest request = new FriendUpdateRequest();
        request.setFromAccount("test1");
        request.setUpdateItemList(Collections.singletonList(updateItem));
        FriendUpdateResult result = client.sns.friendUpdate(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendDelete() throws IOException {
        FriendDeleteRequest request = new FriendDeleteRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        request.setDeleteType("Delete_Type_Both");
        FriendDeleteResult result = client.sns.friendDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendDeleteAll() throws IOException {
        FriendDeleteAllRequest request = new FriendDeleteAllRequest();
        request.setFromAccount("test1");
        request.setDeleteType("Delete_Type_Both");
        FriendDeleteAllResult result = client.sns.friendDeleteAll(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendCheck() throws IOException {
        FriendCheckRequest request = new FriendCheckRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        request.setCheckType("CheckResult_Type_Both");
        FriendCheckResult result = client.sns.friendCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendGet() throws IOException {
        FriendGetRequest request = new FriendGetRequest();
        request.setFromAccount("test1");
        request.setStartIndex(0);
        request.setStandardSequence(0);
        request.setCustomSequence(0);
        FriendGetResult result = client.sns.friendGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendGetList() throws IOException {
        FriendGetListRequest request = new FriendGetListRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        request.setTagList(Collections.singletonList("Tag_SNS_Custom_testTag"));
        FriendGetListResult result = client.sns.friendGetList(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListAdd() throws IOException {
        BlackListAddRequest request = new BlackListAddRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        BlackListAddResult result = client.sns.blackListAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListDelete() throws IOException {
        BlackListDeleteRequest request = new BlackListDeleteRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        BlackListDeleteResult result = client.sns.blackListDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListGet() throws IOException {
        BlackListGetRequest request = new BlackListGetRequest();
        request.setFromAccount("test1");
        request.setStartIndex(0);
        request.setMaxLimited(10);
        request.setLastSequence(0);
        BlackListGetResult result = client.sns.blackListGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListCheck() throws IOException {
        BlackListCheckRequest request = new BlackListCheckRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        request.setCheckType("BlackCheckResult_Type_Both");
        BlackListCheckResult result = client.sns.blackListCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupAdd() throws IOException {
        GroupAddRequest request = new GroupAddRequest();
        request.setFromAccount("test1");
        request.setToAccount(Collections.singletonList("test2"));
        request.setGroupName(Collections.singletonList("classmate"));
        GroupAddResult result = client.sns.groupAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupDelete() throws IOException {
        GroupDeleteRequest request = new GroupDeleteRequest();
        request.setFromAccount("test1");
        request.setGroupName(Collections.singletonList("classmate"));
        GroupDeleteResult result = client.sns.groupDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupGet() throws IOException {
        GroupGetRequest request = new GroupGetRequest();
        request.setFromAccount("test1");
        request.setGroupName(Collections.singletonList("schoolmate"));
        request.setNeedFriend("Need_Friend_Type_Yes");
        request.setLastSequence(0);
        GroupGetResult result = client.sns.groupGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }


}
