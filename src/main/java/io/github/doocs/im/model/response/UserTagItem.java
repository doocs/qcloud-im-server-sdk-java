package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/30 14:24
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTagItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Tags")
    private List<String> tags;

    public UserTagItem() {
    }

    public UserTagItem(String toAccount, List<String> tags) {
        this.toAccount = toAccount;
        this.tags = tags;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "UserTagItem{" +
                "toAccount='" + toAccount + '\'' +
                ", tags=" + tags +
                '}';
    }
}
