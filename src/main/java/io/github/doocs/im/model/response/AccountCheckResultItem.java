package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/27 16:24
 */
public class AccountCheckResultItem implements Serializable {
    private static final long serialVersionUID = 8615489080848755006L;
    /**
     * 单个账号的检查结果：0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * 单个账号检查失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    /**
     * 请求检查的账号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

    /**
     * 单个账号的导入状态：Imported 表示已导入，NotImported 表示未导入
     */
    @JsonProperty("AccountStatus")
    private String accountStatus;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "AccountCheckResultItem{" +
                "resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                ", userId='" + userId + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
