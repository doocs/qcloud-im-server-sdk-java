package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.TagProfile;
import io.github.doocs.im.model.request.PortraitGetRequest;
import io.github.doocs.im.model.request.PortraitSetRequest;
import io.github.doocs.im.model.request.ProfileItem;
import io.github.doocs.im.model.response.PortraitGetResult;
import io.github.doocs.im.model.response.PortraitSetResult;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * 资料管理测试类 {@link io.github.doocs.im.core.Profile}
 *
 * @author hyh
 * @since 2021/07/31 10:54
 */
public class ProfileTest {
    private static final ImClient client = ClientFactory.getInstance();

    @Test
    public void testPortraitSet() throws IOException {
        ProfileItem profileItem = ProfileItem.builder()
                .tag(TagProfile.IM_NICK)
                .value("MyNickName")
                .build();
        List<ProfileItem> profiles = Collections.singletonList(profileItem);
        PortraitSetRequest request = PortraitSetRequest.builder()
                .fromAccount("test1")
                .profileItemList(profiles)
                .build();

        PortraitSetResult result = client.profile.portraitSet(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    public void testPortraitGet() throws IOException {
        List<String> tagList = Collections.singletonList(TagProfile.IM_NICK);
        List<String> toAccount = Collections.singletonList("test1");
        PortraitGetRequest request = PortraitGetRequest.builder()
                .tagList(tagList)
                .toAccount(toAccount)
                .build();

        PortraitGetResult result = client.profile.portraitGet(request);
        System.out.println(result);
        Assert.assertEquals(ActionStatus.OK, result.getActionStatus());
    }
}
