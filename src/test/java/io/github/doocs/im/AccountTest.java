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
    private static final IMClient client;

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
        client = IMClient.getInstance(appId, identifier, key);
    }


    @Test
    public void testAccountImport() throws IOException {
        AccountImportRequest request = new AccountImportRequest("test1");
        request.setFaceUrl("http://www.qq.com");
        request.setNick("bingo");
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
        MultiAccountImportRequest request = new MultiAccountImportRequest(accounts);
        MultiAccountImportResult result = client.account.multiAccountImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAccountDelete() throws IOException {
        AccountDeleteItem item1 = new AccountDeleteItem("acbin");
        AccountDeleteItem item2 = new AccountDeleteItem("test1");
        AccountDeleteRequest request = new AccountDeleteRequest(Arrays.asList(item1, item2));
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
        QueryStateRequest request = new QueryStateRequest(toAccount);
        request.setIsNeedDetail(IsNeedDetail.YES);
        QueryStateResult result = client.account.queryState(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
