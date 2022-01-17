package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 获取服务器 IP 地址-请求参数
 *
 * @author bingo
 * @since 2021/7/31 20:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetIpListRequest extends GenericRequest {
}
