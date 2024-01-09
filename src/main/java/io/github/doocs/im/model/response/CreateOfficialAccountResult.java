package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 创建公众号-结果
 *
 * @author hyh
 * @since 2024/1/9 22:01
 */
public class CreateOfficialAccountResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 6532102716512028913L;

    /**
     * 创建成功之后的公众号 ID，返回用户自定义或者由即时通信 IM 后台默认分配的 ID
     */
    @JsonProperty("OfficialAccountUserID")
    private String officialAccountUserID;

    public String getOfficialAccountUserID() {
        return officialAccountUserID;
    }

    public void setOfficialAccountUserID(String officialAccountUserID) {
        this.officialAccountUserID = officialAccountUserID;
    }

    @Override
    public String toString() {
        return "CreateOfficialAccountResult{" +
                "officialAccountUserID='" + officialAccountUserID + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
