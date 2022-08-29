package io.github.doocs.im.model.response;

/**
 * 群成员封禁-结果
 *
 * @author bingo
 * @since 2022/8/29 14:07
 */
public class BanGroupMemberResult extends GenericResult {
    @Override
    public String toString() {
        return "BanGroupMemberResult{" +
                "actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
