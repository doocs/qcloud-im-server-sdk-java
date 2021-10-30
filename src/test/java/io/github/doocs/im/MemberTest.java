package io.github.doocs.im;

import io.github.doocs.im.model.message.TIMMsgElement;
import io.github.doocs.im.model.message.TIMTextMsgElement;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
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
        TIMTextMsgElement msg = new TIMTextMsgElement("hi, beauty");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        IMPushRequest request = new IMPushRequest(9312457, msgBody);
        request.setFromAccount("admin");
        request.setMsgLifeTime(120);
        IMPushResult result = client.member.imPush(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImSetAttrName() throws IOException {
        Map<String, String> attrNames = new HashMap<>(3);
        attrNames.put("0", "sex");
        attrNames.put("1", "city");
        attrNames.put("2", "country");
        IMSetAttrNameRequest request = new IMSetAttrNameRequest(attrNames);
        IMSetAttrNameResult result = client.member.imSetAttrName(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetAttrName() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        IMGetAttrNameRequest request = new IMGetAttrNameRequest(toAccount);
        IMGetAttrNameResult result = client.member.imGetAttrName(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetAttr() throws IOException {
        IMGetAttrRequest request = new IMGetAttrRequest();
        IMGetAttrResult result = client.member.imGetAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImSetAttr() throws IOException {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        UserAttrItem item = new UserAttrItem("test1", attrs);
        IMSetAttrRequest request = new IMSetAttrRequest(Collections.singletonList(item));
        IMSetAttrResult result = client.member.imSetAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveAttr() throws IOException {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        UserAttrItem item = new UserAttrItem("test1", attrs);
        IMRemoveAttrRequest request = new IMRemoveAttrRequest(Collections.singletonList(item));
        IMRemoveAttrResult result = client.member.imRemoveAttr(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImGetTag() throws IOException {
        IMGetTagRequest request = new IMGetTagRequest(Arrays.asList("test1", "test2"));
        IMGetTagResult result = client.member.imGetTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImAddTag() throws IOException {
        UserTagItem item = new UserTagItem("test1", Arrays.asList("a", "b"));
        IMAddTagRequest request = new IMAddTagRequest(Collections.singletonList(item));
        IMAddTagResult result = client.member.imAddTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveTag() throws IOException {
        UserTagItem item = new UserTagItem("test1", Arrays.asList("a", "b"));
        IMRemoveTagRequest request = new IMRemoveTagRequest(Collections.singletonList(item));
        IMRemoveTagResult result = client.member.imRemoveTag(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testImRemoveAllTags() throws IOException {
        IMRemoveAllTagsRequest request = new IMRemoveAllTagsRequest(Arrays.asList("test1", "test2"));
        IMRemoveAllTagsResult result = client.member.imRemoveAllTags(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }
}
