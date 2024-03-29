package io.github.doocs.im;

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
    private static ImClient client;
    private static final Properties properties = new Properties();

    static {
        InputStream resourceAsStream = ClientFactory.class.getClassLoader().getResourceAsStream("app.properties");
        try {
            properties.load(resourceAsStream);
            String key = properties.getProperty("key");
            String userId = properties.getProperty("userId");
            Long appId = Long.parseLong(properties.getProperty("appId"));
            ClientConfiguration config = new ClientConfiguration();
            config.setCallTimeout(20_000);
            config.setReadTimeout(10_000);
            config.setWriteTimeout(10_000);
            client = ImClient.getInstance(appId, userId, key, config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ImClient getInstance() {
        return client;
    }
}
