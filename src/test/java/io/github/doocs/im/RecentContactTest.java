package io.github.doocs.im;

import io.github.doocs.im.model.request.DeleteRecentContactRequest;
import io.github.doocs.im.model.request.GetRecentContactListRequest;
import io.github.doocs.im.model.response.DeleteRecentContactResult;
import io.github.doocs.im.model.response.GetRecentContactListResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/10/11 10:56
 */
public class RecentContactTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = RecentContactTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testGetRecentContactList() throws IOException {
        GetRecentContactListRequest request = new GetRecentContactListRequest();
        request.setFromAccount("bingo");
        request.setAssistFlags(1);
        request.setStartIndex(0);
        request.setTimestamp(213213123);
        request.setTopStartIndex(100);
        request.setTopTimestamp(1121212121);
        GetRecentContactListResult result = client.recentContact.recentContactList(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testDeleteRecentContact() throws IOException {
        DeleteRecentContactRequest request = new DeleteRecentContactRequest();
        request.setFromAccount("bingo");
        request.setToAccount("test1");
        request.setType(1);
        request.setClearRamble(2);
        DeleteRecentContactResult result = client.recentContact.deleteRecentContact(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
