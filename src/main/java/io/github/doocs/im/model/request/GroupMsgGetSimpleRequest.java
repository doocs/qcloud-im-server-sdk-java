package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/08/01 13:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMsgGetSimpleRequest extends GenericRequest {
    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("ReqMsgSeq")
    private Integer reqMsgSeq;

    @JsonProperty("ReqMsgNumber")
    private Integer reqMsgNumber;

    public GroupMsgGetSimpleRequest() {
    }

    public GroupMsgGetSimpleRequest(String groupId, Integer reqMsgNumber) {
        this.groupId = groupId;
        this.reqMsgNumber = reqMsgNumber;
    }

    public GroupMsgGetSimpleRequest(String groupId, Integer reqMsgSeq, Integer reqMsgNumber) {
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

    public Integer getReqMsgSeq() {
        return reqMsgSeq;
    }

    public void setReqMsgSeq(Integer reqMsgSeq) {
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
        private Integer reqMsgSeq;
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

        public Builder reqMsgSeq(Integer reqMsgSeq) {
            this.reqMsgSeq = reqMsgSeq;
            return this;
        }

        public Builder reqMsgNumber(Integer reqMsgNumber) {
            this.reqMsgNumber = reqMsgNumber;
            return this;
        }
    }
}
