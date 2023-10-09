package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 批量发单聊消息-结果
 *
 * @author hyh
 * @since 2021/07/28 16:49
 */
public class BatchSendMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 4547611220565507607L;
    /**
     * 消息唯一标识，用于撤回。长度不超过50个字符
     */
    @JsonProperty("MsgKey")
    private String msgKey;

    /**
     * 发消息失败的账号列表，在此列表中的目标账号，消息发送失败或账号不存在。若消息全部发送成功，则 ErrorList 为空
     */
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

    @Override
    public String toString() {
        return "BatchSendMsgResult{" +
                "msgKey='" + msgKey + '\'' +
                ", errorList=" + errorList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
