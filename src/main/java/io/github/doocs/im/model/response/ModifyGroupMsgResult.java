package io.github.doocs.im.model.response;

/**
 * 修改群聊历史消息-结果
 *
 * @author bingo
 * @since 2022/7/20 11:43
 */
public class ModifyGroupMsgResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyGroupMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
