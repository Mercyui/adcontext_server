package com.mercy.dto;

import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Pagination implements Serializable {
    @ApiModelProperty(
            value = "页码，默认是第一页",
            position = 0
    )
    private int pageNo = 1;
    @ApiModelProperty(
            value = "每页显示的记录数，默认是10",
            position = 1
    )
    private int pageSize = 10;
    @ApiModelProperty(
            value = "总记录数",
            position = 2
    )
    private int totalRecord = 0;
    @ApiModelProperty(
            value = "总页数",
            position = 3
    )
    private int totalPage = 1;
    @ApiModelProperty(
            value = "排序",
            position = 4
    )
    private String order = "";

    public  Pagination() {
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return this.totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        this.totalPage = this.totalRecord % this.pageSize == 0 ? this.totalRecord / this.pageSize : this.totalRecord / this.pageSize + 1;
        this.setTotalPage(this.totalPage);
        return this.totalPage;
    }

    private void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getStartIndex() {
        return (this.pageNo - 1) * this.pageSize;
    }

}
