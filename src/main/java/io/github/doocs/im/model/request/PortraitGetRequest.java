package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/31 10:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortraitGetRequest extends GenericRequest {
    @JsonProperty("To_Account")
    private List<String> toAccount;

    @JsonProperty("TagList")
    private List<String> tagList;

    public PortraitGetRequest() {
    }

    public PortraitGetRequest(List<String> toAccount, List<String> tagList) {
        this.toAccount = toAccount;
        this.tagList = tagList;
    }

    private PortraitGetRequest(Builder builder) {
        this.toAccount = builder.toAccount;
        this.tagList = builder.tagList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<String> getToAccount() {
        return toAccount;
    }

    public void setToAccount(List<String> toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }


    public static final class Builder {
        private List<String> toAccount;
        private List<String> tagList;

        private Builder() {
        }

        public PortraitGetRequest build() {
            return new PortraitGetRequest(this);
        }

        public Builder toAccount(List<String> toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder tagList(List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
    }
}
