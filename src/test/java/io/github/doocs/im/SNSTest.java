package io.github.doocs.im;

import io.github.doocs.im.constant.*;
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
        AddFriendItem addFriendItem = new AddFriendItem("test2", "AddSource_Type_XXXXXXXX");
        addFriendItem.setRemark("Mr.A");
        addFriendItem.setGroupName("schoolmate");
        addFriendItem.setAddWording("Hi");
        FriendAddRequest request = new FriendAddRequest("test1", Collections.singletonList(addFriendItem));
        request.setAddType(AddType.BOTH);
        request.setForceAddFlags(ForceAddFlags.FORCE);
        FriendAddResult result = client.sns.friendAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendImport() throws IOException {
        ImportFriendItem importFriendItem = new ImportFriendItem("test2");
        FriendImportRequest request = new FriendImportRequest("test1", Collections.singletonList(importFriendItem));
        FriendImportResult result = client.sns.friendImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendUpdate() throws IOException {
        SnsItem snsItem = new SnsItem("Tag_SNS_Custom_testTag", "Tag_SNS_IM_AddWording");
        UpdateItem updateItem = new UpdateItem("test2", Collections.singletonList(snsItem));
        updateItem.setToAccount("test2");
        updateItem.setSnsItemList(Collections.singletonList(snsItem));
        FriendUpdateRequest request = new FriendUpdateRequest("test1", Collections.singletonList(updateItem));
        FriendUpdateResult result = client.sns.friendUpdate(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendDelete() throws IOException {
        FriendDeleteRequest request = new FriendDeleteRequest("test1", Collections.singletonList("test2"));
        request.setDeleteType(DeleteType.BOTH);
        FriendDeleteResult result = client.sns.friendDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendDeleteAll() throws IOException {
        FriendDeleteAllRequest request = new FriendDeleteAllRequest("test1");
        request.setDeleteType(DeleteType.BOTH);
        FriendDeleteAllResult result = client.sns.friendDeleteAll(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendCheck() throws IOException {
        FriendCheckRequest request = new FriendCheckRequest("test1", Collections.singletonList("test2"), CheckResultType.BOTH);
        FriendCheckResult result = client.sns.friendCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendGet() throws IOException {
        FriendGetRequest request = new FriendGetRequest("test1", 0, 0, 0);
        FriendGetResult result = client.sns.friendGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testFriendGetList() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        List<String> tagList = Arrays.asList(TagProfile.IM_ADMIN_FORBID_TYPE, TagProfile.IM_ALLOW_TYPE);
        FriendGetListRequest request = new FriendGetListRequest("test1", toAccount, tagList);
        FriendGetListResult result = client.sns.friendGetList(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListAdd() throws IOException {
        BlackListAddRequest request = new BlackListAddRequest("test1", Collections.singletonList("test2"));
        BlackListAddResult result = client.sns.blackListAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListDelete() throws IOException {
        BlackListDeleteRequest request = new BlackListDeleteRequest("test1", Collections.singletonList("test2"));
        BlackListDeleteResult result = client.sns.blackListDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListGet() throws IOException {
        BlackListGetRequest request = new BlackListGetRequest("test1", 0, 10, 0);
        BlackListGetResult result = client.sns.blackListGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testBlackListCheck() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        BlackListCheckRequest request = new BlackListCheckRequest("test1", toAccount, BlackCheckResultType.BOTH);
        BlackListCheckResult result = client.sns.blackListCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupAdd() throws IOException {
        List<String> groupName = Collections.singletonList("classmate");
        List<String> toAccount = Collections.singletonList("test2");
        GroupAddRequest request = new GroupAddRequest("test1", groupName, toAccount);
        GroupAddResult result = client.sns.groupAdd(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupDelete() throws IOException {
        List<String> groupName = Collections.singletonList("classmate");
        GroupDeleteRequest request = new GroupDeleteRequest("test1", groupName);
        GroupDeleteResult result = client.sns.groupDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testGroupGet() throws IOException {
        GroupGetRequest request = new GroupGetRequest("test1", 0);
        request.setGroupName(Collections.singletonList("schoolmate"));
        request.setNeedFriend(NeedFriendType.YES);
        GroupGetResult result = client.sns.groupGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
