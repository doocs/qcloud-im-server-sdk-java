# 介绍

本文档基于腾讯云 IM Server SDK Java <Badge type="tip" text="v0.2.12" vertical="top" /> 编写。

## 前提条件

- 已 [注册腾讯云](https://cloud.tencent.com/document/product/378/17985) 账号并完成 [实名认证](https://cloud.tencent.com/document/product/378/3629)。
- 已登录 [即时通信 IM 控制台](https://console.cloud.tencent.com/im) 并创建了应用。创建完成后，可以拿到 `sdkAppId` 以及 `key`。
- 已创建 App 管理员帐号 `userId`，也即 `identifier`。

    <img src="https://cdn.jsdelivr.net/gh/doocs/qcloud-im-server-sdk-java@main/docs/assets/create_identifier.png" />

::: tip
“App 管理员”是对 App 具有最高管理权限的角色，可调用 [REST API 接口](https://cloud.tencent.com/document/product/269/1519?from_cn_redirect=1)，进行创建/解散群组、发送全员推送消息等操作。每个应用最多支持配置 10 个管理员。
:::

## SDK 环境依赖

- Java 8 及以上版本
- Maven

## SDK 源码

SDK 源码请参见 [GitHub](https://github.com/doocs/qcloud-im-server-sdk-java)。

## 项目贡献者

<a href="https://github.com/doocs/qcloud-im-server-sdk-java/graphs/contributors" target="_blank"><img src="https://cdn.jsdelivr.net/gh/doocs/qcloud-im-server-sdk-java@main/docs/assets/contributors.svg" /></a>
