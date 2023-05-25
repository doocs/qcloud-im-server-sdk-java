# 运营管理

## 拉取运营数据

App 管理员可以通过该接口拉取最近 30 天的运营数据，可拉取的字段见下文可拉取的运营字段。

使用示例：

```java
GetAppInfoRequest request = new GetAppInfoRequest();
List<String> requestFields = Arrays.asList("ChainIncrease", "ChainDecrease");
request.setRequestField(requestFields);

GetAppInfoResult result = client.operation.getAppInfo(request);
```

## 下载最近消息记录

App 管理员可以通过该接口获取 App 中最近 7 天中某天某小时的所有单发或群组消息记录的下载地址。

::: warning

- 下载消息记录里的图片、语音、文件和短视频，此功能仅适用于 4.X 版本 IM SDK，可通过聊天记录中的 URL 字段进行下载。如您使用 2.X 或 3.X 版本的 IM SDK，您将无法通过该方法获取到以上信息，如您需要此功能，请您升级至 4.X 版本。
- 消息记录以日志文件形式保存并使用 GZip 压缩，通过该接口获取到下载地址后，请自行下载并处理；消息记录文件每小时产生一次，例如 0 点（00:00~00:59）的数据在 01:00 后开始处理，一般 1 小时内处理完毕（消息较多则处理时间较长）；文件有效期 7 天，无论是否下载过，都会在 7 天后删除，被删除后不支持重新导出；获取到的下载地址存在有效期，请在过期前进行下载，若地址失效，请通过该接口重新获取。
- 此接口仅用于下载最近 7 天的聊天记录文件，用于备份或数据统计等。不建议使用该接口用于线上实时业务。
  :::

使用示例：

```java
GetHistoryRequest request = GetHistoryRequest.builder()
        .chatType(ChatType.C2C)
        .msgTime("2015120121")
        .build();

GetHistoryResult result = client.operation.getHistory(request);
```

## 获取服务器 IP 地址

基于安全等考虑，您可能需要获知服务器的 IP 地址列表，以便进行相关限制。App 管理员可以通过该接口获得 SDK、第三方回调所使用到的服务器 IP 地址列表或 IP 网段信息。

::: warning
此接口仅支持获取中国大陆地区的所有 IM 接入方式的 IP 地址或 IP 网段信息。
:::

使用示例：

```java
GetIpListRequest request = new GetIpListRequest();

GetIpListResult result = client.op~eration.getIpList(request);
```

## 聊天文件封禁

本接口用于封禁聊天消息中的富媒体文件。

::: tip
仅针对富媒体消息中使用 IM SDK 上传的文件有效，为了确保功能正常使用，请将终端 SDK 更新至 4.9.x 版本及以上，Web SDK 更新至 v2.0.0 版本及以上。
:::

使用示例：

```java
ForbidIllegalObjectRequest request = ForbidIllegalObjectRequest.builder()
        .rawUrl("https://cos.ap-shanghai.myqcloud.com/005f-shanghai-360-shared-01-1256635546/76aa-1400152839/2f3b-2273451635034382/699eb4ee5ffa9aeb70627958766f2927-142072.jpg")
        .build();

ForbidIllegalObjectResult result = client.operation.forbidIllegalObject(request);
```

## 聊天文件解封

本接口用于解封聊天消息中的富媒体文件。

::: tip
仅针对富媒体消息中使用 IM SDK 上传的文件有效，为了确保功能正常使用，请将终端 SDK 更新至 4.9.x 版本及以上，Web SDK 更新至 v2.0.0 版本及以上。
:::

```java
AllowBannedObjectRequest request = AllowBannedObjectRequest.builder()
        .rawUrl("https://cos.ap-shanghai.myqcloud.com/005f-shanghai-360-shared-01-1256635546/76aa-1400152839/2f3b-2273451635034382/699eb4ee5ffa9aeb70627958766f2927-142072.jpg")
        .build();

AllowBannedObjectResult result = client.operation.allowBannedObject(request);
```

## 聊天文件签名

本接口用于获取聊天消息中的富媒体文件 FULL_CONTROL 权限的 URL 签名以及文件状态信息，默认有效期 15 分钟。一般 SDK 下发的文件 URL 为普通账号签名，违规封禁后，可以使用 FULL_CONTROL 权限的 URL 签名来查看封禁的资源。

::: tip
仅针对富媒体消息中使用 IM SDK 上传的文件有效，为了确保功能正常使用，请将终端 SDK 更新至 4.9.x 版本及以上，Web SDK 更新至 v2.0.0 版本及以上。
:::

```java
RawUrlItem item = new RawUrlItem();
item.setRawUrl("https://cos.ap-shanghai.myqcloud.com/98ec-shanghai-007-privatev2-01-1256635546/0345-1400187352/0612-yyy/9a0f4c42d208ccfb5aa47c29284aefc6.png");
item.setResourceId(1);
List<RawUrlItem> rawUrls = Collections.singletonList(item);
GetCosSigRequest request = GetCosSigRequest.builder()
        .rawUrls(rawUrls)
        .build();

GetCosSigResult result = client.operation.getCosSig(request);
```
