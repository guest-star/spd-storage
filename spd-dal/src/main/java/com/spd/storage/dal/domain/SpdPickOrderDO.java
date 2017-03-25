package com.spd.storage.dal.domain;

public class SpdPickOrderDO {
    private String id;

    private String pick_id;

    private String category_id;

    private String category_number;

    private String bak;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPick_id() {
        return pick_id;
    }

    public void setPick_id(String pick_id) {
        this.pick_id = pick_id == null ? null : pick_id.trim();
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id == null ? null : category_id.trim();
    }

    public String getCategory_number() {
        return category_number;
    }

    public void setCategory_number(String category_number) {
        this.category_number = category_number == null ? null : category_number.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}