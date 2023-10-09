# 全员推送

## 全员推送

全员推送，用户运营利器，不仅支持全员发送特定内容，还可根据标签、属性，针对特定用户群体发送个性化内容，如会员活动、区域通知等，助力拉新、转化、促活等各个阶段运营工作的有效进行。

- 支持全员推送。
- 支持按用户属性推送。
- 支持按用户标签推送。
- 管理员推送消息，接收方看到消息发送者是管理员。
- 管理员指定某一账号向其他账号推送消息，接收方看到发送者不是管理员，而是管理员指定的账号。
- 支持消息离线存储，不支持漫游。
- 由于全员推送需要下发的账号数量巨大，下发完全部账号需要一定时间（根据账号总数而定，一般在一分钟内）。
- 支持只推在线用户，需要将 MsgLifeTime 参数设置为 0。

::: tip
“全员推送”为 IM 旗舰版功能，[购买旗舰版套餐包](https://buy.cloud.tencent.com/avc?from=17489) 后可使用，详见 [价格说明](https://cloud.tencent.com/document/product/269/11673?from=17225#.E5.9F.BA.E7.A1.80.E6.9C.8D.E5.8A.A1.E8.AF.A6.E6.83.85)。
:::

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("hi, beauty");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
ImPushRequest request = ImPushRequest.builder()
        .msgRandom(9312457L)
        .msgBody(msgBody)
        .fromAccount("admin")
        .msgLifeTime(120)
        .build();

ImPushResult result = client.member.imPush(request);
```

## 设置应用属性名称

每个应用可以设置自定义的用户属性，最多可以有 10 个。通过本接口可以设置每个属性的名称，设置完成后，即可用于按用户属性推送等。

使用示例：

```java
Map<String, String> attrNames = new HashMap<>(3);
attrNames.put("0", "sex");
attrNames.put("1", "city");
attrNames.put("2", "country");
ImSetAttrNameRequest request = new ImSetAttrNameRequest(attrNames);

ImSetAttrNameResult result = client.member.imSetAttrName(request);
```

## 获取应用属性名称

管理员获取应用属性名称。使用前请先 [设置应用属性名称](#设置应用属性名称) 。

使用示例：

```java
ImGetAttrNameRequest request = new ImGetAttrNameRequest();

ImGetAttrNameResult result = client.member.imGetAttrName(request);
```

## 获取用户属性

获取用户属性（必须以管理员账号调用）；每次最多只能获取 100 个用户的属性。使用前请先 [设置应用属性名称](#设置应用属性名称) 。

使用示例：

```java
List<String> toAccount = Arrays.asList("test1", "test2");
ImGetAttrRequest request = new ImGetAttrRequest(toAccount);

ImGetAttrResult result = client.member.imGetAttr(request);
```

## 设置用户属性

管理员给用户设置属性。每次最多只能给 100 个用户设置属性。使用前请先 [设置应用属性名称](#设置应用属性名称) 。

使用示例：

```java
Map<String, Object> attrs = new HashMap<>();
attrs.put("sex", "attr1");
attrs.put("city", "attr2");
UserAttrItem item = new UserAttrItem("test1", attrs);
List<UserAttrItem> userAttrs = Collections.singletonList(item);
ImSetAttrRequest request = new ImSetAttrRequest(userAttrs);

ImSetAttrResult result = client.member.imSetAttr(request);
```

## 删除用户属性

管理员给用户删除属性。注意每次最多只能给 100 个用户删除属性。使用前请先 [设置应用属性名称](#设置应用属性名称) 。

使用示例：

```java
Map<String, Object> attrs = new HashMap<>();
attrs.put("sex", "attr1");
attrs.put("city", "attr2");
UserAttrItem item = UserAttrItem.builder()
        .toAccount("test1")
        .attrs(attrs)
        .build();
List<UserAttrItem> userAttrs = Collections.singletonList(item);
ImRemoveAttrRequest request = new ImRemoveAttrRequest(userAttrs);

ImRemoveAttrResult result = client.member.imRemoveAttr(request);
```

## 获取用户标签

获取用户标签（必须以管理员账号调用）。每次最多只能获取 100 个用户的标签。

使用示例：

```java
List<String> toAccount = Arrays.asList("test1", "test2");
ImGetTagRequest request = new ImGetTagRequest(toAccount);

ImGetTagResult result = client.member.imGetTag(request);
```

## 添加用户标签

管理员给用户添加标签。

::: warning

- 每次请求最多只能给 100 个用户添加标签，请求体中单个用户添加标签数最多为 10 个。
- 单个用户可设置最大标签数为 100 个，若用户当前标签超过 100，则添加新标签之前请先删除旧标签。
- 单个标签最大长度为 50 字节。
  :::

使用示例：

```java
List<String> tags = Arrays.asList("a", "b");
UserTagItem item = UserTagItem.builder()
        .toAccount("test1")
        .tags(tags)
        .build();
List<UserTagItem> userTags = Collections.singletonList(item);
ImAddTagRequest request = new ImAddTagRequest(userTags);

ImAddTagResult result = client.member.imAddTag(request);
```

## 删除用户标签

管理员给用户删除标签。注意每次最多只能给 100 个用户删除标签。

使用示例：

```java
List<String> tags = Arrays.asList("a", "b");
UserTagItem item = UserTagItem.builder()
        .toAccount("test1")
        .tags(tags)
        .build();
List<UserTagItem> userTags = Collections.singletonList(item);
ImRemoveTagRequest request = new ImRemoveTagRequest(userTags);

ImRemoveTagResult result = client.member.imRemoveTag(request);
```

## 删除所有用户标签

管理员给用户删除所有标签。注意每次最多只能给 100 个用户删除所有标签。

使用示例：

```java
List<String> toAccount = Arrays.asList("test1", "test2");
ImRemoveAllTagsRequest request = new ImRemoveAllTagsRequest(toAccount);

ImRemoveAllTagsResult result = client.member.imRemoveAllTags(request);
```
