package io.github.doocs.im;

import io.github.doocs.im.core.AccountTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 单元测试类-客户端工厂
 *
 * @author bingo
 * @since 2022/6/29 11:17
 */
public class ClientFactory {
    private static final ImClient client;
    private static final Properties properties = new Properties();

    static {
        InputStream resourceAsStream = AccountTest.class.getClassLoader().getResourceAsStream("app.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String key = properties.getProperty("key");
        String userId = properties.getProperty("userId");
        Long appId = Long.parseLong(properties.getProperty("appId"));
        client = ImClient.getInstance(appId, userId, key);
    }

    public static ImClient getInstance() {
        return client;
    }
}
