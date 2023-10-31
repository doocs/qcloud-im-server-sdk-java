# 内容审核

## 添加敏感词（本地审核）

开启本地审核后，在 App 后台可以主动调用 REST API 接口，增删改查本地审核相关词库。

使用示例：

```java
LocalAuditWord word = new LocalAuditWord();
word.setFilterType(AuditFilterType.REPLACE);
word.setWordType(AuditWordType.SENSITIVE_WORDS);
word.setKeyword("caonima");
word.setReplacedContent("****");
AddLocalAuditKeywordsRequest request = AddLocalAuditKeywordsRequest.builder()
        .sdkAppId(1400594307)
        .localAuditWords(Collections.singletonList(word)).build();

AddLocalAuditKeywordsResult result = client.audit.addLocalAuditKeywords(request);
```

## 删除敏感词（本地审核）

开启本地审核后，在 App 后台可以主动调用 REST API 接口，增删改查本地审核相关词库。

使用示例：

```java
DeleteLocalAuditKeywordsRequest request = new DeleteLocalAuditKeywordsRequest();
request.setSdkAppId(1400594307);
LocalAuditWord word = new LocalAuditWord();
word.setId(1L);
word.setReplacedContent("****");
word.setKeyword("caonima");
word.setWordType(AuditWordType.SENSITIVE_WORDS);
word.setFilterType(AuditFilterType.REPLACE);
request.setLocalAuditWords(Collections.singletonList(word));

DeleteLocalAuditKeywordsResult result = client.audit.deleteLocalAuditKeywords(request);
```

## 获取敏感词（本地审核）

开启本地审核后，在 App 后台可以主动调用 REST API 接口，增删改查本地审核相关词库。

使用示例：

```java
GetLocalAuditKeywordsRequest request = GetLocalAuditKeywordsRequest.builder().keyword("caonima")
        .filterType(AuditFilterType.REPLACE)
        .limit(1).offset(0).sdkAppId(1400594307).build();

GetLocalAuditKeywordsResult result = client.audit.getLocalAuditKeywords(request);
```

## 主动审核接口（云端审核）

开启云端审核后，在 App 后台可以主动调用 REST API 接口，送审音视图文等相关内容，其中图文同步返回机审结果，音视频通过异步回调的形式返回机审结果。

使用示例：

```java
ContentModerationRequest request = ContentModerationRequest.builder().content("122")
        .contentType(AuditContentType.TEXT)
        .auditName(AuditNameType.C2C)
        .build();

ContentModerationResult result = client.audit.contentModeration(request);
```

## 主动批量审核接口（云端审核）

开启云端审核后，在 App 后台可以主动调用 REST API 接口，批量送审图文等相关内容，音视频审核请查看主动审核接口。

使用示例：

```java
BatchContentModerationRequest request = new BatchContentModerationRequest();
request.setAuditName(AuditNameType.GROUP);
AuditContentItem item1 = new AuditContentItem();
item1.setContent("f*ck uuu");
item1.setContentId(323245334);
item1.setContentType(AuditContentType.TEXT);
AuditContentItem item2 = AuditContentItem.builder()
        .contentId(435545)
        .contentType(AuditContentType.TEXT)
        .content("cnm").build();
request.setContents(Arrays.asList(item1, item2));

BatchContentModerationResult result = client.audit.batchContentModeration(request);
```

## 获取词库列表（云端审核）

开启云端审核后，在 App 后台可以主动调用 REST API 接口，增删改查云端审核相关词库。

使用示例：

```java
GetCloudAuditKeyWordsIdsRequest request = GetCloudAuditKeyWordsIdsRequest.builder()
        .limit(1)
        .offset(0)
        .sdkAppId(1400594307)
        .build();

GetCloudAuditKeywordsIdsResult result = client.audit.getCloudAuditKeywordsIds(request);
```

## 获取敏感词（云端审核）

开启云端审核后，在 App 后台可以主动调用 REST API 接口，增删改查云端审核相关词库。

使用示例：

```java
GetCloudAuditKeyWordsRequest request = GetCloudAuditKeyWordsRequest.builder()
        .libId("fd")
        .limit(1)
        .offset(0)
        .sdkAppId(1400594307)
        .build();

GetCloudAuditKeywordsResult result = client.audit.getCloudAuditKeywords(request);
```

## 添加敏感词（云端审核）

开启云端审核后，在 App 后台可以主动调用 RESTA PI 接口，增删改查云端审核相关词库。

使用示例：

```java
UserKeyword userKeyword = new UserKeyword();
userKeyword.setContent("caonima");
userKeyword.setLabel(ContentModerationLabel.COMPOSITE);
AddCloudAuditKeywordsRequest request = AddCloudAuditKeywordsRequest.builder()
        .sdkAppId(1400594307)
        .libId("fd")
        .userKeywords(Collections.singletonList(userKeyword))
        .build();

AddCloudAuditKeywordsResult result = client.audit.addCloudAuditKeywords(request);
```

## 删除敏感词（云端审核）

开启云端审核后，在 App 后台可以主动调用 REST API 接口，增删改查云端审核相关词库。

使用示例：

```java
DeleteCloudAuditKeywordsRequest request = DeleteCloudAuditKeywordsRequest.builder()
        .sdkAppId(1400594307)
        .libId("fd")
        .keywords(Arrays.asList("caonima", "wtf")).build();

DeleteCloudAuditKeywordsResult result = client.audit.deleteCloudAuditKeywords(request);
```