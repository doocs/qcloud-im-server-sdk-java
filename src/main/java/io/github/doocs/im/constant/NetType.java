package io.github.doocs.im.constant;

/**
 * 请求指定类型的服务器 IP 地址列表
 *
 * @author bingo
 * @since 2022/6/1 14:06
 */
public class NetType {
    /**
     * 所有的服务器 IP 地址列表
     */
    public static final int ALL = 0;

    /**
     * native SDK 访问的中国地区(包括中国香港)服务器 IP 地址列表
     */
    public static final int NATIVE_SDK_CHINA = 1;

    /**
     * native SDK 访问的海外地区服务器地址列表
     */
    public static final int NATIVE_SDK_OVERSEAS = 2;

    /**
     * web SDK 访问的中国地区(包括中国香港)服务器 IP 地址列表
     */
    public static final int WEB_SDK_CHINA = 3;

    /**
     * web SDK 访问的海外地区服务器地址列表
     */
    public static final int WEB_SDK_OVERSEAS = 4;

    /**
     * IM 回调中国地区(包括中国香港)的出口地址列表
     */
    public static final int IM_CALLBACK_CHINA = 5;

    /**
     * IM 回调海外地区的出口地址列表
     */
    public static final int IM_CALLBACK_OVERSEAS = 6;

    private NetType() {
    }
}
