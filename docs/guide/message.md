# 单聊消息

## 单发单聊消息

- 管理员向帐号发消息，接收方看到消息发送者是管理员。
- 管理员指定某一帐号向其他帐号发消息，接收方看到发送者不是管理员，而是管理员指定的帐号。
- 该接口不会检查发送者和接收者的好友关系（包括黑名单），同时不会检查接收者是否被禁言。
- 该接口默认不会检查接收者对发送者是否设置了免打扰，如需检查，请在"SendMsgControl"字段填上"WithMuteNotifications"。
- 单聊消息 MsgSeq 字段的作用及说明：该字段在发送消息时由用户自行指定，该值可以重复，非后台生成，非全局唯一。与群聊消息的 MsgSeq 字段不同，群聊消息的 MsgSeq 由后台生成，每个群都维护一个 MsgSeq，从 1 开始严格递增。单聊消息历史记录对同一个会话的消息先以时间戳排序，同秒内的消息再以 MsgSeq 排序。

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
SendMsgRequest request = SendMsgRequest.builder()
        .fromAccount("test1")
        .toAccount("test2")
        .msgRandom(123L)
        .msgBody(msgBody)
        .syncOtherMachine(SyncOtherMachine.YES)
        .msgTimeStamp(1631934058)
        .msgLifeTime(604800)
        .build();

SendMsgResult result = client.message.sendMsg(request);
```

## 批量发单聊消息

- 支持一次对最多 500 个用户进行单发消息。
- 与单发消息相比，该接口更适用于营销类消息、系统通知 tips 等时效性较强的消息。
- 若消息不需要计入未读数，也不需要存储聊天记录，则可将 MsgLifeTime 字段设置为 0，这样可以带来更快的消息下发速度。
- 管理员指定某一帐号向目标帐号批量发消息，接收方看到发送者不是管理员，而是管理员指定的帐号。
- 该接口不触发回调请求。
- 该接口不会检查发送者和接收者的好友关系（包括黑名单），同时不会检查接收者是否被禁言。
- 该接口默认不会检查接收者对发送者是否设置了免打扰，如需检查，请在"SendMsgControl"字段填上"WithMuteNotifications"。
- 单聊消息 MsgSeq 字段的作用及说明：该字段在发送消息时由用户自行指定，该值可以重复，非后台生成，非全局唯一。与群聊消息的 MsgSeq 字段不同，群聊消息的 MsgSeq 由后台生成，每个群都维护一个 MsgSeq，从 1 开始严格递增。单聊消息历史记录对同一个会话的消息先以时间戳排序，同秒内的消息再以 MsgSeq 排序。

使用示例：

```java
List<String> toAccount = Arrays.asList("test1", "test2");
TIMTextMsgElement msg = new TIMTextMsgElement("hi bingo");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
BatchSendMsgRequest request = BatchSendMsgRequest
        .builder()
        .toAccount(toAccount)
        .msgRandom(123L)
        .msgBody(msgBody)
        .syncOtherMachine(SyncOtherMachine.NO)
        .msgSeq(28460L)
        .build();

BatchSendMsgResult result = client.message.batchSendMsg(request);
```

## 导入单聊消息

- 导入历史单聊消息到即时通信 IM。
- 平滑过渡期间，将原有即时通信实时单聊消息导入到即时通信 IM。
- 该接口会更新会话。
- 该接口不会触发回调。
- 对于同一个单聊会话的消息，该接口会根据 MsgSeq ， MsgRandom ， MsgTimeStamp 字段的值对导入的消息进行去重。**仅当这三个字段的值都对应相同时，才判定消息是重复的，消息是否重复与消息内容本身无关。** 另外，若两条消息的 MsgSeq ， MsgRandom ， MsgTimeStamp 字段对应相同，而 from_account 和 to_account 相反，则这两条消息也认为是重复的。
- 重复导入的消息不会覆盖之前已导入的消息（即消息内容以首次导入的为准）。
- 单聊消息 MsgSeq 字段的作用及说明：该字段在发送消息时由用户自行指定，该值可以重复，非后台生成，非全局唯一。与群聊消息的 MsgSeq 字段不同，群聊消息的 MsgSeq 由后台生成，每个群都维护一个 MsgSeq，从 1 开始严格递增。单聊消息历史记录对同一个会话的消息先以时间戳排序，同秒内的消息再以 MsgSeq 排序。

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("hello bingo");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
ImportMsgRequest request = ImportMsgRequest.builder()
        .fromAccount("bingo")
        .toAccount("test1")
        .msgRandom(122L)
        .msgTimeStamp(1557387418)
        .msgBody(msgBody)
        .build();

ImportMsgResult result = client.message.importMsg(request);
```

