package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/29 15:09
 */
public class PortraitSetResult extends GenericResult{
    @JsonProperty("ErrorDisplay")
    private String errorDisplay;

    public String getErrorDisplay() {
        return errorDisplay;
    }

    public void setErrorDisplay(String errorDisplay) {
        this.errorDisplay = errorDisplay;
    }

    @Override
    public String toString() {
        return "PortraitSetResult{" +
                "errorDisplay='" + errorDisplay + '\'' +
                '}';
    }
}
