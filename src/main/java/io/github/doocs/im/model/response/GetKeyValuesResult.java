package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 拉取单聊消息扩展-结果
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
public class GetKeyValuesResult extends GenericResult {
    /**
     * 1 为已返回所有扩展，0 为未返回所有列表
     */
    @JsonProperty("CompleteFlag")
    private Integer completeFlag;

    /**
     * 后台最新的Seq，为所有KV的Seq的最大值
     */
    @JsonProperty("LatestSeq")
    private Long latestSeq;

    /**
     * 清空操作的Seq，客户端本地需要删除所有小于等于ClearSeq的KV
     */
    @JsonProperty("ClearSeq")
    private Long clearSeq;

    /**
     * 返回的KV列表，按Seq大小排序。单次拉取最多返回200条KV。超过200条需要通过StartSeq分批拉取
     */
    @JsonProperty("ExtensionList")
    private List<KeyValueSeq> extensionList;

    public Integer getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(Integer completeFlag) {
        this.completeFlag = completeFlag;
    }

    public Long getLatestSeq() {
        return latestSeq;
    }

    public void setLatestSeq(Long latestSeq) {
        this.latestSeq = latestSeq;
    }

    public Long getClearSeq() {
        return clearSeq;
    }

    public void setClearSeq(Long clearSeq) {
        this.clearSeq = clearSeq;
    }

    public List<KeyValueSeq> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<KeyValueSeq> extensionList) {
        this.extensionList = extensionList;
    }

    @Override
    public String toString() {
        return "GetKeyValuesResult{" +
                "completeFlag=" + completeFlag +
                ", latestSeq=" + latestSeq +
                ", clearSeq=" + clearSeq +
                ", extensionList=" + extensionList +
                '}';
    }
}
