package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/29 15:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortraitSetRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItemList;

    public PortraitSetRequest(String fromAccount, List<ProfileItem> profileItemList) {
        this.fromAccount = fromAccount;
        this.profileItemList = profileItemList;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public List<ProfileItem> getProfileItemList() {
        return profileItemList;
    }

    public void setProfileItemList(List<ProfileItem> profileItemList) {
        this.profileItemList = profileItemList;
    }
}
