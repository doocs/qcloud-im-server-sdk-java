package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 15:33
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupAddRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("GroupName")
    private List<String> groupName;

    @JsonProperty("To_Account")
    private List<String> toAccount;

    public GroupAddRequest() {
    }

    public GroupAddRequest(String fromAccount, List<String> groupName) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
    }

    public GroupAddRequest(String fromAccount, List<String> groupName, List<String> toAccount) {
        this.fromAccount = fromAccount;
        this.groupName = groupName;
        this.toAccount = toAccount;
    }

    private GroupAddRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.groupName = builder.groupName;
        this.toAccount = builder.toAccount;
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

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }


    public static final class Builder {
        private String fromAccount;
        private List<String> groupName;
        private List<String> toAccount;

        private Builder() {
        }

        public GroupAddRequest build() {
            return new GroupAddRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder groupName(List<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }
    }
}
