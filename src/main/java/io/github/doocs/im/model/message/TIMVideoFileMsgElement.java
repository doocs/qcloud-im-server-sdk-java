package io.github.doocs.im.model.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.doocs.im.constant.MsgType;

/**
 * 视频消息元素
 *
 * @author bingo
 * @since 2021/10/29 16:56
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TIMVideoFileMsgElement extends TIMMsgElement {
    /**
     * MsgContent 为 TIM 消息对象
     */
    @JsonProperty("MsgContent")
    private VideoFileMsgContent msgContent;

    public TIMVideoFileMsgElement() {
        this(null);
    }

    public TIMVideoFileMsgElement(VideoFileMsgContent msgContent) {
        super(MsgType.TIM_VIDEO_FILE_ELEM);
        this.msgContent = msgContent;
    }

    public TIMVideoFileMsgElement(String videoUrl, String videoUuid, Integer videoSize, Integer videoSecond, String videoFormat, Integer videoDownloadFlag, String thumbUrl, String thumbUuid, Integer thumbSize, Integer thumbWidth, Integer thumbHeight, String thumbFormat, Integer thumbDownloadFlag) {
        this(new VideoFileMsgContent(videoUrl, videoUuid, videoSize, videoSecond, videoFormat, videoDownloadFlag, thumbUrl, thumbUuid, thumbSize, thumbWidth, thumbHeight, thumbFormat, thumbDownloadFlag));
    }

    public VideoFileMsgContent getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(VideoFileMsgContent msgContent) {
        this.msgContent = msgContent;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class VideoFileMsgContent {
        @JsonProperty("VideoUrl")
        private String videoUrl;

        @JsonProperty("VideoUUID")
        private String videoUuid;

        @JsonProperty("VideoSize")
        private Integer videoSize;

        @JsonProperty("VideoSecond")
        private Integer videoSecond;

        @JsonProperty("VideoFormat")
        private String videoFormat;

        @JsonProperty("VideoDownloadFlag")
        private Integer videoDownloadFlag;

        @JsonProperty("ThumbUrl")
        private String thumbUrl;

        @JsonProperty("ThumbUUID")
        private String thumbUuid;

        @JsonProperty("ThumbSize")
        private Integer thumbSize;

        @JsonProperty("ThumbWidth")
        private Integer thumbWidth;

        @JsonProperty("ThumbHeight")
        private Integer thumbHeight;

        @JsonProperty("ThumbFormat")
        private String thumbFormat;

        @JsonProperty("ThumbDownloadFlag")
        private Integer thumbDownloadFlag;

        public VideoFileMsgContent() {
        }

        public VideoFileMsgContent(String videoUrl, String videoUuid, Integer videoSize, Integer videoSecond, String videoFormat, Integer videoDownloadFlag, String thumbUrl, String thumbUuid, Integer thumbSize, Integer thumbWidth, Integer thumbHeight, String thumbFormat, Integer thumbDownloadFlag) {
            this.videoUrl = videoUrl;
            this.videoUuid = videoUuid;
            this.videoSize = videoSize;
            this.videoSecond = videoSecond;
            this.videoFormat = videoFormat;
            this.videoDownloadFlag = videoDownloadFlag;
            this.thumbUrl = thumbUrl;
            this.thumbUuid = thumbUuid;
            this.thumbSize = thumbSize;
            this.thumbWidth = thumbWidth;
            this.thumbHeight = thumbHeight;
            this.thumbFormat = thumbFormat;
            this.thumbDownloadFlag = thumbDownloadFlag;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getVideoUuid() {
            return videoUuid;
        }

        public void setVideoUuid(String videoUuid) {
            this.videoUuid = videoUuid;
        }

        public Integer getVideoSize() {
            return videoSize;
        }

        public void setVideoSize(Integer videoSize) {
            this.videoSize = videoSize;
        }

        public Integer getVideoSecond() {
            return videoSecond;
        }

        public void setVideoSecond(Integer videoSecond) {
            this.videoSecond = videoSecond;
        }

        public String getVideoFormat() {
            return videoFormat;
        }

        public void setVideoFormat(String videoFormat) {
            this.videoFormat = videoFormat;
        }

        public Integer getVideoDownloadFlag() {
            return videoDownloadFlag;
        }

        public void setVideoDownloadFlag(Integer videoDownloadFlag) {
            this.videoDownloadFlag = videoDownloadFlag;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public String getThumbUuid() {
            return thumbUuid;
        }

        public void setThumbUuid(String thumbUuid) {
            this.thumbUuid = thumbUuid;
        }

        public Integer getThumbSize() {
            return thumbSize;
        }

        public void setThumbSize(Integer thumbSize) {
            this.thumbSize = thumbSize;
        }

        public Integer getThumbWidth() {
            return thumbWidth;
        }

        public void setThumbWidth(Integer thumbWidth) {
            this.thumbWidth = thumbWidth;
        }

        public Integer getThumbHeight() {
            return thumbHeight;
        }

        public void setThumbHeight(Integer thumbHeight) {
            this.thumbHeight = thumbHeight;
        }

        public String getThumbFormat() {
            return thumbFormat;
        }

        public void setThumbFormat(String thumbFormat) {
            this.thumbFormat = thumbFormat;
        }

        public Integer getThumbDownloadFlag() {
            return thumbDownloadFlag;
        }

        public void setThumbDownloadFlag(Integer thumbDownloadFlag) {
            this.thumbDownloadFlag = thumbDownloadFlag;
        }
    }
}
