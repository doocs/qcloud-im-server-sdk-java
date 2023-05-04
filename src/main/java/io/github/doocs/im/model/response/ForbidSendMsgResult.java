package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 批量禁言和取消禁言-结果
 *
 * @author bingo
 * @since 2021/8/4 11:19
 */
public class ForbidSendMsgResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -4667911681438840968L;

    @Override
    public String toString() {
        return "ForbidSendMsgResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
