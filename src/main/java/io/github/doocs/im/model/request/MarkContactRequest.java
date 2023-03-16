package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建或更新会话标记数据-请求参数
 *
 * @author bingo
 * @since 2023/3/16 15:31
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarkContactRequest extends GenericRequest {
    /**
     * 请求方uid
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 会话标记数组，一次最多支持100个
     */
    @JsonProperty("MarkItem")
    private List<MarkContactItem> markItem;

    public MarkContactRequest() {
    }

    public MarkContactRequest(String fromAccount, List<MarkContactItem> markItem) {
        this.fromAccount = fromAccount;
        this.markItem = markItem;
    }

    private MarkContactRequest(Builder builder) {
        this.fromAccount = builder.fromAccount;
        this.markItem = builder.markItem;
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

    public List<MarkContactItem> getMarkItem() {
        return markItem;
    }

    public void setMarkItem(List<MarkContactItem> markItem) {
        this.markItem = markItem;
    }


    public static final class Builder {
        private String fromAccount;
        private List<MarkContactItem> markItem;

        private Builder() {
        }

        public MarkContactRequest build() {
            return new MarkContactRequest(this);
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder markItem(List<MarkContactItem> markItem) {
            this.markItem = markItem;
            return this;
        }
    }
}
