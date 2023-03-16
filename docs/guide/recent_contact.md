# 最近联系人

## 拉取会话列表

支持分页拉取会话列表。

使用示例：

```java
GetRecentContactListRequest request = GetRecentContactListRequest.builder()
        .fromAccount("doocs")
        .timestamp(0)
        .startIndex(0)
        .topTimestamp(0)
        .topStartIndex(0)
        .assistFlags(AssistFlags.BIT_0)
        .build();

GetRecentContactListResult result = client.recentContact.recentContactList(request);
```

## 删除单个会话

删除指定会话，支持同步清理漫游消息。

使用示例：

```java
DeleteRecentContactRequest request = DeleteRecentContactRequest.builder()
        .fromAccount("doocs_1")
        .type(RecentContactType.C2C)
        .toAccount("doocs_2")
        .clearRamble(ClearRamble.YES)
        .build();

DeleteRecentContactResult result = client.recentContact.deleteRecentContact(request);
```

## 创建会话分组数据

会话分组标记数据独立于最近联系人，RestAPI 支持会话分组、会话标准标记、会话自定义标记等字段增删改查。会话分组标记最多支持1000个会话，而一个用户最多支持20个会话分组。本接口支持会话分组数据的创建，仅旗舰版支持会话分组数据操作。

使用示例：

```java
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
```

## 更新会话分组数据

会话分组标记数据独立于最近联系人，RestAPI 支持会话分组、会话标准标记、会话自定义标记等字段增删改查。会话分组标记数据最多支持1000个会话。本接口支持会话分组数据的更新，仅旗舰版支持会话分组数据操作。

使用示例：

```java
UpdateGroup updateGroup = UpdateGroup.builder().updateGroupType(1)
        .newGroupName("hh").oldGroupName("cc").build();
UpdateContactGroupRequest request = UpdateContactGroupRequest.builder()
        .updateType(1)
        .fromAccount("test1")
        .updateGroup(updateGroup)
        .build();

UpdateContactGroupResult result = client.recentContact.updateContactGroup(request);
```

## 删除会话分组数据

本接口支持删除用户的会话分组数据，仅旗舰版支持会话分组数据操作。

使用示例：

```java
List<String> groupName = new ArrayList<>();
groupName.add("hh");
DelContactGroupRequest request = DelContactGroupRequest.builder()
        .groupName(groupName)
        .fromAccount("test1")
        .build();

DelContactGroupResult result = client.recentContact.delContactGroup(request);
```

## 创建或更新会话标记数据

会话分组标记数据独立于最近联系人，RestAPI 支持会话分组、会话标准标记、会话自定义标记等字段增删改查。会话分组标记最多支持1000个会话。本接口支持会话标准标记以及会话自定义标记的创建或更新，仅旗舰版支持会话标准标记数据操作，自定义会话标记数据无限制。

使用示例：

```java
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
```

## 搜索会话分组标记

本接口根据指定的会话来查询对应会话分组标记数据。

使用示例：

```java
SearchContactGroupRequest request = new SearchContactGroupRequest();
request.setFromAccount("test1");
ContactItem contactItem = new ContactItem();
contactItem.setType(1);
contactItem.setToAccount("test2");
contactItem.setToGroupId("123");
request.setContactItem(Collections.singletonList(contactItem));

SearchContactGroupResult result = client.recentContact.searchContactGroup(request);
```

## 拉取会话分组标记数据

本接口支持批量获取用户的会话分组标记数据。

使用示例：

```java
GetContactGroupRequest request = new GetContactGroupRequest();
request.setFromAccount("test1");
request.setStartIndex(1);

GetContactGroupResult result = client.recentContact.getContactGroup(request);
```