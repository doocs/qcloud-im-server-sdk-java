package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2021/7/28 11:04
 */
public class AccountDeleteResultItem implements Serializable {
    private static final long serialVersionUID = 2265767918424355807L;
    /**
     * 单个帐号的错误码，0表示成功，非0表示失败
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * 单个帐号删除失败时的错误描述信息
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    /**
     * 请求删除的帐号的 UserID
     */
    @JsonProperty("UserID")
    private String userId;

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

    @Override
    public String toString() {
        return "AccountDeleteResultItem{" +
                "resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
