package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取服务器 IP 地址-结果
 *
 * @author bingo
 * @since 2021/7/31 20:31
 */
public class GetIpListResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4557651566304188031L;
    /**
     * 服务器 IP 列表
     */
    @JsonProperty("IPList")
    private List<String> ipList;

    public List<String> getIpList() {
        return ipList;
    }

    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }

    @Override
    public String toString() {
        return "GetIpListResult{" +
                "ipList=" + ipList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
