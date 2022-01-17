package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 获取应用属性名称-请求参数
 *
 * @author bingo
 * @since 2021/7/31 16:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImGetAttrNameRequest extends GenericRequest {

}
