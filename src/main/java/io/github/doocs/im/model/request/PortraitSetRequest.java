package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 设置资料-请求参数
 *
 * @author hyh
 * @since 2021/07/29 15:01
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortraitSetRequest extends GenericRequest {
    /**
     * 需要设置该 UserID 的资料
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 待设置的用户的资料对象数组，数组中每一个对象都包含了 Tag 和 Value
     */
    @JsonProperty("ProfileItem")
    private List<ProfileItem> profileItemList;

    public PortraitSetRequest() {
    }

    public PortraitSetRequest(String fromAccount, List<ProfileItem> profileItemList) {
        this.fromAccount = fromAccount;
        this.profileItemList = profileItemList;
    }

    private PortraitSetRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.profileItemList = builder.profileItemList;
    }

    public static Builder builder() {
        return new Builder();
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


    public static final class Builder {
        private String fromAccount;
        private List<ProfileItem> profileItemList;

        private Builder() {
        }

        public PortraitSetRequest build() {
            return new PortraitSetRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder profileItemList(List<ProfileItem> profileItemList) {
            this.profileItemList = profileItemList;
            return this;
        }
    }
}
