package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:10
 */
public class QueryResultItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Detail")
    private List<QueryResultDetailItem> detail;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<QueryResultDetailItem> getDetail() {
        return detail;
    }

    public void setDetail(List<QueryResultDetailItem> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "QueryResultItem{" +
                "toAccount='" + toAccount + '\'' +
                ", status='" + status + '\'' +
                ", detail=" + detail +
                '}';
    }
}
