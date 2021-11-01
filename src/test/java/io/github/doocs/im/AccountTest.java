package io.github.doocs.im;

import io.github.doocs.im.constant.IsNeedDetail;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
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
        String identifier = properties.getProperty("identifier");
        Long appId = Long.parseLong(properties.getProperty("appId"));
        client = ImClient.getInstance(appId, identifier, key);
    }


    @Test
    public void testAccountImport() throws IOException {
        AccountImportRequest request = AccountImportRequest.builder()
                .identifier("user2")
                .faceUrl("http://www.qq.com")
                .nick("ylb")
                .build();
        AccountImportResult result = client.account.accountImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testMultiAccountImport() throws IOException {
        List<String> accounts = new ArrayList<>();
        for (int i = 1; i < 100; ++i) {
            accounts.add("ak" + i);
        }
        MultiAccountImportRequest request = MultiAccountImportRequest.builder().accounts(accounts).build();
        MultiAccountImportResult result = client.account.multiAccountImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAccountDelete() throws IOException {
        AccountDeleteItem item1 = AccountDeleteItem.builder().userId("acbin").build();
        AccountDeleteItem item2 = AccountDeleteItem.builder().userId("test1").build();
        AccountDeleteRequest request = AccountDeleteRequest.builder().deleteItemList(Arrays.asList(item1, item2)).build();
        AccountDeleteResult result = client.account.accountDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAccountCheck() throws IOException {
        AccountCheckItem item1 = new AccountCheckItem("user1");
        AccountCheckItem item2 = new AccountCheckItem("user2");
        AccountCheckRequest request = new AccountCheckRequest(Arrays.asList(item1, item2));
        AccountCheckResult result = client.account.accountCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testKick() throws IOException {
        KickRequest request = new KickRequest("test1");
        KickResult result = client.account.kick(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testQueryState() throws IOException {
        List<String> toAccount = Collections.singletonList("bingo");
        QueryOnlineStatusRequest request = new QueryOnlineStatusRequest(toAccount);
        request.setIsNeedDetail(IsNeedDetail.YES);
        QueryOnlineStatusResult result = client.account.queryOnlineStatus(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
