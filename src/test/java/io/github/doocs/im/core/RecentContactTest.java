package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.AssistFlags;
import io.github.doocs.im.constant.ClearRamble;
import io.github.doocs.im.constant.RecentContactType;
import io.github.doocs.im.model.request.DeleteRecentContactRequest;
import io.github.doocs.im.model.request.GetRecentContactListRequest;
import io.github.doocs.im.model.response.DeleteRecentContactResult;
import io.github.doocs.im.model.response.GetRecentContactListResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 最近联系人测试类 {@link io.github.doocs.im.core.RecentContact}
 *
 * @author bingo
 * @since 2021/10/11 10:56
 */
class RecentContactTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testGetRecentContactList() throws IOException {
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
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testDeleteRecentContact() throws IOException {
        DeleteRecentContactRequest request = DeleteRecentContactRequest.builder()
                .fromAccount("doocs_1")
                .type(RecentContactType.C2C)
                .toAccount("doocs_2")
                .clearRamble(ClearRamble.YES)
                .build();

        DeleteRecentContactResult result = client.recentContact.deleteRecentContact(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
