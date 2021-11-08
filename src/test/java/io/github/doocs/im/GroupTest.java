package io.github.doocs.im;

import io.github.doocs.im.constant.*;
import io.github.doocs.im.model.message.TIMMsgElement;
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
    private static final ImClient client;

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
        client = ImClient.getInstance(appId, identifier, key);
    }

    @Test
    public void testGetAppIdGroupList() throws IOException {
        GetAppidGroupListRequest request = GetAppidGroupListRequest.builder()
                .limit(10)
                .groupType(GroupType.PUBLIC)
                .next(0)
                .build();

        GetAppidGroupListResult result = client.group.getAppIdGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testCreateGroup() throws IOException {
        CreateGroupRequest request = CreateGroupRequest.builder()
                .type(GroupType.PUBLIC)
                .name("TestGroup")
                .ownerAccount("user2")
                .groupId("MyFirstGroup")
                .introduction("This is group Introduction")
                .notification("This is group Notification")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .maxMemberCount(500)
                .applyJoinOption(ApplyJoinOption.FREE_ACCESS)
                .build();

        CreateGroupResult result = client.group.createGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupInfo() throws IOException {
        List<String> groupIdList = Collections.singletonList("MyFirstGroup");
        GetGroupInfoRequest request = new GetGroupInfoRequest(groupIdList);

        GetGroupInfoResult result = client.group.getGroupInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupMemberInfo() throws IOException {
        GetGroupMemberInfoRequest request = GetGroupMemberInfoRequest.builder()
                .groupId("MyFirstGroup")
                .limit(100)
                .offset(0)
                .build();

        GetGroupMemberInfoResult result = client.group.getGroupMemberInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupBaseInfo() throws IOException {
        ModifyGroupBaseInfoRequest request = ModifyGroupBaseInfoRequest.builder()
                .groupId("MyFirstGroup")
                .name("groupName")
                .introduction("my first group")
                .notification("hello world!")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .maxMemberNum(500)
                .applyJoinOption(ApplyJoinOption.NEED_PERMISSION)
                .shutUpAllMember(ShutUpAllMember.OFF)
                .build();

        ModifyGroupBaseInfoResult result = client.group.modifyGroupBaseInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testAddGroupMember() throws IOException {
        MemberRequestItem item = new MemberRequestItem("user2");
        List<MemberRequestItem> memberList = Collections.singletonList(item);
        AddGroupMemberRequest request = AddGroupMemberRequest.builder()
                .groupId("MyFirstGroup")
                .memberList(memberList)
                .silence(1)
                .build();

        AddGroupMemberResult result = client.group.addGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDeleteGroupMember() throws IOException {
        List<String> toDelAccount = Collections.singletonList("user2");
        DeleteGroupMemberRequest request = DeleteGroupMemberRequest.builder()
                .groupId("MyFirstGroup")
                .memberToDelAccount(toDelAccount)
                .build();

        DeleteGroupMemberResult result = client.group.deleteGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testModifyGroupMemberInfo() throws IOException {
        ModifyGroupMemberInfoRequest request = ModifyGroupMemberInfoRequest.builder()
                .groupId("MyFirstGroup")
                .memberAccount("doocs")
                .nameCard("hello World!")
                .build();

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
        List<String> userAccount = Collections.singletonList("doocs");
        GetRoleInGroupRequest request = GetRoleInGroupRequest.builder()
                .groupId("MyFirstGroup")
                .userAccount(userAccount)
                .build();

        GetRoleInGroupResult result = client.group.getRoleInGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testForbidSendMsg() throws IOException {
        ForbidSendMsgRequest request = ForbidSendMsgRequest.builder()
                .groupId("MyFirstGroup")
                .membersAccount(Collections.singletonList("doocs"))
                .shutUpTime(200)
                .build();

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
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        SendGroupMsgRequest request = SendGroupMsgRequest.builder()
                .groupId("MyFirstGroup")
                .random(1314)
                .msgBody(msgBody)
                .onlineOnlyFlag(OnlineOnlyFlag.YES)
                .build();

        SendGroupMsgResult result = client.group.sendGroupMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSendGroupSystemNotification() throws IOException {
        List<String> toMembersAccount = Collections.singletonList("doocs");
        SendGroupSystemNotificationRequest request = SendGroupSystemNotificationRequest.builder()
                .groupId("MyFirstGroup")
                .content("hello world")
                .toMembersAccount(toMembersAccount)
                .build();

        SendGroupSystemNotificationResult result = client.group.sendGroupSystemNotification(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testChangeGroupOwner() throws IOException {
        ChangeGroupOwnerRequest request = ChangeGroupOwnerRequest.builder()
                .groupId("MyFirstGroup")
                .newOwnerAccount("doocs")
                .build();

        ChangeGroupOwnerResult result = client.group.changeGroupOwner(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgRecall() throws IOException {
        List<MsgSeqItem> msgSeqList = Collections.singletonList(new MsgSeqItem(0));
        GroupMsgRecallRequest request = GroupMsgRecallRequest.builder()
                .groupId("MyFirstGroup")
                .msgSeqList(msgSeqList)
                .build();

        GroupMsgRecallResult result = client.group.groupMsgRecall(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroup() throws IOException {
        ImportGroupRequest request = ImportGroupRequest.builder()
                .type(GroupType.PUBLIC)
                .name("groupName")
                .build();

        ImportGroupResult result = client.group.importGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        GroupMsgItem item = GroupMsgItem.builder()
                .fromAccount("doocs")
                .sendTime(1628062005)
                .msgBody(msgBody)
                .build();
        List<GroupMsgItem> msgList = Collections.singletonList(item);
        ImportGroupMsgRequest request = ImportGroupMsgRequest.builder()
                .groupId("newGroup")
                .msgList(msgList)
                .build();

        ImportGroupMsgResult result = client.group.importGroupMsg(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testImportGroupMember() throws IOException {
        MemberItem item = MemberItem.builder()
                .memberAccount("doocs")
                .joinTime(1628062005)
                .role(MemberRole.ADMIN)
                .unreadMsgNum(1)
                .build();
        List<MemberItem> members = Collections.singletonList(item);
        ImportGroupMemberRequest request = ImportGroupMemberRequest.builder()
                .groupId("groupName")
                .memberList(members)
                .build();

        ImportGroupMemberResult result = client.group.importGroupMember(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testSetUnreadMsgNum() throws IOException {
        SetUnreadMsgNumRequest request = SetUnreadMsgNumRequest.builder()
                .groupId("MyFirstGroup")
                .memberAccount("doocs")
                .unreadMsgNum(1)
                .build();

        SetUnreadMsgNumResult result = client.group.setUnreadMsgNum(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testDeleteGroupMsgBySender() throws IOException {
        DeleteGroupMsgBySenderRequest request = DeleteGroupMsgBySenderRequest.builder()
                .groupId("MyFirstGroup")
                .senderAccount("doocs")
                .build();

        DeleteGroupMsgBySenderResult result = client.group.deleteGroupMsgBySender(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGroupMsgGetSimple() throws IOException {
        GroupMsgGetSimpleRequest request = GroupMsgGetSimpleRequest.builder()
                .groupId("MyFirstGroup")
                .reqMsgNumber(1)
                .reqMsgNumber(20)
                .build();

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
