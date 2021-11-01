package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.PortraitGetRequest;
import io.github.doocs.im.model.request.PortraitSetRequest;
import io.github.doocs.im.model.response.PortraitGetResult;
import io.github.doocs.im.model.response.PortraitSetResult;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Profile {
    private static final String SERVICE_NAME = "profile";

    private static final String PORTRAIT_SET_COMMAND = "portrait_set";
    private static final String PORTRAIT_GET_COMMAND = "portrait_get";

    private final ImClient imClient;

    public Profile(ImClient imClient) {
        this.imClient = imClient;
    }

    public PortraitSetResult portraitSet(PortraitSetRequest portraitSetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_SET_COMMAND);
        return HttpUtil.post(url, portraitSetRequest, PortraitSetResult.class);
    }

    public PortraitGetResult portraitGet(PortraitGetRequest portraitGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_GET_COMMAND);
        return HttpUtil.post(url, portraitGetRequest, PortraitGetResult.class);
    }
}
