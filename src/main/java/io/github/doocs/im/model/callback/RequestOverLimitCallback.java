package io.github.doocs.im.model.callback;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 接口超频告警回调
 *
 * @author bingo
 * @since 2024/7/4 10:15
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestOverLimitCallback implements Serializable {
    private static final long serialVersionUID = 2040242672319703567L;

    /**
     * 回调命令
     */
    @JsonProperty("CallbackCommand")
    private String callbackCommand;

    /**
     * 接口内部服务名，不同的 ServiceName 对应不同的服务类型
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * 接口命令字，与 ServiceName 组合用来标识具体的业务功能
     */
    @JsonProperty("Command")
    private String command;

    /**
     * 接口请求 QPS 频率
     */
    @JsonProperty("Request")
    private Integer request;

    /**
     * 接口请求 QPS 阈值
     */
    @JsonProperty("Limit")
    private Integer limit;

    public String getCallbackCommand() {
        return callbackCommand;
    }

    public void setCallbackCommand(String callbackCommand) {
        this.callbackCommand = callbackCommand;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Integer getRequest() {
        return request;
    }

    public void setRequest(Integer request) {
        this.request = request;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
