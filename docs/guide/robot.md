# 机器人

## 创建机器人

本接口用于创建一个机器人账号，机器人是一种特殊账号，userid 必须以 `@RBT#` 开头，创建机器人时可以指定设置昵称、头像和签名。

::: tip

- 同一个机器人账号 userid 重复创建仅会创建 1 个机器人。
- 每个 IM 账号只能创建最多 20 个机器人账号。
  :::

使用示例：

```java
CreateRobotRequest request = new CreateRobotRequest();
request.setNick("bingo");
request.setFaceUrl("https://avatars.githubusercontent.com/u/2784452?v=4");
request.setSelfSignature("hah");
request.setUserId("@RBT#1233232");

CreateRobotResult result = client.robot.createRobot(request);
```

## 删除机器人

本接口用于将一个机器人账号设置为无效，机器人是一种特殊账号，userid 必须以 `@RBT#` 开头。

::: tip

- 本接口将一个机器人账号设置为无效。
- 机器人账号 UserID 本身不会被删除。
  :::

使用示例：

```java
DeleteRobotRequest request = DeleteRobotRequest.builder().robotAccount("@RBT#1233232").build();

DeleteRobotResult result = client.robot.deleteRobot(request);
```

## 拉取所有机器人

本接口用于拉取所有的机器人账号列表，机器人是一种特殊账号，userid 必须以 `@RBT#` 开头。

使用示例：

```java
GetAllRobotsRequest request = new GetAllRobotsRequest();

GetAllRobotsResult result = client.robot.getAllRobots(request);
```
