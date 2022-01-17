package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取运营数据-结果
 *
 * @author bingo
 * @since 2021/7/31 19:06
 */
public class GetAppInfoResult extends GenericResult {
    /**
     * 请求最近30天的运营数据
     */
    @JsonProperty("Result")
    private List<AppInfoResultItem> result;

    public List<AppInfoResultItem> getResult() {
        return result;
    }

    public void setResult(List<AppInfoResultItem> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "GetAppInfoResult{" +
                "result=" + result +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
