package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 删除群计数器-结果
 *
 * @author bingo
 * @since 2023/2/6 11:33
 */
public class DeleteGroupCounterResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8754170604734209183L;

    @Override
    public String toString() {
        return "DeleteGroupCounterResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                "} " + super.toString();
    }
}
