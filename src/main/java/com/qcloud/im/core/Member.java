package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

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
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imPushRequest), null);
        return JsonUtil.str2Obj(result, IMPushResult.class);
    }

    public IMSetAttrNameResult imSetAttrName(IMSetAttrNameRequest imSetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_NAME_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imSetAttrNameRequest), null);
        return JsonUtil.str2Obj(result, IMSetAttrNameResult.class);
    }

    public IMGetAttrNameResult imGetAttrName(IMGetAttrNameRequest imGetAttrNameRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_NAME_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imGetAttrNameRequest), null);
        return JsonUtil.str2Obj(result, IMGetAttrNameResult.class);
    }

    public IMGetAttrResult imGetAttr(IMGetAttrRequest imGetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_ATTR_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imGetAttrRequest), null);
        return JsonUtil.str2Obj(result, IMGetAttrResult.class);
    }

    public IMSetAttrResult imSetAttr(IMSetAttrRequest imSetAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_SET_ATTR_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imSetAttrRequest), null);
        return JsonUtil.str2Obj(result, IMSetAttrResult.class);
    }

    public IMRemoveAttrResult imRemoveAttr(IMRemoveAttrRequest imRemoveAttrRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ATTR_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imRemoveAttrRequest), null);
        return JsonUtil.str2Obj(result, IMRemoveAttrResult.class);
    }

    public IMGetTagResult imGetTag(IMGetTagRequest imGetTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_GET_TAG_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imGetTagRequest), null);
        return JsonUtil.str2Obj(result, IMGetTagResult.class);
    }

    public IMAddTagResult imAddTag(IMAddTagRequest imAddTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_ADD_TAG_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imAddTagRequest), null);
        return JsonUtil.str2Obj(result, IMAddTagResult.class);
    }

    public IMRemoveTagResult imRemoveTag(IMRemoveTagRequest imRemoveTagRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_TAG_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imRemoveTagRequest), null);
        return JsonUtil.str2Obj(result, IMRemoveTagResult.class);
    }

    public IMRemoveAllTagsResult imRemoveAllTags(IMRemoveAllTagsRequest imRemoveAllTagsRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, IM_REMOVE_ALL_TAGS_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(imRemoveAllTagsRequest), null);
        return JsonUtil.str2Obj(result, IMRemoveAllTagsResult.class);
    }
}
