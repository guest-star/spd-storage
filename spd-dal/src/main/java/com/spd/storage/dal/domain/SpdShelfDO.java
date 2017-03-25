package com.spd.storage.dal.domain;

public class SpdShelfDO {
    private String id;

    private String name;

    private String container_id;

    private String category_id;

    private String category_name;

    private Double category_number;

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

    public String getContainer_id() {
        return container_id;
    }

    public void setContainer_id(String container_id) {
        this.container_id = container_id == null ? null : container_id.trim();
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id == null ? null : category_id.trim();
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name == null ? null : category_name.trim();
    }

    public Double getCategory_number() {
        return category_number;
    }

    public void setCategory_number(Double category_number) {
        this.category_number = category_number;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}