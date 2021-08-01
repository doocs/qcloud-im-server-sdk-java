package com.qcloud.im;

import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 21:05
 */
public class GroupTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = GroupTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testGetAppIdGroupList() throws IOException {
        GetAppidGroupListRequest request = new GetAppidGroupListRequest();
        request.setLimit(10);
        request.setGroupType("Public");
        request.setNext(0);
        GetAppidGroupListResult result = client.group.getAppIdGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testCreateGroup() throws IOException {
        CreateGroupRequest request = new CreateGroupRequest();
        request.setOwnerAccount("bingo");
        request.setType("Public");
        request.setGroupId("MyFirstGroup");
        request.setName("TestGroup");
        request.setIntroduction("This is group Introduction");
        request.setNotification("This is group Notification");
        request.setFaceUrl("http://this.is.face.url");
        request.setMaxMemberCount(5000);
        request.setApplyJoinOption("FreeAccess");
        // Map<String, Object> map = new HashMap<>();
        // map.put("Key", "test1");
        // map.put("Value", "test2");
        // request.setAppDefinedData(Collections.singletonList(map));
        CreateGroupResult result = client.group.createGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupInfo() throws IOException {
        GetGroupInfoRequest request = new GetGroupInfoRequest();
        request.setGroupIdList(Collections.singletonList("MyFirstGroup"));
        GetGroupInfoResult result = client.group.getGroupInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testAddGroupMember() throws IOException {
        MemberRequestItem memberItem = new MemberRequestItem("test1");
        AddGroupMemberRequest request = new AddGroupMemberRequest();
        request.setGroupId("MyFirstGroup");
        request.setSilence(1);
        request.setMemberList(Collections.singletonList(memberItem));
        AddGroupMemberResult result = client.group.addGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSetUnreadMsgNum() throws IOException {
        SetUnreadMsgNumRequest request = new SetUnreadMsgNumRequest();
        request.setGroupId("MyFirstGroup");
        request.setMemberAccount("test1");
        request.setUnreadMsgNum(1);
        SetUnreadMsgNumResult result = client.group.setUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDeleteGroupMsgBySender() throws IOException {
        DeleteGroupMsgBySenderRequest request = new DeleteGroupMsgBySenderRequest();
        request.setGroupId("MyFirstGroup");
        request.setSenderAccount("test1");
        DeleteGroupMsgBySenderResult result = client.group.deleteGroupMsgBySender(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgGetSimple() throws IOException {
        GroupMsgGetSimpleRequest request = new GroupMsgGetSimpleRequest();
        request.setGroupId("MyFirstGroup");
        request.setReqMsgNumber(20);
        request.setReqMsgSeq(1);
        GroupMsgGetSimpleResult result = client.group.groupMsgGetSimple(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetOnlineMemberNum() throws IOException {
        GetOnlineMemberNumRequest request = new GetOnlineMemberNumRequest();
        request.setGroupId("MyFirstAVChatRoom");
        GetOnlineMemberNumResult result = client.group.getOnlineMemberNum(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }
}
