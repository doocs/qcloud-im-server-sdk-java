package com.qcloud.im.core;

import com.qcloud.im.IMClient;
import com.qcloud.im.model.request.PortraitSetRequest;
import com.qcloud.im.model.response.PortraitSetResult;
import com.qcloud.im.util.HttpUtil;
import com.qcloud.im.util.JsonUtil;

import java.io.IOException;

/**
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Profile {
    private final String SERVICE_NAME = "profile";
    private final String PORTRAIT_SET_COMMAND = "portrait_set";

    private IMClient imClient;

    public PortraitSetResult portraitSet(PortraitSetRequest portraitSetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_SET_COMMAND);
        String result = HttpUtil.post(url, JsonUtil.obj2Str(portraitSetRequest), null);
        return JsonUtil.str2Obj(result, PortraitSetResult.class);
    }

    public Profile(IMClient imClient) {
        this.imClient = imClient;
    }
}
