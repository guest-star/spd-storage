package com.spd.storage.dal.domain;

import java.util.Date;

public class SpdCategoryDO {
    private String id;

    private String name;

    private String standard;

    private String package_stdd;

    private String batch_code;

    private Date valid_date;

    private String produce_factory;

    private String reg_code;

    private Double refer_unit_price;

    private String unit;

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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getPackage_stdd() {
        return package_stdd;
    }

    public void setPackage_stdd(String package_stdd) {
        this.package_stdd = package_stdd == null ? null : package_stdd.trim();
    }

    public String getBatch_code() {
        return batch_code;
    }

    public void setBatch_code(String batch_code) {
        this.batch_code = batch_code == null ? null : batch_code.trim();
    }

    public Date getValid_date() {
        return valid_date;
    }

    public void setValid_date(Date valid_date) {
        this.valid_date = valid_date;
    }

    public String getProduce_factory() {
        return produce_factory;
    }

    public void setProduce_factory(String produce_factory) {
        this.produce_factory = produce_factory == null ? null : produce_factory.trim();
    }

    public String getReg_code() {
        return reg_code;
    }

    public void setReg_code(String reg_code) {
        this.reg_code = reg_code == null ? null : reg_code.trim();
    }

    public Double getRefer_unit_price() {
        return refer_unit_price;
    }

    public void setRefer_unit_price(Double refer_unit_price) {
        this.refer_unit_price = refer_unit_price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }
}