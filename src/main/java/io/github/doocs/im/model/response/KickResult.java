package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 失效帐号登录状态-结果
 *
 * @author bingo
 * @since 2021/7/28 11:07
 */
public class KickResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6210537375172063713L;

    @Override
    public String toString() {
        return "KickResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
