package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 11:03
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApnsInfo {
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
}
