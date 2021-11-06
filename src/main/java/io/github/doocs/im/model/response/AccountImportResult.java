package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/7/28 11:02
 */
public class AccountImportResult extends GenericResult {
    @Override
    public String toString() {
        return "AccountImportResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
