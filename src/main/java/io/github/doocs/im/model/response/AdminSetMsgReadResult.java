package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 设置单聊消息已读-结果
 *
 * @author hyh
 * @since 2021/07/28 20:32
 */
public class AdminSetMsgReadResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -418920513736327493L;

    @Override
    public String toString() {
        return "AdminSetMsgReadResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
