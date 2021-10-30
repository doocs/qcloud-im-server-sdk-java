package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;
import java.util.Map;

/**
 * @author bingo
 * @since 2021/7/31 16:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IMPushRequest extends GenericRequest {
    @JsonProperty("Condition")
    private Map<String, Object> condition;

    @JsonProperty("MsgRandom")
    private Integer msgRandom;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    @JsonProperty("MsgLifeTime")
    private Integer msgLifeTime;

    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    public IMPushRequest(Integer msgRandom, List<TIMMsgElement> msgBody) {
        this(null, msgRandom, msgBody, null, null, null);
    }

    public IMPushRequest(Map<String, Object> condition, Integer msgRandom, List<TIMMsgElement> msgBody, Integer msgLifeTime, String fromAccount, OfflinePushInfo offlinePushInfo) {
        this.condition = condition;
        this.msgRandom = msgRandom;
        this.msgBody = msgBody;
        this.msgLifeTime = msgLifeTime;
        this.fromAccount = fromAccount;
        this.offlinePushInfo = offlinePushInfo;
    }

    public Map<String, Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }

    public Integer getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Integer msgRandom) {
        this.msgRandom = msgRandom;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public Integer getMsgLifeTime() {
        return msgLifeTime;
    }

    public void setMsgLifeTime(Integer msgLifeTime) {
        this.msgLifeTime = msgLifeTime;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }
}
