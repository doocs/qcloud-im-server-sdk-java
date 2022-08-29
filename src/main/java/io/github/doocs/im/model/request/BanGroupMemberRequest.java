package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 群成员封禁-请求参数
 *
 * @author bingo
 * @since 2022/8/29 11:09
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BanGroupMemberRequest extends GenericRequest {
    /**
     * 封禁成员的群 id
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 封禁的群成员账号id，单次请求最大20个
     */
    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    /**
     * 封禁时长，单位秒，无符号32位数字
     */
    @JsonProperty("Duration")
    private Long duration;

    /**
     * 封禁时长，单位秒，无符号32位数字
     */
    @JsonProperty("Description")
    private String description;

    public BanGroupMemberRequest() {
    }

    public BanGroupMemberRequest(String groupId, List<String> membersAccount, Long duration) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.duration = duration;
    }

    public BanGroupMemberRequest(String groupId, List<String> membersAccount, Long duration, String description) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.duration = duration;
        this.description = description;
    }

    private BanGroupMemberRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.membersAccount = builder.membersAccount;
        this.duration = builder.duration;
        this.description = builder.description;
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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static final class Builder {
        private String groupId;
        private List<String> membersAccount;
        private Long duration;
        private String description;

        private Builder() {
        }

        public BanGroupMemberRequest build() {
            return new BanGroupMemberRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder membersAccount(List<String> membersAccount) {
            this.membersAccount = membersAccount;
            return this;
        }

        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }
    }
}
