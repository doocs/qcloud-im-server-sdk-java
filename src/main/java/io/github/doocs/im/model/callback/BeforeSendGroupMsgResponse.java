package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * 群内发言之前回调响应
 *
 * @author bingo
 * @since 2021/11/16 21:00
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeforeSendGroupMsgResponse extends CallbackResponse {
    /**
     * 经过App修改之后的消息体，云通讯后台将把修改后的消息发送到群组中
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public BeforeSendGroupMsgResponse(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public BeforeSendGroupMsgResponse(String actionStatus, Integer errorCode, String errorInfo,
                                      List<TIMMsgElement> msgBody, String cloudCustomData) {
        super(actionStatus, errorCode, errorInfo);
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }
}
