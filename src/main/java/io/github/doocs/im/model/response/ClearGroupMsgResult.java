package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 单向删除单聊历史消息-结果
 *
 * @author bingo
 * @since 2024/1/10 10:25
 */
public class ClearGroupMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -3579769724643194012L;

    @Override
    public String toString() {
        return "ClearGroupMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
