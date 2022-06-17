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
 * 关系链管理测试类 {@link io.github.doocs.im.core.Sns}
 *
 * @author hyh
 * @since 2021/07/31 16:14
 */
public class SnsTest {
    private static final Properties properties = new Properties();
    private static final ImClient client;

    static {
        InputStream resourceAsStream = SnsTest.class.getClassLoader().getResourceAsStream("app.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String key = properties.getProperty("key");
        String userId = properties.getProperty("userId");
        Long appId = Long.parseLong(properties.getProperty("appId"));
        client = ImClient.getInstance(appId, userId, key);
    }

    @Test
    public void testFriendAdd() throws IOException {
        AddFriendItem addFriendItem = AddFriendItem.builder()
                .toAccount("test2")
                .addSource("AddSource_Type_XXXXXXXX")
                .remark("Mr.A")
                .groupName("schoolmate")
                .addWording("Hi")
                .build();
        List<AddFriendItem> addFriendItemList = Collections.singletonList(addFriendItem);
        FriendAddRequest request = FriendAddRequest.builder()
                .fromAccount("test1")
                .addFriendItemList(addFriendItemList)
                .addType(AddType.BOTH)
                .forceAddFlags(ForceAddFlags.FORCE)
                .build();

        FriendAddResult result = client.sns.friendAdd(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendImport() throws IOException {
        ImportFriendItem importFriendItem = ImportFriendItem.builder()
                .toAccount("test2")
                .addSource("AddSource_Type_XXXXXXXX")
                .build();
        List<ImportFriendItem> importFriendItems = Collections.singletonList(importFriendItem);
        FriendImportRequest request = FriendImportRequest.builder()
                .fromAccount("test1")
                .importFriendItemList(importFriendItems)
                .build();

        FriendImportResult result = client.sns.friendImport(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendUpdate() throws IOException {
        SnsItem snsItem = SnsItem.builder()
                .tag("Tag_SNS_Custom_testTag")
                .value(TagSns.IM_ADD_WORDING)
                .build();
        List<SnsItem> snsItems = Collections.singletonList(snsItem);
        UpdateItem updateItem = UpdateItem.builder()
                .toAccount("test2")
                .snsItemList(snsItems)
                .build();
        List<UpdateItem> updateItems = Collections.singletonList(updateItem);
        FriendUpdateRequest request = FriendUpdateRequest.builder()
                .fromAccount("test1")
                .updateItemList(updateItems)
                .build();

        FriendUpdateResult result = client.sns.friendUpdate(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendDelete() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        FriendDeleteRequest request = FriendDeleteRequest.builder()
                .deleteType(DeleteType.BOTH)
                .fromAccount("test1")
                .toAccount(toAccount)
                .build();

        FriendDeleteResult result = client.sns.friendDelete(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendDeleteAll() throws IOException {
        FriendDeleteAllRequest request = FriendDeleteAllRequest.builder()
                .deleteType(DeleteType.BOTH)
                .fromAccount("test1")
                .build();

        FriendDeleteAllResult result = client.sns.friendDeleteAll(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendCheck() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        FriendCheckRequest request = FriendCheckRequest.builder()
                .fromAccount("test1")
                .toAccount(toAccount)
                .checkType(CheckResultType.BOTH)
                .build();

        FriendCheckResult result = client.sns.friendCheck(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendGet() throws IOException {
        FriendGetRequest request = FriendGetRequest.builder()
                .fromAccount("test1")
                .startIndex(0)
                .standardSequence(0)
                .customSequence(0)
                .build();

        FriendGetResult result = client.sns.friendGet(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testFriendGetList() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        List<String> tagList = Arrays.asList(TagProfile.IM_ADMIN_FORBID_TYPE, TagProfile.IM_ALLOW_TYPE);
        FriendGetListRequest request = FriendGetListRequest.builder()
                .fromAccount("test1")
                .toAccount(toAccount)
                .tagList(tagList)
                .build();

        FriendGetListResult result = client.sns.friendGetList(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testBlackListAdd() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        BlackListAddRequest request = BlackListAddRequest.builder()
                .fromAccount("test1")
                .toAccount(toAccount)
                .build();

        BlackListAddResult result = client.sns.blackListAdd(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testBlackListDelete() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        BlackListDeleteRequest request = BlackListDeleteRequest.builder()
                .fromAccount("test1")
                .toAccount(toAccount)
                .build();

        BlackListDeleteResult result = client.sns.blackListDelete(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testBlackListGet() throws IOException {
        BlackListGetRequest request = BlackListGetRequest.builder()
                .fromAccount("test1")
                .startIndex(0)
                .maxLimited(10)
                .lastSequence(0)
                .build();

        BlackListGetResult result = client.sns.blackListGet(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testBlackListCheck() throws IOException {
        List<String> toAccount = Collections.singletonList("test2");
        BlackListCheckRequest request = BlackListCheckRequest.builder()
                .fromAccount("test1")
                .toAccount(toAccount)
                .checkType(BlackCheckResultType.BOTH)
                .build();

        BlackListCheckResult result = client.sns.blackListCheck(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testGroupAdd() throws IOException {
        List<String> groupName = Collections.singletonList("classmate");
        List<String> toAccount = Collections.singletonList("test2");
        GroupAddRequest request = GroupAddRequest.builder()
                .fromAccount("test1")
                .groupName(groupName)
                .toAccount(toAccount)
                .build();

        GroupAddResult result = client.sns.groupAdd(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testGroupDelete() throws IOException {
        List<String> groupName = Collections.singletonList("classmate");
        GroupDeleteRequest request = GroupDeleteRequest.builder()
                .fromAccount("test1")
                .groupName(groupName)
                .build();

        GroupDeleteResult result = client.sns.groupDelete(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testGroupGet() throws IOException {
        List<String> groupName = Collections.singletonList("classmate");
        GroupGetRequest request = GroupGetRequest.builder()
                .fromAccount("test1")
                .groupName(groupName)
                .needFriend(NeedFriendType.YES)
                .build();

        GroupGetResult result = client.sns.groupGet(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
