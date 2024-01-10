package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取直播群管理员列表-请求参数
 *
 * @author bingo
 * @since 2024/1/9 11:36
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAdminListRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -4674343475066620157L;

    /**
     * 直播群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    public GetAdminListRequest() {
    }

    public GetAdminListRequest(String groupId) {
        this.groupId = groupId;
    }

    private GetAdminListRequest(Builder builder) {
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    public static final class Builder {
        private String groupId;

        private Builder() {
        }

        public GetAdminListRequest build() {
            return new GetAdminListRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
    }
}
