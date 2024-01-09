package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 销毁公众号-结果
 *
 * @author hyh
 * @since 2024/1/9 22:09
 */
public class DestroyOfficialAccountResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -1365673241688886735L;

    @Override
    public String toString() {
        return "DestroyOfficialAccountResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
