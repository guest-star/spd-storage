package com.spd.storage.dal.domain;

import java.util.Date;

public class SpdPurchaseOrderDO {
    private String id;

    private String name;

    private String dept_id;

    private String dep_name;

    private Date create_time;

    private String category_id;

    private Double plan_number;

    private Double refer_unit_price;

    private Double approval_number;

    private Double already_buy_number;

    private Date plan_date;

    private String bak;

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

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id == null ? null : dept_id.trim();
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name == null ? null : dep_name.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id == null ? null : category_id.trim();
    }

    public Double getPlan_number() {
        return plan_number;
    }

    public void setPlan_number(Double plan_number) {
        this.plan_number = plan_number;
    }

    public Double getRefer_unit_price() {
        return refer_unit_price;
    }

    public void setRefer_unit_price(Double refer_unit_price) {
        this.refer_unit_price = refer_unit_price;
    }

    public Double getApproval_number() {
        return approval_number;
    }

    public void setApproval_number(Double approval_number) {
        this.approval_number = approval_number;
    }

    public Double getAlready_buy_number() {
        return already_buy_number;
    }

    public void setAlready_buy_number(Double already_buy_number) {
        this.already_buy_number = already_buy_number;
    }

    public Date getPlan_date() {
        return plan_date;
    }

    public void setPlan_date(Date plan_date) {
        this.plan_date = plan_date;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}