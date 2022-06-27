package io.github.doocs.im.constant;

/**
 * 公共错误码
 *
 * @author bingo
 * @since 2021/10/30 9:54
 */
public enum ErrorCode {
    /**
     * REST API 公共错误码：<a href="https://cloud.tencent.com/document/product/269/1519">...</a>
     */
    SUCCESS(0, "成功"),
    MSG_TEXT_SECURITY_STRIKE(80001, "消息文本安全打击"),
    HTTP_PARSE_ERROR(60002, "HTTP 解析错误 ，请检查 HTTP 请求 URL 格式"),
    HTTP_JSON_PARSE_ERROR(60002, "HTTP 请求 JSON 解析错误，请检查 JSON 格式"),
    WRONG_ACCOUNT_OR_SIGNATURE(60004, "请求 URL 或 JSON 包体中帐号或签名错误"),
    WRONG_ACCOUNT_OR_SIGNATURE_2(60005, "请求 URL 或 JSON 包体中帐号或签名错误"),
    INVALID_SDK_APP_ID(60006, "SDKAppID 失效，请核对 SDKAppID 有效性"),
    EXCEED_FREQUENCY_LIMIT_REST_API(60007, "REST 接口调用频率超过限制，请降低请求频率"),
    SERVICE_TIMEOUT_OR_WRONG_HTTP_REQUEST_FORMAT(60008, "服务请求超时或 HTTP 请求格式错误，请检查并重试"),
    REQUEST_RESOURCE_ERROR(60009, "请求资源错误，请检查请求 URL"),
    NEED_ADMIN_AUTHORITY(60010, "请求需要 App 管理员权限"),
    EXCEED_FREQUENCY_LIMIT_SDK_APP_ID(60011, "SDKAppID 请求频率超限，请降低请求频率"),
    NEED_SDK_APP_ID(60012, "REST 接口需要带 SDKAppID，请检查请求 URL 中的 SDKAppID"),
    HTTP_RESPONSE_JSON_PARSE_ERROR(60013, "HTTP 响应包 JSON 解析错误"),
    DISPLACE_ACCOUNT_TIMEOUT(60014, "置换帐号超时"),
    WRONG_ACCOUNT_TYPE(60015, "请求包体帐号类型错误，请确认帐号为字符串格式"),
    SDK_APP_ID_DISABLED(60016, "SDKAppID 被禁用"),
    REQUEST_DISABLED(60017, "请求被禁用"),
    REQUEST_TOO_FREQUENT(60018, "请求过于频繁，请稍后重试"),
    REQUEST_TOO_FREQUENT_2(60019, "请求过于频繁，请稍后重试"),
    EXPIRED_PRO_PACKAGE(60020, "您的专业版套餐包已到期并停用，请登录 即时通信 IM 购买页面 重新购买套餐包。购买后，将在5分钟后生效"),
    ILLEGAL_IP_REST_API(60021, "RestAPI 调用来源 IP 非法"),
    ;

    ErrorCode(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    private Integer code;
    private String info;

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
