package io.github.doocs.im.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bingo
 * @since 2021/7/31 10:55
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AndroidInfo {
    @JsonProperty("Sound")
    private String sound;

    @JsonProperty("HuaWeiChannelID")
    private String huaweiChannelId;

    @JsonProperty("XiaoMiChannelID")
    private String xiaomiChannelId;

    @JsonProperty("OPPOChannelID")
    private String oppoChannelId;

    @JsonProperty("OPPOChannelID")
    private String googleChannelId;

    @JsonProperty("VIVOClassification")
    private Integer vivoClassification;

    @JsonProperty("HuaWeiImportance")
    private String huaweiImportance;

    @JsonProperty("ExtAsHuaweiIntentParam")
    private Integer extAsHuaweiIntentParam;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getHuaweiChannelId() {
        return huaweiChannelId;
    }

    public void setHuaweiChannelId(String huaweiChannelId) {
        this.huaweiChannelId = huaweiChannelId;
    }

    public String getXiaomiChannelId() {
        return xiaomiChannelId;
    }

    public void setXiaomiChannelId(String xiaomiChannelId) {
        this.xiaomiChannelId = xiaomiChannelId;
    }

    public String getOppoChannelId() {
        return oppoChannelId;
    }

    public void setOppoChannelId(String oppoChannelId) {
        this.oppoChannelId = oppoChannelId;
    }

    public String getGoogleChannelId() {
        return googleChannelId;
    }

    public void setGoogleChannelId(String googleChannelId) {
        this.googleChannelId = googleChannelId;
    }

    public Integer getVivoClassification() {
        return vivoClassification;
    }

    public void setVivoClassification(Integer vivoClassification) {
        this.vivoClassification = vivoClassification;
    }

    public String getHuaweiImportance() {
        return huaweiImportance;
    }

    public void setHuaweiImportance(String huaweiImportance) {
        this.huaweiImportance = huaweiImportance;
    }

    public Integer getExtAsHuaweiIntentParam() {
        return extAsHuaweiIntentParam;
    }

    public void setExtAsHuaweiIntentParam(Integer extAsHuaweiIntentParam) {
        this.extAsHuaweiIntentParam = extAsHuaweiIntentParam;
    }
}
