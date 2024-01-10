package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.model.request.ContactItem;

import java.io.Serializable;
import java.util.List;

/**
 * 审核结果回调
 *
 * @author bingo
 * @since 2024/1/10 10:18
 */
public class ContentResultNotifyCallback implements Serializable {
    private static final long serialVersionUID = 7934474404159505779L;

    /**
     * 送审场景：
     * 单聊 = C2C
     * 单聊自定义消息 = C2CCustom
     * 群聊 = Group
     * 群聊自定义消息 = GroupCustom
     * 群资料 = GroupInfo
     * 群成员资料 = GroupMemberInfo
     * 关系链 = RelationChain
     * 用户资料 = UserInfo
     */
    @JsonProperty("Scene")
    private String scene;

    /**
     * 送审内容的发起者 UserID
     */
    @JsonProperty("From_Account")
    private String fromAccount;

    /**
     * 消息送审时，表示消息接收对象
     */
    @JsonProperty("ContactItem")
    private ContactItem contactItem;

    /**
     * 表示送审的内容类型：
     * 文本 = Text
     * 图片 = Image
     * 音频 = Audio
     * 视频 = Video
     */
    @JsonProperty("ContentType")
    private String contentType;

    /**
     * 当 ContentType 为 Text 时，表示送审的文本内容。文本自定义消息可能存在多个数组成员返回，其他消息只有一个数组成员返回。
     */
    @JsonProperty("TextContent")
    private List<String> textContent;

    /**
     * 当 ContentType 为 Image/Audio/Video 时，表示送审的文件 URL
     */
    @JsonProperty("FileURL")
    private String fileUrl;

    /**
     * 单聊送审，MsgID 为单聊消息 MsgKey
     * 群聊送审，MsgID 为群聊消息 MsgSeq
     * 其中群消息如果没有MsgID，则表示违规拦截或者非审核环节导致消息没下发
     */
    @JsonProperty("MsgID")
    private String msgId;

    /**
     * IM处置策略：
     * 1：表示拦截
     * 0：表示放过
     */
    @JsonProperty("CtxcbResult")
    private Integer ctxcbResult;

    /**
     * 第三方内容服务审核标示
     */
    @JsonProperty("CtxcbRequestId")
    private String ctxcbRequestId;

    /**
     * 文本命中的敏感词
     */
    @JsonProperty("CtxcbKeywords")
    private List<String> ctxcbKeywords;

    /**
     * 第三方内容审核服务审核建议：Block/Review/Normal
     */
    @JsonProperty("CtxcbSuggestion")
    private String ctxcbSuggestion;

    /**
     * 审核命中的违规分类： Normal/Illegal/Abuse/Polity/Ad/Porn/Sexy/Terror/Composite
     */
    @JsonProperty("CtxcbLabel")
    private String ctxcbLabel;

    /**
     * 单聊或者群聊消息审核，消息体中对应的自定义字段 CloudCustomData 原样返回。其他场景审核该字段为空
     */
    @JsonProperty("CloudCustomData")
    private String cloudCustomData;

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public ContactItem getContactItem() {
        return contactItem;
    }

    public void setContactItem(ContactItem contactItem) {
        this.contactItem = contactItem;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public List<String> getTextContent() {
        return textContent;
    }

    public void setTextContent(List<String> textContent) {
        this.textContent = textContent;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Integer getCtxcbResult() {
        return ctxcbResult;
    }

    public void setCtxcbResult(Integer ctxcbResult) {
        this.ctxcbResult = ctxcbResult;
    }

    public String getCtxcbRequestId() {
        return ctxcbRequestId;
    }

    public void setCtxcbRequestId(String ctxcbRequestId) {
        this.ctxcbRequestId = ctxcbRequestId;
    }

    public List<String> getCtxcbKeywords() {
        return ctxcbKeywords;
    }

    public void setCtxcbKeywords(List<String> ctxcbKeywords) {
        this.ctxcbKeywords = ctxcbKeywords;
    }

    public String getCtxcbSuggestion() {
        return ctxcbSuggestion;
    }

    public void setCtxcbSuggestion(String ctxcbSuggestion) {
        this.ctxcbSuggestion = ctxcbSuggestion;
    }

    public String getCtxcbLabel() {
        return ctxcbLabel;
    }

    public void setCtxcbLabel(String ctxcbLabel) {
        this.ctxcbLabel = ctxcbLabel;
    }

    public String getCloudCustomData() {
        return cloudCustomData;
    }

    public void setCloudCustomData(String cloudCustomData) {
        this.cloudCustomData = cloudCustomData;
    }
}
