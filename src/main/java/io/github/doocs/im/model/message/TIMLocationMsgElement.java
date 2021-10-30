package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

/**
 * 地理位置消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:35
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMLocationMsgElement extends TIMMsgElement {
    @JsonProperty("MsgContent")
    private LocationMsgContent msgContent;

    public TIMLocationMsgElement() {
        super(MsgType.TIM_LOCATION_ELEM);
    }

    public TIMLocationMsgElement(LocationMsgContent msgContent) {
        this();
        this.msgContent = msgContent;
    }

    public TIMLocationMsgElement(String desc, Double latitude, Double longitude) {
        this(new LocationMsgContent(desc, latitude, longitude));
    }

    public LocationMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(LocationMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LocationMsgContent {
        @JsonProperty("Desc")
        private String desc;

        @JsonProperty("Latitude")
        private Double latitude;

        @JsonProperty("Longitude")
        private Double longitude;

        public LocationMsgContent() {
        }

        public LocationMsgContent(String desc, Double latitude, Double longitude) {
            this.desc = desc;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
    }
}
