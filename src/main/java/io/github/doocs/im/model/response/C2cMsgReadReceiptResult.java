package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * @author bingo
 * @since 2025/3/7 15:24
 */
public class C2cMsgReadReceiptResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 5080198848517921206L;

    @Override
    public String toString() {
        return "C2cMsgReadReceiptResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
