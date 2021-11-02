package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author bingo
 * @since 2021/7/31 16:19
 */
public class Member {
    private static final String SERVICE_NAME = "all_member_push";

    private static final String IM_PUSH_COMMAND = "im_push";
    private static final String IM_SET_ATTR_NAME_COMMAND = "im_set_attr_name";
    private static final String IM_GET_ATTR_NAME_COMMAND = "im_get_attr_name";
    private static final String IM_GET_ATTR_COMMAND = "im_get_attr";
    private static final String IM_SET_ATTR_COMMAND = "im_set_attr";
    private static final String IM_REMOVE_ATTR_COMMAND = "im_remove_attr";
    private static final String IM_GET_TAG_COMMAND = "im_get_tag";
    private static final String IM_ADD_TAG_COMMAND = "im_add_tag";
    private static final String IM_REMOVE_TAG_COMMAND = "im_remove_tag";
    private static final String IM_REMOVE_ALL_TAGS_COMMAND = "im_remove_all_tags";

    private final ImClient imClient;

    public Member(ImClient imClient) {
        this.imClient = imClient;
    }

    public ImPushResult imPush(ImPushRequest imPushRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_PUSH_COMMAND);
        return HttpUtil.post(url, imPushRequest, ImPushResult.class, imClient.getConfig());
    }

    public ImSetAttrNameResult imSetAttrName(ImSetAttrNameRequest imSetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imSetAttrNameRequest, ImSetAttrNameResult.class, imClient.getConfig());
    }

    public ImGetAttrNameResult imGetAttrName(ImGetAttrNameRequest imGetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imGetAttrNameRequest, ImGetAttrNameResult.class, imClient.getConfig());
    }

    public ImGetAttrResult imGetAttr(ImGetAttrRequest imGetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_COMMAND);
        return HttpUtil.post(url, imGetAttrRequest, ImGetAttrResult.class, imClient.getConfig());
    }

    public ImSetAttrResult imSetAttr(ImSetAttrRequest imSetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_COMMAND);
        return HttpUtil.post(url, imSetAttrRequest, ImSetAttrResult.class, imClient.getConfig());
    }

    public ImRemoveAttrResult imRemoveAttr(ImRemoveAttrRequest imRemoveAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ATTR_COMMAND);
        return HttpUtil.post(url, imRemoveAttrRequest, ImRemoveAttrResult.class, imClient.getConfig());
    }

    public ImGetTagResult imGetTag(ImGetTagRequest imGetTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_TAG_COMMAND);
        return HttpUtil.post(url, imGetTagRequest, ImGetTagResult.class, imClient.getConfig());
    }

    public ImAddTagResult imAddTag(ImAddTagRequest imAddTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_ADD_TAG_COMMAND);
        return HttpUtil.post(url, imAddTagRequest, ImAddTagResult.class, imClient.getConfig());
    }

    public ImRemoveTagResult imRemoveTag(ImRemoveTagRequest imRemoveTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_TAG_COMMAND);
        return HttpUtil.post(url, imRemoveTagRequest, ImRemoveTagResult.class, imClient.getConfig());
    }

    public ImRemoveAllTagsResult imRemoveAllTags(ImRemoveAllTagsRequest imRemoveAllTagsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ALL_TAGS_COMMAND);
        return HttpUtil.post(url, imRemoveAllTagsRequest, ImRemoveAllTagsResult.class, imClient.getConfig());
    }
}
