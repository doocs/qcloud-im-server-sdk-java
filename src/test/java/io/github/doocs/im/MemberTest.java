package io.github.doocs.im;

import io.github.doocs.im.constant.ActionStatus;
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
    private static final ImClient client;

    static {
        InputStream resourceAsStream = MemberTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testImPush() throws IOException {
        TIMTextMsgElement msg = new TIMTextMsgElement("hi, beauty");
        List<TIMMsgElement> msgBody = Collections.singletonList(msg);
        ImPushRequest request = ImPushRequest.builder()
                .msgRandom(9312457L)
                .msgBody(msgBody)
                .fromAccount("admin")
                .msgLifeTime(120)
                .build();

        ImPushResult result = client.member.imPush(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImSetAttrName() throws IOException {
        Map<String, String> attrNames = new HashMap<>(3);
        attrNames.put("0", "sex");
        attrNames.put("1", "city");
        attrNames.put("2", "country");
        ImSetAttrNameRequest request = new ImSetAttrNameRequest(attrNames);

        ImSetAttrNameResult result = client.member.imSetAttrName(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImGetAttrName() throws IOException {
        ImGetAttrNameRequest request = new ImGetAttrNameRequest();

        ImGetAttrNameResult result = client.member.imGetAttrName(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImGetAttr() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        ImGetAttrRequest request = new ImGetAttrRequest(toAccount);

        ImGetAttrResult result = client.member.imGetAttr(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImSetAttr() throws IOException {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        UserAttrItem item = new UserAttrItem("test1", attrs);
        List<UserAttrItem> userAttrs = Collections.singletonList(item);
        ImSetAttrRequest request = new ImSetAttrRequest(userAttrs);

        ImSetAttrResult result = client.member.imSetAttr(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImRemoveAttr() throws IOException {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("sex", "attr1");
        attrs.put("city", "attr2");
        UserAttrItem item = UserAttrItem.builder()
                .toAccount("test1")
                .attrs(attrs)
                .build();
        List<UserAttrItem> userAttrs = Collections.singletonList(item);
        ImRemoveAttrRequest request = new ImRemoveAttrRequest(userAttrs);

        ImRemoveAttrResult result = client.member.imRemoveAttr(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImGetTag() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        ImGetTagRequest request = new ImGetTagRequest(toAccount);

        ImGetTagResult result = client.member.imGetTag(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImAddTag() throws IOException {
        List<String> tags = Arrays.asList("a", "b");
        UserTagItem item = UserTagItem.builder()
                .toAccount("test1")
                .tags(tags)
                .build();
        List<UserTagItem> userTags = Collections.singletonList(item);
        ImAddTagRequest request = new ImAddTagRequest(userTags);

        ImAddTagResult result = client.member.imAddTag(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImRemoveTag() throws IOException {
        List<String> tags = Arrays.asList("a", "b");
        UserTagItem item = UserTagItem.builder()
                .toAccount("test1")
                .tags(tags)
                .build();
        List<UserTagItem> userTags = Collections.singletonList(item);
        ImRemoveTagRequest request = new ImRemoveTagRequest(userTags);

        ImRemoveTagResult result = client.member.imRemoveTag(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testImRemoveAllTags() throws IOException {
        List<String> toAccount = Arrays.asList("test1", "test2");
        ImRemoveAllTagsRequest request = new ImRemoveAllTagsRequest(toAccount);

        ImRemoveAllTagsResult result = client.member.imRemoveAllTags(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
