package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 撤回公众号消息-请求参数
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialAccountMsgRecallRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8441195658528603133L;

    /**
     * 操作的公众号用户 ID
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 被撤回的消息 MsgKey 列表，一次请求最多可以撤回10条消息
     */
    @JsonProperty("MsgKeyList")
    private List<String> msgKeyList;

    /**
     * 撤回消息的原因，长度限制最大100字节
     */
    @JsonProperty("Reason")
    private String reason;

    public OfficialAccountMsgRecallRequest() {
    }

    public OfficialAccountMsgRecallRequest(String officialAccount, List<String> msgKeyList) {
        this.officialAccount = officialAccount;
        this.msgKeyList = msgKeyList;
    }

    public OfficialAccountMsgRecallRequest(String officialAccount, List<String> msgKeyList, String reason) {
        this.officialAccount = officialAccount;
        this.msgKeyList = msgKeyList;
        this.reason = reason;
    }

    private OfficialAccountMsgRecallRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.msgKeyList = builder.msgKeyList;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getOfficialAccount() {
        return officialAccount;
    }

    public void setOfficialAccount(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public List<String> getMsgKeyList() {
        return msgKeyList;
    }

    public void setMsgKeyList(List<String> msgKeyList) {
        this.msgKeyList = msgKeyList;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


    public static final class Builder {
        private String officialAccount;
        private List<String> msgKeyList;
        private String reason;

        private Builder() {
        }

        public OfficialAccountMsgRecallRequest build() {
            return new OfficialAccountMsgRecallRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder msgKeyList(List<String> msgKeyList) {
            this.msgKeyList = msgKeyList;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }
    }
}
