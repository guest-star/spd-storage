package com.spd.storage.dal.domain;

public class SpdDepositoryDO {
    private String id;

    private String name;

    private String dept_id;

    private String address;

    private String dept_name;

    private String manager_user_id;

    private String manager_user_name;

    private String parent_id;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name == null ? null : dept_name.trim();
    }

    public String getManager_user_id() {
        return manager_user_id;
    }

    public void setManager_user_id(String manager_user_id) {
        this.manager_user_id = manager_user_id == null ? null : manager_user_id.trim();
    }

    public String getManager_user_name() {
        return manager_user_name;
    }

    public void setManager_user_name(String manager_user_name) {
        this.manager_user_name = manager_user_name == null ? null : manager_user_name.trim();
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id == null ? null : parent_id.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}