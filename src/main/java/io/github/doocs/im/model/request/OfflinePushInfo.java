package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 离线推送
 *
 * @author bingo
 * @since 2021/7/31 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfflinePushInfo {
    /**
     * 0表示推送，1表示不离线推送。
     */
    @JsonProperty("PushFlag")
    private Integer pushFlag;

    /**
     * 离线推送标题。该字段为 iOS 和 Android 共用
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 离线推送内容。该字段会覆盖上面各种消息元素 TIMMsgElement 的离线推送展示文本。
     * 若发送的消息只有一个 TIMCustomElem 自定义消息元素，该 Desc 字段会覆盖 TIMCustomElem 中的 Desc 字段。
     * 如果两个 Desc 字段都不填，将收不到该自定义消息的离线推送。
     */
    @JsonProperty("Desc")
    private String desc;

    /**
     * 离线推送透传内容。由于国内各 Android 手机厂商的推送平台要求各不一样，
     * 请保证此字段为 JSON 格式，否则可能会导致收不到某些厂商的离线推送。
     */
    @JsonProperty("Ext")
    private String ext;

    /**
     * Android离线推送信息
     */
    @JsonProperty("AndroidInfo")
    private AndroidInfo androidInfo;

    /**
     * Apple Push Notification Service
     */
    @JsonProperty("ApnsInfo")
    private ApnsInfo apnsInfo;

    private OfflinePushInfo(Builder builder) {
        this.pushFlag = builder.pushFlag;
        this.title = builder.title;
        this.desc = builder.desc;
        this.ext = builder.ext;
        this.androidInfo = builder.androidInfo;
        this.apnsInfo = builder.apnsInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getPushFlag() {
        return pushFlag;
    }

    public void setPushFlag(Integer pushFlag) {
        this.pushFlag = pushFlag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public AndroidInfo getAndroidInfo() {
        return androidInfo;
    }

    public void setAndroidInfo(AndroidInfo androidInfo) {
        this.androidInfo = androidInfo;
    }

    public ApnsInfo getApnsInfo() {
        return apnsInfo;
    }

    public void setApnsInfo(ApnsInfo apnsInfo) {
        this.apnsInfo = apnsInfo;
    }


    public static final class Builder {
        private Integer pushFlag;
        private String title;
        private String desc;
        private String ext;
        private AndroidInfo androidInfo;
        private ApnsInfo apnsInfo;

        private Builder() {
        }

        public OfflinePushInfo build() {
            return new OfflinePushInfo(this);
        }

        public Builder pushFlag(Integer pushFlag) {
            this.pushFlag = pushFlag;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder ext(String ext) {
            this.ext = ext;
            return this;
        }

        public Builder androidInfo(AndroidInfo androidInfo) {
            this.androidInfo = androidInfo;
            return this;
        }

        public Builder apnsInfo(ApnsInfo apnsInfo) {
            this.apnsInfo = apnsInfo;
            return this;
        }
    }
}
