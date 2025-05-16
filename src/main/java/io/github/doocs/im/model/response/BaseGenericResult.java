package io.github.doocs.im.model.response;

import java.io.Serializable;

public class BaseGenericResult extends GenericResult implements Serializable {

    private static final long serialVersionUID = -8713954419178432365L;


    @Override
    public String getActionStatus() {
        return super.getActionStatus();
    }

    @Override
    public void setActionStatus(String actionStatus) {
        super.setActionStatus(actionStatus);
    }

    @Override
    public String getErrorInfo() {
        return super.getErrorInfo();
    }

    @Override
    public void setErrorInfo(String errorInfo) {
        super.setErrorInfo(errorInfo);
    }

    @Override
    public Integer getErrorCode() {
        return super.getErrorCode();
    }

    @Override
    public void setErrorCode(Integer errorCode) {
        super.setErrorCode(errorCode);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
