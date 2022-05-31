package io.github.doocs.im.model.response;

/**
 * 修改单聊历史消息-结果
 *
 * @author bingo
 * @since 2022/5/31 17:46
 */
public class ModifyC2cMsgResult extends GenericResult {
    @Override
    public String toString() {
        return "ModifyC2cMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
