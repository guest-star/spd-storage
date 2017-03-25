package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpdCategoryDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdCategoryDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andPackage_stddIsNull() {
            addCriterion("package_stdd is null");
            return (Criteria) this;
        }

        public Criteria andPackage_stddIsNotNull() {
            addCriterion("package_stdd is not null");
            return (Criteria) this;
        }

        public Criteria andPackage_stddEqualTo(String value) {
            addCriterion("package_stdd =", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddNotEqualTo(String value) {
            addCriterion("package_stdd <>", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddGreaterThan(String value) {
            addCriterion("package_stdd >", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddGreaterThanOrEqualTo(String value) {
            addCriterion("package_stdd >=", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddLessThan(String value) {
            addCriterion("package_stdd <", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddLessThanOrEqualTo(String value) {
            addCriterion("package_stdd <=", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddLike(String value) {
            addCriterion("package_stdd like", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddNotLike(String value) {
            addCriterion("package_stdd not like", value, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddIn(List<String> values) {
            addCriterion("package_stdd in", values, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddNotIn(List<String> values) {
            addCriterion("package_stdd not in", values, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddBetween(String value1, String value2) {
            addCriterion("package_stdd between", value1, value2, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andPackage_stddNotBetween(String value1, String value2) {
            addCriterion("package_stdd not between", value1, value2, "package_stdd");
            return (Criteria) this;
        }

        public Criteria andBatch_codeIsNull() {
            addCriterion("batch_code is null");
            return (Criteria) this;
        }

        public Criteria andBatch_codeIsNotNull() {
            addCriterion("batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatch_codeEqualTo(String value) {
            addCriterion("batch_code =", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeNotEqualTo(String value) {
            addCriterion("batch_code <>", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeGreaterThan(String value) {
            addCriterion("batch_code >", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_code >=", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeLessThan(String value) {
            addCriterion("batch_code <", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeLessThanOrEqualTo(String value) {
            addCriterion("batch_code <=", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeLike(String value) {
            addCriterion("batch_code like", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeNotLike(String value) {
            addCriterion("batch_code not like", value, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeIn(List<String> values) {
            addCriterion("batch_code in", values, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeNotIn(List<String> values) {
            addCriterion("batch_code not in", values, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeBetween(String value1, String value2) {
            addCriterion("batch_code between", value1, value2, "batch_code");
            return (Criteria) this;
        }

        public Criteria andBatch_codeNotBetween(String value1, String value2) {
            addCriterion("batch_code not between", value1, value2, "batch_code");
            return (Criteria) this;
        }

        public Criteria andValid_dateIsNull() {
            addCriterion("valid_date is null");
            return (Criteria) this;
        }

        public Criteria andValid_dateIsNotNull() {
            addCriterion("valid_date is not null");
            return (Criteria) this;
        }

        public Criteria andValid_dateEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date =", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date <>", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("valid_date >", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date >=", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateLessThan(Date value) {
            addCriterionForJDBCDate("valid_date <", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("valid_date <=", value, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateIn(List<Date> values) {
            addCriterionForJDBCDate("valid_date in", values, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("valid_date not in", values, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valid_date between", value1, value2, "valid_date");
            return (Criteria) this;
        }

        public Criteria andValid_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("valid_date not between", value1, value2, "valid_date");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryIsNull() {
            addCriterion("produce_factory is null");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryIsNotNull() {
            addCriterion("produce_factory is not null");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryEqualTo(String value) {
            addCriterion("produce_factory =", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryNotEqualTo(String value) {
            addCriterion("produce_factory <>", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryGreaterThan(String value) {
            addCriterion("produce_factory >", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryGreaterThanOrEqualTo(String value) {
            addCriterion("produce_factory >=", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryLessThan(String value) {
            addCriterion("produce_factory <", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryLessThanOrEqualTo(String value) {
            addCriterion("produce_factory <=", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryLike(String value) {
            addCriterion("produce_factory like", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryNotLike(String value) {
            addCriterion("produce_factory not like", value, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryIn(List<String> values) {
            addCriterion("produce_factory in", values, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryNotIn(List<String> values) {
            addCriterion("produce_factory not in", values, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryBetween(String value1, String value2) {
            addCriterion("produce_factory between", value1, value2, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andProduce_factoryNotBetween(String value1, String value2) {
            addCriterion("produce_factory not between", value1, value2, "produce_factory");
            return (Criteria) this;
        }

        public Criteria andReg_codeIsNull() {
            addCriterion("reg_code is null");
            return (Criteria) this;
        }

        public Criteria andReg_codeIsNotNull() {
            addCriterion("reg_code is not null");
            return (Criteria) this;
        }

        public Criteria andReg_codeEqualTo(String value) {
            addCriterion("reg_code =", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeNotEqualTo(String value) {
            addCriterion("reg_code <>", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeGreaterThan(String value) {
            addCriterion("reg_code >", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_code >=", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeLessThan(String value) {
            addCriterion("reg_code <", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeLessThanOrEqualTo(String value) {
            addCriterion("reg_code <=", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeLike(String value) {
            addCriterion("reg_code like", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeNotLike(String value) {
            addCriterion("reg_code not like", value, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeIn(List<String> values) {
            addCriterion("reg_code in", values, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeNotIn(List<String> values) {
            addCriterion("reg_code not in", values, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeBetween(String value1, String value2) {
            addCriterion("reg_code between", value1, value2, "reg_code");
            return (Criteria) this;
        }

        public Criteria andReg_codeNotBetween(String value1, String value2) {
            addCriterion("reg_code not between", value1, value2, "reg_code");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceIsNull() {
            addCriterion("refer_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceIsNotNull() {
            addCriterion("refer_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceEqualTo(Double value) {
            addCriterion("refer_unit_price =", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceNotEqualTo(Double value) {
            addCriterion("refer_unit_price <>", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceGreaterThan(Double value) {
            addCriterion("refer_unit_price >", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("refer_unit_price >=", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceLessThan(Double value) {
            addCriterion("refer_unit_price <", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceLessThanOrEqualTo(Double value) {
            addCriterion("refer_unit_price <=", value, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceIn(List<Double> values) {
            addCriterion("refer_unit_price in", values, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceNotIn(List<Double> values) {
            addCriterion("refer_unit_price not in", values, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceBetween(Double value1, Double value2) {
            addCriterion("refer_unit_price between", value1, value2, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andRefer_unit_priceNotBetween(Double value1, Double value2) {
            addCriterion("refer_unit_price not between", value1, value2, "refer_unit_price");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andBakIsNull() {
            addCriterion("bak is null");
            return (Criteria) this;
        }

        public Criteria andBakIsNotNull() {
            addCriterion("bak is not null");
            return (Criteria) this;
        }

        public Criteria andBakEqualTo(String value) {
            addCriterion("bak =", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotEqualTo(String value) {
            addCriterion("bak <>", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakGreaterThan(String value) {
            addCriterion("bak >", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakGreaterThanOrEqualTo(String value) {
            addCriterion("bak >=", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLessThan(String value) {
            addCriterion("bak <", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLessThanOrEqualTo(String value) {
            addCriterion("bak <=", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakLike(String value) {
            addCriterion("bak like", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotLike(String value) {
            addCriterion("bak not like", value, "bak");
            return (Criteria) this;
        }

        public Criteria andBakIn(List<String> values) {
            addCriterion("bak in", values, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotIn(List<String> values) {
            addCriterion("bak not in", values, "bak");
            return (Criteria) this;
        }

        public Criteria andBakBetween(String value1, String value2) {
            addCriterion("bak between", value1, value2, "bak");
            return (Criteria) this;
        }

        public Criteria andBakNotBetween(String value1, String value2) {
            addCriterion("bak not between", value1, value2, "bak");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}