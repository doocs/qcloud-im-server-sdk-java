package io.github.doocs.im;

import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.IsNeedDetail;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * 帐号管理测试类 {@link io.github.doocs.im.core.Account}
 *
 * @author bingo
 * @since 2021/7/30 16:17
 */
public class AccountTest {
    private static final Properties properties = new Properties();
    private static final ImClient client;

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


    @Test
    public void testAccountImport() throws IOException {
        AccountImportRequest request = AccountImportRequest.builder()
                .userId("admin")
                .faceUrl("https://avatars.githubusercontent.com/u/43716716?s=200&v=4")
                .nick("doocs")
                .build();

        AccountImportResult result = client.account.accountImport(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testMultiAccountImport() throws IOException {
        List<String> accounts = new ArrayList<>();
        accounts.add("user1");
        accounts.add("user2");
        MultiAccountImportRequest request = new MultiAccountImportRequest(accounts);

        MultiAccountImportResult result = client.account.multiAccountImport(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testAccountDelete() throws IOException {
        AccountDeleteItem item1 = AccountDeleteItem.builder().userId("user1").build();
        AccountDeleteItem item2 = AccountDeleteItem.builder().userId("user2").build();
        List<AccountDeleteItem> deleteItems = Arrays.asList(item1, item2);
        AccountDeleteRequest request = new AccountDeleteRequest(deleteItems);

        AccountDeleteResult result = client.account.accountDelete(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testAccountCheck() throws IOException {
        AccountCheckItem item1 = new AccountCheckItem("user1");
        AccountCheckItem item2 = new AccountCheckItem("user2");
        List<AccountCheckItem> checkItems = Arrays.asList(item1, item2);
        AccountCheckRequest request = new AccountCheckRequest(checkItems);

        AccountCheckResult result = client.account.accountCheck(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testKick() throws IOException {
        KickRequest request = new KickRequest("test1");

        KickResult result = client.account.kick(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testQueryOnlineStatus() throws IOException {
        List<String> toAccount = Arrays.asList("user1", "user2");
        QueryOnlineStatusRequest request = QueryOnlineStatusRequest.builder()
                .toAccount(toAccount)
                .isNeedDetail(IsNeedDetail.YES)
                .build();

        QueryOnlineStatusResult result = client.account.queryOnlineStatus(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
