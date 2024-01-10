# 群组管理

## 获取 App 中的所有群组

App 管理员可以通过该接口获取 App 中所有群组的 ID。

::: tip
即时通信 IM 内置多种群组类型，详情请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetAppIdGroupListRequest request = GetAppIdGroupListRequest.builder()
        .limit(10)
        .groupType(GroupType.PUBLIC)
        .next(0)
        .build();

GetAppIdGroupListResult result = client.group.getAppIdGroupList(request);
```

## 创建群组

App 管理员可以通过该接口创建群组。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                                                        |
| ----------------- | -------------------------------------------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）                                      |
| Public            | 支持                                                                       |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）                                   |
| AVChatRoom        | 支持，用户（包括群主）使用 AVChatroom（直播群）时必须操作 SDK 主动申请进群 |
| Community（社群） | 支持                                                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
CreateGroupRequest request = CreateGroupRequest.builder()
        .type(GroupType.PUBLIC)
        .name("TestGroup")
        .ownerAccount("user1")
        .groupId("MyFirstGroup")
        .introduction("This is group Introduction")
        .notification("This is group Notification")
        .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
        .maxMemberCount(500)
        .applyJoinOption(ApplyJoinOption.FREE_ACCESS)
        .build();

CreateGroupResult result = client.group.createGroup(request);
```

## 获取群详细资料

App 管理员可以根据群组 ID 获取群组的详细信息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
List<String> groupIdList = Collections.singletonList("MyFirstGroup");
GetGroupInfoRequest request = new GetGroupInfoRequest(groupIdList);

GetGroupInfoResult result = client.group.getGroupInfo(request);
```

## 获取群成员详细资料

App 管理员可以根据群组 ID 获取群组成员的资料。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持，使用 Next 字段分批获取             |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

因 Community（社群）人数较多，分页获取方式改用 Next 分批方法。
:::

使用示例：

```java
GetGroupMemberInfoRequest request = GetGroupMemberInfoRequest.builder()
        .groupId("MyFirstGroup")
        .limit(100)
        .offset(0)
        .build();

GetGroupMemberInfoResult result = client.group.getGroupMemberInfo(request);
```

## 修改群基础资料

App 管理员可以通过该接口修改指定群组的基础信息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
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
```

## 增加群成员

App 管理员可以通过该接口向指定的群中添加新成员。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom(直播群)不支持增加群成员，对此类型群组进行操作时会返回 10007 错误。用户加入此类型群组的唯一方式是用户申请加群。
:::

使用示例：

```java
MemberRequestItem item = new MemberRequestItem("user2");
List<MemberRequestItem> memberList = Collections.singletonList(item);
AddGroupMemberRequest request = AddGroupMemberRequest.builder()
        .groupId("MyFirstGroup")
        .memberList(memberList)
        .silence(1)
        .build();

AddGroupMemberResult result = client.group.addGroupMember(request);
```

## 删除群成员

