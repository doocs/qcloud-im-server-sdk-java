package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 下载最近消息记录-请求参数
 *
 * @author bingo
 * @since 2021/7/31 20:28
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHistoryRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = 4053700683003712565L;
    /**
     * 消息类型，C2C 表示单发消息 Group 表示群组消息
     * {@link io.github.doocs.im.constant.ChatType}
     */
    @JsonProperty("ChatType")
    private String chatType;

    /**
     * 需要下载的消息记录的时间段
     * 2015120121表示获取2015年12月1日21:00 - 21:59的消息的下载地址。
     * 该字段需精确到小时。每次请求只能获取某天某小时的所有单发或群组消息记录
     */
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
