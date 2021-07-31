package com.qcloud.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/30 11:20
 */
public class IMPushResult extends GenericResult {
    @JsonProperty("TaskId")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "IMPushResult{" +
                "taskId='" + taskId + '\'' +
                '}';
    }
}
