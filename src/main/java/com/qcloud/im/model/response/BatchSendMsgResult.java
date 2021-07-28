package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author hyh
 * @since 2021/07/28 16:49
 */
public class BatchSendMsgResult extends GenericResult {
    @JsonProperty("MsgKey")
    private String msgKey;

    @JsonProperty("ErrorList")
    private List<BatchSendMsgErrorItem> errorList;

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey;
    }

    public List<BatchSendMsgErrorItem> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<BatchSendMsgErrorItem> errorList) {
        this.errorList = errorList;
    }
}
