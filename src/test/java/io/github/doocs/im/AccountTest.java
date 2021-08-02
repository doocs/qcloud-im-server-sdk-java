package io.github.doocs.im;

import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

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
        AccountImportRequest request = new AccountImportRequest();
        request.setFaceUrl("http://www.qq.com");
        request.setIdentifier("test1");
        request.setNick("bingo");
        AccountImportResult result = client.account.accountImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testMultiAccountImport() throws IOException {
        MultiAccountImportRequest request = new MultiAccountImportRequest();
        request.setAccounts(Arrays.asList("test1", "test2", "bingo"));
        MultiAccountImportResult result = client.account.multiAccountImport(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAccountDelete() throws IOException {
        AccountDeleteRequest request = new AccountDeleteRequest();
        AccountDeleteItem item1 = new AccountDeleteItem();
        item1.setUserId("acbin");
        AccountDeleteItem item2 = new AccountDeleteItem();
        item2.setUserId("test1");
        request.setDeleteItemList(Arrays.asList(item1, item2));
        AccountDeleteResult result = client.account.accountDelete(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testAccountCheck() throws IOException {
        AccountCheckRequest request = new AccountCheckRequest();
        AccountCheckItem item1 = new AccountCheckItem();
        item1.setUserId("user1");
        AccountCheckItem item2 = new AccountCheckItem();
        item2.setUserId("test1");
        request.setCheckItemList(Arrays.asList(item1, item2));
        AccountCheckResult result = client.account.accountCheck(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testKick() throws IOException {
        KickRequest request = new KickRequest();
        request.setIdentifier("test1");
        KickResult result = client.account.kick(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testQueryState() throws IOException {
        QueryStateRequest request = new QueryStateRequest();
        request.setIsNeedDetail(1);
        request.setToAccount(Arrays.asList("test1", "test2", "user1"));
        QueryStateResult result = client.account.queryState(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
