package com.spd.storage.dal.domain;

import java.util.Date;

public class SpdPickDO {
    private String id;

    private String name;

    private String req_dept_id;

    private String req_dept_name;

    private String out_dept_id;

    private String out_dept_name;

    private String out_username;

    private String req_username;

    private String approval_username;

    private Double total_price;

    private Date create_time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReq_dept_id() {
        return req_dept_id;
    }

    public void setReq_dept_id(String req_dept_id) {
        this.req_dept_id = req_dept_id == null ? null : req_dept_id.trim();
    }

    public String getReq_dept_name() {
        return req_dept_name;
    }

    public void setReq_dept_name(String req_dept_name) {
        this.req_dept_name = req_dept_name == null ? null : req_dept_name.trim();
    }

    public String getOut_dept_id() {
        return out_dept_id;
    }

    public void setOut_dept_id(String out_dept_id) {
        this.out_dept_id = out_dept_id == null ? null : out_dept_id.trim();
    }

    public String getOut_dept_name() {
        return out_dept_name;
    }

    public void setOut_dept_name(String out_dept_name) {
        this.out_dept_name = out_dept_name == null ? null : out_dept_name.trim();
    }

    public String getOut_username() {
        return out_username;
    }

    public void setOut_username(String out_username) {
        this.out_username = out_username == null ? null : out_username.trim();
    }

    public String getReq_username() {
        return req_username;
    }

    public void setReq_username(String req_username) {
        this.req_username = req_username == null ? null : req_username.trim();
    }

    public String getApproval_username() {
        return approval_username;
    }

    public void setApproval_username(String approval_username) {
        this.approval_username = approval_username == null ? null : approval_username.trim();
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}