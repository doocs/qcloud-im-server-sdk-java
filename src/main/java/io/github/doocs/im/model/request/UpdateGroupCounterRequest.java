package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.group.GroupCounterItem;

import java.util.List;

/**
 * 更新群计数器-请求参数
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateGroupCounterRequest extends GenericRequest {
    /**
     * 群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 群计数器列表
     * Key 为群计数器的键，Key数量不超过20个，Key长度不超过128个字节；
     * Value 为群计数器的值，最大支持 64 位有符号整型；
     */
    @JsonProperty("GroupCounter")
    private List<GroupCounterItem> groupCounter;

    /**
     * 模式 {@link io.github.doocs.im.constant.GroupCounterMode}
     */
    @JsonProperty("Mode")
    private String mode;

    public UpdateGroupCounterRequest() {
    }

    public UpdateGroupCounterRequest(String groupId, List<GroupCounterItem> groupCounter, String mode) {
        this.groupId = groupId;
        this.groupCounter = groupCounter;
        this.mode = mode;
    }

    private UpdateGroupCounterRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.groupCounter = builder.groupCounter;
        this.mode = builder.mode;
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

    public List<GroupCounterItem> getGroupCounter() {
        return groupCounter;
    }

    public void setGroupCounter(List<GroupCounterItem> groupCounter) {
        this.groupCounter = groupCounter;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }


    public static final class Builder {
        private String groupId;
        private List<GroupCounterItem> groupCounter;
        private String mode;

        private Builder() {
        }

        public UpdateGroupCounterRequest build() {
            return new UpdateGroupCounterRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder groupCounter(List<GroupCounterItem> groupCounter) {
            this.groupCounter = groupCounter;
            return this;
        }

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }
    }
}
