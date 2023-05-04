package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改单聊历史消息-结果
 *
 * @author bingo
 * @since 2022/5/31 17:46
 */
public class ModifyC2cMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6610288874615223346L;

    @Override
    public String toString() {
        return "ModifyC2cMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
