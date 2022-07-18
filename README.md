# Tencent Cloud IM Server SDK in Java

<a href="https://search.maven.org/artifact/io.github.doocs/im-server-sdk-java"><img src="https://img.shields.io/maven-metadata/v?color=42b883&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fio%2Fgithub%2Fdoocs%2Fim-server-sdk-java%2Fmaven-metadata.xml&style=flat-square" alt="maven"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/blob/main/LICENSE"><img src="https://img.shields.io/github/license/doocs/qcloud-im-server-sdk-java?color=42b883&style=flat-square" alt="license"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/pulls"><img src="https://img.shields.io/badge/prs-welcome-42b883?style=flat-square" alt="prs welcome"></a>
<a href="https://doocs.github.io/#/?id=how-to-join"><img src="https://img.shields.io/badge/organization-join%20us-42b883?style=flat-square" alt="open-source-organization"></a>

The Tencent Cloud IM Server SDK for Java enables Java developers to easily work with Tencent Cloud IM.

[中文文档](./README_CN.md)

## Documentation

- [Documentation Home](https://doocs.github.io/qcloud-im-server-sdk-java)
- [Contributing Code](#Contributing)

## Quick Start

### 1. Add Dependency

**Note**: Tencent Cloud IM Server SDK requires JDK 1.8 or later.

If you're using Maven, just add the following dependency in `pom.xml`.

```xml
<dependency>
  <groupId>io.github.doocs</groupId>
  <artifactId>im-server-sdk-java</artifactId>
  <version>0.3.23</version>
</dependency>
```

If not, you can download JAR in [Maven Center Repository](https://repo1.maven.org/maven2/io/github/doocs/im-server-sdk-java/).

### 2. Getting Started

Here is a quick teaser of an application using Tencent Cloud IM Server SDK in Java:

```java
// sdk appId
long appId = 1400554812;

// admin userId
String userId = "test";

// application key
String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";

// create ImClient instance
ImClient client = ImClient.getInstance(appId, userId, key);

// import account
AccountImportRequest request = new AccountImportRequest("doocs");
request.setFaceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4");
request.setNick("Doocs Community");
try {
    AccountImportResult result = client.account.accountImport(request);
    // handle result
} catch (IOException e) {
    // handle exception
}
```

## Contributing

Contributions are always welcomed!

We use the `dev` branch as the development branch, which indicates that this is a unstable branch.

Here are the workflow for contributors:

1. Fork to your own
2. Clone fork to local repository
3. Create a new branch and work on it
4. Keep your branch in sync
5. Commit your changes (make sure your commit message concise)
6. Push your commits to your forked repository
7. Create a pull request

Please refer to [CONTRIBUTING](./CONTRIBUTING.md) for detailed guidelines.

## License

Apache-2.0 License.
