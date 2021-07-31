package com.qcloud.im;

import com.qcloud.im.model.request.GetAppidGroupListRequest;
import com.qcloud.im.model.response.GetAppidGroupListResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 21:05
 */
public class GroupTest {
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
    public void testGetAppidGroupList() throws IOException {
        GetAppidGroupListRequest request = new GetAppidGroupListRequest();
        request.setLimit(10);
        request.setGroupType("Public");
        request.setNext(0);
        GetAppidGroupListResult result = client.group.getAppidGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }
}
