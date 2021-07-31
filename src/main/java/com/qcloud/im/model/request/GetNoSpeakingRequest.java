package com.qcloud.im.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:48
 */
public class GetNoSpeakingRequest extends GenericRequest {
    @JsonProperty("Get_Account")
    private String getAccount;

    public GetNoSpeakingRequest() {
    }

    public GetNoSpeakingRequest(String getAccount) {
        this.getAccount = getAccount;
    }

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }

}
