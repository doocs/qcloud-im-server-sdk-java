package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
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

    private final IMClient imClient;

    public Member(IMClient imClient) {
        this.imClient = imClient;
    }

    public IMPushResult imPush(IMPushRequest imPushRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_PUSH_COMMAND);
        return HttpUtil.post(url, imPushRequest, IMPushResult.class);
    }

    public IMSetAttrNameResult imSetAttrName(IMSetAttrNameRequest imSetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imSetAttrNameRequest, IMSetAttrNameResult.class);
    }

    public IMGetAttrNameResult imGetAttrName(IMGetAttrNameRequest imGetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_NAME_COMMAND);
        return HttpUtil.post(url, imGetAttrNameRequest, IMGetAttrNameResult.class);
    }

    public IMGetAttrResult imGetAttr(IMGetAttrRequest imGetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_COMMAND);
        return HttpUtil.post(url, imGetAttrRequest, IMGetAttrResult.class);
    }

    public IMSetAttrResult imSetAttr(IMSetAttrRequest imSetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_COMMAND);
        return HttpUtil.post(url, imSetAttrRequest, IMSetAttrResult.class);
    }

    public IMRemoveAttrResult imRemoveAttr(IMRemoveAttrRequest imRemoveAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ATTR_COMMAND);
        return HttpUtil.post(url, imRemoveAttrRequest, IMRemoveAttrResult.class);
    }

    public IMGetTagResult imGetTag(IMGetTagRequest imGetTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_TAG_COMMAND);
        return HttpUtil.post(url, imGetTagRequest, IMGetTagResult.class);
    }

    public IMAddTagResult imAddTag(IMAddTagRequest imAddTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_ADD_TAG_COMMAND);
        return HttpUtil.post(url, imAddTagRequest, IMAddTagResult.class);
    }

    public IMRemoveTagResult imRemoveTag(IMRemoveTagRequest imRemoveTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_TAG_COMMAND);
        return HttpUtil.post(url, imRemoveTagRequest, IMRemoveTagResult.class);
    }

    public IMRemoveAllTagsResult imRemoveAllTags(IMRemoveAllTagsRequest imRemoveAllTagsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ALL_TAGS_COMMAND);
        return HttpUtil.post(url, imRemoveAllTagsRequest, IMRemoveAllTagsResult.class);
    }
}
