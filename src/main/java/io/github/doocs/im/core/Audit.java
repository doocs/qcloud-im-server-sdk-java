package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.AddCloudAuditKeywordsRequest;
import io.github.doocs.im.model.request.AddLocalAuditKeywordsRequest;
import io.github.doocs.im.model.request.BatchContentModerationRequest;
import io.github.doocs.im.model.request.ContentModerationRequest;
import io.github.doocs.im.model.request.DeleteCloudAuditKeywordsRequest;
import io.github.doocs.im.model.request.DeleteLocalAuditKeywordsRequest;
import io.github.doocs.im.model.request.GetCloudAuditKeyWordsIdsRequest;
import io.github.doocs.im.model.request.GetCloudAuditKeyWordsRequest;
import io.github.doocs.im.model.request.GetLocalAuditKeywordsRequest;
import io.github.doocs.im.model.response.AddCloudAuditKeywordsResult;
import io.github.doocs.im.model.response.AddLocalAuditKeywordsResult;
import io.github.doocs.im.model.response.BatchContentModerationResult;
import io.github.doocs.im.model.response.ContentModerationResult;
import io.github.doocs.im.model.response.DeleteCloudAuditKeywordsResult;
import io.github.doocs.im.model.response.DeleteLocalAuditKeywordsResult;
import io.github.doocs.im.model.response.GetCloudAuditKeywordsIdsResult;
import io.github.doocs.im.model.response.GetCloudAuditKeywordsResult;
import io.github.doocs.im.model.response.GetLocalAuditKeywordsResult;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 内容审核
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
public class Audit {
    /**
     * 内容审核服务名
     */
    public static final String SERVICE_NAME_MRG = "im_msg_audit_mgr";
    public static final String SERVICE_NAME = "im_msg_audit";

    /**
     * 本地审核
     */
    public static final String ADD_LOCAL_AUDIT_KEYWORDS_COMMAND = "add_local_audit_keywords";
    public static final String DELETE_LOCAL_AUDIT_KEYWORDS_COMMAND = "delete_local_audit_keywords";
    public static final String GET_LOCAL_AUDIT_KEYWORDS_COMMAND = "get_local_audit_keywords";

    /**
     * 云端审核
     */
    public static final String CONTENT_MODERATION_COMMAND = "content_moderation";
    public static final String BATCH_CONTENT_MODERATION_COMMAND = "batch_content_moderation";
    public static final String GET_CLOUD_AUDIT_KEYWORDS_IDS_COMMAND = "get_cloud_audit_keywords_ids";
    public static final String GET_CLOUD_AUDIT_KEYWORDS_COMMAND = "get_cloud_audit_keywords";
    public static final String ADD_CLOUD_AUDIT_KEYWORDS_COMMAND = "add_cloud_audit_keywords";
    public static final String DELETE_CLOUD_AUDIT_KEYWORDS_COMMAND = "delete_cloud_audit_keywords";

    private final ImClient imClient;

