# 全员推送

## 全员推送

- 支持全员推送。
- 支持按用户属性推送。
- 支持按用户标签推送。
- 管理员推送消息，接收方看到消息发送者是管理员。
- 管理员指定某一帐号向其他帐号推送消息，接收方看到发送者不是管理员，而是管理员指定的帐号。
- 支持消息离线存储，不支持漫游。
- 由于全员推送需要下发的帐号数量巨大，下发完全部帐号需要一定时间（根据帐号总数而定，一般在一分钟内）。

使用示例：

```java
TIMTextMsgElement msg = new TIMTextMsgElement("hi, beauty");
List<TIMMsgElement> msgBody = Collections.singletonList(msg);
ImPushRequest request = ImPushRequest.builder()
        .msgRandom(9312457)
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

获取用户属性（必须以管理员帐号调用）；每次最多只能获取 100 个用户的属性。使用前请先 [设置应用属性名称](#设置应用属性名称) 。

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
ImSetAttrRequest request = new ImSetAttrRequest(Collections.singletonList(item));

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
ImRemoveAttrRequest request = new ImRemoveAttrRequest(Collections.singletonList(item));

ImRemoveAttrResult result = client.member.imRemoveAttr(request);
```

## 获取用户标签

获取用户标签（必须以管理员帐号调用）。每次最多只能获取 100 个用户的标签。

使用示例：

```java
ImGetTagRequest request = new ImGetTagRequest(Arrays.asList("test1", "test2"));

ImGetTagResult result = client.member.imGetTag(request);
```

## 添加用户标签

管理员给用户添加标签。

::: warning 注意

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
ImAddTagRequest request = new ImAddTagRequest(Collections.singletonList(item));

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
ImRemoveTagRequest request = new ImRemoveTagRequest(Collections.singletonList(item));

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
