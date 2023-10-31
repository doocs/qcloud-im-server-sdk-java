package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.*;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/**
 * 内容审核测试类 {@link io.github.doocs.im.core.Audit}
 *
 * @author bingo
 * @since 2023/7/26 10:56
 */
class AuditTest {
    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testAddLocalAuditKeywords() throws IOException {
        LocalAuditWord word = new LocalAuditWord();
        word.setFilterType(AuditFilterType.REPLACE);
        word.setWordType(AuditWordType.SENSITIVE_WORDS);
        word.setKeyword("caonima");
        word.setReplacedContent("****");
        AddLocalAuditKeywordsRequest request = AddLocalAuditKeywordsRequest.builder()
                .sdkAppId(1400594307)
                .localAuditWords(Collections.singletonList(word)).build();
        AddLocalAuditKeywordsResult result = client.audit.addLocalAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDeleteLocalAuditKeywords() throws IOException {
        DeleteLocalAuditKeywordsRequest request = new DeleteLocalAuditKeywordsRequest();
        request.setSdkAppId(1400594307);
        LocalAuditWord word = new LocalAuditWord();
        word.setId(1L);
        word.setReplacedContent("****");
        word.setKeyword("caonima");
        word.setWordType(AuditWordType.SENSITIVE_WORDS);
        word.setFilterType(AuditFilterType.REPLACE);
        request.setLocalAuditWords(Collections.singletonList(word));
        DeleteLocalAuditKeywordsResult result = client.audit.deleteLocalAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetLocalAuditKeywords() throws IOException {
        GetLocalAuditKeywordsRequest request = GetLocalAuditKeywordsRequest.builder().keyword("caonima")
                .filterType(AuditFilterType.REPLACE)
                .limit(1).offset(0).sdkAppId(1400594307).build();
        GetLocalAuditKeywordsResult result = client.audit.getLocalAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testContentModeration() throws IOException {
        ContentModerationRequest request = ContentModerationRequest.builder().content("122")
                .contentType(AuditContentType.TEXT)
                .auditName(AuditNameType.C2C)
                .build();
        ContentModerationResult result = client.audit.contentModeration(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testBatchContentModeration() throws IOException {
        BatchContentModerationRequest request = new BatchContentModerationRequest();
        request.setAuditName(AuditNameType.GROUP);
        AuditContentItem item1 = new AuditContentItem();
        item1.setContent("f*ck uuu");
        item1.setContentId(323245334);
        item1.setContentType(AuditContentType.TEXT);
        AuditContentItem item2 = AuditContentItem.builder()
                .contentId(435545)
                .contentType(AuditContentType.TEXT)
                .content("cnm").build();
        request.setContents(Arrays.asList(item1, item2));
        BatchContentModerationResult result = client.audit.batchContentModeration(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetCloudAuditKeywordsIds() throws IOException {
        GetCloudAuditKeyWordsIdsRequest request = GetCloudAuditKeyWordsIdsRequest.builder()
                .limit(1)
                .offset(0)
                .sdkAppId(1400594307)
                .build();
        GetCloudAuditKeywordsIdsResult result = client.audit.getCloudAuditKeywordsIds(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testGetCloudAuditKeywords() throws IOException {
        GetCloudAuditKeyWordsRequest request = GetCloudAuditKeyWordsRequest.builder()
                .libId("fd")
                .limit(1)
                .offset(0)
                .sdkAppId(1400594307)
                .build();
        GetCloudAuditKeywordsResult result = client.audit.getCloudAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testAddCloudAuditKeywords() throws IOException {
        UserKeyword userKeyword = new UserKeyword();
        userKeyword.setContent("caonima");
        userKeyword.setLabel(ContentModerationLabel.COMPOSITE);
        AddCloudAuditKeywordsRequest request = AddCloudAuditKeywordsRequest.builder()
                .sdkAppId(1400594307)
                .libId("fd")
                .userKeywords(Collections.singletonList(userKeyword))
                .build();
        AddCloudAuditKeywordsResult result = client.audit.addCloudAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }

    @Test
    void testDeleteCloudAuditKeywords() throws IOException {
        DeleteCloudAuditKeywordsRequest request = DeleteCloudAuditKeywordsRequest.builder()
                .sdkAppId(1400594307)
                .libId("fd")
                .keywords(Arrays.asList("caonima", "wtf")).build();
        DeleteCloudAuditKeywordsResult result = client.audit.deleteCloudAuditKeywords(request);
        System.out.println(result);
        Assertions.assertEquals(ErrorCode.SUCCESS.getCode(), result.getErrorCode());
    }
}
