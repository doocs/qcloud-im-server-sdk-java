package io.github.doocs.im.model.response;

/**
 * @author bingo
 * @since 2021/7/28 11:07
 */
public class KickResult extends GenericResult {
    @Override
    public String toString() {
        return "KickResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
