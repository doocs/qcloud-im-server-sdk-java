import{_ as s,c as a,e as t,o as e}from"./app-DZZ4xOJ4.js";const p={};function c(o,n){return e(),a("div",null,n[0]||(n[0]=[t(`<h1 id="资料管理" tabindex="-1"><a class="header-anchor" href="#资料管理"><span>资料管理</span></a></h1><h2 id="设置资料" tabindex="-1"><a class="header-anchor" href="#设置资料"><span>设置资料</span></a></h2><p>支持 <a href="https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5" target="_blank" rel="noopener noreferrer">标配资料字段</a> 和 <a href="https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5" target="_blank" rel="noopener noreferrer">自定义资料字段</a> 的设置。</p><p>使用示例：</p><div class="language-java line-numbers-mode" data-highlighter="prismjs" data-ext="java" data-title="java"><pre><code><span class="line"><span class="token class-name">ProfileItem</span> profileItem <span class="token operator">=</span> <span class="token class-name">ProfileItem</span><span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">tag</span><span class="token punctuation">(</span><span class="token class-name">TagProfile</span><span class="token punctuation">.</span><span class="token constant">IM_NICK</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">value</span><span class="token punctuation">(</span><span class="token string">&quot;MyNickName&quot;</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">ProfileItem</span><span class="token punctuation">&gt;</span></span> profiles <span class="token operator">=</span> <span class="token class-name">Collections</span><span class="token punctuation">.</span><span class="token function">singletonList</span><span class="token punctuation">(</span>profileItem<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"><span class="token class-name">PortraitSetRequest</span> request <span class="token operator">=</span> <span class="token class-name">PortraitSetRequest</span><span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">fromAccount</span><span class="token punctuation">(</span><span class="token string">&quot;test1&quot;</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">profileItemList</span><span class="token punctuation">(</span>profiles<span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span>
<span class="line"><span class="token class-name">PortraitSetResult</span> result <span class="token operator">=</span> client<span class="token punctuation">.</span>profile<span class="token punctuation">.</span><span class="token function">portraitSet</span><span class="token punctuation">(</span>request<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span></code></pre><div class="line-numbers" aria-hidden="true" style="counter-reset:line-number 0;"><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div></div></div><h2 id="拉取资料" tabindex="-1"><a class="header-anchor" href="#拉取资料"><span>拉取资料</span></a></h2><ul><li>支持拉取好友和非好友的资料字段。</li><li>支持拉取 <a href="https://cloud.tencent.com/document/product/269/1500#.E6.A0.87.E9.85.8D.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5" target="_blank" rel="noopener noreferrer">标配资料字段</a> 和 <a href="https://cloud.tencent.com/document/product/269/1500#.E8.87.AA.E5.AE.9A.E4.B9.89.E8.B5.84.E6.96.99.E5.AD.97.E6.AE.B5" target="_blank" rel="noopener noreferrer">自定义资料字段</a>。</li><li>建议每次拉取的用户数不超过 100，避免因回包数据量太大导致回包失败。</li><li>请确保请求中的所有账号都已导入即时通信 IM，如果请求中含有未导入即时通信 IM 的账号，即时通信 IM 后台将会提示错误。</li></ul><p>使用示例：</p><div class="language-java line-numbers-mode" data-highlighter="prismjs" data-ext="java" data-title="java"><pre><code><span class="line"><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> tagList <span class="token operator">=</span> <span class="token class-name">Collections</span><span class="token punctuation">.</span><span class="token function">singletonList</span><span class="token punctuation">(</span><span class="token class-name">TagProfile</span><span class="token punctuation">.</span><span class="token constant">IM_NICK</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"><span class="token class-name">List</span><span class="token generics"><span class="token punctuation">&lt;</span><span class="token class-name">String</span><span class="token punctuation">&gt;</span></span> toAccount <span class="token operator">=</span> <span class="token class-name">Collections</span><span class="token punctuation">.</span><span class="token function">singletonList</span><span class="token punctuation">(</span><span class="token string">&quot;test1&quot;</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"><span class="token class-name">PortraitGetRequest</span> request <span class="token operator">=</span> <span class="token class-name">PortraitGetRequest</span><span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">tagList</span><span class="token punctuation">(</span>tagList<span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">toAccount</span><span class="token punctuation">(</span>toAccount<span class="token punctuation">)</span></span>
<span class="line">        <span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span>
<span class="line"><span class="token class-name">PortraitGetResult</span> result <span class="token operator">=</span> client<span class="token punctuation">.</span>profile<span class="token punctuation">.</span><span class="token function">portraitGet</span><span class="token punctuation">(</span>request<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span></code></pre><div class="line-numbers" aria-hidden="true" style="counter-reset:line-number 0;"><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div></div></div>`,9)]))}const i=s(p,[["render",c],["__file","profile.html.vue"]]),u=JSON.parse('{"path":"/guide/profile.html","title":"资料管理","lang":"zh-CN","frontmatter":{},"headers":[{"level":2,"title":"设置资料","slug":"设置资料","link":"#设置资料","children":[]},{"level":2,"title":"拉取资料","slug":"拉取资料","link":"#拉取资料","children":[]}],"git":{"updatedTime":1696847753000,"contributors":[{"name":"acbin","email":"44314231+acbin@users.noreply.github.com","commits":1,"url":"https://github.com/acbin"},{"name":"Yang Libin","email":"szuyanglb@outlook.com","commits":2,"url":"https://github.com/Yang Libin"},{"name":"hongyiheng","email":"hongyihengg@gmail.com","commits":1,"url":"https://github.com/hongyiheng"}]},"filePathRelative":"guide/profile.md"}');export{i as comp,u as data};