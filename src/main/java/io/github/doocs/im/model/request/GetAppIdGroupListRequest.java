package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取 App 中的所有群组-请求参数
 *
 * @author bingo
 * @since 2021/7/31 21:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetAppIdGroupListRequest extends GenericRequest {
    /**
     * 本次获取的群组 ID 数量的上限，不得超过 10000。如果不填，默认为最大值 10000
     */
    @JsonProperty("Limit")
    private Integer limit;

    /**
     * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的 Next 为0代表拉完了
     */
    @JsonProperty("Next")
    private Long next;

    /**
     * 如果仅需要返回特定群组形态的群组，可以通过 GroupType 进行过滤，
     * 但此时返回的 TotalCount 的含义就变成了 App 中属于该群组形态的群组总数。不填为获取所有类型的群组。
     * 群组形态包括 Public（公开群），Private（即 Work，好友工作群），ChatRoom（即 Meeting，会议群），
     * AVChatRoom（音视频聊天室），BChatRoom（在线成员广播大群）和社群（Community）
     * {@link io.github.doocs.im.constant.GroupType}
     */
    @JsonProperty("GroupType")
    private String groupType;

    public GetAppIdGroupListRequest() {
    }

    public GetAppIdGroupListRequest(Integer limit, Long next, String groupType) {
        this.limit = limit;
        this.next = next;
        this.groupType = groupType;
    }

    private GetAppIdGroupListRequest(Builder builder) {
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

    public Long getNext() {
        return next;
    }

    public void setNext(Long next) {
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
        private Long next;
        private String groupType;

        private Builder() {
        }

        public GetAppIdGroupListRequest build() {
            return new GetAppIdGroupListRequest(this);
        }

        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder next(Long next) {
            this.next = next;
            return this;
        }

        public Builder groupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
    }
}
