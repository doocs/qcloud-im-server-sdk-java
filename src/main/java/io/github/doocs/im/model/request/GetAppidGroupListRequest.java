package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 21:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAppidGroupListRequest extends GenericRequest {
    @JsonProperty("Limit")
    private Integer limit;

    @JsonProperty("Next")
    private Integer next;

    @JsonProperty("GroupType")
    private String groupType;

    public GetAppidGroupListRequest() {
    }

    public GetAppidGroupListRequest(Integer limit, Integer next, String groupType) {
        this.limit = limit;
        this.next = next;
        this.groupType = groupType;
    }

    private GetAppidGroupListRequest(Builder builder) {
        this.limit = builder.limit;
        this.next = builder.next;
        this.groupType = builder.groupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }


    public static final class Builder {
        private Integer limit;
        private Integer next;
        private String groupType;

        private Builder() {
        }

        public GetAppidGroupListRequest build() {
            return new GetAppidGroupListRequest(this);
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder next(Integer next) {
            this.next = next;
            return this;
        }

        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
    }
}
