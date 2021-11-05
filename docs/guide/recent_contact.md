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
