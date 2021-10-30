package io.github.doocs.im.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * Http tool
 *
 * @author bingo
 * @since 2021/7/28 14:55
 */
public class HttpUtil {
    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    private HttpUtil() {
    }

    /**
     * Send a get request
     *
     * @param url Url as string
     * @return response
     * @throws IOException IOException
     */
    public static String get(String url) throws IOException {
        return get(url, null);
    }

    /**
     * Send a get request
     *
     * @param url     Url as string
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String get(String url,
                             Map<String, String> headers) throws IOException {
        return fetch("GET", url, null, headers);
    }

    /**
     * Send a post request
     *
     * @param url     Url as string
     * @param body    Request body as string
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String post(String url, String body,
                              Map<String, String> headers) throws IOException {
        return fetch("POST", url, body, headers);
    }

    /**
     * Send a post request
     *
     * @param url  Url as string
     * @param body Request body as string
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String post(String url, String body) throws IOException {
        return post(url, body, null);
    }

    /**
     * Post a json string
     *
     * @param url     Url as string
     * @param jsonStr a json string
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String postJson(String url, String jsonStr) throws IOException {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        return post(url, jsonStr, headers);
    }

    /**
     * Post a form with parameters
     *
     * @param url    Url as string
     * @param params map with parameters/values
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String postForm(String url, Map<String, String> params)
            throws IOException {
        return postForm(url, params, null);
    }

    /**
     * Post a form with parameters
     *
     * @param url     Url as string
     * @param params  Map with parameters/values
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String postForm(String url, Map<String, String> params,
                                  Map<String, String> headers) throws IOException {
        // set content type
        if (headers == null) {
            headers = new HashMap<>(2);
        }
        headers.put("Content-Type", "application/x-www-form-urlencoded");

        // parse parameters
        StringBuilder body = new StringBuilder();
        if (params != null) {
            boolean first = true;
            for (String param : params.keySet()) {
                if (first) {
                    first = false;
                } else {
                    body.append("&");
                }
                String value = params.get(param);
                body.append(URLEncoder.encode(param, UTF_8)).append("=");
                body.append(URLEncoder.encode(value, UTF_8));
            }
        }

        return post(url, body.toString(), headers);
    }

    /**
     * Send a put request
     *
     * @param url     Url as string
     * @param body    Request body as string
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String put(String url, String body,
                             Map<String, String> headers) throws IOException {
        return fetch("PUT", url, body, headers);
    }

    /**
     * Send a put request
     *
     * @param url Url as string
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String put(String url, String body) throws IOException {
        return put(url, body, null);
    }

    /**
     * Send a delete request
     *
     * @param url     Url as string
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String delete(String url,
                                Map<String, String> headers) throws IOException {
        return fetch("DELETE", url, null, headers);
    }

    /**
     * Send a delete request
     *
     * @param url Url as string
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String delete(String url) throws IOException {
        return delete(url, null);
    }

    /**
     * Append query parameters to given url
     *
     * @param url    Url as string
     * @param params Map with query parameters
     * @return url        Url with query parameters appended
     * @throws IOException IOException
     */
    public static String appendQueryParams(String url,
                                           Map<String, String> params) throws IOException {
        StringBuilder fullUrl = new StringBuilder(url);
        if (params != null) {
            boolean first = (fullUrl.toString().indexOf('?') == -1);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (first) {
                    fullUrl.append('?');
                    first = false;
                } else {
                    fullUrl.append('&');
                }
                String param = entry.getKey();
                String value = entry.getValue();
                fullUrl.append(URLEncoder.encode(param, UTF_8)).append('=');
                fullUrl.append(URLEncoder.encode(value, UTF_8));
            }
        }
        return fullUrl.toString();
    }

    /**
     * Retrieve the query parameters from given url
     *
     * @param url Url containing query parameters
     * @return params     Map with query parameters
     * @throws IOException IOException
     */
    public static Map<String, String> getQueryParams(String url)
            throws IOException {
        Map<String, String> params = new HashMap<>(16);

        int start = url.indexOf('?');
        while (start != -1) {
            // read parameter name
            int equals = url.indexOf('=', start);
            String param = equals == -1 ? url.substring(start + 1) : url.substring(start + 1, equals);

            // read parameter value
            String value = "";
            if (equals != -1) {
                start = url.indexOf('&', equals);
                value = start == -1 ? url.substring(equals + 1) : url.substring(equals + 1, start);
            }

            params.put(URLDecoder.decode(param, UTF_8),
                    URLDecoder.decode(value, UTF_8));
        }

        return params;
    }

    /**
     * Returns the url without query parameters
     *
     * @param url Url containing query parameters
     * @return url        Url without query parameters
     */
    public static String removeQueryParams(String url) {
        int q = url.indexOf('?');
        return q == -1 ? url : url.substring(0, q);
    }

    /**
     * Send a request
     *
     * @param method  HTTP method, for example "GET" or "POST"
     * @param url     Url as string
     * @param body    Request body as string
     * @param headers Optional map with headers
     * @return response   Response as string
     * @throws IOException IOException
     */
    public static String fetch(String method, String url, String body,
                               Map<String, String> headers) throws IOException {
        // connection
        URL u = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        conn.setConnectTimeout(120000);
        conn.setReadTimeout(120000);

        // method
        if (method != null) {
            conn.setRequestMethod(method);
        }

        // headers
        if (headers != null) {
            headers.forEach(conn::addRequestProperty);
        }

        // body
        if (body != null) {
            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(body.getBytes());
            os.flush();
            os.close();
        }

        // response
        InputStream is = conn.getInputStream();
        String response = streamToString(is);

        // handle redirects
        if (conn.getResponseCode() == 301) {
            String location = conn.getHeaderField("Location");
            return fetch(method, location, body, headers);
        }

        return response;
    }

    /**
     * Read an input stream from conn into a string
     *
     * @param in InputStream
     * @return InputStream as string
     * @throws IOException IOException
     */
    public static String streamToString(InputStream in) throws IOException {
        InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String data;
        StringBuilder out = new StringBuilder();
        while ((data = br.readLine()) != null) {
            out.append(data);
        }
        br.close();
        return out.toString();
    }
}
