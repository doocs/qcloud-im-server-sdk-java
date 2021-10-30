package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xy
 * @since 2021/07/31 11:48
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetNoSpeakingRequest extends GenericRequest {
    @JsonProperty("Get_Account")
    private String getAccount;

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
