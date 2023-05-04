package io.github.doocs.im.model.response;

import java.io.Serializable;

/**
 * 解散群组-结果
 *
 * @author bingo
 * @since 2021/8/4 10:43
 */
public class DestroyGroupResult extends GenericResult implements Serializable {
    private static final long serialVersionUID = -338196546963571076L;

    @Override
    public String toString() {
        return "DestroyGroupResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
