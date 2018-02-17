package com.mercy.utils;

import com.mercy.dto.Pagination;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class ResultDTOWithPagination<T> implements Serializable {

    @ApiModelProperty(
            value = "返回是否成功",
            required = true,
            position = 0
    )
    private boolean success;
    @ApiModelProperty(
            value = "返回数据",
            position = 4
    )
    private T data;
    @ApiModelProperty(
            value = "返回消息代码",
            position = 1
    )
    private String messageCode;
    @ApiModelProperty(
            value = "返回消息",
            position = 2
    )
    private String message;
    @ApiModelProperty(
            value = "分页对象",
            position = 3
    )
    private Pagination pagination;

    public ResultDTOWithPagination() {
    }

    public ResultDTOWithPagination(boolean success, T data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.pagination = new Pagination();
    }

    public ResultDTOWithPagination(boolean success, T data, String message, Pagination pagination) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.pagination = pagination;
    }

    public ResultDTOWithPagination(boolean success, T data, String messageCode, String message, Pagination pagination) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.messageCode = messageCode;
        this.pagination = pagination;
    }

    public ResultDTOWithPagination(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ResultDTOWithPagination(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
