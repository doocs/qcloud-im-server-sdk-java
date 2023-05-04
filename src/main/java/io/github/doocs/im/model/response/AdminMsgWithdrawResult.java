package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 撤回单聊消息-结果
 *
 * @author hyh
 * @since 2021/07/28 20:32
 */
public class AdminMsgWithdrawResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -8331190767882911216L;

    @Override
    public String toString() {
        return "AdminMsgWithdrawResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
