package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 导入多个账号-结果
 *
 * @author bingo
 * @since 2021/7/27 16:00
 */
public class MultiAccountImportResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7910345256342778638L;
    /**
     * 导入失败的账号列表
     */
    @JsonProperty("FailAccounts")
    private List<String> failAccounts;

    public List<String> getFailAccounts() {
        return failAccounts;
    }

    public void setFailAccounts(List<String> failAccounts) {
        this.failAccounts = failAccounts;
    }

    @Override
    public String toString() {
        return "MultiAccountImportResult{" +
                "failAccounts=" + failAccounts +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
