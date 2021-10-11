package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/10/11 10:49
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRecentContactRequest extends GenericRequest {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("Type")
    private Integer type;

    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ClearRamble")
    private Integer clearRamble;

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getClearRamble() {
        return clearRamble;
    }

    public void setClearRamble(Integer clearRamble) {
        this.clearRamble = clearRamble;
    }
}
