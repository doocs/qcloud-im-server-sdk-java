package io.github.doocs.im.constant;

/**
 * 客户端平台，对应不同的平台类型
 *
 * @author bingo
 * @since 2021/11/16 11:29
 */
public class OptPlatform {
    /**
     * 使用 REST API 发送请求
     */
    public static final String REST_API = "RESTAPI";

    /**
     * 使用 Web SDK 发送请求
     */
    public static final String WEB = "Web";

    public static final String ANDROID = "Android";

    public static final String IOS = "iOS";

    public static final String WINDOWS = "Windows";

    public static final String MAC = "Mac";

    public static final String IPAD = "IPad";

    /**
     * 使用未知类型的设备发送请求
     */
    public static final String UNKNOWN = "Unknown";
}
