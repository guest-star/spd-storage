package com.spd.storage.common.dto;

import java.io.Serializable;

/**
 * Created by luoyongchang on 2016/12/30.
 */
public class BasePageRequestDTO implements Serializable {

    private static final long serialVersionUID = -830962619811616753L;

    private int pageNo;//当前页面

    private int pageSize;//每页记录数

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