App 管理员可以通过该接口删除群成员。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不支持删除群成员，对这种类型的群组进行操作时会返回 10004 错误。如果管理员希望达到删除群成员的效果，可以通过设置 [批量禁言和取消禁言](#批量禁言和取消禁言) 的方式实现。
:::

使用示例：

```java
List<String> toDelAccount = Collections.singletonList("user2");
DeleteGroupMemberRequest request = DeleteGroupMemberRequest.builder()
        .groupId("MyFirstGroup")
        .memberToDelAccount(toDelAccount)
        .build();

DeleteGroupMemberResult result = client.group.deleteGroupMember(request);
```

## 修改群成员资料

App 管理员可以通过该接口修改群成员资料。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不存储群成员资料，所以不能修改成员资料。只能修改管理员和群主的成员资料，修改普通成员资料时会返回 10007 错误。
:::

使用示例：

```java
ModifyGroupMemberInfoRequest request = ModifyGroupMemberInfoRequest.builder()
        .groupId("MyFirstGroup")
        .memberAccount("doocs")
        .nameCard("hello World!")
        .build();

ModifyGroupMemberInfoResult result = client.group.modifyGroupMemberInfo(request);
```

## 解散群组

App 管理员通过该接口解散群。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
DestroyGroupRequest request = new DestroyGroupRequest("MyFirstGroup");

DestroyGroupResult result = client.group.destroyGroup(request);
```

## 获取用户所加入的群组

App 管理员可以通过本接口获取某一用户加入的群信息。默认不获取用户已加入但未激活好友工作群（Work）以及直播群（AVChatRoom）群信息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                                                                                                               |
| ----------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群），但默认不返回已加入但未激活的此类型群信息                                                   |
| Public            | 支持                                                                                                                              |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）                                                                                          |
| AVChatRoom        | 支持，但默认不返回此类型群信息。如果指定拉取 AVChatRoom 类型群信息，获得的群信息可能不完整，AVChatRoom 并不存储所有的群成员资料。 |
| Community（社群） | 支持                                                                                                                              |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetJoinedGroupListRequest request = new GetJoinedGroupListRequest("doocs");

GetJoinGroupListResult result = client.group.getJoinGroupList(request);
```

## 查询用户在群组中的身份

App 管理员可以通过该接口获取一批用户在群内的身份，即“成员角色”。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不支持该接口，对此类型群组进行操作将返回 10007 错误；但可以通过 [获取群组成员详细资料](#获取群组成员详细资料) 达到查询“成员角色”的效果。
:::

使用示例：

```java
List<String> userAccount = Collections.singletonList("doocs");
GetRoleInGroupRequest request = GetRoleInGroupRequest.builder()
        .groupId("MyFirstGroup")
        .userAccount(userAccount)
        .build();

GetRoleInGroupResult result = client.group.getRoleInGroup(request);
```

## 批量禁言和取消禁言

- App 管理员禁止指定群组中某些用户在一段时间内发言。
- App 管理员取消对某些用户的禁言。
- 被禁言用户退出群组之后再进入同一群组，禁言仍然有效。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 不支持，同新版本中的 Work（好友工作群）  |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

Private（即新版本中的 Work，好友工作群）类型不支持禁言。
:::

使用示例：

```java
List<String> membersAccount = Collections.singletonList("doocs");
ForbidSendMsgRequest request = ForbidSendMsgRequest.builder()
        .groupId("MyFirstGroup")
        .membersAccount(membersAccount)
        .muteTime(200L)
        .build();

ForbidSendMsgResult result = client.group.forbidSendMsg(request);
```

## 获取被禁言群成员列表

App 管理员可以根据群组 ID 获取群组中被禁言的用户列表。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupMutedAccountRequest request = new GetGroupMutedAccountRequest("MyFirstGroup");

GetGroupMutedAccountResult result = client.group.getGroupMutedAccount(request);
```

## 在群组中发送普通消息

App 管理员可以通过该接口在群组中发送普通消息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("red packet");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
SendGroupMsgRequest request = SendGroupMsgRequest.builder()
        .groupId("MyFirstGroup")
        .random(1314)
        .msgBody(msgBody)
        .onlineOnlyFlag(OnlineOnlyFlag.YES)
        .build();

SendGroupMsgResult result = client.group.sendGroupMsg(request);
```

## 在群组中发送系统通知

App 管理员可以通过该接口在群组中发送系统通知。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持，仅支持面向全员                     |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

- 非直播群支持向群组中的一部分指定成员发送系统通知，而 AVChatRoom（直播群）只支持向群组中所有成员发送系统通知。
- 客户端接收系统通知接口（V2TIMGroupListener.onReceiveRESTCustomData）请参见 [Android](https://im.sdk.qcloud.com/doc/zh-cn/classcom_1_1tencent_1_1imsdk_1_1v2_1_1V2TIMGroupListener.html#a0775a137d293473aaed4cf9fc4c18795)、[iOS](https://im.sdk.qcloud.com/doc/zh-cn/protocolV2TIMGroupListener-p.html#a34108da2661d1b5ff68d1458ac4dd163) 。
  :::

使用示例：

```java
List<String> toMembersAccount = Collections.singletonList("doocs");
SendGroupSystemNotificationRequest request = SendGroupSystemNotificationRequest.builder()
        .groupId("MyFirstGroup")
        .content("hello world")
        .toMembersAccount(toMembersAccount)
        .build();

SendGroupSystemNotificationResult result = client.group.sendGroupSystemNotification(request);
```

## 转让群主

- App 管理员可以通过该接口将群主身份转移给他人。
- 没有群主的群，App 管理员可以通过此接口指定他人作为群主。
- 新群主必须为群内成员。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持（见说明）                         |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不支持转让群主，对该类型的群组进行操作时会返回 10007 错误。
:::

使用示例：

```java
ChangeGroupOwnerRequest request = ChangeGroupOwnerRequest.builder()
        .groupId("MyFirstGroup")
        .newOwnerAccount("doocs")
        .build();

ChangeGroupOwnerResult result = client.group.changeGroupOwner(request);
```

## 撤回群消息

App 管理员通过该接口撤回指定群组的消息，消息需要在漫游有效期以内。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
List<MsgSeqItem> msgSeqList = Collections.singletonList(new MsgSeqItem(0L));
GroupMsgRecallRequest request = GroupMsgRecallRequest.builder()
        .groupId("MyFirstGroup")
        .msgSeqList(msgSeqList)
        .build();

GroupMsgRecallResult result = client.group.groupMsgRecall(request);
```

## 导入群基础资料

App 管理员可以通过该接口导入群组，不会触发回调、不会下发通知；
当 App 需要从其他即时通信系统迁移到即时通信 IM 时，使用该协议导入存量群组数据。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不支持导入群基础资料，对此类型的群组进行操作时会返回 10007 错误；如果需要达到导入群组基础资料的效果，可以通过 [创建群组](#创建群组) 和 [修改群基础资料](#修改群基础资料) 的方式实现。
:::

使用示例：

```java
ImportGroupRequest request = ImportGroupRequest.builder()
        .type(GroupType.PUBLIC)
        .name("groupName")
        .build();

ImportGroupResult result = client.group.importGroup(request);
```

## 导入群消息

- 该 API 接口的作用是导入群组的消息，不会触发回调、不会下发通知。
- 当 App 需要从其他即时通信系统迁移到即时通信 IM 时，使用该协议导入存量群消息数据。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）不支持导入群消息，对此类型的群组进行操作时会返回 10007 错误；因为此类型群组所适用的场景不支持查看入群前的历史消息，所以没有提供这一功能。
:::

使用示例：

```java
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
```

## 导入群成员

- 该 API 接口的作用是导入群组成员，不会触发回调、不会下发通知。
- 当 App 需要从其他即时通信系统迁移到即时通信 IM 时，使用该协议导入存量群成员数据。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom（直播群）所适用的场景一般不需要导入成员，因此不支持导入群成员功能，对此类型的群组进行操作时会返回 10007 错误。
:::

使用示例：

```java
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
```

## 设置成员未读消息计数

- App 管理员使用该接口设置群组成员未读消息数，不会触发回调、不会下发通知。
- 当 App 需要从其他即时通信系统迁移到即时通信 IM 时，使用该协议设置群成员的未读消息计数。

::: tip
该文档仅限迁移用户使用，线上用户不能使用。

适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 支持，同新版本中的 Work（好友工作群）      |
| Public            | 支持                                       |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                     |
| Community（社群） | 支持                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

ChatRoom 和 AVChatroom（直播群）的客户端不支持未读消息计数，所以对这两种类型的群组成员设置未读消息计数是无效的（但是不会返回错误）。
:::

使用示例：

```java
SetUnreadMsgNumRequest result = SetUnreadMsgNumRequest.builder()
        .groupId("MyFirstGroup")
        .memberAccount("doocs")
        .unreadMsgNum(1)
        .build();

SetUnreadMsgNumResult result = client.group.setUnreadMsgNum(request);
```

## 删除指定用户发送的消息

该 API 接口的作用是撤回最近 1000 条消息中指定用户发送的消息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

- AVChatRoom（直播群）不支持历史消息存储（此处撤回消息指撤回历史消息存储中的消息），对这此类型群组中的用户撤回消息是无效的（但是不会返回错误）。
- 该接口目前只支持静默撤回，在服务端对该消息打上撤回标记，并不会通知到客户端，只有拉漫游时才知道该消息被撤回。
  :::

使用示例：

```java
DeleteGroupMsgBySenderRequest request = DeleteGroupMsgBySenderRequest.builder()
        .groupId("MyFirstGroup")
        .senderAccount("doocs")
        .build();

DeleteGroupMsgBySenderResult result = client.group.deleteGroupMsgBySender(request);
```

## 拉取群历史消息

App 管理员可以通过该接口拉取群组的历史消息。

背景说明：

- 即时通信 IM 的群消息是按 Seq 排序的，按照 server 收到群消息的顺序分配 Seq，先发的群消息 Seq 小，后发的 Seq 大。
- 如果用户想拉取一个群的全量消息，首次拉取时不用填拉取 Seq，Server 会自动返回最新的消息，以后拉取时拉取 Seq 填上次返回的最小 Seq 减 1。
- 如果返回消息的 IsPlaceMsg 为 1，表示这个 Seq 的消息或者过期、或者存储失败、或者被删除了。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                      |
| ----------------- | ---------------------------------------- |
| Private           | 支持，同新版本中的 Work（好友工作群）    |
| Public            | 支持                                     |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 不支持                                   |
| Community（社群） | 支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。

AVChatRoom(直播群) 不支持历史消息存储，所以不支持调用此接口。
:::

使用示例：

```java
GroupMsgGetSimpleRequest request = GroupMsgGetSimpleRequest.builder()
        .groupId("MyFirstGroup")
        .reqMsgNumber(1)
        .reqMsgNumber(20)
        .build();

GroupMsgGetSimpleResult result = client.group.groupMsgGetSimple(request);
```

## 获取直播群在线人数

App 管理员可以根据群组 ID 获取直播群在线人数。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                          |
| ----------------- | -------------------------------------------- |
| Private           | 不支持，同新版本中的 Work（好友工作群）      |
| Public            | 不支持                                       |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持                                         |
| Community（社群） | 不支持                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

::: warning

- 在线人数总体更新粒度为 10s。
- 当群人数大于等于 300 或群内有 Web 端用户的时候，出现群成员上下线或者进退群的时候，由于当前 10s 周期内已经统计了用户在线状态的原因，会在下一个 10s 周期才会统计到剔除状态用户变更的在线人数，所以会出现调用接口 10s - 20s 才会更新的现象。
- 当群人数小于 300 人且群内没有 Web 端用户的时候，用户进退群会触发即时更新在线人数。
  :::

使用示例：

```java
GetOnlineMemberNumRequest request = new GetOnlineMemberNumRequest("MyFirstAVChatRoom");

GetOnlineMemberNumResult result = client.group.getOnlineMemberNum(request);
```

## 获取直播群在线列表

App 管理员可以根据群组 ID 获取直播群在线列表。

适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                          |
| ----------------- | -------------------------------------------- |
| Private           | 不支持，同新版本中的 Work（好友工作群）      |
| Public            | 不支持                                       |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持                                         |
| Community（社群） | 不支持                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

::: warning

- 此功能需 [旗舰版套餐](https://buy.cloud.tencent.com/avc?from=17473)，并且已开通“直播群在线成员列表”功能(控制台“群功能配置”)。
- 在线列表总体更新粒度为 10s。
- 当直播群中超过 1000 人时，接口仅返回最新进群并且在线的 1000 人。
- 当群人数大于等于 300 或群内有 Web 端用户的时候，出现群成员上下线或者进退群的时候，由于当前 10s 周期内已经统计了用户在线状态的原因，会在下一个 10s 周期才会统计到剔除状态用户变更的在线人数，所以会出现调用接口 10s - 20s 才会更新的现象。
- 当群人数小于 300 人且群内没有 Web 端用户的时候，用户进退群会触发即时更新在线人数。
  :::

使用示例：

```java
GetMembersRequest request = GetMembersRequest.builder()
        .groupId("MyFirstGroup")
        .timestamp(0)
        .build();

GetMembersResult result = client.group.getMembers(request);
```

## 设置直播群成员标记

App 管理员和群主可以对直播群成员设置不同的标记以区分不同类型的群成员。该功能需旗舰版，并且在 IM 控制台“群功能配置”中开通“直播群在线成员列表”功能。其他套餐版本调用该 API 将返回失败。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                          |
| ----------------- | -------------------------------------------- |
| Private           | 不支持，同新版本中的 Work（好友工作群）      |
| Public            | 不支持                                       |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持                                         |
| Community（社群） | 不支持                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
ModifyGroupUserInfoRequest request = new ModifyGroupUserInfoRequest();
request.setCommandType(1);
GroupMemberItem item = new GroupMemberItem();
item.setMarks(Arrays.asList(1001, 1002));
item.setMemberAccount("test1");
request.setMemberList(Collections.singletonList(item));
request.setGroupId("MyFirstGroup");

ModifyGroupUserInfoResult result = client.group.modifyGroupUserInfo(request);
```

## 获取群自定义属性

App 管理员可以通过该接口获取群自定义属性。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 支持，同新版本中的 Work（好友工作群）      |
| Public            | 支持                                       |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持                                       |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupAttrRequest request = new GetGroupAttrRequest("MyFirstGroup");

GetGroupAttrResult result = client.group.getGroupAttr(request);
```

## 修改群自定义属性

App 管理员可以通过该接口修改群自定义属性。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 支持，同新版本中的 Work（好友工作群）      |
| Public            | 支持                                       |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持                                       |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GroupAttr groupAttr = new GroupAttr();
groupAttr.setKey("isOpen");
groupAttr.setValue("yes");
List<GroupAttr> groupAttrs = Collections.singletonList(groupAttr);
ModifyGroupAttrRequest request = ModifyGroupAttrRequest.builder()
        .groupId("MyFirstGroup")
        .groupAttrs(groupAttrs)
        .build();

ModifyGroupAttrResult result = client.group.modifyGroupAttr(request);
```

## 清空群自定义属性

App 管理员可以通过该接口清空群自定义属性。

::: tip
适用的群组类型

| 群组类型 ID | 是否支持此 REST API                        |
| ----------- | ------------------------------------------ |
| Private     | 支持，同新版本中的 Work（好友工作群）      |
| Public      | 支持                                       |
| ChatRoom    | 支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom  | 支持                                       |
| Community   | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
ClearGroupAttrRequest request = new ClearGroupAttrRequest("MyFirstGroup");

ClearGroupAttrResult result = client.group.clearGroupAttr(request);
```

## 重置群自定义属性

App 管理员可以通过该接口重置群自定义属性。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API |
| ----------------- | ------------------- |
| Private           | 支持                |
| Public            | 支持                |
| ChatRoom          | 支持                |
| AVChatRoom        | 支持                |
| Community（社群） | 不支持              |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
SetGroupAttrRequest request = new SetGroupAttrRequest();
request.setGroupId("MyFirstGroup");
GroupAttr groupAttr = new GroupAttr();
groupAttr.setKey("isOpen");
groupAttr.setValue("yes");
List<GroupAttr> groupAttrs = Collections.singletonList(groupAttr);
request.setGroupAttrs(groupAttrs);

SetGroupAttrResult result = client.group.setGroupAttr(request);
```

## 修改群聊历史消息

- 管理员修改群聊历史消息
- 可以单独修改消息中的 MsgBody 或 CloudCustomData 字段，也可以同时修改这两个字段。以请求中指定的字段值覆盖历史消息对应的字段。
- 不支持修改直播群的历史消息

::: warning
使用该接口修改消息后，被修改的消息不能恢复，请谨慎调用该接口。
:::

使用示例：

```java
ModifyGroupMsgRequest request = new ModifyGroupMsgRequest();
request.setGroupId("MyFirstGroup");
request.setMsgSeq(123L);
TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
request.setMsgBody(msgBody);
request.setMsgBody(msgBody);

ModifyGroupMsgResult result = client.group.modifyGroupMsg(request);
```

## 直播群广播消息

App 管理员可以通过该接口向所有直播群下发广播消息。

::: warning
直播群广播消息功能支持需要终端 SDK 6.5.2803 增强版及以上版本、Web SDK v2.21.0 及以上版本，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182) 并在 [控制台](https://console.cloud.tencent.com/im/qun-setting)>群功能配置>群功能配置>直播群广播消息 打开开关后方可使用。
:::

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                          |
| ----------------- | -------------------------------------------- |
| Private           | 不支持，同新版本中的 Work（好友工作群）      |
| Public            | 不支持                                       |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 支持，发给所有直播群                         |
| Community（社群） | 不支持                                       |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
SendBroadcastMsgRequest request = new SendBroadcastMsgRequest();
request.setFromAccount("test1");
TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
request.setMsgBody(msgBody);
request.setRandom(1223L);

SendBroadcastMsgResult result = client.group.sendBroadcastMsg(request);
```

## 拉取群消息已读回执信息

App 管理员可以通过该接口拉取群消息已读回执信息。

::: warning
该功能仅对旗舰版客户开放，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182) 并在 [控制台](https://console.cloud.tencent.com/im/qun-setting)>登录与消息>群消息已读回执 打开开关后方可使用。
:::

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 支持，同新版本中的 Work(好友工作群)        |
| Public            | 支持                                       |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 不支持                                     |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupMsgReceiptRequest request = new GetGroupMsgReceiptRequest();
request.setGroupId("MyFirstGroup");
MsgSeqItem seqItem = new MsgSeqItem();
seqItem.setMsgSeq(123L);
request.setMsgSeqList(Collections.singletonList(seqItem));

GetGroupMsgReceiptResult result = client.group.getGroupMsgReceipt(request);
```

## 拉取群消息已读回执详情

App 管理员可以通过该接口拉取群消息已读或未读成员列表。

::: warning
该功能仅对旗舰版客户开放，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182) 并在 [控制台](https://console.cloud.tencent.com/im/qun-setting)>登录与消息>群消息已读回执 打开开关后方可使用。
:::

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 支持，同新版本中的 Work(好友工作群)        |
| Public            | 支持                                       |
| ChatRoom          | 支持，同新版本中的 Meeting（临时会议群）） |
| AVChatRoom        | 不支持                                     |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupMsgReceiptDetailRequest request = new GetGroupMsgReceiptDetailRequest();
request.setGroupId("MyFirstGroup");
request.setMsgSeq(123L);
request.setNum(12);
request.setCursor("");
request.setFlag(12);

GetGroupMsgReceiptDetailResult result = client.group.getGroupMsgReceiptDetail(request);
```

## 创建话题

App 管理员可以通过该接口创建话题。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API            |
| ----------------- | ------------------------------ |
| Private           | 不支持                         |
| Public            | 不支持                         |
| ChatRoom          | 不支持                         |
| AVChatRoom        | 不支持                         |
| Community（社群） | 只有支持话题的社群才适用此 API |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
CreateGroupTopicRequest request = new CreateGroupTopicRequest();
request.setGroupId("MyFirstGroup");
request.setTopicName("test");
request.setFaceUrl("");

CreateGroupTopicResult result = client.group.createGroupTopic(request);
```

## 获取话题资料

App 管理员可以通过该接口获取话题资料。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API            |
| ----------------- | ------------------------------ |
| Private           | 不支持                         |
| Public            | 不支持                         |
| ChatRoom          | 不支持                         |
| AVChatRoom        | 不支持                         |
| Community（社群） | 只有支持话题的社群才适用此 API |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupTopicRequest request = new GetGroupTopicRequest();
request.setGroupId("MyFirstGroup");
request.setFromAccount("1400187352");

GetGroupTopicResult result = client.group.getGroupTopic(request);
```

## 修改话题资料

App 管理员可以通过该接口修改话题资料。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API            |
| ----------------- | ------------------------------ |
| Private           | 不支持                         |
| Public            | 不支持                         |
| ChatRoom          | 不支持                         |
| AVChatRoom        | 不支持                         |
| Community（社群） | 只有支持话题的社群才适用此 API |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
ModifyGroupTopicRequest request = new ModifyGroupTopicRequest();
request.setGroupId("MyFirstGroup");
request.setTopicName("test");
request.setFaceUrl("");

ModifyGroupTopicResult result = client.group.modifyGroupTopic(request);
```

## 导入话题基础资料

App 管理员可以通过该接口导入话题，不会触发回调、不会下发通知；当 App 需要从其他即时通信系统迁移到即时通信 IM 时，使用该协议导入存量话题数据。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API            |
| ----------------- | ------------------------------ |
| Private           | 不支持                         |
| Public            | 不支持                         |
| ChatRoom          | 不支持                         |
| AVChatRoom        | 不支持                         |
| Community（社群） | 只有支持话题的社群才适用此 API |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
ImportGroupTopicRequest request = new ImportGroupTopicRequest();
request.setGroupId("MyFirstGroup");
request.setTopicName("test");
request.setFromAccount("123");

ImportGroupTopicResult result = client.group.importGroupTopic(request);
```

## 解散话题

App 管理员可以通过该接口解散话题。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API            |
| ----------------- | ------------------------------ |
| Private           | 不支持                         |
| Public            | 不支持                         |
| ChatRoom          | 不支持                         |
| AVChatRoom        | 不支持                         |
| Community（社群） | 只有支持话题的社群才适用此 API |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
DestroyGroupTopicRequest request = new DestroyGroupTopicRequest();
request.setGroupId("MyFirstGroup");

DestroyGroupTopicResult result = client.group.destroyGroupTopic(request);
```

## 获取封禁群成员列表

App 管理员可以通过该接口获取对应直播群的封禁成员列表。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 不支持，同新版本中的 Work（好友工作群）    |
| Public            | 不支持                                     |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                       |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
GetGroupBanMemberRequest request = new GetGroupBanMemberRequest();
request.setGroupId("MyFirstGroup");
request.setLimit(10);
request.setOffset(0);

GetGroupBanMemberResult result = client.group.getGroupBanMember(request);
```

## 群成员封禁

App 管理员可以通过该接口向直播群封禁成员，封禁后成员无法接收消息，并且封禁时间内无法再次进群。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 不支持，同新版本中的 Work（好友工作群）    |
| Public            | 不支持                                     |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                       |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
BanGroupMemberRequest request = new BanGroupMemberRequest();
request.setGroupId("MyFirstGroup");
request.setDuration(1000L);
request.setMembersAccount(Arrays.asList("test1", "bingo"));
request.setDescription("test");

BanGroupMemberResult result = client.group.banGroupMember(request);
```

## 群成员解封

App 管理员可以通过该接口向直播群解封成员，解封后，之前封禁的成员可重新进群获取消息。

::: tip
适用的群组类型

| 群组类型 ID       | 是否支持此 REST API                        |
| ----------------- | ------------------------------------------ |
| Private           | 不支持，同新版本中的 Work（好友工作群）    |
| Public            | 不支持                                     |
| ChatRoom          | 不支持，同新版本中的 Meeting（临时会议群） |
| AVChatRoom        | 支持                                       |
| Community（社群） | 不支持                                     |

即时通信 IM 内置上述群组类型，详情介绍请参见 [群组系统](https://cloud.tencent.com/document/product/269/1502)。
:::

使用示例：

```java
UnbanGroupMemberRequest request = new UnbanGroupMemberRequest();
request.setGroupId("MyFirstGroup");
request.setMembersAccount(Arrays.asList("test1", "bingo"));

UnbanGroupMemberResult result = client.group.unbanGroupMember(request);
```

## 拉取群消息扩展

App 管理员和群成员可以拉取消息扩展，消息扩展为一组自定义的键值对。

::: warning

- 此功能需 旗舰版套餐，并且已开通“消息扩展功能”功能(控制台“登录与消息”配置)。
- 单条群消息可设置的最大键值对数量为 300 条。
- 被设置的群消息需要在发送时指定“支持消息扩展”，参见 [在群组中发送普通消息](#在群组中发送普通消息)。
  :::

使用示例：

```java
GroupGetKeyValuesRequest request = GroupGetKeyValuesRequest.builder()
        .groupId("MyFirstGroup")
        .msgSeq(1L)
        .build();

GroupGetKeyValuesResult result = client.group.groupGetKeyValues(request);
```

## 设置群消息扩展

App 管理员和群成员可以为群聊普通消息设置消息扩展，消息扩展为一组自定义的键值对。

::: warning

- 此功能需 旗舰版套餐，并且已开通“消息扩展功能”功能(控制台“登录与消息”配置)。
- 单条群消息可设置的最大键值对数量为 300 条。
- 被设置的群消息需要在发送时指定“支持消息扩展”，参见 [在群组中发送普通消息](#在群组中发送普通消息)。
  :::

使用示例：

```java
GroupSetKeyValuesRequest request = GroupSetKeyValuesRequest.builder()
        .groupId("MyFirstGroup")
        .msgSeq(1L)
        .extensionList(Collections.singletonList(KeyValueSeq.builder()
                .key("test")
                .value("test")
                .build()))
        .build();

GroupSetKeyValuesResult result = client.group.groupSetKeyValues(request);
```

## 获取群计数器

App 管理员可以通过该接口获取群计数器。

::: warning

- 该功能仅对旗舰版客户开放，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182)。
  :::

使用示例：

```java
GetGroupCounterRequest request = GetGroupCounterRequest.builder()
        .groupId("MyFirstGroup")
        .build();

GetGroupCounterResult result = client.group.getGroupCounter(request);
```

## 更新群计数器

App 管理员可以通过该接口更新（设置、递增、递减）群计数器。

::: warning

- 该功能仅对旗舰版客户开放，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182)。
  :::

使用示例：

```java
List<GroupCounterItem> groupCounter = new ArrayList<>();
GroupCounterItem item = new GroupCounterItem();
item.setKey("x");
item.setValue(1L);
groupCounter.add(item);
UpdateGroupCounterRequest request = UpdateGroupCounterRequest.builder()
        .groupId("MyFirstGroup")
        .groupCounter(groupCounter)
        .mode(GroupCounterMode.SET)
        .build();

UpdateGroupCounterResult result = client.group.updateGroupCounter(request);
```

## 删除群计数器

App 管理员可以通过该接口删除群计数器。

::: warning

- 该功能仅对旗舰版客户开放，需 [购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17182)。
  :::

使用示例：

```java
DeleteGroupCounterRequest request = DeleteGroupCounterRequest.builder()
        .groupId("MyFirstGroup")
        .build();

DeleteGroupCounterResult result = client.group.deleteGroupCounter(request);
```

## 设置/取消直播群管理员

App 管理员可以为直播群设置和取消管理员，当设置管理员时，被设置的账号可以不需要在直播群里，被设置为管理员之后，该账号即使离开直播群再重新进群也仍然是管理员。需要取消管理员身份时，需要调用本接口取消该用户的管理员身份。该功能需旗舰版，并且在 IM 控制台“群功能配置”中开通“直播群在线成员列表”功能。

使用示例：

```java
ModifyAdminRequest request = ModifyAdminRequest.builder()
        .groupId("MyFirstGroup")
        .commandType(1)
        .adminAccount(Arrays.asList("test1", "bingo"))
        .build();

ModifyAdminResult result = client.group.modifyAdmin(request);
```

## 获取直播群管理员列表

App 管理员可以根据群组 ID 获取直播群管理员列表。该功能仅限旗舰版用户在 IM 控制台“群功能配置”中开启“直播群在线成员列表”后方可使用。

使用示例：

```java
GetAdminListRequest request = GetAdminListRequest.builder()
        .groupId("MyFirstGroup")
        .build();

GetAdminListResult result = client.group.getAdminList(request);
```

## 查询用户是否在直播群内

App 管理员可以根据群组 ID 查询一批用户是否在直播群内。该功能需旗舰版，并且在 IM 控制台“群功能配置”中开通“直播群在线成员列表”功能。

使用示例：

```java
CheckMembersRequest request = CheckMembersRequest.builder()
        .groupId("MyFirstGroup")
        .memberAccount(Arrays.asList("test1", "bingo"))
        .build();

CheckMembersResult result = client.group.checkMembers(request);
```