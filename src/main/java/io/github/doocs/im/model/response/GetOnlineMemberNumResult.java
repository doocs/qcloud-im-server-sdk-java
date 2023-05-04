package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 获取直播群在线人数-结果
 *
 * @author hyh
 * @since 2021/08/01 13:33
 */
public class GetOnlineMemberNumResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 19788052602034369L;
    /**
     * 该群组的在线人数
     */
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
