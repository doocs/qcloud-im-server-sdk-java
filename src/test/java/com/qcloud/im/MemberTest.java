package com.qcloud.im;

import com.qcloud.im.model.request.*;
import com.qcloud.im.model.response.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author bingo
 * @since 2021/7/31 17:22
 */
public class MemberTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = MemberTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testImPush() throws IOException {
        IMPushRequest request = new IMPushRequest();
        request.setFromAccount("admin");
        request.setMsgRandom(9312457);
        request.setMsgLifeTime(120);
        MsgBodyItem item = new MsgBodyItem();
        MsgContentItem contentItem = new MsgContentItem();
        contentItem.setText("hi, beauty");
        item.setMsgContent(contentItem);
        request.setMsgBody(Collections.singletonList(item));
        IMPushResult result = client.member.imPush(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImSetAttrName() throws IOException {
        IMSetAttrNameRequest request = new IMSetAttrNameRequest();
        Map<String, String> attrNames = new HashMap<>(3);
        attrNames.put("0", "sex");
        attrNames.put("1", "city");
        attrNames.put("2", "country");
        request.setAttrNames(attrNames);
        IMSetAttrNameResult result = client.member.imSetAttrName(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetAttrName() throws IOException {
        IMGetAttrNameRequest request = new IMGetAttrNameRequest();
        IMGetAttrNameResult result = client.member.imGetAttrName(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetAttr() throws IOException {
        IMGetAttrRequest request = new IMGetAttrRequest();
        request.setToAccount(Arrays.asList("test1", "test2"));
        IMGetAttrResult result = client.member.imGetAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImSetAttr() throws IOException {
        IMSetAttrRequest request = new IMSetAttrRequest();
        UserAttrItem item = new UserAttrItem();
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        item.setAttrs(attrs);
        item.setToAccount("test1");
        request.setUserAttrs(Collections.singletonList(item));
        IMSetAttrResult result = client.member.imSetAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveAttr() throws IOException {
        IMRemoveAttrRequest request = new IMRemoveAttrRequest();
        UserAttrItem item = new UserAttrItem();
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        item.setAttrs(attrs);
        request.setUserAttrs(Collections.singletonList(item));
        IMRemoveAttrResult result = client.member.imRemoveAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetTag() throws IOException {
        IMGetTagRequest request = new IMGetTagRequest();
        request.setToAccount(Arrays.asList("test1", "test2"));
        IMGetTagResult result = client.member.imGetTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImAddTag() throws IOException {
        IMAddTagRequest request = new IMAddTagRequest();
        UserTagItem item = new UserTagItem();
        item.setTags(Arrays.asList("a", "b"));
        item.setToAccount("test1");
        request.setUserTags(Collections.singletonList(item));
        IMAddTagResult result = client.member.imAddTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveTag() throws IOException {
        IMRemoveTagRequest request = new IMRemoveTagRequest();
        UserTagItem item = new UserTagItem();
        item.setTags(Arrays.asList("a", "b"));
        item.setToAccount("test1");
        request.setUserTags(Collections.singletonList(item));
        IMRemoveTagResult result = client.member.imRemoveTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveAllTags() throws IOException {
        IMRemoveAllTagsRequest request = new IMRemoveAllTagsRequest();
        request.setToAccount(Arrays.asList("test1", "test2"));
        IMRemoveAllTagsResult result = client.member.imRemoveAllTags(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
