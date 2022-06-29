package io.github.doocs.im;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 客户端工厂测试类 {@link ClientFactory}
 *
 * @author bingo
 * @since 2022/6/29 15:08
 */
class ClientFactoryTest {

    @Test
    void testGetInstance() {
        ImClient client = ClientFactory.getInstance();
        System.out.println(client);
        Assertions.assertNotNull(client, "client is null");
    }
}
