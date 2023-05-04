package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 获取应用属性名称-请求参数
 *
 * @author bingo
 * @since 2021/7/31 16:47
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImGetAttrNameRequest extends GenericRequest implements Serializable {

    private static final long serialVersionUID = -6967156954773751232L;
}
