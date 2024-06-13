package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取直播群在线列表-请求参数
 *
 * @author bingo
 * @since 2022/07/15 14:13
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMembersRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -2269206430727619673L;
    /**
     * 操作的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 首次请求传0，当直播群中人数较多时，后台返回非0的 Timestamp 表示需要分页拉取，后续请求将 Timestamp 传回，直到后台返回0
     */
    @JsonProperty("Timestamp")
    private Long timestamp;

    /**
     *  按某个标记过滤拉取用户列表
     */
    @JsonProperty("Mark")
    private Long mark;

    public GetMembersRequest() {
    }

    public GetMembersRequest(String groupId, Long timestamp) {
        this.groupId = groupId;
        this.timestamp = timestamp;
    }

    public GetMembersRequest(String groupId, Long timestamp, Long mark) {
        this.groupId = groupId;
        this.timestamp = timestamp;
        this.mark = mark;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    private GetMembersRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.timestamp = builder.timestamp;
        this.mark = builder.mark;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private String groupId;
        private Long timestamp;
        private Long mark;

        private Builder() {
        }

        public GetMembersRequest build() {
            return new GetMembersRequest(this);
        }
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder mark(Long mark) {
            this.mark = mark;
            return this;
        }
    }
}
