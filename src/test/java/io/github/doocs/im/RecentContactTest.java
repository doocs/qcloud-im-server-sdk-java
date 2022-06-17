package io.github.doocs.im;

import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.AssistFlags;
import io.github.doocs.im.constant.ClearRamble;
import io.github.doocs.im.constant.RecentContactType;
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
 * 最近联系人测试类 {@link io.github.doocs.im.core.RecentContact}
 *
 * @author bingo
 * @since 2021/10/11 10:56
 */
public class RecentContactTest {
    private static final Properties properties = new Properties();
    private static final ImClient client;

    static {
        InputStream resourceAsStream = RecentContactTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testGetRecentContactList() throws IOException {
        GetRecentContactListRequest request = GetRecentContactListRequest.builder()
                .fromAccount("doocs")
                .timestamp(0)
                .startIndex(0)
                .topTimestamp(0)
                .topStartIndex(0)
                .assistFlags(AssistFlags.BIT_0)
                .build();

        GetRecentContactListResult result = client.recentContact.recentContactList(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testDeleteRecentContact() throws IOException {
        DeleteRecentContactRequest request = DeleteRecentContactRequest.builder()
                .fromAccount("doocs_1")
                .type(RecentContactType.C2C)
                .toAccount("doocs_2")
                .clearRamble(ClearRamble.YES)
                .build();

        DeleteRecentContactResult result = client.recentContact.deleteRecentContact(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
