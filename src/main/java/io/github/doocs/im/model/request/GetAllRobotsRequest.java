package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 拉取所有机器人-请求参数
 *
 * @author bingo
 * @since 2023/7/26 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAllRobotsRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 4109892937908383128L;

    public GetAllRobotsRequest() {
    }


}
