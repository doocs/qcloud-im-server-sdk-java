package com.qcloud.im;

import com.qcloud.im.model.request.AccountImportRequest;
import com.qcloud.im.model.response.AccountImportResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author bingo
 * @since 2021/7/30 16:17
 */
public class AccountTest {

    @Test
    public void testAccountImport() throws IOException {
        long appId = 11212L;
        String key = "xxx";
        String userId = "test";
        IMClient client = IMClient.getInstance(appId, userId, key);
        AccountImportRequest request = new AccountImportRequest();
        request.setFaceUrl("http://www.qq.com");
        request.setIdentifier("bingo123");
        request.setNick("bingo");
        AccountImportResult accountImportResult = client.account.accountImport(request);
        Assert.assertEquals(accountImportResult.getActionStatus(), "OK");
    }
}
