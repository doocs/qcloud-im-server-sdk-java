package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 聊天文件签名-结果
 *
 * @author bingo
 * @since 2022/6/1 17:52
 */
public class GetCosSigResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7623803821611127995L;
    /**
     * 批量查询结果返回
     */
    @JsonProperty("PreSigURLs")
    private List<PreSigUrlItem> preSigUrls;

    public List<PreSigUrlItem> getPreSigUrls() {
        return preSigUrls;
    }

    public void setPreSigUrls(List<PreSigUrlItem> preSigUrls) {
        this.preSigUrls = preSigUrls;
    }

    @Override
    public String toString() {
        return "GetCosSigResult{" +
                "preSigUrls=" + preSigUrls +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
