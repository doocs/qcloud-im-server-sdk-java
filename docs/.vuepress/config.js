const { defaultTheme } = require('vuepress');
const { searchPlugin } = require('@vuepress/plugin-search');

module.exports = {
  lang: 'zh-CN',
  title: '腾讯云 IM 服务端 Java SDK 使用文档',
  description: '腾讯云 IM 服务端 SDK API 文档 Java 版',
  head: [
    [
      'link',
      {
        rel: 'icon',
        href: 'https://avatars.githubusercontent.com/u/43716716?s=200&v=4',
      },
    ],
  ],
  base: '/qcloud-im-server-sdk-java/',
  theme: defaultTheme({
    repo: 'doocs/qcloud-im-server-sdk-java',
    logo: 'https://avatars.githubusercontent.com/u/43716716?s=200&v=4',
    open: true,
    contributorsText: '贡献者',
    docsDir: 'docs',
    editLinkText: '编辑',
    lastUpdatedText: '最近更新时间',
    locales: {
      '/': {
        tip: '说明',
        warning: '注意',
        danger: '警告',
      },
    },
    sidebar: [
      {
        text: '指南',
        children: [
          '/guide/README.md',
          '/guide/quickstart.md',
          '/guide/account.md',
          '/guide/message.md',
          '/guide/member.md',
          '/guide/profile.md',
          '/guide/sns.md',
          '/guide/recent_contact.md',
          '/guide/group.md',
          '/guide/operation_1.md',
          '/guide/operation_2.md',
        ],
      },
    ],
  }),
  plugins: [
    searchPlugin({
      isSearchable: page => page.path !== '/',
    }),
  ],
};
