package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 失效账号登录状态-请求参数
 *
 * @author bingo
 * @since 2021/7/30 17:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KickRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 6131946345543643681L;
    /**
     * 用户名
     */
    @JsonProperty("UserID")
    private String userId;

    public KickRequest() {
    }

    public KickRequest(String userId) {
        this.userId = userId;
    }

    private KickRequest(Builder builder) {
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public static final class Builder {
        private String userId;

        private Builder() {
        }

        public KickRequest build() {
            return new KickRequest(this);
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
    }
}
