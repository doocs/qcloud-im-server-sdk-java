export default {
  async fetch(request, env, ctx) {
    const url = new URL(request.url);
    let pathname = url.pathname;

    // Handle root path
    if (pathname === '/') {
      pathname = '/index.html';
    }
    
    try {
      // Try to serve the static asset
      let asset = await env.ASSETS.fetch(request);
      
      if (asset.status === 404) {
        // Try with .html extension for clean URLs
        const htmlPath = pathname.endsWith('/') 
          ? `${pathname}index.html` 
          : `${pathname}.html`;
        const htmlRequest = new Request(new URL(htmlPath, request.url), request);
        asset = await env.ASSETS.fetch(htmlRequest);
        
        if (asset.status === 404 && !pathname.endsWith('/')) {
          // Try index.html in the directory
          const indexRequest = new Request(new URL(`${pathname}/index.html`, request.url), request);
          asset = await env.ASSETS.fetch(indexRequest);
        }
      }
      
      return asset;
    } catch (e) {
      return new Response(`Error: ${e.message}`, { status: 500 });
    }
  },
};
