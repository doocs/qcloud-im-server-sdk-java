package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

import java.io.Serializable;
import java.util.List;

/**
 * 图像消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:48
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMImageMsgElement extends TIMMsgElement implements Serializable {
    private static final long serialVersionUID = -7102796968963047885L;

    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private ImageMsgContent msgContent;

    public TIMImageMsgElement() {
        this(null);
    }

    public TIMImageMsgElement(ImageMsgContent msgContent) {
        super(MsgType.TIM_IMAGE_ELEM);
        this.msgContent = msgContent;
    }

    public TIMImageMsgElement(String uuid, Integer imageFormat, List<ImageInfo> imageInfoArray) {
        this(new ImageMsgContent(uuid, imageFormat, imageInfoArray));
    }

    public ImageMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(ImageMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ImageMsgContent {
        @JsonProperty("UUID")
        private String uuid;

        @JsonProperty("ImageFormat")
        private Integer imageFormat;

        @JsonProperty("ImageInfoArray")
        private List<ImageInfo> imageInfoArray;

        public ImageMsgContent() {
        }

        public ImageMsgContent(String uuid, Integer imageFormat, List<ImageInfo> imageInfoArray) {
            this.uuid = uuid;
            this.imageFormat = imageFormat;
            this.imageInfoArray = imageInfoArray;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public Integer getImageFormat() {
            return imageFormat;
        }

        public void setImageFormat(Integer imageFormat) {
            this.imageFormat = imageFormat;
        }

        public List<ImageInfo> getImageInfoArray() {
            return imageInfoArray;
        }

        public void setImageInfoArray(List<ImageInfo> imageInfoArray) {
            this.imageInfoArray = imageInfoArray;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ImageInfo {
        @JsonProperty("Type")
        private Integer type;

        @JsonProperty("Size")
        private Integer size;

        @JsonProperty("Width")
        private Integer width;

        @JsonProperty("Height")
        private Integer height;

        @JsonProperty("URL")
        private String url;

        public ImageInfo() {
        }

        public ImageInfo(Integer type, Integer size, Integer width, Integer height, String url) {
            this.type = type;
            this.size = size;
            this.width = width;
            this.height = height;
            this.url = url;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
