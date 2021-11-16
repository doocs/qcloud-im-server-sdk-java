package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author bingo
 * @since 2021/11/16 21:00
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeforeSendGroupMsgResponse extends CallbackResponse {
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    public BeforeSendGroupMsgResponse(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public BeforeSendGroupMsgResponse(String actionStatus, Integer errorCode, String errorInfo, List<TIMMsgElement> msgBody) {
        super(actionStatus, errorCode, errorInfo);
        this.msgBody = msgBody;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }
}
