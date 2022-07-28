package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.IsNeedDetail;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.RandomUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 帐号管理测试类 {@link io.github.doocs.im.core.Account}
 *
 * @author bingo
 * @since 2021/7/30 16:17
 */
class AccountTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }


    @Test
    void testAccountImport() throws IOException {
        AccountImportRequest request = AccountImportRequest.builder()
                .userId("admin")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .nick("doocs")
                .build();

        long random = RandomUtil.next();
        AccountImportResult result = client.account.accountImport(request, random);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testMultiAccountImport() throws IOException {
        List<String> accounts = new ArrayList<>();
        accounts.add("user1");
        accounts.add("user2");
        MultiAccountImportRequest request = new MultiAccountImportRequest(accounts);

        MultiAccountImportResult result = client.account.multiAccountImport(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testAccountDelete() throws IOException {
        AccountDeleteItem item1 = AccountDeleteItem.builder().userId("user1").build();
        AccountDeleteItem item2 = AccountDeleteItem.builder().userId("user2").build();
        List<AccountDeleteItem> deleteItems = Arrays.asList(item1, item2);
        AccountDeleteRequest request = new AccountDeleteRequest(deleteItems);

        AccountDeleteResult result = client.account.accountDelete(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testAccountCheck() throws IOException {
        AccountCheckItem item1 = new AccountCheckItem("user1");
        AccountCheckItem item2 = new AccountCheckItem("user2");
        List<AccountCheckItem> checkItems = Arrays.asList(item1, item2);
        AccountCheckRequest request = new AccountCheckRequest(checkItems);

        AccountCheckResult result = client.account.accountCheck(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testKick() throws IOException {
        KickRequest request = new KickRequest("test1");

        KickResult result = client.account.kick(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testQueryOnlineStatus() throws IOException {
        List<String> toAccount = Arrays.asList("user1", "user2");
        QueryOnlineStatusRequest request = QueryOnlineStatusRequest.builder()
                .toAccount(toAccount)
                .isNeedDetail(IsNeedDetail.YES)
                .build();

        QueryOnlineStatusResult result = client.account.queryOnlineStatus(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
