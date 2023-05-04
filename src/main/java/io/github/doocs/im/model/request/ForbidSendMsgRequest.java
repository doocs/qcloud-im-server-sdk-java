package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 批量禁言和取消禁言-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForbidSendMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -5974931571072718003L;
    /**
     * 需要查询的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 需要禁言的用户帐号，最多支持500个帐号
     */
    @JsonProperty("Members_Account")
    private List<String> membersAccount;

    /**
     * 无符号类型。需禁言时间，单位为秒，为0时表示取消禁言，4294967295为永久禁言。
     */
    @JsonProperty("MuteTime")
    private Long muteTime;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public ForbidSendMsgRequest() {
    }

    public ForbidSendMsgRequest(String groupId, List<String> membersAccount, Long muteTime) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.muteTime = muteTime;
    }

    public ForbidSendMsgRequest(String groupId, List<String> membersAccount, Long muteTime, String topicId) {
        this.groupId = groupId;
        this.membersAccount = membersAccount;
        this.muteTime = muteTime;
        this.topicId = topicId;
    }

    private ForbidSendMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.membersAccount = builder.membersAccount;
        this.muteTime = builder.muteTime;
        this.topicId = builder.topicId;
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

    public Long getMuteTime() {
        return muteTime;
    }

    public void setMuteTime(Long muteTime) {
        this.muteTime = muteTime;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }


    public static final class Builder {
        private String groupId;
        private List<String> membersAccount;
        private Long muteTime;
        private String topicId;

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

        public Builder muteTime(Long muteTime) {
            this.muteTime = muteTime;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
