package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 11:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApnsInfo {
    @JsonProperty("Sound")
    private String sound;

    @JsonProperty("BadgeMode")
    private String badgeMode;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("SubTitle")
    private String subTitle;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("MutableContent")
    private Integer mutableContent;

    public ApnsInfo() {
    }

    public ApnsInfo(String sound, String badgeMode, String title, String subTitle,
                    String image, Integer mutableContent) {
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

    public String getBadgeMode() {
        return badgeMode;
    }

    public void setBadgeMode(String badgeMode) {
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
        private String badgeMode;
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

        public Builder badgeMode(String badgeMode) {
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
