package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 20:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHistoryRequest extends GenericRequest {
    @JsonProperty("ChatType")
    private String chatType;

    @JsonProperty("MsgTime")
    private String msgTime;

    public GetHistoryRequest() {
    }

    public GetHistoryRequest(String chatType, String msgTime) {
        this.chatType = chatType;
        this.msgTime = msgTime;
    }

    private GetHistoryRequest(Builder builder) {
        this.chatType = builder.chatType;
        this.msgTime = builder.msgTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getChatType() {
        return chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }


    public static final class Builder {
        private String chatType;
        private String msgTime;

        private Builder() {
        }

        public GetHistoryRequest build() {
            return new GetHistoryRequest(this);
        }

        public Builder chatType(String chatType) {
            this.chatType = chatType;
            return this;
        }

        public Builder msgTime(String msgTime) {
            this.msgTime = msgTime;
            return this;
        }
    }
}
