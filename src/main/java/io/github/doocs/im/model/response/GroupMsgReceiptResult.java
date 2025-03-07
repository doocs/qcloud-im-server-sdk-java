package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 群消息已读回执-结果
 *
 * @author bingo
 * @since 2024/3/7 11:39
 */
public class GroupMsgReceiptResult  extends GenericResult implements Serializable {
    private static final long serialVersionUID = -7609800040502400162L;

    @Override
    public String toString() {
        return "GroupMsgReceiptResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
