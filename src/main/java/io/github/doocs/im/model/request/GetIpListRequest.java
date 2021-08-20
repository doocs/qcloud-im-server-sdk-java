package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author bingo
 * @since 2021/7/31 20:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetIpListRequest extends GenericRequest {
}
