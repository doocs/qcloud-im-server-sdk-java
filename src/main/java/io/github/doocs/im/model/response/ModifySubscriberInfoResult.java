package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改订阅者资料-结果
 *
 * @author hyh
 * @since 2024/01/10 15:50
 */
public class ModifySubscriberInfoResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1289325582381743675L;

    @Override
    public String toString() {
        return "ModifySubscriberInfoResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
