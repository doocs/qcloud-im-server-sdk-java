package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:55
 */
public class ResultItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ResultCode")
    private Integer resultCode;

    @JsonProperty("ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    @Override
    public String toString() {
        return "ResultItem{" +
                "toAccount='" + toAccount + '\'' +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
