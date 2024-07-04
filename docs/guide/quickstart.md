# 快速上手

## 安装

### Maven

在项目的 `pom.xml` 的 dependencies 中引入以下依赖:

```xml
<dependency>
  <groupId>io.github.doocs</groupId>
  <artifactId>im-server-sdk-java</artifactId>
  <version>0.4.03</version>
</dependency>
```

### Gradle

```gradle
implementation group: 'io.github.doocs', name: 'im-server-sdk-java', version: '0.4.03'
```

### 下载 JAR

[Maven 中央仓库](https://repo1.maven.org/maven2/io/github/doocs/im-server-sdk-java/)

## 初始化

在使用腾讯云即时 IM 服务端 REST API 之前， 需要先通过 `appId`, `userId`, `key` 获取到一个 `ImClient` 实例:

```java
// sdk appId
long appId = 1400554812;

// admin userId
String userId = "test";

// application key
String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";

// create a default ImClient instance
ImClient client = ImClient.getInstance(appId, userId, key);

// create a default ImClient instance with custom domain
ImClient client = ImClient.getInstance(appId, userId, key, Domain.SINGAPORE);

// create a custom ImClient instance
ClientConfiguration config = new ClientConfiguration();
config.setExpireTime(7 * 24 * 60 * 60L);
config.setAutoRenewSig(false);
ImClient client = ImClient.getInstance(appId, userId, key, config);
```

`ClientConfiguration` 支持对以下参数进行自定义配置：

| 字段             | 类型    | 说明                                                                                                     | 默认值 |
| ---------------- | ------- | -------------------------------------------------------------------------------------------------------- | ------ |
| `maxRetries`     | int     | HTTP 最大重试次数                                                                                        | 3      |
| `connectTimeout` | long    | HTTP 连接超时（毫秒）                                                                                    | 10_000 |
| `readTimeout`    | long    | HTTP 读超时（毫秒）                                                                                      | 10_000 |
| `writeTimeout`   | long    | HTTP 写超时（毫秒）                                                                                      | 10_000 |
| `callTimeout`    | long    | 一个完整的 HTTP 调用的时间限制。这包括解析 DNS、连接、写入请求正文、服务器处理以及读取响应正文。（毫秒） | 30_000 |
| `expireTime`     | long    | UserSig 签名有效时长（秒）                                                                               | 86400  |
| `autoRenewSig`   | boolean | 是否自动进行 UserSig 签名续期                                                                            | true   |
| `userAgent`      | string  | User-Agent                                                                                               |        |
| `connectionPool` | object  | HTTP 连接池                                                                                              |        |

## 使用示例

获取到 `ImClient` 实例后，就可以方便地进行 REST API 调用了。

我们以 [账号管理-导入单个账号](./account.md#导入单个账号) 为例：

```java
AccountImportRequest request = AccountImportRequest.builder()
        .identifier("admin")
        .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
        .nick("doocs")
        .build();

AccountImportResult result = client.account.accountImport(request);
```
