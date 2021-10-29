package io.github.doocs.im;

import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
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
    public void testGetGroupMemberInfo() throws IOException {
        GetGroupMemberInfoRequest request = new GetGroupMemberInfoRequest();
        request.setGroupId("MyFirstGroup");
        request.setLimit(100);
        request.setOffset(0);
        GetGroupMemberInfoResult result = client.group.getGroupMemberInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupBaseInfo() throws IOException {
        ModifyGroupBaseInfoRequest request = new ModifyGroupBaseInfoRequest();
        request.setGroupId("MyFirstGroup");
        request.setName("groupName");
        request.setIntroduction("my first group");
        request.setNotification("hello group member");
        request.setFaceUrl("http://this.is.face.url");
        request.setMaxMemberNum(500);
        request.setApplyJoinOption("NeedPermission");
        request.setShutUpAllMember("Off");
        ModifyGroupBaseInfoResult result = client.group.modifyGroupBaseInfo(request);
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
    public void testDeleteGroupMember() throws IOException {
        DeleteGroupMemberRequest request = new DeleteGroupMemberRequest();
        request.setGroupId("MyFirstGroup");
        request.setMemberToDelAccount(Collections.singletonList("test1"));
        DeleteGroupMemberResult result = client.group.deleteGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupMemberInfo() throws IOException {
        ModifyGroupMemberInfoRequest request = new ModifyGroupMemberInfoRequest();
        request.setGroupId("MyFirstGroup");
        request.setNameCard("hello world");
        request.setMemberAccount("test1");
        ModifyGroupMemberInfoResult result = client.group.modifyGroupMemberInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDestroyGroup() throws IOException {
        DestroyGroupRequest request = new DestroyGroupRequest();
        request.setGroupId("MyFirstGroup");
        DestroyGroupResult result = client.group.destroyGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetJoinGroupList() throws IOException {
        GetJoinedGroupListRequest request = new GetJoinedGroupListRequest();
        request.setMemberAccount("bingo");
        GetJoinGroupListResult result = client.group.getJoinGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetRoleInGroup() throws IOException {
        GetRoleInGroupRequest request = new GetRoleInGroupRequest();
        request.setGroupId("MyFirstGroup");
        request.setUserAccount(Collections.singletonList("bingo"));
        GetRoleInGroupResult result = client.group.getRoleInGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testForbidSendMsg() throws IOException {
        ForbidSendMsgRequest request = new ForbidSendMsgRequest();
        request.setGroupId("MyFirstGroup");
        request.setMembersAccount(Collections.singletonList("bingo"));
        request.setShutUpTime(200);
        ForbidSendMsgResult result = client.group.forbidSendMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupShuttedUin() throws IOException {
        GetGroupShuttedUinRequest request = new GetGroupShuttedUinRequest();
        request.setGroupId("MyFirstGroup");
        GetGroupShuttedUinResult result = client.group.getGroupShuttedUin(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSendGroupMsg() throws IOException {
        SendGroupMsgRequest request = new SendGroupMsgRequest();
        request.setRandom(1212);
        request.setGroupId("MyFirstGroup");

        TIMTextMsgElement msg = new TIMTextMsgElement("red packet");
        request.setMsgBody(Collections.singletonList(msg));
        SendGroupMsgResult result = client.group.sendGroupMsg(request);


        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSendGroupSystemNotification() throws IOException {
        SendGroupSystemNotificationRequest request = new SendGroupSystemNotificationRequest();
        request.setGroupId("MyFirstGroup");
        request.setContent("hello world");
        request.setToMembersAccount(Collections.singletonList("bingo"));
        SendGroupSystemNotificationResult result = client.group.sendGroupSystemNotification(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testChangeGroupOwner() throws IOException {
        ChangeGroupOwnerRequest request = new ChangeGroupOwnerRequest();
        request.setGroupId("MyFirstGroup");
        request.setNewOwnerAccount("test1");
        ChangeGroupOwnerResult result = client.group.changeGroupOwner(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgRecall() throws IOException {
        GroupMsgRecallRequest request = new GroupMsgRecallRequest();
        request.setGroupId("MyFirstGroup");
        MsgSeqItem item = new MsgSeqItem();
        item.setMsgSeq(123323);
        request.setMsgSeqList(Collections.singletonList(item));
        GroupMsgRecallResult result = client.group.groupMsgRecall(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroup() throws IOException {
        ImportGroupRequest request = new ImportGroupRequest();
        request.setOwnerAccount("bingo");
        request.setType("Public");
        request.setGroupId("newGroup");
        request.setName("群名");
        ImportGroupResult result = client.group.importGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMsg() throws IOException {
        ImportGroupMsgRequest request = new ImportGroupMsgRequest();
        request.setGroupId("newGroup");
        ImportGroupMsgListItem item = new ImportGroupMsgListItem();
        item.setFromAccount("bingo");
        item.setSendTime(1628062005);

        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        item.setMsgBody(Collections.singletonList(msg));
        request.setMsgList(Collections.singletonList(item));

        ImportGroupMsgResult result = client.group.importGroupMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMember() throws IOException {
        ImportGroupMemberRequest request = new ImportGroupMemberRequest();
        request.setGroupId("newGroup");
        MemberItem item = new MemberItem();
        item.setMemberAccount("test1");
        item.setJoinTime(1628062005);
        item.setRole("Admin");
        item.setUnreadMsgNum(4);
        request.setMemberList(Collections.singletonList(item));
        ImportGroupMemberResult result = client.group.importGroupMember(request);
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
