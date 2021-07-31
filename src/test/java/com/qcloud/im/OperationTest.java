package com.qcloud.im;

import com.qcloud.im.model.request.GetNoSpeakingRequest;
import com.qcloud.im.model.request.SetNoSpeakingRequest;
import com.qcloud.im.model.response.GetNoSpeakingResult;
import com.qcloud.im.model.response.SetNoSpeakingResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/30 16:17
 */
public class OperationTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = OperationTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testSetNoSpeaking() throws IOException {
        SetNoSpeakingRequest request = new SetNoSpeakingRequest();
        request.setSetAccount("test1");
        request.setMsgNoSpeakingTime(11111);
        request.setGroupMsgNoSpeakingTime(11111);
        SetNoSpeakingResult result = client.operation.setNoSpeaking(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetNoSpeaking() throws IOException {
        GetNoSpeakingRequest request = new GetNoSpeakingRequest();
        request.setGetAccount("test1");
        GetNoSpeakingResult result = client.operation.getNoSpeaking(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

}
