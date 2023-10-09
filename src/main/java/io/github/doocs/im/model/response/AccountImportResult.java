package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 导入单个账号-结果
 *
 * @author bingo
 * @since 2021/7/28 11:02
 */
public class AccountImportResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -2658290061667302138L;

    @Override
    public String toString() {
        return "AccountImportResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
