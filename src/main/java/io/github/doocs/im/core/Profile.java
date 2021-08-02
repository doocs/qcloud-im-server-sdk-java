package io.github.doocs.im.core;

import io.github.doocs.im.IMClient;
import io.github.doocs.im.model.request.PortraitGetRequest;
import io.github.doocs.im.model.request.PortraitSetRequest;
import io.github.doocs.im.model.response.PortraitGetResult;
import io.github.doocs.im.model.response.PortraitSetResult;
import io.github.doocs.im.util.HttpUtil;
import io.github.doocs.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Profile {
    private static final String SERVICE_NAME = "profile";

    private static final String PORTRAIT_SET_COMMAND = "portrait_set";
    private static final String PORTRAIT_GET_COMMAND = "portrait_get";

    private final IMClient imClient;

    public Profile(IMClient imClient) {
        this.imClient = imClient;
    }

    public PortraitSetResult portraitSet(PortraitSetRequest portraitSetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_SET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(portraitSetRequest), null);
        return JsonUtil.str2Obj(result, PortraitSetResult.class);
    }

    public PortraitGetResult portraitGet(PortraitGetRequest portraitGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_GET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(portraitGetRequest), null);
        return JsonUtil.str2Obj(result, PortraitGetResult.class);
    }
}
