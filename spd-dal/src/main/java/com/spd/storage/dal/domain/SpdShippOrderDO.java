package com.spd.storage.dal.domain;

import java.util.Date;

public class SpdShippOrderDO {
    private String id;

    private String name;

    private Date create_time;

    private String category_id;

    private String category_name;

    private Double category_number;

    private String category_unit;

    private Double category_unit_price;

    private String produce_factory;

    private String batch;

    private String batch_number;

    private Date valid_date;

    private String product_registr_card;

    private String production_license;

    private String bak;

    private String shipp_id;

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

    public String getCategory_unit() {
        return category_unit;
    }

    public void setCategory_unit(String category_unit) {
        this.category_unit = category_unit == null ? null : category_unit.trim();
    }

    public Double getCategory_unit_price() {
        return category_unit_price;
    }

    public void setCategory_unit_price(Double category_unit_price) {
        this.category_unit_price = category_unit_price;
    }

    public String getProduce_factory() {
        return produce_factory;
    }

    public void setProduce_factory(String produce_factory) {
        this.produce_factory = produce_factory == null ? null : produce_factory.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getBatch_number() {
        return batch_number;
    }

    public void setBatch_number(String batch_number) {
        this.batch_number = batch_number == null ? null : batch_number.trim();
    }

    public Date getValid_date() {
        return valid_date;
    }

    public void setValid_date(Date valid_date) {
        this.valid_date = valid_date;
    }

    public String getProduct_registr_card() {
        return product_registr_card;
    }

    public void setProduct_registr_card(String product_registr_card) {
        this.product_registr_card = product_registr_card == null ? null : product_registr_card.trim();
    }

    public String getProduction_license() {
        return production_license;
    }

    public void setProduction_license(String production_license) {
        this.production_license = production_license == null ? null : production_license.trim();
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak == null ? null : bak.trim();
    }

    public String getShipp_id() {
        return shipp_id;
    }

    public void setShipp_id(String shipp_id) {
        this.shipp_id = shipp_id == null ? null : shipp_id.trim();
    }
}