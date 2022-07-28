package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 拉取群历史消息-请求参数
 *
 * @author hyh
 * @since 2021/08/01 13:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgGetSimpleRequest extends GenericRequest {
    /**
     * 要拉取历史消息的群组 ID
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 拉取消息的最大 seq
     */
    @JsonProperty("ReqMsgSeq")
    private Long reqMsgSeq;

    /**
     * 拉取的历史消息的条数，目前一次请求最多返回20条历史消息，所以这里最好小于等于20
     */
    @JsonProperty("ReqMsgNumber")
    private Integer reqMsgNumber;

    public GroupMsgGetSimpleRequest() {
    }

    public GroupMsgGetSimpleRequest(String groupId, Integer reqMsgNumber) {
        this.groupId = groupId;
        this.reqMsgNumber = reqMsgNumber;
    }

    public GroupMsgGetSimpleRequest(String groupId, Long reqMsgSeq, Integer reqMsgNumber) {
        this.groupId = groupId;
        this.reqMsgSeq = reqMsgSeq;
        this.reqMsgNumber = reqMsgNumber;
    }

    private GroupMsgGetSimpleRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.reqMsgSeq = builder.reqMsgSeq;
        this.reqMsgNumber = builder.reqMsgNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Long getReqMsgSeq() {
        return reqMsgSeq;
    }

    public void setReqMsgSeq(Long reqMsgSeq) {
        this.reqMsgSeq = reqMsgSeq;
    }

    public Integer getReqMsgNumber() {
        return reqMsgNumber;
    }

    public void setReqMsgNumber(Integer reqMsgNumber) {
        this.reqMsgNumber = reqMsgNumber;
    }


    public static final class Builder {
        private String groupId;
        private Long reqMsgSeq;
        private Integer reqMsgNumber;

        private Builder() {
        }

        public GroupMsgGetSimpleRequest build() {
            return new GroupMsgGetSimpleRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder reqMsgSeq(Long reqMsgSeq) {
            this.reqMsgSeq = reqMsgSeq;
            return this;
        }

        public Builder reqMsgNumber(Integer reqMsgNumber) {
            this.reqMsgNumber = reqMsgNumber;
            return this;
        }
    }
}
