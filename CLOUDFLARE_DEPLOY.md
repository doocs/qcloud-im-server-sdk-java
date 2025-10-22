# Cloudflare Workers 部署配置

本项目已配置为支持自动部署到 Cloudflare Workers。

## 前置要求

在 GitHub 仓库中配置以下 Secrets：

1. `CLOUDFLARE_API_TOKEN` - Cloudflare API Token
   - 前往 [Cloudflare Dashboard](https://dash.cloudflare.com/profile/api-tokens)
   - 创建 Token，权限需要包含 `Workers Scripts:Edit`

2. `CLOUDFLARE_ACCOUNT_ID` - Cloudflare Account ID
   - 可以在 Cloudflare Dashboard 的 URL 中找到
   - 或在 Workers & Pages 页面右侧查看

## 自动部署

每次推送到 `main` 分支时，GitHub Actions 会自动：
1. 构建 VitePress 文档站点
2. 部署到 Cloudflare Workers

## 手动部署

本地部署（需要先配置 wrangler）：

```bash
# 登录 Cloudflare
pnpm wrangler login

# 构建并部署
pnpm deploy:cf
```

## 项目配置

- **Worker 名称**: `qcloud-im-server-sdk-java-docs`
- **构建输出目录**: `docs/.vitepress/dist`
- **Worker 脚本**: `worker.js`
- **配置文件**: `wrangler.toml`

## Workflows

- `.github/workflows/cloudflare.yml` - Cloudflare Workers 部署
- `.github/workflows/docs.yml` - GitHub Pages 部署

两个部署可以同时运行，互不干扰。

## Worker 功能

Worker 脚本会：
- 提供静态文档站点服务
- 支持 clean URLs（无需 .html 扩展名）
- 自动处理目录索引（index.html）
