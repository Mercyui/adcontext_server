package com.mercy.dto;

import java.io.Serializable;

public class QueueListDTO<T> extends Pagination implements Serializable {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
