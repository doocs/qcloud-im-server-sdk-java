package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.response.MsgBodyItem;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 14:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportMsgRequest extends GenericRequest {
    @JsonProperty("SyncFromOldSystem")
    private Integer syncFromOldSystem;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MsgSeq")
    private Integer msgSeq;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    @JsonProperty("MsgBody")
    private List<MsgBodyItem> msgBody;

    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public ImportMsgRequest() {
    }

    public ImportMsgRequest(Integer syncFromOldSystem, String fromAccount, String toAccount, Integer msgSeq, Integer msgRandom, Integer msgTimeStamp, List<MsgBodyItem> msgBody, String cloudCustomData) {
        this.syncFromOldSystem = syncFromOldSystem;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    public Integer getSyncFromOldSystem() {
        return syncFromOldSystem;
    }

    public void setSyncFromOldSystem(Integer syncFromOldSystem) {
        this.syncFromOldSystem = syncFromOldSystem;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Integer msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
    }

    public List<MsgBodyItem> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<MsgBodyItem> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }
}
