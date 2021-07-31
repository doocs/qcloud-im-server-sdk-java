package com.qcloud.im;

import com.qcloud.im.model.request.PortraitGetRequest;
import com.qcloud.im.model.request.PortraitSetRequest;
import com.qcloud.im.model.request.ProfileItem;
import com.qcloud.im.model.response.PortraitGetResult;
import com.qcloud.im.model.response.PortraitSetResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author hyh
 * @since 2021/07/31 10:54
 */
public class ProfileTest {
    private static final Properties properties = new Properties();
    private static final IMClient client;

    static {
        InputStream resourceAsStream = AccountTest.class.getClassLoader().getResourceAsStream("app.properties");
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
    public void testPortraitSet() throws IOException {
        ProfileItem profileItem = new ProfileItem("Tag_Profile_IM_Nick", "MyNickName");
        List<ProfileItem> profileItemList = new ArrayList<>();
        profileItemList.add(profileItem);
        PortraitSetRequest request = new PortraitSetRequest("test1", profileItemList);
        PortraitSetResult result = client.profile.portraitSet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }

    @Test
    public void testPortraitGet() throws IOException {
        List<String> toAccount = new ArrayList<>();
        toAccount.add("test1");
        List<String> tagList = new ArrayList<>();
        tagList.add("Tag_Profile_IM_Nick");
        PortraitGetRequest request = new PortraitGetRequest(toAccount, tagList);
        PortraitGetResult result = client.profile.portraitGet(request);
        System.out.println(result);
        Assert.assertEquals("OK", result.getActionStatus());
    }


}
