# 公众号管理

## 创建公众号

App 管理员可以通过该接口创建公众号。

使用示例：

```java
CreateOfficialAccountRequest request = new CreateOfficialAccountRequest();
request.setOwnerAccount("test");
request.setName("test_official_account");

CreateOfficialAccountResult result = client.officialAccount.createOfficialAccount(request);
```

## 销毁公众号

App 管理员可以通过该接口销毁公众号。

使用示例：

```java
DestroyOfficialAccountRequest request = new DestroyOfficialAccountRequest();
request.setOfficialAccount("test_official_account_user_id");

DestroyOfficialAccountResult result = client.officialAccount.destroyOfficialAccount(request);
```

## 修改公众号资料

App 管理员可以通过该接口修改公众号的相关信息，如公众号的名称、头像、简介等

使用示例：

```java
ModifyOfficialAccountBaseInfoRequest request = new ModifyOfficialAccountBaseInfoRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setName("test_official_account2");

ModifyOfficialAccountBaseInfoResult result = client.officialAccount.modifyOfficialAccountBaseInfo(request);
```

## 获取公众号详细资料

App 管理员可以通过该接口获取公众号的相关资料信息。

使用示例：

```java
GetOfficialAccountInfoRequest request = new GetOfficialAccountInfoRequest();
request.setOfficialAccountIdList(Collections.singletonList(new OfficialAccountItem("test_official_account_user_id")));

GetOfficialAccountInfoResult result = client.officialAccount.getOfficialAccountInfo(request);
```

## 获取公众号的订阅成员资料

App 管理员可以通过该接口获取订阅某个公众号的所有用户信息.

使用示例：

```java
GetSubscriberInfoRequest request = new GetSubscriberInfoRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setLimit(10);
request.setNext("");

GetSubscriberInfoResult result = client.officialAccount.getSubscriberInfo(request);
```

## 添加订阅者

App 管理员可以通过该接口使用户订阅某个公众号，成为公众号的订阅成员。

使用示例：

```java
AddSubscriberRequest request = new AddSubscriberRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setSubscriberList(Collections.singletonList(new OfficialAccountItem("test_subscriber_id")));

AddSubscriberResult result = client.officialAccount.addSubscriber(request);
```

## 删除订阅者

App 管理员可以通过该接口使用户取消订阅某个公众号，从公众号的订阅成员中移除。

使用示例：

```java
DeleteSubscriberRequest request = new DeleteSubscriberRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setSubscriberToDelAccount(Collections.singletonList("test_subscriber_id"));

DeleteSubscriberResult result = client.officialAccount.deleteSubscriber(request);
```

## 修改订阅者资料

App 管理员可以通过该接口修改订阅者的相关资料信息。

使用示例：

```java
ModifySubscriberInfoRequest request = new ModifySubscriberInfoRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setSubscriberAccount("test_subscriber_id");
request.setCustomString("test_custom_string");

ModifySubscriberInfoResult result = client.officialAccount.modifySubscriberInfo(request);
```

## 获取订阅的公众号列表

App 管理员可以通过该接口获取用户订阅的所有公众号列表信息。

使用示例：

```java
GetSubscribedOfficialAccountListRequest request = new GetSubscribedOfficialAccountListRequest();
request.setSubscriberAccount("test_subscriber_id");

GetSubscribedOfficialAccountListResult result = client.officialAccount.getSubscribedOfficialAccountList(request);
```

## 公众号用户发送广播消息

- App 管理员可以通过该接口向关注公众号的所有订阅者发送普通消息。
- 单个公众号的发送频率上限为1条/秒，每小时最多可发布2条广播消息。
- 如果5分钟内两条消息的内容相同，后面的消息将被当做重复消息而丢弃。


使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
SendOfficialAccountMsgRequest request = SendOfficialAccountMsgRequest.builder()
        .officialAccount("test_official_account_user_id")
        .random(123)
        .msgBody(msgBody)
        .build();

SendOfficialAccountMsgResult result = client.officialAccount.sendOfficialAccountMsg(request);
```

## 拉取公众号用户历史消息

- 即时通信 IM 的公众号消息是按 Seq 排序的，按照 server 收到公众号消息的顺序分配 Seq，先发的公众号消息 Seq 小，后发的 Seq 大。
- 即时通信 IM 会给每条公众号消息生成一个 MsgKey，格式为 "Seq_1_ServerTime"。
- 如果用户想拉取一个公众号的全量消息，需要填写消息的 LastMsgKey，首次拉取时不用填拉取 LastMsgKey，Server 会自动返回最新的消息，以后拉取时拉取 LastMsgKey 填上次请求返回 LastMsgKey。
- 如果返回消息的 IsPlaceMsg 为1，表示这个 Seq 的消息或者过期、或者存储失败、或者被删除了。


使用示例：

```java
OfficialAccountMsgGetSimpleRequest request = new OfficialAccountMsgGetSimpleRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setLastMsgKey("msg_key");
request.setReqMsgNumber(10);
request.setWithRecalledMsg(1);

OfficialAccountMsgGetSimpleResult result = client.officialAccount.msgGetSimple(request);
```

## 撤回公众号消息

- 管理员撤回公众号消息。
- 该接口可以撤回所有漫游有效期内的公众号消息，包括客户端发出的公众号消息，由 REST API 接口发出的公众号消息。
- 若需要撤回由客户端发出的公众号消息，您可以开通 发公众号消息之后回调 ，通过该回调接口记录每条公众号消息的 MsgKey，然后填在本接口的 MsgKeyList 参数里进行撤回。您也可以通过 拉取公众号用户历史消息 查询出待撤回的公众号消息的相关信息后，使用本接口进行撤回。
- 若需要撤回由 REST API 公众号用户发送广播消息 接口发出的公众号消息，需要记录这些接口回包里的 MsgKey 字段以进行撤回。
- 调用该接口撤回消息后，该条消息的接收方的客户端的本地缓存都会被撤回。
- 该接口可撤回的公众号消息没有时间限制，即可以撤回任何时间的公众号消息，但是公众号消息的漫游时间需要在有效期内。


使用示例：

```java
OfficialAccountMsgRecallRequest request = new OfficialAccountMsgRecallRequest();
request.setOfficialAccount("test_official_account_user_id");
request.setMsgKeyList(Collections.singletonList("msg_key"));

OfficialAccountMsgRecallResult result = client.officialAccount.msgRecall(request);
```