package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 获取直播群管理员列表-结果
 *
 * @author bingo
 * @since 2024/1/9 11:36
 */
public class GetAdminListResult  extends GenericResult implements Serializable {
    private static final long serialVersionUID = 8209999755430615708L;

    /**
     * 该群组的直播群管理员列表
     */
    @JsonProperty("Admin_List")
    private List<AdminResultItem> adminList;

    public List<AdminResultItem> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<AdminResultItem> adminList) {
        this.adminList = adminList;
    }

    @Override
    public String toString() {
        return "GetAdminListResult{" +
                "adminList=" + adminList +
                ", actionStatus='" + actionStatus + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
