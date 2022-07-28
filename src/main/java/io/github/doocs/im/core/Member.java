package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 全员推送
 *
 * @author bingo
 * @since 2021/7/31 16:19
 */
public class Member {
    /**
     * 全员推送服务名
     */
    public static final String SERVICE_NAME = "all_member_push";

    /**
     * 全员推送相关命令字
     */
    public static final String IM_PUSH_COMMAND = "im_push";
    public static final String IM_SET_ATTR_NAME_COMMAND = "im_set_attr_name";
    public static final String IM_GET_ATTR_NAME_COMMAND = "im_get_attr_name";
    public static final String IM_GET_ATTR_COMMAND = "im_get_attr";
    public static final String IM_SET_ATTR_COMMAND = "im_set_attr";
    public static final String IM_REMOVE_ATTR_COMMAND = "im_remove_attr";
    public static final String IM_GET_TAG_COMMAND = "im_get_tag";
    public static final String IM_ADD_TAG_COMMAND = "im_add_tag";
    public static final String IM_REMOVE_TAG_COMMAND = "im_remove_tag";
    public static final String IM_REMOVE_ALL_TAGS_COMMAND = "im_remove_all_tags";

    private final ImClient imClient;

    public Member(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 全员推送
     *
     * @param imPushRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImPushResult imPush(ImPushRequest imPushRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_PUSH_COMMAND);
        return HttpUtil.post(url, imPushRequest, ImPushResult.class, imClient.getConfig());
    }

    public ImPushResult imPush(ImPushRequest imPushRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_PUSH_COMMAND, random);
        return HttpUtil.post(url, imPushRequest, ImPushResult.class, imClient.getConfig());
    }

    /**
     * 设置应用属性名称
     *
     * @param imSetAttrNameRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImSetAttrNameResult imSetAttrName(ImSetAttrNameRequest imSetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imSetAttrNameRequest, ImSetAttrNameResult.class, imClient.getConfig());
    }

    public ImSetAttrNameResult imSetAttrName(ImSetAttrNameRequest imSetAttrNameRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_NAME_COMMAND, random);
        return HttpUtil.post(url, imSetAttrNameRequest, ImSetAttrNameResult.class, imClient.getConfig());
    }

    /**
     * 获取应用属性名称
     *
     * @param imGetAttrNameRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImGetAttrNameResult imGetAttrName(ImGetAttrNameRequest imGetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imGetAttrNameRequest, ImGetAttrNameResult.class, imClient.getConfig());
    }

    public ImGetAttrNameResult imGetAttrName(ImGetAttrNameRequest imGetAttrNameRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_NAME_COMMAND, random);
        return HttpUtil.post(url, imGetAttrNameRequest, ImGetAttrNameResult.class, imClient.getConfig());
    }

    /**
     * 获取用户属性
     *
     * @param imGetAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImGetAttrResult imGetAttr(ImGetAttrRequest imGetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_COMMAND);
        return HttpUtil.post(url, imGetAttrRequest, ImGetAttrResult.class, imClient.getConfig());
    }

    public ImGetAttrResult imGetAttr(ImGetAttrRequest imGetAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_COMMAND, random);
        return HttpUtil.post(url, imGetAttrRequest, ImGetAttrResult.class, imClient.getConfig());
    }

    /**
     * 设置用户属性
     *
     * @param imSetAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImSetAttrResult imSetAttr(ImSetAttrRequest imSetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_COMMAND);
        return HttpUtil.post(url, imSetAttrRequest, ImSetAttrResult.class, imClient.getConfig());
    }

    public ImSetAttrResult imSetAttr(ImSetAttrRequest imSetAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_COMMAND, random);
        return HttpUtil.post(url, imSetAttrRequest, ImSetAttrResult.class, imClient.getConfig());
    }

    /**
     * 删除用户属性
     *
     * @param imRemoveAttrRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImRemoveAttrResult imRemoveAttr(ImRemoveAttrRequest imRemoveAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ATTR_COMMAND);
        return HttpUtil.post(url, imRemoveAttrRequest, ImRemoveAttrResult.class, imClient.getConfig());
    }

    public ImRemoveAttrResult imRemoveAttr(ImRemoveAttrRequest imRemoveAttrRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ATTR_COMMAND, random);
        return HttpUtil.post(url, imRemoveAttrRequest, ImRemoveAttrResult.class, imClient.getConfig());
    }

    /**
     * 获取用户标签
     *
     * @param imGetTagRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImGetTagResult imGetTag(ImGetTagRequest imGetTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_TAG_COMMAND);
        return HttpUtil.post(url, imGetTagRequest, ImGetTagResult.class, imClient.getConfig());
    }

    public ImGetTagResult imGetTag(ImGetTagRequest imGetTagRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_TAG_COMMAND, random);
        return HttpUtil.post(url, imGetTagRequest, ImGetTagResult.class, imClient.getConfig());
    }

    /**
     * 添加用户标签
     *
     * @param imAddTagRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImAddTagResult imAddTag(ImAddTagRequest imAddTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_ADD_TAG_COMMAND);
        return HttpUtil.post(url, imAddTagRequest, ImAddTagResult.class, imClient.getConfig());
    }

    public ImAddTagResult imAddTag(ImAddTagRequest imAddTagRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_ADD_TAG_COMMAND, random);
        return HttpUtil.post(url, imAddTagRequest, ImAddTagResult.class, imClient.getConfig());
    }

    /**
     * 删除用户标签
     *
     * @param imRemoveTagRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImRemoveTagResult imRemoveTag(ImRemoveTagRequest imRemoveTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_TAG_COMMAND);
        return HttpUtil.post(url, imRemoveTagRequest, ImRemoveTagResult.class, imClient.getConfig());
    }

    public ImRemoveTagResult imRemoveTag(ImRemoveTagRequest imRemoveTagRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_TAG_COMMAND, random);
        return HttpUtil.post(url, imRemoveTagRequest, ImRemoveTagResult.class, imClient.getConfig());
    }

    /**
     * 删除用户所有标签
     *
     * @param imRemoveAllTagsRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public ImRemoveAllTagsResult imRemoveAllTags(ImRemoveAllTagsRequest imRemoveAllTagsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ALL_TAGS_COMMAND);
        return HttpUtil.post(url, imRemoveAllTagsRequest, ImRemoveAllTagsResult.class, imClient.getConfig());
    }

    public ImRemoveAllTagsResult imRemoveAllTags(ImRemoveAllTagsRequest imRemoveAllTagsRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ALL_TAGS_COMMAND, random);
        return HttpUtil.post(url, imRemoveAllTagsRequest, ImRemoveAllTagsResult.class, imClient.getConfig());
    }
}
