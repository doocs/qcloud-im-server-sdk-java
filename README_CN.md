# 腾讯云 IM 服务端 Java SDK

<a href="https://search.maven.org/artifact/io.github.doocs/im-server-sdk-java"><img src="https://img.shields.io/maven-metadata/v?color=42b883&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fio%2Fgithub%2Fdoocs%2Fim-server-sdk-java%2Fmaven-metadata.xml&style=flat-square" alt="maven"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/blob/main/LICENSE"><img src="https://img.shields.io/github/license/doocs/qcloud-im-server-sdk-java?color=42b883&style=flat-square" alt="license"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/pulls"><img src="https://img.shields.io/badge/prs-welcome-42b883?style=flat-square" alt="prs welcome"></a>
<a href="https://doocs.github.io/#/?id=how-to-join"><img src="https://img.shields.io/badge/organization-join%20us-42b883?style=flat-square" alt="open-source-organization"></a>

腾讯云 IM 服务端 Java SDK 封装了[腾讯云即时通信 IM](https://cloud.tencent.com/document/product/269) 服务端的所有 API 接口，方便服务端开发者进行 REST API 接口的调用以第三方回调的处理。

[English Version](./README.md)

## 文档导航

- [文档站点](https://doocs.github.io/qcloud-im-server-sdk-java)
- [贡献代码](#Contributing)

## 快速上手

### 1. 添加依赖

**注意**： 腾讯云 IM 服务端 Java SDK 依赖 JDK 1.8 及以上版本。

如果你的应用程序属于 Maven 工程，请在 `pom.xml` 文件中引入以下依赖：

```xml
<dependency>
  <groupId>io.github.doocs</groupId>
  <artifactId>im-server-sdk-java</artifactId>
  <version>0.2.11</version>
</dependency>
```

你也可以在 [Maven 中央仓库](https://repo1.maven.org/maven2/io/github/doocs/im-server-sdk-java/)下载 SDK 的 JAR 包，并在项目中引入。

### 2. 编码实现

```java
// sdk appId
long appId = 1400554812;

// 管理员 userId
String userId = "test";

// 应用程序 key
String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";

// 创建 IM 客户端实例
ImClient client = ImClient.getInstance(appId, userId, key);

// 导入帐号
AccountImportRequest request = new AccountImportRequest("doocs");
request.setFaceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4");
request.setNick("Doocs Community");
try {
    AccountImportResult result = client.account.accountImport(request);
    // 结果处理
} catch (IOException e) {
    // 异常捕捉处理
}
```

## 参与项目

我们非常欢迎各位开发者参与完善 SDK！

本项目，我们使用 `dev` 作为开发分支，如果你希望参与本项目，请参考以下步骤：

1. 将本项目 fork 到你的个人帐号下
2. 将 fork 后的项目 clone 到你本地项目
3. 创建一个新的分支，并添加你的变更
4. 将你的分支与我们上游最新代码保持同步
5. Commit 提交你的分支，注意 commit msg 的格式保持简洁明了
6. 将你的代码 Push 到你在第一步中 fork 下来的项目中
7. 创建一个 Pull Request，请求将你的代码合并到我们 dev 分支

更多详情，请参考 [CONTRIBUTING](./CONTRIBUTING.md) 文档指南。

## 许可证

Apache-2.0 许可证。
