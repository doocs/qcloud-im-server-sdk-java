package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.*;
import io.github.doocs.im.model.group.GroupAttr;
import io.github.doocs.im.model.group.GroupMemberItem;
import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 群组管理测试类 {@link io.github.doocs.im.core.Group}
 *
 * @author bingo
 * @since 2021/7/31 21:05
 */
class GroupTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testGetAppIdGroupList() throws IOException {
        GetAppIdGroupListRequest request = GetAppIdGroupListRequest.builder()
                .limit(10)
                .groupType(GroupType.PUBLIC)
                .next(0L)
                .build();

        GetAppIdGroupListResult result = client.group.getAppIdGroupList(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testCreateGroup() throws IOException {
        CreateGroupRequest request = CreateGroupRequest.builder()
                .type(GroupType.AV_CHAT_ROOM)
                .name("TestGroup")
                .ownerAccount("bingo")
                .groupId("MyFirstGroup")
                .introduction("This is group Introduction")
                .notification("This is group Notification")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .maxMemberCount(500)
                .applyJoinOption(ApplyJoinOption.FREE_ACCESS)
                .build();

        CreateGroupResult result = client.group.createGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupInfo() throws IOException {
        List<String> groupIdList = Collections.singletonList("MyFirstGroup");
        GetGroupInfoRequest request = new GetGroupInfoRequest(groupIdList);

        GetGroupInfoResult result = client.group.getGroupInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupMemberInfo() throws IOException {
        GetGroupMemberInfoRequest request = GetGroupMemberInfoRequest.builder()
                .groupId("MyFirstGroup")
                .limit(100)
                .offset(0)
                .build();

        GetGroupMemberInfoResult result = client.group.getGroupMemberInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupBaseInfo() throws IOException {
        ModifyGroupBaseInfoRequest request = ModifyGroupBaseInfoRequest.builder()
                .groupId("MyFirstGroup")
                .name("groupName")
                .introduction("my first group")
                .notification("hello world!")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .maxMemberNum(500)
                .applyJoinOption(ApplyJoinOption.NEED_PERMISSION)
                .muteAllMember(MuteAllMember.OFF)
                .build();

        ModifyGroupBaseInfoResult result = client.group.modifyGroupBaseInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testAddGroupMember() throws IOException {
        MemberRequestItem item = new MemberRequestItem("user2");
        List<MemberRequestItem> memberList = Collections.singletonList(item);
        AddGroupMemberRequest request = AddGroupMemberRequest.builder()
                .groupId("MyFirstGroup")
                .memberList(memberList)
                .silence(1)
                .build();

        AddGroupMemberResult result = client.group.addGroupMember(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDeleteGroupMember() throws IOException {
        List<String> toDelAccount = Collections.singletonList("user2");
        DeleteGroupMemberRequest request = DeleteGroupMemberRequest.builder()
                .groupId("MyFirstGroup")
                .memberToDelAccount(toDelAccount)
                .build();

        DeleteGroupMemberResult result = client.group.deleteGroupMember(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupMemberInfo() throws IOException {
        ModifyGroupMemberInfoRequest request = ModifyGroupMemberInfoRequest.builder()
                .groupId("MyFirstGroup")
                .memberAccount("doocs")
                .nameCard("hello World!")
                .build();

        ModifyGroupMemberInfoResult result = client.group.modifyGroupMemberInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDestroyGroup() throws IOException {
        DestroyGroupRequest request = new DestroyGroupRequest("MyFirstGroup");

        DestroyGroupResult result = client.group.destroyGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetJoinGroupList() throws IOException {
        GetJoinedGroupListRequest request = new GetJoinedGroupListRequest("bingo");

        GetJoinGroupListResult result = client.group.getJoinGroupList(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetRoleInGroup() throws IOException {
        List<String> userAccount = Collections.singletonList("doocs");
        GetRoleInGroupRequest request = GetRoleInGroupRequest.builder()
                .groupId("MyFirstGroup")
                .userAccount(userAccount)
                .build();

        GetRoleInGroupResult result = client.group.getRoleInGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testForbidSendMsg() throws IOException {
        List<String> membersAccount = Collections.singletonList("doocs");
        ForbidSendMsgRequest request = ForbidSendMsgRequest.builder()
                .groupId("MyFirstGroup")
                .membersAccount(membersAccount)
                .muteTime(200L)
                .build();

        ForbidSendMsgResult result = client.group.forbidSendMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupMutedAccount() throws IOException {
        GetGroupMutedAccountRequest request = new GetGroupMutedAccountRequest("MyFirstGroup");

        GetGroupMutedAccountResult result = client.group.getGroupMutedAccount(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSendGroupMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("red packet");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        SendGroupMsgRequest request = SendGroupMsgRequest.builder()
                .groupId("MyFirstGroup")
                .random(1314L)
                .msgBody(msgBody)
                .onlineOnlyFlag(OnlineOnlyFlag.NO)
                .build();

        SendGroupMsgResult result = client.group.sendGroupMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSendGroupSystemNotification() throws IOException {
        List<String> toMembersAccount = Collections.singletonList("doocs");
        SendGroupSystemNotificationRequest request = SendGroupSystemNotificationRequest.builder()
                .groupId("MyFirstGroup")
                .content("hello world")
                .toMembersAccount(toMembersAccount)
                .build();

        SendGroupSystemNotificationResult result = client.group.sendGroupSystemNotification(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testChangeGroupOwner() throws IOException {
        ChangeGroupOwnerRequest request = ChangeGroupOwnerRequest.builder()
                .groupId("MyFirstGroup")
                .newOwnerAccount("doocs")
                .build();

        ChangeGroupOwnerResult result = client.group.changeGroupOwner(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGroupMsgRecall() throws IOException {
        List<MsgSeqItem> msgSeqList = Collections.singletonList(new MsgSeqItem(0L));
        GroupMsgRecallRequest request = GroupMsgRecallRequest.builder()
                .groupId("MyFirstGroup")
                .msgSeqList(msgSeqList)
                .build();

        GroupMsgRecallResult result = client.group.groupMsgRecall(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testImportGroup() throws IOException {
        ImportGroupRequest request = ImportGroupRequest.builder()
                .type(GroupType.PUBLIC)
                .name("groupName")
                .build();

        ImportGroupResult result = client.group.importGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testImportGroupMsg() throws IOException {
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
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testImportGroupMember() throws IOException {
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
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSetUnreadMsgNum() throws IOException {
        SetUnreadMsgNumRequest request = SetUnreadMsgNumRequest.builder()
                .groupId("MyFirstGroup")
                .memberAccount("doocs")
                .unreadMsgNum(1)
                .build();

        SetUnreadMsgNumResult result = client.group.setUnreadMsgNum(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDeleteGroupMsgBySender() throws IOException {
        DeleteGroupMsgBySenderRequest request = DeleteGroupMsgBySenderRequest.builder()
                .groupId("MyFirstGroup")
                .senderAccount("doocs")
                .build();

        DeleteGroupMsgBySenderResult result = client.group.deleteGroupMsgBySender(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGroupMsgGetSimple() throws IOException {
        GroupMsgGetSimpleRequest request = GroupMsgGetSimpleRequest.builder()
                .groupId("MyFirstGroup")
                .reqMsgNumber(1)
                .reqMsgSeq(20L)
                .build();

        GroupMsgGetSimpleResult result = client.group.groupMsgGetSimple(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetOnlineMemberNum() throws IOException {
        GetOnlineMemberNumRequest request = new GetOnlineMemberNumRequest("MyFirstAVChatRoom");

        GetOnlineMemberNumResult result = client.group.getOnlineMemberNum(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetMembers() throws IOException {
        GetMembersRequest request = GetMembersRequest.builder()
                .groupId("MyFirstGroup")
                .timestamp(0)
                .build();

        GetMembersResult result = client.group.getMembers(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupAttr() throws IOException {
        GetGroupAttrRequest request = new GetGroupAttrRequest("MyFirstGroup");

        GetGroupAttrResult result = client.group.getGroupAttr(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupAttr() throws IOException {
        GroupAttr groupAttr = new GroupAttr();
        groupAttr.setKey("isOpen");
        groupAttr.setValue("yes");
        List<GroupAttr> groupAttrs = Collections.singletonList(groupAttr);
        ModifyGroupAttrRequest request = ModifyGroupAttrRequest.builder()
                .groupId("MyFirstGroup")
                .groupAttrs(groupAttrs)
                .build();

        ModifyGroupAttrResult result = client.group.modifyGroupAttr(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testClearGroupAttr() throws IOException {
        ClearGroupAttrRequest request = new ClearGroupAttrRequest("MyFirstGroup");

        ClearGroupAttrResult result = client.group.clearGroupAttr(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSetGroupAttr() throws IOException {
        SetGroupAttrRequest request = new SetGroupAttrRequest();
        request.setGroupId("MyFirstGroup");
        GroupAttr groupAttr = new GroupAttr();
        groupAttr.setKey("isOpen");
        groupAttr.setValue("yes");
        List<GroupAttr> groupAttrs = Collections.singletonList(groupAttr);
        request.setGroupAttrs(groupAttrs);

        SetGroupAttrResult result = client.group.setGroupAttr(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupMsg() throws IOException {
        ModifyGroupMsgRequest request = new ModifyGroupMsgRequest();
        request.setGroupId("MyFirstGroup");
        request.setMsgSeq(123L);
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        request.setMsgBody(msgBody);
        request.setMsgBody(msgBody);

        ModifyGroupMsgResult result = client.group.modifyGroupMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSendBroadcastMsg() throws IOException {
        SendBroadcastMsgRequest request = new SendBroadcastMsgRequest();
        request.setFromAccount("test1");
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        request.setMsgBody(msgBody);
        request.setRandom(1223L);

        SendBroadcastMsgResult result = client.group.sendBroadcastMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupMsgReceipt() throws IOException {
        GetGroupMsgReceiptRequest request = new GetGroupMsgReceiptRequest();
        request.setGroupId("MyFirstGroup");
        MsgSeqItem seqItem = new MsgSeqItem();
        seqItem.setMsgSeq(123L);
        request.setMsgSeqList(Collections.singletonList(seqItem));

        GetGroupMsgReceiptResult result = client.group.getGroupMsgReceipt(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupMsgReceiptDetail() throws IOException {
        GetGroupMsgReceiptDetailRequest request = new GetGroupMsgReceiptDetailRequest();
        request.setGroupId("MyFirstGroup");
        request.setMsgSeq(123L);
        request.setNum(12);
        request.setCursor("");
        request.setFlag(12);

        GetGroupMsgReceiptDetailResult result = client.group.getGroupMsgReceiptDetail(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testCreateGroupTopic() throws IOException {
        CreateGroupTopicRequest request = new CreateGroupTopicRequest();
        request.setGroupId("MyFirstGroup");
        request.setTopicName("test");
        request.setFaceUrl("");

        CreateGroupTopicResult result = client.group.createGroupTopic(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupTopic() throws IOException {
        GetGroupTopicRequest request = new GetGroupTopicRequest();
        request.setGroupId("MyFirstGroup");
        request.setFromAccount("1400187352");

        GetGroupTopicResult result = client.group.getGroupTopic(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupTopic() throws IOException {
        ModifyGroupTopicRequest request = new ModifyGroupTopicRequest();
        request.setGroupId("MyFirstGroup");
        request.setTopicName("test");
        request.setFaceUrl("");

        ModifyGroupTopicResult result = client.group.modifyGroupTopic(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDestroyGroupTopic() throws IOException {
        DestroyGroupTopicRequest request = new DestroyGroupTopicRequest();
        request.setGroupId("MyFirstGroup");

        DestroyGroupTopicResult result = client.group.destroyGroupTopic(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetGroupBanMember() throws IOException {
        GetGroupBanMemberRequest request = new GetGroupBanMemberRequest();
        request.setGroupId("MyFirstGroup");
        request.setLimit(10);
        request.setOffset(0);

        GetGroupBanMemberResult result = client.group.getGroupBanMember(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testBanGroupMember() throws IOException {
        BanGroupMemberRequest request = new BanGroupMemberRequest();
        request.setGroupId("MyFirstGroup");
        request.setDuration(1000L);
        request.setMembersAccount(Arrays.asList("test1", "bingo"));
        request.setDescription("test");

        BanGroupMemberResult result = client.group.banGroupMember(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testUnbanGroupMember() throws IOException {
        UnbanGroupMemberRequest request = new UnbanGroupMemberRequest();
        request.setGroupId("MyFirstGroup");
        request.setMembersAccount(Arrays.asList("test1", "bingo"));

        UnbanGroupMemberResult result = client.group.unbanGroupMember(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testModifyGroupMemberUserInfo() throws IOException {
        ModifyGroupUserInfoRequest request = new ModifyGroupUserInfoRequest();
        request.setCommandType(1);
        GroupMemberItem item = new GroupMemberItem();
        item.setMarks(Arrays.asList(1001, 1002));
        item.setMemberAccount("test1");
        request.setMemberList(Collections.singletonList(item));
        request.setGroupId("MyFirstGroup");

        ModifyGroupUserInfoResult result = client.group.modifyGroupUserInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGroupGetKeyValues() throws IOException {
        GroupGetKeyValuesRequest request = GroupGetKeyValuesRequest.builder()
                .groupId("MyFirstGroup")
                .msgSeq(1L)
                .build();

        GroupGetKeyValuesResult result = client.group.groupGetKeyValues(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testSetGroupKeyValues() throws IOException {
        GroupSetKeyValuesRequest request = GroupSetKeyValuesRequest.builder()
                .groupId("MyFirstGroup")
                .msgSeq(1L)
                .extensionList(Collections.singletonList(KeyValueSeq.builder()
                        .key("test")
                        .value("test")
                        .build()))
                .build();

        GroupSetKeyValuesResult result = client.group.groupSetKeyValues(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }
}