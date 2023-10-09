package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.message.TIMMsgElement;

import java.io.Serializable;
import java.util.List;

/**
 * 在群组中发送普通消息-请求参数
 *
 * @author hyh
 * @since 2021/08/02 16:46
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SendGroupMsgRequest extends GenericRequest implements Serializable {
    private static final long serialVersionUID = -8188296907846189930L;
    /**
     * 向哪个群组发送消息
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * 无符号32位整数。如果5分钟内两条消息的内容和 Random 随机值都相同的情况下，后一条消息将被当做重复消息而丢弃
     */
    @JsonProperty("Random")
    private Long random;

    /**
     * 消息的优先级
     */
    @JsonProperty("MsgPriority")
    private String msgPriority;

    /**
     * 消息体，详细可参阅 消息格式描述
     */
    @JsonProperty("MsgBody")
    private List<TIMMsgElement> msgBody;

    /**
     * 消息来源账号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的 App 管理员账号。
     * 除此之外，App 亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。
     * 需要注意的是，如果指定该字段，必须要确保字段中的账号是存在的
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 线推送信息配置，详细可参阅 消息格式描述
     */
    @JsonProperty("OfflinePushInfo")
    private OfflinePushInfo offlinePushInfo;

    /**
     * 消息回调禁止开关，只对单条消息有效，
     * ForbidBeforeSendMsgCallback 表示禁止发消息前回调，ForbidAfterSendMsgCallback 表示禁止发消息后回调
     */
    @JsonProperty("ForbidCallbackControl")
    private List<String> forbidCallbackControl;

    /**
     * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
     * {@link io.github.doocs.im.constant.OnlineOnlyFlag}
     */
    @JsonProperty("OnlineOnlyFlag")
    private Integer onlineOnlyFlag;

    /**
     * 消息发送权限，NoLastMsg 只对单条消息有效，表示不更新最近联系人会话；NoUnread 不计未读，只对单条消息有效。
     * （如果该消息 OnlineOnlyFlag 设置为1，则不允许使用该字段。）
     */
    @JsonProperty("SendMsgControl")
    private List<String> sendMsgControl;

    /**
     * 消息自定义数据（云端保存，会发送到对端，程序卸载重装后还能拉取到）
     */
    @JsonProperty("cloudCustomData")
    private String cloudCustomData;

    /**
     * 该条消息是否支持消息扩展，0为不支持，1为支持。
     * {@link io.github.doocs.im.constant.SupportMessageExtension}
     */
    @JsonProperty("SupportMessageExtension")
    private Integer supportMessageExtension;

    /**
     * 指定消息接收者(接收者成员上限50个)，如果此字段被使用，消息则不计未读，仅旗舰版支持此功能，
     * 支持群类型 Private、Public、ChatRoom
     */
    @JsonProperty("To_Account")
    private String toAccount;

    /**
     * 话题的 ID，仅社群支持此选项
     */
    @JsonProperty("TopicId")
    private String topicId;

    public SendGroupMsgRequest() {
    }

    public SendGroupMsgRequest(String groupId, Long random, List<TIMMsgElement> msgBody) {
        this.groupId = groupId;
        this.random = random;
        this.msgBody = msgBody;
    }

    public SendGroupMsgRequest(String groupId, Long random, String msgPriority, List<TIMMsgElement> msgBody,
                               String fromAccount, OfflinePushInfo offlinePushInfo, List<String> forbidCallbackControl,
                               Integer onlineOnlyFlag, List<String> sendMsgControl, String cloudCustomData,
                               Integer supportMessageExtension, String toAccount, String topicId) {
        this.groupId = groupId;
        this.random = random;
        this.msgPriority = msgPriority;
        this.msgBody = msgBody;
        this.fromAccount = fromAccount;
        this.offlinePushInfo = offlinePushInfo;
        this.forbidCallbackControl = forbidCallbackControl;
        this.onlineOnlyFlag = onlineOnlyFlag;
        this.sendMsgControl = sendMsgControl;
        this.cloudCustomData = cloudCustomData;
        this.supportMessageExtension = supportMessageExtension;
        this.toAccount = toAccount;
        this.topicId = topicId;
    }

    private SendGroupMsgRequest(Builder builder) {
        this.groupId = builder.groupId;
        this.random = builder.random;
        this.msgPriority = builder.msgPriority;
        this.msgBody = builder.msgBody;
        this.fromAccount = builder.fromAccount;
        this.offlinePushInfo = builder.offlinePushInfo;
        this.forbidCallbackControl = builder.forbidCallbackControl;
        this.onlineOnlyFlag = builder.onlineOnlyFlag;
        this.sendMsgControl = builder.sendMsgControl;
        this.cloudCustomData = builder.cloudCustomData;
        this.supportMessageExtension = builder.supportMessageExtension;
        this.toAccount = builder.toAccount;
        this.topicId = builder.topicId;
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

    public Long getRandom() {
        return random;
    }

    public void setRandom(Long random) {
        this.random = random;
    }

    public String getMsgPriority() {
        return msgPriority;
    }

    public void setMsgPriority(String msgPriority) {
        this.msgPriority = msgPriority;
    }

    public List<TIMMsgElement> getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(List<TIMMsgElement> msgBody) {
        this.msgBody = msgBody;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public OfflinePushInfo getOfflinePushInfo() {
        return offlinePushInfo;
    }

    public void setOfflinePushInfo(OfflinePushInfo offlinePushInfo) {
        this.offlinePushInfo = offlinePushInfo;
    }

    public List<String> getForbidCallbackControl() {
        return forbidCallbackControl;
    }

    public void setForbidCallbackControl(List<String> forbidCallbackControl) {
        this.forbidCallbackControl = forbidCallbackControl;
    }

    public Integer getOnlineOnlyFlag() {
        return onlineOnlyFlag;
    }

    public void setOnlineOnlyFlag(Integer onlineOnlyFlag) {
        this.onlineOnlyFlag = onlineOnlyFlag;
    }

    public List<String> getSendMsgControl() {
        return sendMsgControl;
    }

    public void setSendMsgControl(List<String> sendMsgControl) {
        this.sendMsgControl = sendMsgControl;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }

    public Integer getSupportMessageExtension() {
        return supportMessageExtension;
    }

    public void setSupportMessageExtension(Integer supportMessageExtension) {
        this.supportMessageExtension = supportMessageExtension;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }


    public static final class Builder {
        private String groupId;
        private Long random;
        private String msgPriority;
        private List<TIMMsgElement> msgBody;
        private String fromAccount;
        private OfflinePushInfo offlinePushInfo;
        private List<String> forbidCallbackControl;
        private Integer onlineOnlyFlag;
        private List<String> sendMsgControl;
        private String cloudCustomData;
        private Integer supportMessageExtension;
        private String toAccount;
        private String topicId;

        private Builder() {
        }

        public SendGroupMsgRequest build() {
            return new SendGroupMsgRequest(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder random(Long random) {
            this.random = random;
            return this;
        }

        public Builder msgPriority(String msgPriority) {
            this.msgPriority = msgPriority;
            return this;
        }

        public Builder msgBody(List<TIMMsgElement> msgBody) {
            this.msgBody = msgBody;
            return this;
        }

        public Builder fromAccount(String fromAccount) {
            this.fromAccount = fromAccount;
            return this;
        }

        public Builder offlinePushInfo(OfflinePushInfo offlinePushInfo) {
            this.offlinePushInfo = offlinePushInfo;
            return this;
        }

        public Builder forbidCallbackControl(List<String> forbidCallbackControl) {
            this.forbidCallbackControl = forbidCallbackControl;
            return this;
        }

        public Builder onlineOnlyFlag(Integer onlineOnlyFlag) {
            this.onlineOnlyFlag = onlineOnlyFlag;
            return this;
        }

        public Builder sendMsgControl(List<String> sendMsgControl) {
            this.sendMsgControl = sendMsgControl;
            return this;
        }

        public Builder cloudCustomData(String cloudCustomData) {
            this.cloudCustomData = cloudCustomData;
            return this;
        }

        public Builder supportMessageExtension(Integer supportMessageExtension) {
            this.supportMessageExtension = supportMessageExtension;
            return this;
        }

        public Builder toAccount(String toAccount) {
            this.toAccount = toAccount;
            return this;
        }

        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }
    }
}
