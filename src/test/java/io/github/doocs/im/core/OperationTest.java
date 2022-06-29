package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ChatType;
import io.github.doocs.im.constant.ErrorCode;
import io.github.doocs.im.constant.NoSpeakingTime;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 全局禁言管理、运营管理测试类 {@link io.github.doocs.im.core.Operation}
 *
 * @author xy
 * @since 2021/07/31 15:36:40
 */
class OperationTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testSetNoSpeaking() throws IOException {
        SetNoSpeakingRequest request = SetNoSpeakingRequest.builder()
                .setAccount("test1")
                .msgNoSpeakingTime(NoSpeakingTime.NEVER)
                .groupMsgNoSpeakingTime(NoSpeakingTime.FOREVER)
                .build();

        SetNoSpeakingResult result = client.operation.setNoSpeaking(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetNoSpeaking() throws IOException {
        GetNoSpeakingRequest request = new GetNoSpeakingRequest("test1");

        GetNoSpeakingResult result = client.operation.getNoSpeaking(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetAppInfo() throws IOException {
        GetAppInfoRequest request = new GetAppInfoRequest();
        List<String> requestFields = Arrays.asList("ChainIncrease", "ChainDecrease");
        request.setRequestField(requestFields);

        GetAppInfoResult result = client.operation.getAppInfo(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetHistory() throws IOException {
        GetHistoryRequest request = GetHistoryRequest.builder()
                .chatType(ChatType.C2C)
                .msgTime("2015120121")
                .build();

        GetHistoryResult result = client.operation.getHistory(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetIpList() throws IOException {
        GetIpListRequest request = new GetIpListRequest();

        GetIpListResult result = client.operation.getIpList(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testForbidIllegalObject() throws IOException {
        ForbidIllegalObjectRequest request = ForbidIllegalObjectRequest.builder()
                .rawUrl("https://cos.ap-shanghai.myqcloud.com/005f-shanghai-360-shared-01-1256635546/76aa-1400152839/2f3b-2273451635034382/699eb4ee5ffa9aeb70627958766f2927-142072.jpg")
                .build();

        ForbidIllegalObjectResult result = client.operation.forbidIllegalObject(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testAllowBannedObject() throws IOException {
        AllowBannedObjectRequest request = AllowBannedObjectRequest.builder()
                .rawUrl("https://cos.ap-shanghai.myqcloud.com/005f-shanghai-360-shared-01-1256635546/76aa-1400152839/2f3b-2273451635034382/699eb4ee5ffa9aeb70627958766f2927-142072.jpg")
                .build();

        AllowBannedObjectResult result = client.operation.allowBannedObject(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetCosSig() throws IOException {
        RawUrlItem item = new RawUrlItem();
        item.setRawUrl("https://cos.ap-shanghai.myqcloud.com/98ec-shanghai-007-privatev2-01-1256635546/0345-1400187352/0612-yyy/9a0f4c42d208ccfb5aa47c29284aefc6.png");
        item.setResourceId(1);
        List<RawUrlItem> rawUrls = Collections.singletonList(item);
        GetCosSigRequest request = GetCosSigRequest.builder()
                .rawUrls(rawUrls)
                .build();

        GetCosSigResult result = client.operation.getCosSig(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }
}
