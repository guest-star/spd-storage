package com.spd.storage.dal.domain;

public class SpdCarsDO {
    private String id;

    private String name;

    private String shipp_id;

    private String drivers;

    private String tel;

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

    public String getShipp_id() {
        return shipp_id;
    }

    public void setShipp_id(String shipp_id) {
        this.shipp_id = shipp_id == null ? null : shipp_id.trim();
    }

    public String getDrivers() {
        return drivers;
    }

    public void setDrivers(String drivers) {
        this.drivers = drivers == null ? null : drivers.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}