# 账号管理

## 导入单个账号

本接口用于将 App 自有账号导入即时通信 IM 账号系统，为该账号创建一个对应的内部 ID，使该账号能够使用即时通信 IM 服务。

::: tip
同一个账号重复导入仅会创建 1 个内部 ID。
:::

使用示例：

```java
AccountImportRequest request = AccountImportRequest.builder()
        .userId("admin")
        .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
        .nick("doocs")
        .build();

AccountImportResult result = client.account.accountImport(request);
```

## 导入多个账号

本接口用于批量将 App 自有账号导入即时通信 IM 账号系统，为该账号创建一个对应的内部 ID，使该账号能够使用即时通信 IM 服务。

注意： 本接口单次最多支持导入 100 个账号，且不支持导入账号的昵称和头像信息。请使用 [资料管理-设置资料](./profile.md#设置资料) 设置其他信息。

使用示例：

```java
List<String> accounts = new ArrayList<>();
accounts.add("user1");
accounts.add("user2");
MultiAccountImportRequest request = new MultiAccountImportRequest(accounts);

MultiAccountImportResult result = client.account.multiAccountImport(request);
```

## 删除账号

- 仅支持删除套餐包类型为 IM 体验版的账号，其他类型的账号（如：TRTC、白板、专业版、旗舰版）无法删除。
- 账号删除时，该用户的关系链、资料等数据也会被删除
- 账号删除后，**该用户的数据将无法恢复**，请谨慎使用该接口。

使用示例：

```java
AccountDeleteItem item1 = AccountDeleteItem.builder().userId("user1").build();
AccountDeleteItem item2 = AccountDeleteItem.builder().userId("user2").build();
List<AccountDeleteItem> deleteItems = Arrays.asList(item1, item2);
AccountDeleteRequest request = new AccountDeleteRequest(deleteItems);

AccountDeleteResult result = client.account.accountDelete(request);
```

## 查询账号

用于查询自有账号是否已导入即时通信 IM, 支持批量查询。

使用示例：

```java
AccountCheckItem item1 = new AccountCheckItem("user1");
AccountCheckItem item2 = new AccountCheckItem("user2");
List<AccountCheckItem> checkItems = Arrays.asList(item1, item2);
AccountCheckRequest request = new AccountCheckRequest(checkItems);

AccountCheckResult result = client.account.accountCheck(request);
```

## 失效账号登录状态

本接口适用于将 App 用户账号的登录状态（例如 UserSig）失效。

例如，开发者判断一个用户为恶意账号后，可以调用本接口将该用户当前的登录状态失效，这样用户使用历史 UserSig 登录即时通信 IM 会失败。

::: warning
支持一次失效一个账号，用户可以使用重新生成的 UserSig 登录即时通信 IM
:::

使用示例：

```java
KickRequest request = new KickRequest("user2");

KickResult result = client.account.kick(request);
```

## 查询账号在线状态

获取用户当前的登录状态。

使用示例：

```java
List<String> toAccount = Arrays.asList("user1", "user2");
QueryOnlineStatusRequest request = QueryOnlineStatusRequest.builder()
        .toAccount(toAccount)
        .isNeedDetail(IsNeedDetail.YES)
        .build();

QueryOnlineStatusResult result = client.account.queryOnlineStatus(request);
```
