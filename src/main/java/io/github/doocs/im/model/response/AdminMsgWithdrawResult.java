package io.github.doocs.im.model.response;

/**
 * 撤回单聊消息-结果
 *
 * @author hyh
 * @since 2021/07/28 20:32
 */
public class AdminMsgWithdrawResult extends GenericResult {
    @Override
    public String toString() {
        return "AdminMsgWithdrawResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
