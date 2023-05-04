package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author hyh
 * @since 2021/07/30 17:29
 */
public class BlackListCheckItem implements Serializable {
    private static final long serialVersionUID = -1784145990260400542L;
    /**
     * 请求校验的用户的 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 校验成功时 To_Account 与 From_Account 之间的黑名单关系，详情可参见 校验黑名单
     */
    @JsonProperty("Relation")
    private String relation;

    /**
     * To_Account 的处理结果，0表示成功，非0表示失败，非0取值的详细描述请参见 错误码说明
     */
    @JsonProperty("ResultCode")
    private Integer resultCode;

    /**
     * To_Account 的错误描述信息，成功时该字段为空
     */
    @JsonProperty("ResultInfo")
    private String resultInfo;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
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
        return "BlackListCheckItem{" +
                "toAccount='" + toAccount + '\'' +
                ", relation='" + relation + '\'' +
                ", resultCode=" + resultCode +
                ", resultInfo='" + resultInfo + '\'' +
                '}';
    }
}
