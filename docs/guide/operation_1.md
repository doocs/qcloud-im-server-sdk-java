# 全局禁言管理

## 设置全局禁言

- 设置帐号的单聊消息全局禁言。
- 设置帐号的群组消息全局禁言。

使用示例：

```java
SetNoSpeakingRequest request = SetNoSpeakingRequest.builder()
        .setAccount("test1")
        .msgNoSpeakingTime(NoSpeakingTime.NEVER)
        .groupMsgNoSpeakingTime(NoSpeakingTime.FOREVER)
        .build();

SetNoSpeakingResult result = client.operation.setNoSpeaking(request);
```

## 查询全局禁言

- 查询帐号的单聊消息全局禁言。
- 查询帐号的群组消息全局禁言。

使用示例：

```java
GetNoSpeakingRequest request = new GetNoSpeakingRequest("test1");

GetNoSpeakingResult result = client.operation.getNoSpeaking(request);
```
