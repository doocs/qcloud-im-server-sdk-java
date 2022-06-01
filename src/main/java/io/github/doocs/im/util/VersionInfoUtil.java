package io.github.doocs.im.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 版本工具类
 *
 * @author bingo
 * @since 2021/11/2 14:21
 */
public class VersionInfoUtil {
    private static String version = null;
    private static String defaultUserAgent = null;

    private static final String VERSION_INFO_FILE = "version.properties";
    private static final String USER_AGENT_PREFIX = "qcloud-im-server-sdk-java";

    private VersionInfoUtil() {
    }

    public static String getDefaultUserAgent() {
        if (defaultUserAgent == null) {
            String osName = System.getProperty("os.name");
            String osVersion = System.getProperty("os.version");
            String osArch = System.getProperty("os.arch");
            String javaVersion = System.getProperty("java.version");
            defaultUserAgent = String.format("%s/%s(%s/%s/%s;%s)", USER_AGENT_PREFIX, getVersion(), osName, osVersion, osArch, javaVersion);
        }
        return defaultUserAgent;
    }

    private static String getVersion() {
        if (version == null) {
            init();
        }
        return version;
    }

    private static void init() {
        Properties versionProperties = new Properties();
        try (InputStream is = VersionInfoUtil.class.getClassLoader().getResourceAsStream(VERSION_INFO_FILE)) {
            if (is != null) {
                versionProperties.load(is);
                version = versionProperties.getProperty("version");
            }
        } catch (IOException e) {
            version = "unknown-version";
        }
    }
}
