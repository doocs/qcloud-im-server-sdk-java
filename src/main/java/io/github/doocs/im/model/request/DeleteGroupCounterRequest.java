package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 更新群计数器-请求参数
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGroupCounterRequest extends GenericRequest {
    /**
     * 群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 删除指定的群计数器 Key 列表，不填则全部删除
     */
    @JsonProperty("GroupCounterKeys")
    private List<String> groupCounterKeys;

    public DeleteGroupCounterRequest() {
    }

    public DeleteGroupCounterRequest(String groupId) {
        this.groupId = groupId;
    }

    public DeleteGroupCounterRequest(String groupId, List<String> groupCounterKeys) {
        this.groupId = groupId;
        this.groupCounterKeys = groupCounterKeys;
    }

    private DeleteGroupCounterRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.groupCounterKeys = builder.groupCounterKeys;
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

    public List<String> getGroupCounterKeys() {
        return groupCounterKeys;
    }

    public void setGroupCounterKeys(List<String> groupCounterKeys) {
        this.groupCounterKeys = groupCounterKeys;
    }


    public static final class Builder {
        private String groupId;
        private List<String> groupCounterKeys;

        private Builder() {
        }

        public DeleteGroupCounterRequest build() {
            return new DeleteGroupCounterRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder groupCounterKeys(List<String> groupCounterKeys) {
            this.groupCounterKeys = groupCounterKeys;
            return this;
        }
    }
}
