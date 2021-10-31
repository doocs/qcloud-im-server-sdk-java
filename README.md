# Tencent Cloud IM Server SDK in Java

<a href="https://search.maven.org/artifact/io.github.doocs/im-server-sdk-java"><img src="https://img.shields.io/maven-metadata/v?color=42b883&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fio%2Fgithub%2Fdoocs%2Fim-server-sdk-java%2Fmaven-metadata.xml&style=flat-square" alt="maven"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/blob/main/LICENSE"><img src="https://img.shields.io/github/license/doocs/qcloud-im-server-sdk-java?color=42b883&style=flat-square" alt="license"></a>
<a href="https://github.com/doocs/qcloud-im-server-sdk-java/pulls"><img src="https://img.shields.io/badge/prs-welcome-42b883?style=flat-square" alt="prs welcome"></a>
<a href="https://doocs.github.io/#/?id=how-to-join"><img src="https://img.shields.io/badge/organization-join%20us-42b883?style=flat-square" alt="open-source-organization"></a>

The Tencent Cloud IM Server SDK for Java enables Java developers to easily work with Tencent Cloud IM.

## Requirements

- Java 8 or later
- Maven

## Installation and Getting Started

### 1. Maven Configuration

Add the Maven dependency:

```xml
<dependency>
  <groupId>io.github.doocs</groupId>
  <artifactId>im-server-sdk-java</artifactId>
  <version>0.2.0</version>
</dependency>
```

### 2. Getting Started

Here is a quick teaser of an application using IM SDK in Java:

```java
public class Main {
    public static void main(String[] args) {
        // type your sdkAppId here
        long appId = 1400554812;
        
        // type your adminUserId here
        String identifier = "test";
        
        // type your applicationKey here
        String key = "60c6c5925f3ae52c7325ac5a8ec78e44c056d1dd84d54e12ffa39911267a2a70";
        
        // create ImClient instance
        IMClient client = IMClient.getInstance(appId, identifier, key);

        // import account
        AccountImportRequest request = new AccountImportRequest();
        request.setFaceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4");
        request.setIdentifier("doocs");
        request.setNick("Doocs Community");
        try {
            AccountImportResult result = client.account.accountImport(request);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Authors

- [Yang Libin](https://github.com/yanglbme)
- [Hong Yiheng](https://github.com/hongyiheng)
- [Xie Yu](https://github.com/YXxy1002)

## Contributing

Contributions are always welcomed! Please refer to [CONTRIBUTING](./CONTRIBUTING.md) for detailed guidelines.

## License

Apache-2.0 License.
