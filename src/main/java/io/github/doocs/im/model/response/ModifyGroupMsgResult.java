package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 修改群聊历史消息-结果
 *
 * @author bingo
 * @since 2022/7/20 11:43
 */
public class ModifyGroupMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -942817793511393977L;

    @Override
    public String toString() {
        return "ModifyGroupMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
