package io.github.doocs.im;

import io.github.doocs.im.constant.ChatType;
import io.github.doocs.im.constant.ErrorCode;
import io.github.doocs.im.constant.NoSpeakingTime;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * 全局禁言管理、运营管理测试类
 *
 * @author xy
 * @since 2021/07/31 15:36:40
 */
public class OperationTest {
    private static final Properties properties = new Properties();
    private static final ImClient client;

    static {
        InputStream resourceAsStream = OperationTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testSetNoSpeaking() throws IOException {
        SetNoSpeakingRequest request = SetNoSpeakingRequest.builder()
                .setAccount("test1")
                .msgNoSpeakingTime(NoSpeakingTime.NEVER)
                .groupMsgNoSpeakingTime(NoSpeakingTime.FOREVER)
                .build();

        SetNoSpeakingResult result = client.operation.setNoSpeaking(request);
        System.out.println(result);
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    public void testGetNoSpeaking() throws IOException {
        GetNoSpeakingRequest request = new GetNoSpeakingRequest("test1");

        GetNoSpeakingResult result = client.operation.getNoSpeaking(request);
        System.out.println(result);
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    public void testGetAppInfo() throws IOException {
        GetAppInfoRequest request = new GetAppInfoRequest();
        List<String> requestFields = Arrays.asList("ChainIncrease", "ChainDecrease");
        request.setRequestField(requestFields);

        GetAppInfoResult result = client.operation.getAppInfo(request);
        System.out.println(result);
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    public void testGetHistory() throws IOException {
        GetHistoryRequest request = GetHistoryRequest.builder()
                .chatType(ChatType.C2C)
                .msgTime("2015120121")
                .build();

        GetHistoryResult result = client.operation.getHistory(request);
        System.out.println(result);
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    public void testGetIpList() throws IOException {
        GetIpListRequest request = new GetIpListRequest();

        GetIpListResult result = client.operation.getIpList(request);
        System.out.println(result);
        Assert.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }
}
