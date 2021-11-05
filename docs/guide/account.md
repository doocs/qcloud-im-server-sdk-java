# 帐号管理

## 导入单个帐号

本接口用于将 App 自有帐号导入即时通信 IM 帐号系统，为该帐号创建一个对应的内部 ID，使该帐号能够使用即时通信 IM 服务。

::: tip
同一个帐号重复导入仅会创建 1 个内部 ID。
:::

使用示例：

```java
AccountImportRequest request = AccountImportRequest.builder()
        .identifier("admin")
        .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
        .nick("doocs")
        .build();

AccountImportResult result = client.account.accountImport(request);
```

## 导入多个帐号

本接口用于批量将 App 自有帐号导入即时通信 IM 帐号系统，为该帐号创建一个对应的内部 ID，使该帐号能够使用即时通信 IM 服务。

注意： 本接口单次最多支持导入 100 个帐号，且不支持导入帐号的昵称和头像信息。请使用 [资料管理-设置资料](./profile.md#设置资料) 设置其他信息。

使用示例：

```java
List<String> accounts = new ArrayList<>();
accounts.add("doocs_1");
accounts.add("doocs_2");
MultiAccountImportRequest request = MultiAccountImportRequest.builder()
        .accounts(accounts)
        .build();

MultiAccountImportResult result = client.account.multiAccountImport(request);
```

## 删除帐号

仅支持删除套餐包类型为 IM 体验版的帐号，其他类型的账号（如：TRTC、白板、专业版、旗舰版）无法删除。

::: tip
帐号删除时，该用户的关系链、资料等数据也会被删除，且数据将无法恢复。
:::

使用示例：

```java
AccountDeleteItem deleteAccount = AccountDeleteItem.builder()
        .userId("doocs")
        .build();
AccountDeleteRequest request = AccountDeleteRequest.builder()
        .deleteItemList(Collections.singletonList(deleteAccount))
        .build();

AccountDeleteResult result = client.account.accountDelete(request);
```

## 查询帐号

用于查询自有帐号是否已导入即时通信 IM, 支持批量查询。

使用示例：

```java
AccountCheckItem account1 = new AccountCheckItem("doocs_1");
AccountCheckItem account2 = new AccountCheckItem("doocs_2");
AccountCheckRequest request = new AccountCheckRequest(Arrays.asList(account1, account2));

AccountCheckResult result = client.account.accountCheck(request);
```

## 失效帐号登录状态

本接口适用于将 App 用户帐号的登录状态（例如 UserSig）失效。

例如，开发者判断一个用户为恶意帐号后，可以调用本接口将该用户当前的登录状态失效，这样用户使用历史 UserSig 登录即时通信 IM 会失败。

::: tip
支持一次失效一个帐号，用户可以使用重新生成的 UserSig 登录即时通信 IM
:::

使用示例：

```java
KickRequest request = new KickRequest("doocs_1");

KickResult result = client.account.kick(request);
```

## 查询帐号在线状态

获取用户当前的登录状态。

使用示例：

```java
List<String> toAccount = Arrays.asList("doocs_1", "doocs_2");
QueryOnlineStatusRequest request = QueryOnlineStatusRequest.builder()
        .toAccount(toAccount)
        .isNeedDetail(IsNeedDetail.YES)
        .build();

QueryOnlineStatusResult result = client.account.queryOnlineStatus(request);
```
