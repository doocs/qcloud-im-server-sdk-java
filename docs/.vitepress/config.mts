import { defineConfig } from 'vitepress'

// https://vitepress.dev/reference/site-config
export default defineConfig({
  title: "qcloud-im-server-sdk-java",
  description: "腾讯云 IM 服务端 SDK API 文档 Java 版",
  themeConfig: {
    nav: [
      { text: '首页', link: '/' },
      { text: '指南', link: '/guide/intro' }
    ],
    sidebar: {
      '/guide/': [
        {
          text: '指南',
          items: [
            { text: '介绍', link: '/guide/intro'},
            { text: '快速上手', link: '/guide/quickstart' },
            { text: '账号管理', link: '/guide/account' },
            { text: '单聊消息', link: '/guide/message' },
            { text: '全员推送', link: '/guide/member' },
            { text: '资料管理', link: '/guide/profile' },
            { text: '关系链管理', link: '/guide/sns' },
            { text: '最近联系人', link: '/guide/recent_contact' },
            { text: '群组管理', link: '/guide/group' },
            { text: '全局禁言管理', link: '/guide/operation_1' },
            { text: '运营管理', link: '/guide/operation_2' },
            { text: '机器人', link: '/guide/robot' },
            { text: '内容审核', link: '/guide/audit' },
            { text: '公众号管理', link: '/guide/official_account' }
          ]
        }
      ]
    },
    socialLinks: [
      { icon: 'github', link: 'https://github.com/doocs/qcloud-im-server-sdk-java' }
    ],
    logo: '/favicon-32x32.png',
    footer: {
      message: 'Released under the Apache-2.0 license.',
      copyright: `版权所有 © 2018-${new Date().getFullYear()} <a href="https://github.com/doocs">Doocs</a>`
    },
    docFooter: {
      prev: '上一篇',
      next: '下一篇'
    },
    editLink: {
      pattern: 'https://github.com/doocs/qcloud-im-server-sdk-java/edit/main/docs/:path',
      text: '在 GitHub 编辑'
    }
  },
  head: [
    ['link', { rel: 'icon', type: 'image/png', href: '/favicon-32x32.png' }],
  ],
  cleanUrls: true,
  sitemap: {
    hostname: 'https://qcloud-im-server-sdk-java.doocs.org'
  }
})
