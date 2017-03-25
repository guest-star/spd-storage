package com.spd.storage.dal.domain;

public class SpdContainerDO {
    private String id;

    private String name;

    private String depository_id;

    private String address;

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

    public String getDepository_id() {
        return depository_id;
    }

    public void setDepository_id(String depository_id) {
        this.depository_id = depository_id == null ? null : depository_id.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}