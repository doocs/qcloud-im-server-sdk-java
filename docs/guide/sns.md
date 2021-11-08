# 关系链管理

## 添加好友

添加好友，支持批量添加好友。

使用示例：

```java
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
```

## 导入好友

- 支持批量导入单向好友。
- 往同一个用户导入好友时建议采用批量导入的方式，避免并发写导致的写冲突。

使用示例：

```java
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
```

## 更新好友

- 支持批量更新同一用户的多个好友的关系链数据。
- 更新一个用户多个好友时，建议采用批量方式，避免并发写导致的写冲突。

使用示例：

```java
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
```

## 删除好友

删除好友，支持单向删除好友和双向删除好友。

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
FriendDeleteRequest request = FriendDeleteRequest.builder()
        .deleteType(DeleteType.BOTH)
        .fromAccount("test1")
        .toAccount(toAccount)
        .build();

FriendDeleteResult result = client.sns.friendDelete(request);
```

## 删除所有好友

清除指定用户的标配好友数据和自定义好友数据。

使用示例：

```java
FriendDeleteAllRequest request = FriendDeleteAllRequest.builder()
        .deleteType(DeleteType.BOTH)
        .fromAccount("test1")
        .build();

FriendDeleteAllResult result = client.sns.friendDeleteAll(request);
```

## 校验好友

支持批量校验好友关系。

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
FriendCheckRequest request = FriendCheckRequest.builder()
        .fromAccount("test1")
        .toAccount(toAccount)
        .checkType(CheckResultType.BOTH)
        .build();

FriendCheckResult result = client.sns.friendCheck(request);
```

## 拉取好友

- 分页拉取全量好友数据。
- 不支持资料数据的拉取。
- 不需要指定请求拉取的字段，默认返回全量的标配好友数据和自定义好友数据。

使用示例：

```java
FriendGetRequest request = FriendGetRequest.builder()
        .fromAccount("test1")
        .startIndex(0)
        .standardSequence(0)
        .customSequence(0)
        .build();

FriendGetResult result = client.sns.friendGet(request);
```

## 拉取指定好友

- 支持拉取指定好友的好友数据和资料数据。
- 建议每次拉取的好友数不超过 100，避免因数据量太大导致回包失败。

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
List<String> tagList = Arrays.asList(TagProfile.IM_ADMIN_FORBID_TYPE, TagProfile.IM_ALLOW_TYPE);
FriendGetListRequest request = FriendGetListRequest.builder()
        .fromAccount("test1")
        .toAccount(toAccount)
        .tagList(tagList)
        .build();

FriendGetListResult result = client.sns.friendGetList(request);
```

## 添加黑名单

添加黑名单，支持批量添加黑名单。

::: warning

- 如果用户 A 与用户 B 之间存在好友关系，拉黑时会解除双向好友关系。
- 如果用户 A 与用户 B 之间存在黑名单关系，二者之间无法发起加好友请求。
- 如果用户 A 的黑名单中有用户 B 且用户 B 的黑名单中有用户 A，二者之间无法发起会话。
- 如果用户 A 的黑名单中有用户 B 但用户 B 的黑名单中没有用户 A，那么用户 A 可以给用户 B 发消息，用户 B 不能给用户 A 发消息。
  :::

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
BlackListAddRequest request = BlackListAddRequest.builder()
        .fromAccount("test1")
        .toAccount(toAccount)
        .build();

BlackListAddResult result = client.sns.blackListAdd(request);
```

## 删除黑名单

删除指定黑名单。

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
BlackListDeleteRequest request = BlackListDeleteRequest.builder()
        .fromAccount("test1")
        .toAccount(toAccount)
        .build();

BlackListDeleteResult result = client.sns.blackListDelete(request);
```

## 拉取黑名单

支持分页拉取所有黑名单。

使用示例：

```java
BlackListGetRequest request = BlackListGetRequest.builder()
        .fromAccount("test1")
        .startIndex(0)
        .maxLimited(10)
        .lastSequence(0)
        .build();

BlackListGetResult result = client.sns.blackListGet(request);
```

## 校验黑名单

支持批量校验黑名单。

使用示例：

```java
List<String> toAccount = Collections.singletonList("test2");
BlackListCheckRequest request = BlackListCheckRequest.builder()
        .fromAccount("test1")
        .toAccount(toAccount)
        .checkType(BlackCheckResultType.BOTH)
        .build();

BlackListCheckResult result = client.sns.blackListCheck(request);
```

## 添加分组

添加分组，支持批量添加分组，并将指定好友加入到新增分组中。

使用示例：

```java
List<String> groupName = Collections.singletonList("classmate");
List<String> toAccount = Collections.singletonList("test2");
GroupAddRequest request = GroupAddRequest.builder()
        .fromAccount("test1")
        .groupName(groupName)
        .toAccount(toAccount)
        .build();

GroupAddResult result = client.sns.groupAdd(request);
```

## 删除分组

删除指定分组。

使用示例：

```java
List<String> groupName = Collections.singletonList("classmate");
GroupDeleteRequest request = GroupDeleteRequest.builder()
        .fromAccount("test1")
        .groupName(groupName)
        .build();

GroupDeleteResult result = client.sns.groupDelete(request);
```

## 拉取分组

拉取分组，支持指定分组以及拉取分组下的好友列表。

使用示例：

```java
List<String> groupName = Collections.singletonList("schoolmate");
GroupGetRequest request = GroupGetRequest.builder()
        .fromAccount("test1")
        .lastSequence(0)
        .groupName(groupName)
        .needFriend(NeedFriendType.YES)
        .build();

GroupGetResult result = client.sns.groupGet(request);
```
