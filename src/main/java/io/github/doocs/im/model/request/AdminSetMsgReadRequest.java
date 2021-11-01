package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 15:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminSetMsgReadRequest extends GenericRequest {
    @JsonProperty("Report_Account")
    private String reportAccount;

    @JsonProperty("Peer_Account")
    private String peerAccount;

    @JsonProperty("MsgReadTime")
    private Integer msgReadTime;

    public AdminSetMsgReadRequest() {
    }

    public AdminSetMsgReadRequest(String reportAccount, String peerAccount) {
        this.reportAccount = reportAccount;
        this.peerAccount = peerAccount;
    }

    public AdminSetMsgReadRequest(String reportAccount, String peerAccount, Integer msgReadTime) {
        this.reportAccount = reportAccount;
        this.peerAccount = peerAccount;
        this.msgReadTime = msgReadTime;
    }

    private AdminSetMsgReadRequest(Builder builder) {
        this.reportAccount = builder.reportAccount;
        this.peerAccount = builder.peerAccount;
        this.msgReadTime = builder.msgReadTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getReportAccount() {
        return reportAccount;
    }

    public void setReportAccount(String reportAccount) {
        this.reportAccount = reportAccount;
    }

    public String getPeerAccount() {
        return peerAccount;
    }

    public void setPeerAccount(String peerAccount) {
        this.peerAccount = peerAccount;
    }

    public Integer getMsgReadTime() {
        return msgReadTime;
    }

    public void setMsgReadTime(Integer msgReadTime) {
        this.msgReadTime = msgReadTime;
    }


    public static final class Builder {
        private String reportAccount;
        private String peerAccount;
        private Integer msgReadTime;

        private Builder() {
        }

        public AdminSetMsgReadRequest build() {
            return new AdminSetMsgReadRequest(this);
        }

        public Builder reportAccount(String reportAccount) {
            this.reportAccount = reportAccount;
            return this;
        }

        public Builder peerAccount(String peerAccount) {
            this.peerAccount = peerAccount;
            return this;
        }

        public Builder msgReadTime(Integer msgReadTime) {
            this.msgReadTime = msgReadTime;
            return this;
        }
    }
}
