package com.mercy.enums;

import org.apache.commons.lang3.StringUtils;

public enum QueueUserInfoStatusEnum {
    STATUS_NORMAL("10", "正常状态"),
    STATUS_UNABLE("20", "禁用状态"),
    STATUS_MODIFY("30", "修改状态"),
    STATUS_DEL("40", "逻辑删除状态");

    private String code;
    private String text;

    QueueUserInfoStatusEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private QueueUserInfoStatusEnum getByCode(String code) {
        QueueUserInfoStatusEnum[] values = QueueUserInfoStatusEnum.values();
        for (QueueUserInfoStatusEnum temp : values) {
            if (StringUtils.isNotBlank(code) && code.equals(temp.getCode())) {
                return temp;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "QueueUserInfoStatusEnum{" +
                "code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
