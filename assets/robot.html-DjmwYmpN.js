import{_ as s,c as a,e as t,o as e}from"./app-C4Bo335J.js";const p={};function l(o,n){return e(),a("div",null,n[0]||(n[0]=[t(`<h1 id="机器人" tabindex="-1"><a class="header-anchor" href="#机器人"><span>机器人</span></a></h1><h2 id="创建机器人" tabindex="-1"><a class="header-anchor" href="#创建机器人"><span>创建机器人</span></a></h2><p>本接口用于创建一个机器人账号，机器人是一种特殊账号，userid 必须以 <code>@RBT#</code> 开头，创建机器人时可以指定设置昵称、头像和签名。</p><div class="hint-container tip"><p class="hint-container-title">说明</p><ul><li>同一个机器人账号 userid 重复创建仅会创建 1 个机器人。</li><li>每个 IM 账号只能创建最多 20 个机器人账号。</li></ul></div><p>使用示例：</p><div class="language-java line-numbers-mode" data-highlighter="prismjs" data-ext="java" data-title="java"><pre><code><span class="line"><span class="token class-name">CreateRobotRequest</span> request <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">CreateRobotRequest</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line">request<span class="token punctuation">.</span><span class="token function">setNick</span><span class="token punctuation">(</span><span class="token string">&quot;bingo&quot;</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line">request<span class="token punctuation">.</span><span class="token function">setFaceUrl</span><span class="token punctuation">(</span><span class="token string">&quot;https://avatars.githubusercontent.com/u/2784452?v=4&quot;</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line">request<span class="token punctuation">.</span><span class="token function">setSelfSignature</span><span class="token punctuation">(</span><span class="token string">&quot;hah&quot;</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line">request<span class="token punctuation">.</span><span class="token function">setUserId</span><span class="token punctuation">(</span><span class="token string">&quot;@RBT#1233232&quot;</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span>
<span class="line"><span class="token class-name">CreateRobotResult</span> result <span class="token operator">=</span> client<span class="token punctuation">.</span>robot<span class="token punctuation">.</span><span class="token function">createRobot</span><span class="token punctuation">(</span>request<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span></code></pre><div class="line-numbers" aria-hidden="true" style="counter-reset:line-number 0;"><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div></div></div><h2 id="删除机器人" tabindex="-1"><a class="header-anchor" href="#删除机器人"><span>删除机器人</span></a></h2><p>本接口用于将一个机器人账号设置为无效，机器人是一种特殊账号，userid 必须以 <code>@RBT#</code> 开头。</p><div class="hint-container tip"><p class="hint-container-title">说明</p><ul><li>本接口将一个机器人账号设置为无效。</li><li>机器人账号 UserID 本身不会被删除。</li></ul></div><p>使用示例：</p><div class="language-java line-numbers-mode" data-highlighter="prismjs" data-ext="java" data-title="java"><pre><code><span class="line"><span class="token class-name">DeleteRobotRequest</span> request <span class="token operator">=</span> <span class="token class-name">DeleteRobotRequest</span><span class="token punctuation">.</span><span class="token function">builder</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">robotAccount</span><span class="token punctuation">(</span><span class="token string">&quot;@RBT#1233232&quot;</span><span class="token punctuation">)</span><span class="token punctuation">.</span><span class="token function">build</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span>
<span class="line"><span class="token class-name">DeleteRobotResult</span> result <span class="token operator">=</span> client<span class="token punctuation">.</span>robot<span class="token punctuation">.</span><span class="token function">deleteRobot</span><span class="token punctuation">(</span>request<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span></code></pre><div class="line-numbers" aria-hidden="true" style="counter-reset:line-number 0;"><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div></div></div><h2 id="拉取所有机器人" tabindex="-1"><a class="header-anchor" href="#拉取所有机器人"><span>拉取所有机器人</span></a></h2><p>本接口用于拉取所有的机器人账号列表，机器人是一种特殊账号，userid 必须以 <code>@RBT#</code> 开头。</p><p>使用示例：</p><div class="language-java line-numbers-mode" data-highlighter="prismjs" data-ext="java" data-title="java"><pre><code><span class="line"><span class="token class-name">GetAllRobotsRequest</span> request <span class="token operator">=</span> <span class="token keyword">new</span> <span class="token class-name">GetAllRobotsRequest</span><span class="token punctuation">(</span><span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span>
<span class="line"><span class="token class-name">GetAllRobotsResult</span> result <span class="token operator">=</span> client<span class="token punctuation">.</span>robot<span class="token punctuation">.</span><span class="token function">getAllRobots</span><span class="token punctuation">(</span>request<span class="token punctuation">)</span><span class="token punctuation">;</span></span>
<span class="line"></span></code></pre><div class="line-numbers" aria-hidden="true" style="counter-reset:line-number 0;"><div class="line-number"></div><div class="line-number"></div><div class="line-number"></div></div></div>`,15)]))}const i=s(p,[["render",l],["__file","robot.html.vue"]]),u=JSON.parse('{"path":"/guide/robot.html","title":"机器人","lang":"zh-CN","frontmatter":{},"headers":[{"level":2,"title":"创建机器人","slug":"创建机器人","link":"#创建机器人","children":[]},{"level":2,"title":"删除机器人","slug":"删除机器人","link":"#删除机器人","children":[]},{"level":2,"title":"拉取所有机器人","slug":"拉取所有机器人","link":"#拉取所有机器人","children":[]}],"git":{"updatedTime":1690371416000,"contributors":[{"name":"Yang Libin","email":"szuyanglb@outlook.com","commits":1,"url":"https://github.com/Yang Libin"}]},"filePathRelative":"guide/robot.md"}');export{i as comp,u as data};
