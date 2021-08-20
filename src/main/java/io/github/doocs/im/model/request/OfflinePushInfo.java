package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 10:52
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfflinePushInfo {
    @JsonProperty("PushFlag")
    private Integer pushFlag;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Desc")
    private String desc;

    @JsonProperty("Ext")
    private String ext;

    @JsonProperty("AndroidInfo")
    private AndroidInfo androidInfo;

    @JsonProperty("ApnsInfo")
    private ApnsInfo apnsInfo;

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
}
