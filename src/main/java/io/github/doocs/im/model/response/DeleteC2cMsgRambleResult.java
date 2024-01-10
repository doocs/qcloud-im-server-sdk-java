package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 单向删除单聊历史消息-结果
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
public class DeleteC2cMsgRambleResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7513216082123424659L;

    /**
     * 请求中格式非法的 MsgKey
     */
    @JsonProperty("InvalidMsgKeyList")
    private List<String> invalidMsgKeyList;

    public List<String> getInvalidMsgKeyList() {
        return invalidMsgKeyList;
    }

    public void setInvalidMsgKeyList(List<String> invalidMsgKeyList) {
        this.invalidMsgKeyList = invalidMsgKeyList;
    }

    @Override
    public String toString() {
        return "DeleteC2cMsgRambleResult{" +
                "invalidMsgKeyList=" + invalidMsgKeyList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
