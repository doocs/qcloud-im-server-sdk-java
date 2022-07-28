package io.github.doocs.im.core;

import io.github.doocs.im.ImClient;
import io.github.doocs.im.model.request.PortraitGetRequest;
import io.github.doocs.im.model.request.PortraitSetRequest;
import io.github.doocs.im.model.response.PortraitGetResult;
import io.github.doocs.im.model.response.PortraitSetResult;
import io.github.doocs.im.util.HttpUtil;

import java.io.IOException;

/**
 * 资料管理
 *
 * @author hyh
 * @since 2021/07/29 15:11
 */
public class Profile {
    /**
     * 资料管理服务名
     */
    public static final String SERVICE_NAME = "profile";

    /**
     * 资料管理相关命令字
     */
    public static final String PORTRAIT_SET_COMMAND = "portrait_set";
    public static final String PORTRAIT_GET_COMMAND = "portrait_get";

    private final ImClient imClient;

    public Profile(ImClient imClient) {
        this.imClient = imClient;
    }

    /**
     * 设置资料
     *
     * @param portraitSetRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public PortraitSetResult portraitSet(PortraitSetRequest portraitSetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_SET_COMMAND);
        return HttpUtil.post(url, portraitSetRequest, PortraitSetResult.class, imClient.getConfig());
    }

    public PortraitSetResult portraitSet(PortraitSetRequest portraitSetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_SET_COMMAND, random);
        return HttpUtil.post(url, portraitSetRequest, PortraitSetResult.class, imClient.getConfig());
    }

    /**
     * 拉取资料
     *
     * @param portraitGetRequest 请求参数
     * @return 结果
     * @throws IOException 异常
     */
    public PortraitGetResult portraitGet(PortraitGetRequest portraitGetRequest) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_GET_COMMAND);
        return HttpUtil.post(url, portraitGetRequest, PortraitGetResult.class, imClient.getConfig());
    }

    public PortraitGetResult portraitGet(PortraitGetRequest portraitGetRequest, long random) throws IOException {
        String url = imClient.getUrl(SERVICE_NAME, PORTRAIT_GET_COMMAND, random);
        return HttpUtil.post(url, portraitGetRequest, PortraitGetResult.class, imClient.getConfig());
    }
}
