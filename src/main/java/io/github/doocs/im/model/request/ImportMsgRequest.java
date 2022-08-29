package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.util.List;

/**
 * 导入单聊消息-请求参数
 *
 * @author hyh
 * @since 2021/07/29 14:25
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportMsgRequest extends GenericRequest {
    /**
     * 该字段只能填2或5，其他值是非法值
     * 2表示历史消息导入，消息不计入未读计数，且消息不会推送到终端
     * 5表示实时消息导入，消息计入未读计数，且消息会推送到终端
     */
    @JsonProperty("SyncFromOldSystem")
    private Integer syncFromOldSystem;

    /**
     * 消息发送方 UserID，用于指定发送消息方
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息接收方 UserID
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgSeq")
    private Long msgSeq;

    /**
     * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
     */
    @JsonProperty("MsgRandom")
    private Long msgRandom;

    /**
     * 消息时间戳，UNIX 时间戳，单位为秒。后台会根据该字段去重，详细规则请看本接口的功能说明。
     */
    @JsonProperty("MsgTimeStamp")
    private Integer msgTimeStamp;

    /**
     * 消息内容
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public ImportMsgRequest() {
    }

    public ImportMsgRequest(Integer syncFromOldSystem, String fromAccount, String toAccount, Long msgRandom,
                            Integer msgTimeStamp, List<TIMMsgElement> msgBody) {
        this.syncFromOldSystem = syncFromOldSystem;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.msgBody = msgBody;
    }

    public ImportMsgRequest(Integer syncFromOldSystem, String fromAccount, String toAccount, Long msgSeq,
                            Long msgRandom, Integer msgTimeStamp, List<TIMMsgElement> msgBody, String cloudCustomData) {
        this.syncFromOldSystem = syncFromOldSystem;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.msgSeq = msgSeq;
        this.msgRandom = msgRandom;
        this.msgTimeStamp = msgTimeStamp;
        this.msgBody = msgBody;
        this.cloudCustomData = cloudCustomData;
    }

    private ImportMsgRequest(Builder builder) {
        this.syncFromOldSystem = builder.syncFromOldSystem;
        this.fromAccount = builder.fromAccount;
        this.toAccount = builder.toAccount;
        this.msgSeq = builder.msgSeq;
        this.msgRandom = builder.msgRandom;
        this.msgTimeStamp = builder.msgTimeStamp;
        this.msgBody = builder.msgBody;
        this.cloudCustomData = builder.cloudCustomData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getSyncFromOldSystem() {
        return syncFromOldSystem;
    }

    public void setSyncFromOldSystem(Integer syncFromOldSystem) {
        this.syncFromOldSystem = syncFromOldSystem;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Long getMsgSeq() {
        return msgSeq;
    }

    public void setMsgSeq(Long msgSeq) {
        this.msgSeq = msgSeq;
    }

    public Long getMsgRandom() {
        return msgRandom;
    }

    public void setMsgRandom(Long msgRandom) {
        this.msgRandom = msgRandom;
    }

    public Integer getMsgTimeStamp() {
        return msgTimeStamp;
    }

    public void setMsgTimeStamp(Integer msgTimeStamp) {
        this.msgTimeStamp = msgTimeStamp;
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

    public static final class Builder {
        private Integer syncFromOldSystem;
        private String fromAccount;
        private String toAccount;
        /**
         * 消息序列号，用于标记该条消息，数据范围 [0,4294967295]
         */
        private Long msgSeq;
        /**
         * 消息随机数，用于标记该条消息，数据范围 [0,4294967295]
         */
        private Long msgRandom;
        private Integer msgTimeStamp;
        private List<TIMMsgElement> msgBody;
        private String cloudCustomData;

        private Builder() {
        }

        public ImportMsgRequest build() {
            return new ImportMsgRequest(this);
        }

        public Builder syncFromOldSystem(Integer syncFromOldSystem) {
            this.syncFromOldSystem = syncFromOldSystem;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder msgSeq(Long msgSeq) {
            this.msgSeq = msgSeq;
            return this;
        }

        public Builder msgRandom(Long msgRandom) {
            this.msgRandom = msgRandom;
            return this;
        }

        public Builder msgTimeStamp(Integer msgTimeStamp) {
            this.msgTimeStamp = msgTimeStamp;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }
    }
}
