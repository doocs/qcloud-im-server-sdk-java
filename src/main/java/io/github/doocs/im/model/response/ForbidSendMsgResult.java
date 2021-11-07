package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/8/4 11:19
 */
public class ForbidSendMsgResult extends GenericResult {
    @Override
    public String toString() {
        return "ForbidSendMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
