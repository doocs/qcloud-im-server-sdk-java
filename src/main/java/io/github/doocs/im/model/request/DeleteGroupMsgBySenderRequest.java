package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 撤回指定用户发送的消息-请求参数
 *
 * @author hyh
 * @since 2021/08/01 13:53
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteGroupMsgBySenderRequest extends GenericRequest {
    /**
     * 要撤回消息的群 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 被撤回消息的发送者 ID
     */
    @JsonProperty("Sender_Account")
    private String senderAccount;

    public DeleteGroupMsgBySenderRequest() {
    }

    public DeleteGroupMsgBySenderRequest(String groupId, String senderAccount) {
        this.groupId = groupId;
        this.senderAccount = senderAccount;
    }

    private DeleteGroupMsgBySenderRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.senderAccount = builder.senderAccount;
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

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }


    public static final class Builder {
        private String groupId;
        private String senderAccount;

        private Builder() {
        }

        public DeleteGroupMsgBySenderRequest build() {
            return new DeleteGroupMsgBySenderRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder senderAccount(String senderAccount) {
            this.senderAccount = senderAccount;
            return this;
        }
    }
}