## 查询单聊消息

- 管理员按照时间范围查询某单聊会话的消息记录。
- 查询的单聊会话由请求中的 From_Account 和 To_Account 指定。查询结果包含会话双方互相发送的消息，具体每条消息的发送方和接收方由每条消息里的 From_Account 和 To_Account 指定。
- 一般情况下，请求中的 From_Account 和 To_Account 字段值互换，查询结果不变。但通过 [单发单聊消息](#单发单聊消息) 或 [批量发单聊消息](#批量发单聊消息) 接口发送的消息，如果指定 SyncOtherMachine 值为 2，则需要指定正确的 From_Account 和 To_Account 字段值才能查询到该消息。
  例如，通过 [单发单聊消息](#单发单聊消息) 接口指定帐号 A 给帐号 B 发一条消息，同时指定 SyncOtherMachine 值为 2。则调用本接口时，From_Account 必须设置为帐号 B，To_Account 必须设置为帐号 A 才能查询到该消息。
- 查询结果包含被撤回的消息，由消息里的 MsgFlagBits 字段标识。
- 若想通过 [撤回单聊消息](#撤回单聊消息) 接口撤回某条消息，可先用本接口查询出该消息的 MsgKey，然后再调用撤回接口进行撤回。
- 可查询的消息记录的时间范围取决于漫游消息存储时长，默认是 7 天。支持在控制台修改消息漫游时长，延长消息漫游时长是增值服务。具体请参考 [漫游消息存储](https://cloud.tencent.com/document/product/269/3571#.E6.BC.AB.E6.B8.B8.E6.B6.88.E6.81.AF.E5.AD.98.E5.82.A8)。
- 若请求时间段内的消息总大小超过应答包体大小限制（目前为 13K）时，则需要续拉。您可以通过应答中的 Complete 字段查看是否已拉取请求的全部消息。

使用示例：

```java
AdminGetRoamMsgRequest request = AdminGetRoamMsgRequest.builder()
        .fromAccount("test1")
        .toAccount("test2")
        .maxCnt(123)
        .minTime(1631934000)
        .maxTime(1631934060)
        .build();

AdminRoamMsgResult result = client.message.getRoamMsg(request);

List<MsgListItem> msgList = result.getMsgList();
if (msgList != null && msgList.size() > 0) {
    for (MsgListItem item : msgList) {
        List<TIMMsgElement> msgBody = item.getMsgBody();
        if (msgBody != null && msgList.size() > 0) {
            for (TIMMsgElement msgElement : msgBody) {
                // 根据 msgType 强转为对应的子类
                if (Objects.equals(msgElement.getMsgType(), MsgType.TIM_CUSTOM_ELEM)) {
                    TIMCustomMsgElement t = (TIMCustomMsgElement) msgElement;
                    System.out.println(t.getMsgContent().getDesc());
                } else if (Objects.equals(msgElement.getMsgType(), MsgType.TIM_TEXT_ELEM)) {
                    TIMTextMsgElement t = (TIMTextMsgElement) msgElement;
                    System.out.println(t.getMsgContent().getText());
                }
            }
        }
    }
}
```

## 撤回单聊消息

- 管理员撤回单聊消息。
- 该接口可以撤回所有单聊消息，包括客户端发出的单聊消息，由 [单发](#单发单聊消息) 和 [批量发](#批量发单聊消息) 接口发出的单聊消息。
- 若需要撤回由客户端发出的单聊消息，您可以开通 [发单聊消息之前回调](https://cloud.tencent.com/document/product/269/38980) 或 [发单聊消息之后回调](https://cloud.tencent.com/document/product/269/38980) ，通过该回调接口记录每条单聊消息的 MsgKey ，然后填在本接口的 MsgKey 字段进行撤回。您也可以通过 [查询单聊消息](#查询单聊消息) 查询出待撤回的单聊消息的 MsgKey 后，填在本接口的 MsgKey 字段进行撤回。
- 若需要撤回由 [单发](#单发单聊消息) 和 [批量发](#批量发单聊消息) 接口发出的单聊消息，需要记录这些接口回包里的 MsgKey 字段以进行撤回。
- 调用该接口撤回消息后，该条消息的离线、漫游存储，以及消息发送方和接收方的客户端的本地缓存都会被撤回。
- 该接口可撤回的单聊消息没有时间限制，即可以撤回任何时间的单聊消息。

::: warning

使用该接口撤回单聊消息后，被撤回的消息不能恢复，请谨慎调用该接口。
:::

使用示例：

```java
AdminMsgWithdrawRequest request = AdminMsgWithdrawRequest.builder()
        .fromAccount("test1")
        .toAccount("bingo")
        .msgKey("31906_833502_1572869830")
        .build();

AdminMsgWithdrawResult result = client.message.msgWithdraw(request);
```

## 设置单聊消息已读

- 设置用户的某个单聊会话的消息已读。

使用示例：

```java
AdminSetMsgReadRequest request = AdminSetMsgReadRequest.builder()
        .reportAccount("test1")
        .peerAccount("test2")
        .build();

AdminSetMsgReadResult result = client.message.setMsgRead(request);
```

## 查询单聊未读消息计数

App 后台可以通过该接口查询特定帐号的单聊总未读数（包含所有的单聊会话）或者单个单聊会话的未读数。

使用示例：

```java
GetC2cUnreadMsgRequest request = new GetC2cUnreadMsgRequest("test2");
List<String> peerAccount = Arrays.asList("test1", "bingo");
request.setPeerAccount(peerAccount);

C2cUnreadMsgNumResult result = client.message.getC2cUnreadMsgNum(request);
```

## 修改单聊历史消息

- 管理员修改单聊历史消息。
- 可以单独修改消息中的 MsgBody 或 CloudCustomData 字段，也可以同时修改这两个字段。以请求中指定的字段值覆盖历史消息对应的字段。
- 待修改的单聊消息的 MsgKey 可通过以下方式获取：
  - 开启 [发单聊消息之前回调](https://cloud.tencent.com/document/product/269/1632) 或 [发单聊消息之后回调](https://cloud.tencent.com/document/product/269/2716)，通过该回调接口记录每条单聊消息的 MsgKey。
  - 通过 [查询单聊消息](#查询单聊消息) 查询出待修改的单聊消息的 MsgKey。
  - 通过 REST API [单发单聊消息](#单发单聊消息) 和 [批量发单聊消息](#批量发单聊消息) 接口发出的单聊消息，回包里会返回消息的 MsgKey。

::: warning

使用该接口修改消息后，被修改的消息不能恢复，请谨慎调用该接口。
:::

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("test modify c2c msg");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
ModifyC2cMsgRequest request = ModifyC2cMsgRequest.builder()
        .fromAccount("test1")
        .toAccount("test2")
        .msgKey("1353691732_123_1653995506")
        .msgBody(msgBody)
        .build();

ModifyC2cMsgResult result = client.message.modifyC2cMsg(request);
```

## 拉取单聊消息扩展

App 管理员和会话成员可以拉取消息扩展，消息扩展为一组自定义的键值对。

::: warning
- 此功能需 旗舰版套餐，并且已开通“消息扩展功能”功能(控制台“登录与消息”配置)。
- 单条单聊消息可设置的最大键值对数量为300条。
- 被设置的单聊消息需要在发送时指定“支持消息扩展”，参见 [单发单聊消息](#单发单聊消息)。
:::

使用示例：

```java
GetKeyValuesRequest request = GetKeyValuesRequest.builder()
        .fromAccount("test1")
        .toAccount("bingo")
        .msgKey("1353691732_123_1653995506")
        .startSeq(1L)
        .build();

GetKeyValuesResult result = client.message.getKeyValues(request);
```

## 设置单聊消息扩展

App 管理员和会话成员可以为单聊普通消息设置消息扩展，消息扩展为一组自定义的键值对。

::: warning
- 此功能需 旗舰版套餐，并且已开通“消息扩展功能”功能(控制台“登录与消息”配置)。
- 单条单聊消息可设置的最大键值对数量为300条。
- 被设置的单聊消息需要在发送时指定“支持消息扩展”，参见 [单发单聊消息](#单发单聊消息)。
:::

使用示例：

```java
SetKeyValuesRequest request = SetKeyValuesRequest.builder()
        .fromAccount("test1")
        .toAccount("bingo")
        .msgKey("1353691732_123_1653995506")
        .build();
        
SetKeyValuesResult result = client.message.setKeyValues(request);
```