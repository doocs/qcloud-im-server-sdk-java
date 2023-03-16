package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 删除会话分组数据-请求参数
 *
 * @author bingo
 * @since 2023/3/16 10:59
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DelContactGroupRequest extends GenericRequest {
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待删除的会话分组列表，当前当前仅支持单个删除
     */
    @JsonProperty("GroupName")
    private List<String> groupName;

    public DelContactGroupRequest() {
    }

    public DelContactGroupRequest(String fromAccount, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
    }

    private DelContactGroupRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<String> getGroupName() {
        return groupName;
    }

    public void setGroupName(List<String> groupName) {
        this.groupName = groupName;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> groupName;

        private Builder() {
        }

        public DelContactGroupRequest build() {
            return new DelContactGroupRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder groupName(List<String> groupName) {
            this.groupName = groupName;
            return this;
        }
    }
}
