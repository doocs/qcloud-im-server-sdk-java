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
}
