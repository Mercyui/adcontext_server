package com.mercy.excption;

import java.util.Map;

/**
 * 自定义异常
 */
public class MyOwnerException extends RuntimeException {

    private String code;
    private String message;
    private Map<String, Object> extMessage;

    public MyOwnerException(String message) {
        this.message = message;
    }

    public MyOwnerException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public MyOwnerException(String code, String message, Map<String, Object> map) {
        this.code = code;
        this.message = message;
        this.extMessage = map;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtMessage() {
        return extMessage;
    }

    public void setExtMessage(Map<String, Object> extMessage) {
        this.extMessage = extMessage;
    }
}
