package io.github.doocs.im.model.response;

/**
 * 设置单聊消息已读-结果
 *
 * @author hyh
 * @since 2021/07/28 20:32
 */
public class AdminSetMsgReadResult extends GenericResult {
    @Override
    public String toString() {
        return "AdminSetMsgReadResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
