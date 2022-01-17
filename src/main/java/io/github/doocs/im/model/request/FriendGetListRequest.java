package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取指定好友-请求参数
 *
 * @author hyh
 * @since 2021/07/31 14:41
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FriendGetListRequest extends GenericRequest {
    /**
     * 指定要拉取好友数据的用户的 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 好友的 UserID 列表
     * 建议每次请求的好友数不超过100，避免因数据量太大导致回包失败
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 指定要拉取的资料字段及好友字段：
     * 标配资料字段
     * 自定义资料字段
     * 标配好友字段
     * 自定义好友字段
     */
    @JsonProperty("TagList")
    private List<String> tagList;

    public FriendGetListRequest() {
    }

    public FriendGetListRequest(String fromAccount, List<String> toAccount, List<String> tagList) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.tagList = tagList;
    }

    private FriendGetListRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.tagList = builder.tagList;
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
        private String fromAccount;
        private List<String> toAccount;
        private List<String> tagList;

        private Builder() {
        }

        public FriendGetListRequest build() {
            return new FriendGetListRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
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
