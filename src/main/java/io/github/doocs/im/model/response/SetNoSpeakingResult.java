package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 设置全局禁言-结果
 *
 * @author xy
 * @since 2021/07/31 11:51:01
 */
public class SetNoSpeakingResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -6943297199653572488L;

    @Override
    public String toString() {
        return "SetNoSpeakingResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
