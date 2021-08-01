package com.qcloud.im;

import com.qcloud.im.model.request.CreateGroupRequest;
import com.qcloud.im.model.request.GetAppidGroupListRequest;
import com.qcloud.im.model.request.GetGroupInfoRequest;
import com.qcloud.im.model.response.CreateGroupResult;
import com.qcloud.im.model.response.GetAppidGroupListResult;
import com.qcloud.im.model.response.GetGroupInfoResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

/**
 * @author bingo
 * @since 2021/7/31 21:05
 */
public class GroupTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = GroupTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testGetAppidGroupList() throws IOException {
        GetAppidGroupListRequest request = new GetAppidGroupListRequest();
        request.setLimit(10);
        request.setGroupType("Public");
        request.setNext(0);
        GetAppidGroupListResult result = client.group.getAppidGroupList(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testCreateGroup() throws IOException {
        CreateGroupRequest request = new CreateGroupRequest();
        request.setOwnerAccount("bingo");
        request.setType("Public");
        request.setGroupId("MyFirstGroup");
        request.setName("TestGroup");
        request.setIntroduction("This is group Introduction");
        request.setNotification("This is group Notification");
        request.setFaceUrl("http://this.is.face.url");
        request.setMaxMemberCount(5000);
        request.setApplyJoinOption("FreeAccess");
        // Map<String, Object> map = new HashMap<>();
        // map.put("Key", "test1");
        // map.put("Value", "test2");
        // request.setAppDefinedData(Collections.singletonList(map));
        CreateGroupResult result = client.group.createGroup(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }

    @Test
    public void testGetGroupInfo() throws IOException {
        GetGroupInfoRequest request = new GetGroupInfoRequest();
        request.setGroupIdList(Collections.singletonList("MyFirstGroup"));
        GetGroupInfoResult result = client.group.getGroupInfo(request);
        System.out.println(result);
        Assert.assertEquals(0, (int) result.getErrorCode());
    }
}
