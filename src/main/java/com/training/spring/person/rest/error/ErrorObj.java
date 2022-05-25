package com.training.spring.person.rest.error;

import java.util.List;

public class ErrorObj {
    private List<ErrorObj> subErrors;
    private String desc;
    private int errorCode;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<ErrorObj> getSubErrors() {
        return subErrors;
    }

    public void setSubErrors(List<ErrorObj> subErrors) {
        this.subErrors = subErrors;
    }
}
