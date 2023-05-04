package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 转让群主-结果
 *
 * @author bingo
 * @since 2021/8/4 11:36
 */
public class ChangeGroupOwnerResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = 1334337413493042072L;

    @Override
    public String toString() {
        return "ChangeGroupOwnerResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
