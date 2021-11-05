# 快速上手

## 安装

### Maven

在项目的 `pom.xml` 的 dependencies 中加入以下内容:

```xml
<dependency>
  <groupId>io.github.doocs</groupId>
  <artifactId>im-server-sdk-java</artifactId>
  <version>0.2.3</version>
</dependency>
```

### Gradle

```gradle
implementation group: 'io.github.doocs', name: 'im-server-sdk-java', version: '0.2.3'
```

### 下载 jar

[Maven 中央仓库](https://repo1.maven.org/maven2/io/github/doocs/im-server-sdk-java/)

## 初始化

在使用腾讯云即时 IM 服务端 API 之前， 需要初始化 `ImClient` 实例:

```java
// sdk appId
long appId = 1400554812;

// admin userId
String identifier = "test";

// application key
String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";

// create a default ImClient instance
ImClient client = ImClient.getInstance(appId, identifier, key);

// create a custom ImClient instance
ClientConfiguration config = new ClientConfiguration();
ImClient client = ImClient.getInstance(appId, identifier, key, config);
```

`ClientConfiguration` 支持可配置参数如下：

| 字段           | 类型    | 说明                         | 默认值 |
| -------------- | ------- | ---------------------------- | ------ |
| maxRetries     | Integer | HTTP 最大重试次数            | 3      |
| connectTimeout | Long    | HTTP 连接超时（毫秒）        | 3000   |
| readTimeout    | Long    | HTTP 读超时（毫秒）          | 3000   |
| writeTimeout   | Long    | HTTP 写超时（毫秒）          | 3000   |
| expireTime     | Long    | UserSig 签名失效时间（毫秒） | 86400  |
| userAgent      | String  | User-Agent                   |        |

## 使用示例

初始化 `ImClient` 实例后， 以使用 [帐号管理-导入单个帐号](./account.md#导入单个帐号) 为例：

```java
AccountImportRequest request = AccountImportRequest.builder()
<<<<<<< Updated upstream
        .identifier("admin")
        .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
        .nick("doocs")
        .build();
        
=======
    .identifier("admin")
    .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
    .nick("doocs")
    .build();

>>>>>>> Stashed changes
AccountImportResult result = client.account.accountImport(request);
```
