package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 11:22
 */
public class GetGroupShuttedUinResult extends GenericResult {
    @JsonProperty("ShuttedUinList")
    private List<ShuttedUinResultItem> shuttedUinList;

    public List<ShuttedUinResultItem> getShuttedUinList() {
        return shuttedUinList;
    }

    public void setShuttedUinList(List<ShuttedUinResultItem> shuttedUinList) {
        this.shuttedUinList = shuttedUinList;
    }

    @Override
    public String toString() {
        return "GetGroupShuttedUinResult{" +
                "shuttedUinList=" + shuttedUinList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
