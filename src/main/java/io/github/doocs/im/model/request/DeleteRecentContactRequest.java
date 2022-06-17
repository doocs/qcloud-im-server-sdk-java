package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 删除单个会话-请求参数
 *
 * @author bingo
 * @since 2021/10/11 10:49
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteRecentContactRequest extends GenericRequest {
    /**
     * 请求删除该 UserID 的会话
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 会话类型：1 表示 C2C 会话；2 表示 G2C 会话
     * {@link io.github.doocs.im.constant.RecentContactType}
     */
    @JsonProperty("Type")
    private Integer type;

    /**
     * C2C 会话才赋值，C2C 会话方的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * G2C 会话才赋值，G2C 会话的群 ID
     */
    @JsonProperty("ToGroupid")
    private String toGroupId;

    /**
     * 是否清理漫游消息：1 表示清理漫游消息；0 表示不清理漫游消息
     * {@link io.github.doocs.im.constant.ClearRamble}
     */
    @JsonProperty("ClearRamble")
    private Integer clearRamble;

    public DeleteRecentContactRequest() {
    }

    public DeleteRecentContactRequest(String fromAccount, Integer type) {
        this.fromAccount = fromAccount;
        this.type = type;
    }

    public DeleteRecentContactRequest(String fromAccount, Integer type, String toAccount,
                                      String toGroupId, Integer clearRamble) {
        this.fromAccount = fromAccount;
        this.type = type;
        this.toAccount = toAccount;
        this.toGroupId = toGroupId;
        this.clearRamble = clearRamble;
    }

    private DeleteRecentContactRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.type = builder.type;
        this.toAccount = builder.toAccount;
        this.toGroupId = builder.toGroupId;
        this.clearRamble = builder.clearRamble;
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

    public String getToGroupId() {
        return toGroupId;
    }

    public void setToGroupId(String toGroupId) {
        this.toGroupId = toGroupId;
    }

    public Integer getClearRamble() {
        return clearRamble;
    }

    public void setClearRamble(Integer clearRamble) {
        this.clearRamble = clearRamble;
    }


    public static final class Builder {
        private String fromAccount;
        private Integer type;
        private String toAccount;
        private String toGroupId;
        private Integer clearRamble;

        private Builder() {
        }

        public DeleteRecentContactRequest build() {
            return new DeleteRecentContactRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder toGroupId(String toGroupId) {
            this.toGroupId = toGroupId;
            return this;
        }

        public Builder clearRamble(Integer clearRamble) {
            this.clearRamble = clearRamble;
            return this;
        }
    }
}
