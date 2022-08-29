package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取封禁群成员列表-请求参数
 *
 * @author bingo
 * @since 2022/8/29 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetGroupBanMemberRequest extends GenericRequest {
    /**
     * 解封成员的群id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 单次获取封禁成员的数量，最大为100
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 偏移量，初次拉取从0开始，后续请求以响应包 NextOffset 为准
     */
    @JsonProperty("Offset")
    private Integer offset;

    public GetGroupBanMemberRequest() {
    }

    public GetGroupBanMemberRequest(String groupId, Integer offset) {
        this.groupId = groupId;
        this.offset = offset;
    }

    public GetGroupBanMemberRequest(String groupId, Integer limit, Integer offset) {
        this.groupId = groupId;
        this.limit = limit;
        this.offset = offset;
    }

    private GetGroupBanMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.limit = builder.limit;
        this.offset = builder.offset;
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

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }


    public static final class Builder {
        private String groupId;
        private Integer limit;
        private Integer offset;

        private Builder() {
        }

        public GetGroupBanMemberRequest build() {
            return new GetGroupBanMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder offset(Integer offset) {
            this.offset = offset;
            return this;
        }
    }
}