    public Audit(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 本地审核添加敏感词
     *
     * @param addLocalAuditKeywordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AddLocalAuditKeywordsResult addLocalAuditKeywords(AddLocalAuditKeywordsRequest addLocalAuditKeywordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, ADD_LOCAL_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, addLocalAuditKeywordsRequest, AddLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    public AddLocalAuditKeywordsResult addLocalAuditKeywords(AddLocalAuditKeywordsRequest addLocalAuditKeywordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, ADD_LOCAL_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, addLocalAuditKeywordsRequest, AddLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    /**
     * 本地审核删除敏感词
     *
     * @param deleteLocalAuditKeywordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteLocalAuditKeywordsResult deleteLocalAuditKeywords(DeleteLocalAuditKeywordsRequest deleteLocalAuditKeywordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, DELETE_LOCAL_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, deleteLocalAuditKeywordsRequest, DeleteLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    public DeleteLocalAuditKeywordsResult deleteLocalAuditKeywords(DeleteLocalAuditKeywordsRequest deleteLocalAuditKeywordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, DELETE_LOCAL_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, deleteLocalAuditKeywordsRequest, DeleteLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    /**
     * 本地审核获取敏感词
     *
     * @param getLocalAuditKeywordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetLocalAuditKeywordsResult getLocalAuditKeywords(GetLocalAuditKeywordsRequest getLocalAuditKeywordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_LOCAL_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, getLocalAuditKeywordsRequest, GetLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    public GetLocalAuditKeywordsResult getLocalAuditKeywords(GetLocalAuditKeywordsRequest getLocalAuditKeywordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_LOCAL_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, getLocalAuditKeywordsRequest, GetLocalAuditKeywordsResult.class, imClient.getConfig());
    }

    /**
     * 云端审核主动审核
     *
     * @param contentModerationRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ContentModerationResult contentModeration(ContentModerationRequest contentModerationRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CONTENT_MODERATION_COMMAND);
        return HttpUtil.post(url, contentModerationRequest, ContentModerationResult.class, imClient.getConfig());
    }

    public ContentModerationResult contentModeration(ContentModerationRequest contentModerationRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, CONTENT_MODERATION_COMMAND, random);
        return HttpUtil.post(url, contentModerationRequest, ContentModerationResult.class, imClient.getConfig());
    }

    /**
     * 云端审核批量审核
     *
     * @param batchContentModerationRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public BatchContentModerationResult batchContentModeration(BatchContentModerationRequest batchContentModerationRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BATCH_CONTENT_MODERATION_COMMAND);
        return HttpUtil.post(url, batchContentModerationRequest, BatchContentModerationResult.class, imClient.getConfig());
    }

    public BatchContentModerationResult batchContentModeration(BatchContentModerationRequest batchContentModerationRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, BATCH_CONTENT_MODERATION_COMMAND, random);
        return HttpUtil.post(url, batchContentModerationRequest, BatchContentModerationResult.class, imClient.getConfig());
    }

    /**
     * 云端审核获取词库列表
     *
     * @param getCloudAuditKeyWordsIdsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetCloudAuditKeywordsIdsResult getCloudAuditKeywordsIds(GetCloudAuditKeyWordsIdsRequest getCloudAuditKeyWordsIdsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_CLOUD_AUDIT_KEYWORDS_IDS_COMMAND);
        return HttpUtil.post(url, getCloudAuditKeyWordsIdsRequest, GetCloudAuditKeywordsIdsResult.class, imClient.getConfig());
    }

    public GetCloudAuditKeywordsIdsResult getCloudAuditKeywordsIds(GetCloudAuditKeyWordsIdsRequest getCloudAuditKeyWordsIdsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_CLOUD_AUDIT_KEYWORDS_IDS_COMMAND, random);
        return HttpUtil.post(url, getCloudAuditKeyWordsIdsRequest, GetCloudAuditKeywordsIdsResult.class, imClient.getConfig());
    }

    /**
     * 云端审核获取敏感词
     *
     * @param getCloudAuditKeyWordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public GetCloudAuditKeywordsResult getCloudAuditKeywords(GetCloudAuditKeyWordsRequest getCloudAuditKeyWordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_CLOUD_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, getCloudAuditKeyWordsRequest, GetCloudAuditKeywordsResult.class, imClient.getConfig());
    }

    public GetCloudAuditKeywordsResult getCloudAuditKeywords(GetCloudAuditKeyWordsRequest getCloudAuditKeyWordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, GET_CLOUD_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, getCloudAuditKeyWordsRequest, GetCloudAuditKeywordsResult.class, imClient.getConfig());
    }

    /**
     * 云端审核添加敏感词
     *
     * @param addCloudAuditKeywordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public AddCloudAuditKeywordsResult addCloudAuditKeywords(AddCloudAuditKeywordsRequest addCloudAuditKeywordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, ADD_CLOUD_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, addCloudAuditKeywordsRequest, AddCloudAuditKeywordsResult.class, imClient.getConfig());
    }

    public AddCloudAuditKeywordsResult addCloudAuditKeywords(AddCloudAuditKeywordsRequest addCloudAuditKeywordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, ADD_CLOUD_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, addCloudAuditKeywordsRequest, AddCloudAuditKeywordsResult.class, imClient.getConfig());
    }

    /**
     * 云端审核删除敏感词
     *
     * @param deleteCloudAuditKeywordsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public DeleteCloudAuditKeywordsResult deleteCloudAuditKeywords(DeleteCloudAuditKeywordsRequest deleteCloudAuditKeywordsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, DELETE_CLOUD_AUDIT_KEYWORDS_COMMAND);
        return HttpUtil.post(url, deleteCloudAuditKeywordsRequest, DeleteCloudAuditKeywordsResult.class, imClient.getConfig());
    }

    public DeleteCloudAuditKeywordsResult deleteCloudAuditKeywords(DeleteCloudAuditKeywordsRequest deleteCloudAuditKeywordsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME_MRG, DELETE_CLOUD_AUDIT_KEYWORDS_COMMAND, random);
        return HttpUtil.post(url, deleteCloudAuditKeywordsRequest, DeleteCloudAuditKeywordsResult.class, imClient.getConfig());
    }
}
