package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * @author bingo
 * @since 2021/8/4 15:23
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgItem {
    @JsonProperty("From_Account")
    private String fromAccount;

    @JsonProperty("SendTime")
    private Integer sendTime;

    @JsonProperty("Random")
    private Integer random;

    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    public GroupMsgItem(String fromAccount, Integer sendTime) {
        this(fromAccount, sendTime, null, null);
    }

    public GroupMsgItem(String fromAccount, Integer sendTime, Integer random, List<TIMMsgElement> msgBody) {
        this.fromAccount = fromAccount;
        this.sendTime = sendTime;
        this.random = random;
        this.msgBody = msgBody;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }
}
