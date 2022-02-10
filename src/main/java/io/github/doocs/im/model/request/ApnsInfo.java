package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Apple Push Notification Service
 *
 * @author bingo
 * @since 2021/7/31 11:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApnsInfo {
    @JsonProperty("Sound")
    private String sound;

    /**
     * 这个字段缺省或者为0表示需要计数，为1表示本条消息不需要计数，即右上角图标数字不增加。
     */
    @JsonProperty("BadgeMode")
    private Integer badgeMode;

    /**
     * 该字段用于标识 APNs 推送的标题，若填写则会覆盖最上层 Title。
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 该字段用于标识 APNs 推送的子标题。
     */
    @JsonProperty("SubTitle")
    private String subTitle;

    /**
     * 该字段用于标识 APNs 携带的图片地址，当客户端拿到该字段时，可以通过下载图片资源的方式将图片展示在弹窗上。
     */
    @JsonProperty("Image")
    private String image;

    /**
     * 为1表示开启 iOS 10 的推送扩展，默认为0。
     */
    @JsonProperty("MutableContent")
    private Integer mutableContent;

    public ApnsInfo() {
    }

    public ApnsInfo(String sound, Integer badgeMode, String title, String subTitle, String image, Integer mutableContent) {
        this.sound = sound;
        this.badgeMode = badgeMode;
        this.title = title;
        this.subTitle = subTitle;
        this.image = image;
        this.mutableContent = mutableContent;
    }

    private ApnsInfo(Builder builder) {
        this.sound = builder.sound;
        this.badgeMode = builder.badgeMode;
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.image = builder.image;
        this.mutableContent = builder.mutableContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Integer getBadgeMode() {
        return badgeMode;
    }

    public void setBadgeMode(Integer badgeMode) {
        this.badgeMode = badgeMode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMutableContent() {
        return mutableContent;
    }

    public void setMutableContent(Integer mutableContent) {
        this.mutableContent = mutableContent;
    }


    public static final class Builder {
        private String sound;
        private Integer badgeMode;
        private String title;
        private String subTitle;
        private String image;
        private Integer mutableContent;

        private Builder() {
        }

        public ApnsInfo build() {
            return new ApnsInfo(this);
        }

        public Builder sound(String sound) {
            this.sound = sound;
            return this;
        }

        public Builder badgeMode(Integer badgeMode) {
            this.badgeMode = badgeMode;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder subTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder mutableContent(Integer mutableContent) {
            this.mutableContent = mutableContent;
            return this;
        }
    }
}
