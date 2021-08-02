package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 14:27
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminRoamMsgRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("MaxCnt")
    private Integer maxCnt;

    @JsonProperty("MinTime")
    private Integer minTime;

    @JsonProperty("MaxTime")
    private Integer maxTime;

    @JsonProperty("LastMsgKey")
    private String lastMsgKey;

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

    public Integer getMaxCnt() {
        return maxCnt;
    }

    public void setMaxCnt(Integer maxCnt) {
        this.maxCnt = maxCnt;
    }

    public Integer getMinTime() {
        return minTime;
    }

    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    public Integer getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    public String getLastMsgKey() {
        return lastMsgKey;
    }

    public void setLastMsgKey(String lastMsgKey) {
        this.lastMsgKey = lastMsgKey;
    }
}
