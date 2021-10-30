package io.github.doocs.im;

import io.github.doocs.im.constant.ApplyJoinOption;
import io.github.doocs.im.constant.GroupType;
import io.github.doocs.im.constant.MemberRole;
import io.github.doocs.im.constant.OnlineOnlyFlag;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
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
        request.setGroupType(GroupType.PUBLIC);
        request.setNext(0);
        GetAppidGroupListResult result = client.group.getAppIdGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testCreateGroup() throws IOException {
        CreateGroupRequest request = new CreateGroupRequest(GroupType.PUBLIC, "TestGroup");
        request.setOwnerAccount("bingo");
        request.setGroupId("MyFirstGroup");
        request.setIntroduction("This is group Introduction");
        request.setNotification("This is group Notification");
        request.setFaceUrl("http://this.is.face.url");
        request.setMaxMemberCount(5000);
        request.setApplyJoinOption(ApplyJoinOption.FREE_ACCESS);
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
        GetGroupInfoRequest request = new GetGroupInfoRequest(Collections.singletonList("MyFirstGroup"));
        GetGroupInfoResult result = client.group.getGroupInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupMemberInfo() throws IOException {
        GetGroupMemberInfoRequest request = new GetGroupMemberInfoRequest("MyFirstGroup");
        request.setLimit(100);
        request.setOffset(0);
        GetGroupMemberInfoResult result = client.group.getGroupMemberInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupBaseInfo() throws IOException {
        ModifyGroupBaseInfoRequest request = new ModifyGroupBaseInfoRequest("MyFirstGroup");
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
        MemberRequestItem memberItem = new MemberRequestItem("test2");
        List<MemberRequestItem> memberList = Collections.singletonList(memberItem);
        AddGroupMemberRequest request = new AddGroupMemberRequest("MyFirstGroup", memberList);
        request.setSilence(1);
        AddGroupMemberResult result = client.group.addGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDeleteGroupMember() throws IOException {
        List<String> toDelAccount = Collections.singletonList("test2");
        DeleteGroupMemberRequest request = new DeleteGroupMemberRequest("MyFirstGroup", toDelAccount);
        DeleteGroupMemberResult result = client.group.deleteGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupMemberInfo() throws IOException {
        ModifyGroupMemberInfoRequest request = new ModifyGroupMemberInfoRequest("MyFirstGroup", "bingo");
        request.setNameCard("hello bingo");
        ModifyGroupMemberInfoResult result = client.group.modifyGroupMemberInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDestroyGroup() throws IOException {
        DestroyGroupRequest request = new DestroyGroupRequest("MyFirstGroup");
        DestroyGroupResult result = client.group.destroyGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetJoinGroupList() throws IOException {
        GetJoinedGroupListRequest request = new GetJoinedGroupListRequest("bingo");
        GetJoinGroupListResult result = client.group.getJoinGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetRoleInGroup() throws IOException {
        GetRoleInGroupRequest request = new GetRoleInGroupRequest("MyFirstGroup", Collections.singletonList("bingo"));
        GetRoleInGroupResult result = client.group.getRoleInGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testForbidSendMsg() throws IOException {
        List<String> membersAccount = Collections.singletonList("bingo");
        ForbidSendMsgRequest request = new ForbidSendMsgRequest("MyFirstGroup", membersAccount, 200);
        ForbidSendMsgResult result = client.group.forbidSendMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupShuttedUin() throws IOException {
        GetGroupShuttedUinRequest request = new GetGroupShuttedUinRequest("MyFirstGroup");
        GetGroupShuttedUinResult result = client.group.getGroupShuttedUin(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSendGroupMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("red packet");
        SendGroupMsgRequest request = new SendGroupMsgRequest("MyFirstGroup", 1212, Collections.singletonList(msg));
        request.setOnlineOnlyFlag(OnlineOnlyFlag.YES);
        SendGroupMsgResult result = client.group.sendGroupMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSendGroupSystemNotification() throws IOException {
        SendGroupSystemNotificationRequest request = new SendGroupSystemNotificationRequest("MyFirstGroup", "hello world");
        request.setToMembersAccount(Collections.singletonList("bingo"));
        SendGroupSystemNotificationResult result = client.group.sendGroupSystemNotification(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testChangeGroupOwner() throws IOException {
        ChangeGroupOwnerRequest request = new ChangeGroupOwnerRequest("MyFirstGroup", "test1");
        ChangeGroupOwnerResult result = client.group.changeGroupOwner(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgRecall() throws IOException {
        MsgSeqItem item = new MsgSeqItem(123323);
        GroupMsgRecallRequest request = new GroupMsgRecallRequest("MyFirstGroup", Collections.singletonList(item));
        GroupMsgRecallResult result = client.group.groupMsgRecall(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroup() throws IOException {
        ImportGroupRequest request = new ImportGroupRequest(GroupType.PUBLIC, "群名");
        ImportGroupResult result = client.group.importGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMsg() throws IOException {
        GroupMsgItem item = new GroupMsgItem("bingo", 1628062005);
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        item.setMsgBody(Collections.singletonList(msg));
        ImportGroupMsgRequest request = new ImportGroupMsgRequest("newGroup", Collections.singletonList(item));
        ImportGroupMsgResult result = client.group.importGroupMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMember() throws IOException {
        MemberItem item = new MemberItem("test1");
        item.setJoinTime(1628062005);
        item.setRole(MemberRole.ADMIN);
        item.setUnreadMsgNum(4);
        ImportGroupMemberRequest request = new ImportGroupMemberRequest("newGroup", Collections.singletonList(item));
        ImportGroupMemberResult result = client.group.importGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSetUnreadMsgNum() throws IOException {
        SetUnreadMsgNumRequest request = new SetUnreadMsgNumRequest("MyFirstGroup", "test1", 1);
        SetUnreadMsgNumResult result = client.group.setUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDeleteGroupMsgBySender() throws IOException {
        DeleteGroupMsgBySenderRequest request = new DeleteGroupMsgBySenderRequest("MyFirstGroup", "test1");
        DeleteGroupMsgBySenderResult result = client.group.deleteGroupMsgBySender(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgGetSimple() throws IOException {
        GroupMsgGetSimpleRequest request = new GroupMsgGetSimpleRequest("MyFirstGroup", 1, 20);
        GroupMsgGetSimpleResult result = client.group.groupMsgGetSimple(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetOnlineMemberNum() throws IOException {
        GetOnlineMemberNumRequest request = new GetOnlineMemberNumRequest("MyFirstAVChatRoom");
        GetOnlineMemberNumResult result = client.group.getOnlineMemberNum(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }
}
