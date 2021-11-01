package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/08/02 16:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForbidSendMsgRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    @JsonProperty("ShutUpTime")
    private Integer shutUpTime;

    public ForbidSendMsgRequest() {
    }

    public ForbidSendMsgRequest(String groupId, List<String> membersAccount, Integer shutUpTime) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.shutUpTime = shutUpTime;
    }

    private ForbidSendMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.membersAccount = builder.membersAccount;
        this.shutUpTime = builder.shutUpTime;
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

    public List<String> getMembersAccount() {
        return membersAccount;
    }

    public void setMembersAccount(List<String> membersAccount) {
        this.membersAccount = membersAccount;
    }

    public Integer getShutUpTime() {
        return shutUpTime;
    }

    public void setShutUpTime(Integer shutUpTime) {
        this.shutUpTime = shutUpTime;
    }


    public static final class Builder {
        private String groupId;
        private List<String> membersAccount;
        private Integer shutUpTime;

        private Builder() {
        }

        public ForbidSendMsgRequest build() {
            return new ForbidSendMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder membersAccount(List<String> membersAccount) {
            this.membersAccount = membersAccount;
            return this;
        }

        public Builder shutUpTime(Integer shutUpTime) {
            this.shutUpTime = shutUpTime;
            return this;
        }
    }
}
