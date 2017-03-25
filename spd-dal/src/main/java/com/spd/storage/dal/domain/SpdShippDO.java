package com.spd.storage.dal.domain;

import java.util.Date;

public class SpdShippDO {
    private String id;

    private String name;

    private Date create_time;

    private String receiver;

    private String receiver_address;

    private String sender;

    private String receiver_phone;

    private String use_dept_name;

    private String sender_phone;

    private Date billing_date;

    private String total_capital;

    private Double total_lowercase;

    private String receiver_accept_user;

    private Date send_date;

    private String receipt_user;

    private Date accept_date;

    private String remarks;

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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address == null ? null : receiver_address.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone == null ? null : receiver_phone.trim();
    }

    public String getUse_dept_name() {
        return use_dept_name;
    }

    public void setUse_dept_name(String use_dept_name) {
        this.use_dept_name = use_dept_name == null ? null : use_dept_name.trim();
    }

    public String getSender_phone() {
        return sender_phone;
    }

    public void setSender_phone(String sender_phone) {
        this.sender_phone = sender_phone == null ? null : sender_phone.trim();
    }

    public Date getBilling_date() {
        return billing_date;
    }

    public void setBilling_date(Date billing_date) {
        this.billing_date = billing_date;
    }

    public String getTotal_capital() {
        return total_capital;
    }

    public void setTotal_capital(String total_capital) {
        this.total_capital = total_capital == null ? null : total_capital.trim();
    }

    public Double getTotal_lowercase() {
        return total_lowercase;
    }

    public void setTotal_lowercase(Double total_lowercase) {
        this.total_lowercase = total_lowercase;
    }

    public String getReceiver_accept_user() {
        return receiver_accept_user;
    }

    public void setReceiver_accept_user(String receiver_accept_user) {
        this.receiver_accept_user = receiver_accept_user == null ? null : receiver_accept_user.trim();
    }

    public Date getSend_date() {
        return send_date;
    }

    public void setSend_date(Date send_date) {
        this.send_date = send_date;
    }

    public String getReceipt_user() {
        return receipt_user;
    }

    public void setReceipt_user(String receipt_user) {
        this.receipt_user = receipt_user == null ? null : receipt_user.trim();
    }

    public Date getAccept_date() {
        return accept_date;
    }

    public void setAccept_date(Date accept_date) {
        this.accept_date = accept_date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}