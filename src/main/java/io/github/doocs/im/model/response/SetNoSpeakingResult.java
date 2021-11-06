package io.github.doocs.im.model.response;

/**
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class SetNoSpeakingResult extends GenericResult {
    @Override
    public String toString() {
        return "SetNoSpeakingResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
