package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 拉取公众号用户历史消息-请求参数
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialAccountMsgGetSimpleRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -2285156190071562998L;
    /**
     * 要拉取历史消息的公众号用户
     */
    @JsonProperty("Official_Account")
    private String officialAccount;

    /**
     * 上一次拉取到的最后一条消息的 MsgKey，续拉时需要填该字段
     */
    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

    /**
     * 请求的消息条数
     */
    @JsonProperty("ReqMsgNumber")
    private Integer reqMsgNumber;

    /**
     * 是否带撤回的消息，填1表明需要拉取撤回后的消息；默认不拉取撤回后的消息
     */
    @JsonProperty("WithRecalledMsg")
    private Integer withRecalledMsg;

    public OfficialAccountMsgGetSimpleRequest() {
    }

    public OfficialAccountMsgGetSimpleRequest(String officialAccount) {
        this.officialAccount = officialAccount;
    }

    public OfficialAccountMsgGetSimpleRequest(String officialAccount, String lastMsgKey, Integer reqMsgNumber, Integer withRecalledMsg) {
        this.officialAccount = officialAccount;
        this.lastMsgKey = lastMsgKey;
        this.reqMsgNumber = reqMsgNumber;
        this.withRecalledMsg = withRecalledMsg;
    }

    private OfficialAccountMsgGetSimpleRequest(Builder builder) {
        this.officialAccount = builder.officialAccount;
        this.lastMsgKey = builder.lastMsgKey;
        this.reqMsgNumber = builder.reqMsgNumber;
        this.withRecalledMsg = builder.withRecalledMsg;
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

    public String getLastMsgKey() {
        return lastMsgKey;
    }

    public void setLastMsgKey(String lastMsgKey) {
        this.lastMsgKey = lastMsgKey;
    }

    public Integer getReqMsgNumber() {
        return reqMsgNumber;
    }

    public void setReqMsgNumber(Integer reqMsgNumber) {
        this.reqMsgNumber = reqMsgNumber;
    }

    public Integer getWithRecalledMsg() {
        return withRecalledMsg;
    }

    public void setWithRecalledMsg(Integer withRecalledMsg) {
        this.withRecalledMsg = withRecalledMsg;
    }


    public static final class Builder {
        private String officialAccount;
        private String lastMsgKey;
        private Integer reqMsgNumber;
        private Integer withRecalledMsg;

        private Builder() {
        }

        public OfficialAccountMsgGetSimpleRequest build() {
            return new OfficialAccountMsgGetSimpleRequest(this);
        }

        public Builder officialAccount(String officialAccount) {
            this.officialAccount = officialAccount;
            return this;
        }

        public Builder lastMsgKey(String lastMsgKey) {
            this.lastMsgKey = lastMsgKey;
            return this;
        }

        public Builder reqMsgNumber(Integer reqMsgNumber) {
            this.reqMsgNumber = reqMsgNumber;
            return this;
        }

        public Builder withRecalledMsg(Integer withRecalledMsg) {
            this.withRecalledMsg = withRecalledMsg;
            return this;
        }
    }
}
