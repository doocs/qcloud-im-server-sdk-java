package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.AssistFlags;
import io.github.doocs.im.constant.ClearRamble;
import io.github.doocs.im.constant.RecentContactType;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 最近联系人测试类 {@link io.github.doocs.im.core.RecentContact}
 *
 * @author bingo
 * @since 2021/10/11 10:56
 */
class RecentContactTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testGetRecentContactList() throws IOException {
        GetRecentContactListRequest request = GetRecentContactListRequest.builder()
                .fromAccount("doocs")
                .timestamp(0)
                .startIndex(0)
                .topTimestamp(0)
                .topStartIndex(0)
                .assistFlags(AssistFlags.BIT_0)
                .build();

        GetRecentContactListResult result = client.recentContact.recentContactList(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testDeleteRecentContact() throws IOException {
        DeleteRecentContactRequest request = DeleteRecentContactRequest.builder()
                .fromAccount("doocs_1")
                .type(RecentContactType.C2C)
                .toAccount("doocs_2")
                .clearRamble(ClearRamble.YES)
                .build();

        DeleteRecentContactResult result = client.recentContact.deleteRecentContact(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testCreateContactGroup() throws IOException {
        List<GroupContactItem> items = new ArrayList<>();
        GroupContactItem item = new GroupContactItem();
        item.setGroupName("groupName");

        List<ContactItem> contactItems = new ArrayList<>();
        ContactItem contactItem = new ContactItem();
        contactItem.setToAccount("ccc");
        contactItem.setToGroupId("group1");
        contactItem.setType(1);
        contactItems.add(contactItem);
        item.setContactItem(contactItems);
        items.add(item);
        CreateContactGroupRequest request = CreateContactGroupRequest.builder()
                .fromAccount("test1")
                .groupContactItem(items).build();

        CreateContactGroupResult result = client.recentContact.createContactGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testUpdateContactGroup() throws IOException {
        UpdateGroup updateGroup = UpdateGroup.builder().updateGroupType(1)
                .newGroupName("hh").oldGroupName("cc").build();
        UpdateContactGroupRequest request = UpdateContactGroupRequest.builder()
                .updateType(1)
                .fromAccount("test1")
                .updateGroup(updateGroup)
                .build();

        UpdateContactGroupResult result = client.recentContact.updateContactGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testDelContactGroup() throws IOException {
        List<String> groupName = new ArrayList<>();
        groupName.add("hh");
        DelContactGroupRequest request = DelContactGroupRequest.builder()
                .groupName(groupName)
                .fromAccount("test1")
                .build();

        DelContactGroupResult result = client.recentContact.delContactGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testMarkContact() throws IOException {
        List<MarkContactItem> items = new ArrayList<>();
        MarkContactItem item = new MarkContactItem();
        item.setClearMark(Collections.singletonList(1));
        item.setSetMark(Collections.singletonList(2));
        item.setOptType(1);
        items.add(item);
        MarkContactRequest request = MarkContactRequest.builder()
                .fromAccount("test1")
                .markItem(items)
                .build();

        MarkContactResult result = client.recentContact.markContact(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testSearchContactGroup() throws IOException {
        SearchContactGroupRequest request = new SearchContactGroupRequest();
        request.setFromAccount("test1");
        ContactItem contactItem = new ContactItem();
        contactItem.setType(1);
        contactItem.setToAccount("test2");
        contactItem.setToGroupId("123");
        request.setContactItem(Collections.singletonList(contactItem));

        SearchContactGroupResult result = client.recentContact.searchContactGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetContactGroup() throws IOException {
        GetContactGroupRequest request = new GetContactGroupRequest();
        request.setFromAccount("test1");
        request.setStartIndex(1);

        GetContactGroupResult result = client.recentContact.getContactGroup(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
