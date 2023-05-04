package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 消息扩展结果
 *
 * @author bingo
 * @since 2022/11/2 16:32
 */
public class ExtensionMsg implements Serializable {
    private static final long serialVersionUID = 950640189214474117L;
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    @JsonProperty("Extension")
    private KeyValueSeq extension;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public KeyValueSeq getExtension() {
        return extension;
    }

    public void setExtension(KeyValueSeq extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "ExtensionMsg{" +
                "errorCode=" + errorCode +
                ", extension=" + extension +
                '}';
    }
}
