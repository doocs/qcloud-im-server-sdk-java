package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 拉取资料-请求参数
 *
 * @author hyh
 * @since 2021/07/31 10:39
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PortraitGetRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8534194613880256146L;
    /**
     * 需要拉取这些 UserID 的资料；
     * 注意：每次拉取的用户数不得超过100，避免因回包数据量太大以致回包失败
     */
    @JsonProperty("To_Account")
    private List<String> toAccount;

    /**
     * 指定要拉取的资料字段的 Tag，支持的字段有：
     * 1. 标配资料字段，详情可参见 标配资料字段
     * 2. 自定义资料字段，详情可参见 自定义资料字段
     */
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
