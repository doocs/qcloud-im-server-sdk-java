package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.CreateOfficialAccountRequest;
import io.github.doocs.im.model.request.DestroyOfficialAccountRequest;
import io.github.doocs.im.model.request.GetOfficialAccountInfoRequest;
import io.github.doocs.im.model.request.GetSubscriberInfoRequest;
import io.github.doocs.im.model.request.ModifyOfficialAccountBaseInfoRequest;
import io.github.doocs.im.model.request.OfficialAccountItem;
import io.github.doocs.im.model.request.SendOfficialAccountMsgRequest;
import io.github.doocs.im.model.response.CreateOfficialAccountResult;
import io.github.doocs.im.model.response.DestroyOfficialAccountResult;
import io.github.doocs.im.model.response.GetOfficialAccountInfoResult;
import io.github.doocs.im.model.response.GetSubscriberInfoResult;
import io.github.doocs.im.model.response.ModifyOfficialAccountBaseInfoResult;
import io.github.doocs.im.model.response.SendOfficialAccountMsgResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

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
        request.setOfficialAccount("test_official_account_user_id");
        DestroyOfficialAccountResult result = client.officialAccount.destroyOfficialAccount(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testModifyOfficialAccountBaseInfo() throws IOException {
        ModifyOfficialAccountBaseInfoRequest request = new ModifyOfficialAccountBaseInfoRequest();
        request.setOfficialAccount("test_official_account_user_id");
        request.setName("test_official_account2");
        ModifyOfficialAccountBaseInfoResult result = client.officialAccount.modifyOfficialAccountBaseInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testSendOfficialAccountMsg() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hello world");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        SendOfficialAccountMsgRequest request = SendOfficialAccountMsgRequest.builder()
                .officialAccount("test_official_account_user_id")
                .random(123)
                .msgBody(msgBody)
                .build();
        SendOfficialAccountMsgResult result = client.officialAccount.sendOfficialAccountMsg(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetOfficialAccountInfo() throws IOException {
        GetOfficialAccountInfoRequest request = new GetOfficialAccountInfoRequest();
        request.setOfficialAccountIdList(Collections.singletonList(new OfficialAccountItem("test_official_account_user_id")));
        GetOfficialAccountInfoResult result = client.officialAccount.getOfficialAccountInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetSubscriberInfo() throws IOException {
        GetSubscriberInfoRequest request = new GetSubscriberInfoRequest();
        request.setOfficialAccount("test_official_account_user_id");
        request.setLimit(10);
        request.setNext("");
        GetSubscriberInfoResult result = client.officialAccount.getSubscriberInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

}
