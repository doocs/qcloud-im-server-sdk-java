package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author bingo
 * @since 2021/7/28 11:10
 */
public class QueryResultItem implements Serializable {
    private static final long serialVersionUID = -1158076928441361126L;
    /**
     * 返回的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 返回的用户状态
     */
    @JsonProperty("Status")
    private String status;

    /**
     * 详细的登录平台信息
     */
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
