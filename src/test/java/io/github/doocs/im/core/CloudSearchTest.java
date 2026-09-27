package io.github.doocs.im.core;

import io.github.doocs.im.ClientFactory;
import io.github.doocs.im.ImClient;
import io.github.doocs.im.constant.ActionStatus;
import io.github.doocs.im.constant.GenderType;
import io.github.doocs.im.model.request.*;
import io.github.doocs.im.model.response.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 云搜索测试类 {@link io.github.doocs.im.core.CloudSearch}
 * </p>
 *
 * @author MC.Yang
 * @version V1.0
 **/
public class CloudSearchTest {

    private static ImClient client;

    @BeforeAll
    static void setup() {
        client = ClientFactory.getInstance();
        Assertions.assertNotNull(client, "client is null");
    }

    @Test
    void testUserSearch() throws IOException {
        List<String> keywords = Collections.singletonList("test1");
        UserSearchRequest request = UserSearchRequest.builder()
                .count(1)
                .userGenderType(GenderType.MALE)
                .keywordMatchType(1)
                .keywords(keywords)
                .build();
        UserSearchResult result = client.cloudSearch.userSearch(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGroupSearch() throws IOException {
        GroupSearchRequest request = GroupSearchRequest.builder()
                .count(100)
                .groupType(Collections.singletonList("Public"))
                .keywordMatchType(1)
                .keywords(Collections.singletonList("test"))
                .build();
        GroupSearchResult result = client.cloudSearch.groupSearch(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGroupMemberSearch() throws IOException {
        GroupMemberSearchRequest request = GroupMemberSearchRequest.builder()
                .count(1)
                .groupType(Collections.singletonList("Public"))
                .keywordMatchType(1)
                .keywords(Collections.singletonList("test"))
                .build();
        GroupMemberSearchResult result = client.cloudSearch.groupMemberSearch(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testSetVisibility() throws IOException {
        SetVisibilityRequest request = SetVisibilityRequest.builder()
                .setType(1)
                .userId("test")
                .isDisable(true)
                .build();
        SetVisibilitySearchResult result = client.cloudSearch.setVisibility(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

    @Test
    void testGetNoVisibility() throws IOException {
        GetNoVisibilityRequest request = GetNoVisibilityRequest.builder()
                .setType(1)
                .count(1)
                .build();
        GetNoVisibilitySearchResult result = client.cloudSearch.getNoVisibility(request);
        System.out.println(result);
        Assertions.assertEquals(ActionStatus.OK, result.getActionStatus());
    }

}
