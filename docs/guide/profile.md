# 资料管理

## 设置资料

支持 [标配资料字段](https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5) 和 [自定义资料字段](https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5) 的设置。

使用示例：

```java
ProfileItem profileItem = ProfileItem.builder()
        .tag("Tag_Profile_IM_Nick")
        .value("MyNickName")
        .build();
PortraitSetRequest request = new PortraitSetRequest("doocs", Collections.singletonList(profileItem));

PortraitSetResult result = client.profile.portraitSet(request);
```

## 拉取资料

- 支持拉取好友和非好友的资料字段。
- 支持拉取 [标配资料字段](https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5) 和 [自定义资料字段](https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5)。
- 建议每次拉取的用户数不超过 100，避免因回包数据量太大导致回包失败。
- 请确保请求中的所有帐号都已导入即时通信 IM，如果请求中含有未导入即时通信 IM 的帐号，即时通信 IM 后台将会提示错误。

使用示例：

```java
List<String> tagList = Collections.singletonList("Tag_Profile_IM_Nick");
PortraitGetRequest request = new PortraitGetRequest(Collections.singletonList("doocs"), tagList);

PortraitGetResult result = client.profile.portraitGet(request);
```
