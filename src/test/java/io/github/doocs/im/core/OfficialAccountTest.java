package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.model.request.CreateOfficialAccountRequest;
import io.github.doocs.im.model.request.DestroyOfficialAccountRequest;
import io.github.doocs.im.model.request.ModifyOfficialAccountBaseInfoRequest;
import io.github.doocs.im.model.response.CreateOfficialAccountResult;
import io.github.doocs.im.model.response.DestroyOfficialAccountResult;
import io.github.doocs.im.model.response.ModifyOfficialAccountBaseInfoResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 公众号测试类 {@link OfficialAccount}
 *
 * @author hyh
 * @since 2024/1/10 10:00
 */
class OfficialAccountTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testCreateOfficialAccount() throws IOException {
        CreateOfficialAccountRequest request = new CreateOfficialAccountRequest();
        request.setOwnerAccount("test");
        request.setName("test_official_account");
        CreateOfficialAccountResult result = client.officialAccount.createOfficialAccount(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void tesDestroyOfficialAccount() throws IOException {
        DestroyOfficialAccountRequest request = new DestroyOfficialAccountRequest();
        request.setOfficialAccount("test_official_account_id");
        DestroyOfficialAccountResult result = client.officialAccount.destroyOfficialAccount(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testModifyOfficialAccountBaseInfo () throws IOException {
        ModifyOfficialAccountBaseInfoRequest request = new ModifyOfficialAccountBaseInfoRequest();
        request.setOfficialAccount("test_official_account_id");
        request.setName("test_official_account2");
        ModifyOfficialAccountBaseInfoResult result = client.officialAccount.modifyOfficialAccountBaseInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

}
