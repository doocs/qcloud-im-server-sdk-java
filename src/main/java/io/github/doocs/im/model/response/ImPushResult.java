package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 全员推送-结果
 *
 * @author hyh
 * @since 2021/07/30 11:20
 */
public class ImPushResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7893902119783863262L;
    /**
     * 推送任务 ID
     */
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
        return "ImPushResult{" +
                "taskId='" + taskId + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
