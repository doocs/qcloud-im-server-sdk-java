package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:33
 */
public class GetOnlineMemberNumResult extends GenericResult {
    @JsonProperty("OnlineMemberNum")
    private Integer onlineMemberNum;

    public GetOnlineMemberNumResult() {
    }

    public GetOnlineMemberNumResult(Integer onlineMemberNum) {
        this.onlineMemberNum = onlineMemberNum;
    }

    public Integer getOnlineMemberNum() {
        return onlineMemberNum;
    }

    public void setOnlineMemberNum(Integer onlineMemberNum) {
        this.onlineMemberNum = onlineMemberNum;
    }

    @Override
    public String toString() {
        return "GetOnlineMemberNumResult{" +
                "onlineMemberNum=" + onlineMemberNum +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
