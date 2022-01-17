package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.doocs.im.model.group.GroupInfo;

/**
 * 创建群组-请求参数
 *
 * @author bingo
 * @since 2021/8/1 11:12
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateGroupRequest extends GroupInfo {
    public static Builder builder() {
        return new Builder();
    }

    public CreateGroupRequest(Builder builder) {
        super(builder);
    }

    public static class Builder extends GroupInfo.Builder<CreateGroupRequest.Builder> {
        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        }
    }
}
