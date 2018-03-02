package com.mercy.dto.queue;

import com.mercy.dto.Pagination;

import java.io.Serializable;

public class QueueOrderListDTO<T> extends Pagination implements Serializable {
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
