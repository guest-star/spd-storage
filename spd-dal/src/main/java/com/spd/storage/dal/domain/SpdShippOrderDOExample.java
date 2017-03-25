package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpdShippOrderDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdShippOrderDOExample() {
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

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_idIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_idEqualTo(String value) {
            addCriterion("category_id =", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotEqualTo(String value) {
            addCriterion("category_id <>", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThan(String value) {
            addCriterion("category_id >", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThan(String value) {
            addCriterion("category_id <", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idLike(String value) {
            addCriterion("category_id like", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotLike(String value) {
            addCriterion("category_id not like", value, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idIn(List<String> values) {
            addCriterion("category_id in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotIn(List<String> values) {
            addCriterion("category_id not in", values, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_idNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "category_id");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_nameEqualTo(String value) {
            addCriterion("category_name =", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThan(String value) {
            addCriterion("category_name >", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThan(String value) {
            addCriterion("category_name <", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameLike(String value) {
            addCriterion("category_name like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotLike(String value) {
            addCriterion("category_name not like", value, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameIn(List<String> values) {
            addCriterion("category_name in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_nameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "category_name");
            return (Criteria) this;
        }

        public Criteria andCategory_numberIsNull() {
            addCriterion("category_number is null");
            return (Criteria) this;
        }

        public Criteria andCategory_numberIsNotNull() {
            addCriterion("category_number is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_numberEqualTo(Double value) {
            addCriterion("category_number =", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotEqualTo(Double value) {
            addCriterion("category_number <>", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberGreaterThan(Double value) {
            addCriterion("category_number >", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberGreaterThanOrEqualTo(Double value) {
            addCriterion("category_number >=", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberLessThan(Double value) {
            addCriterion("category_number <", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberLessThanOrEqualTo(Double value) {
            addCriterion("category_number <=", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberIn(List<Double> values) {
            addCriterion("category_number in", values, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotIn(List<Double> values) {
            addCriterion("category_number not in", values, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberBetween(Double value1, Double value2) {
            addCriterion("category_number between", value1, value2, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotBetween(Double value1, Double value2) {
            addCriterion("category_number not between", value1, value2, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_unitIsNull() {
            addCriterion("category_unit is null");
            return (Criteria) this;
        }

        public Criteria andCategory_unitIsNotNull() {
            addCriterion("category_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_unitEqualTo(String value) {
            addCriterion("category_unit =", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitNotEqualTo(String value) {
            addCriterion("category_unit <>", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitGreaterThan(String value) {
            addCriterion("category_unit >", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitGreaterThanOrEqualTo(String value) {
            addCriterion("category_unit >=", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitLessThan(String value) {
            addCriterion("category_unit <", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitLessThanOrEqualTo(String value) {
            addCriterion("category_unit <=", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitLike(String value) {
            addCriterion("category_unit like", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitNotLike(String value) {
            addCriterion("category_unit not like", value, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitIn(List<String> values) {
            addCriterion("category_unit in", values, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitNotIn(List<String> values) {
            addCriterion("category_unit not in", values, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitBetween(String value1, String value2) {
            addCriterion("category_unit between", value1, value2, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unitNotBetween(String value1, String value2) {
            addCriterion("category_unit not between", value1, value2, "category_unit");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceIsNull() {
            addCriterion("category_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceIsNotNull() {
            addCriterion("category_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceEqualTo(Double value) {
            addCriterion("category_unit_price =", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceNotEqualTo(Double value) {
            addCriterion("category_unit_price <>", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceGreaterThan(Double value) {
            addCriterion("category_unit_price >", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("category_unit_price >=", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceLessThan(Double value) {
            addCriterion("category_unit_price <", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceLessThanOrEqualTo(Double value) {
            addCriterion("category_unit_price <=", value, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceIn(List<Double> values) {
            addCriterion("category_unit_price in", values, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceNotIn(List<Double> values) {
            addCriterion("category_unit_price not in", values, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceBetween(Double value1, Double value2) {
            addCriterion("category_unit_price between", value1, value2, "category_unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_unit_priceNotBetween(Double value1, Double value2) {
            addCriterion("category_unit_price not between", value1, value2, "category_unit_price");
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

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatch_numberIsNull() {
            addCriterion("batch_number is null");
            return (Criteria) this;
        }

        public Criteria andBatch_numberIsNotNull() {
            addCriterion("batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andBatch_numberEqualTo(String value) {
            addCriterion("batch_number =", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberNotEqualTo(String value) {
            addCriterion("batch_number <>", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberGreaterThan(String value) {
            addCriterion("batch_number >", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberGreaterThanOrEqualTo(String value) {
            addCriterion("batch_number >=", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberLessThan(String value) {
            addCriterion("batch_number <", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberLessThanOrEqualTo(String value) {
            addCriterion("batch_number <=", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberLike(String value) {
            addCriterion("batch_number like", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberNotLike(String value) {
            addCriterion("batch_number not like", value, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberIn(List<String> values) {
            addCriterion("batch_number in", values, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberNotIn(List<String> values) {
            addCriterion("batch_number not in", values, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberBetween(String value1, String value2) {
            addCriterion("batch_number between", value1, value2, "batch_number");
            return (Criteria) this;
        }

        public Criteria andBatch_numberNotBetween(String value1, String value2) {
            addCriterion("batch_number not between", value1, value2, "batch_number");
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

        public Criteria andProduct_registr_cardIsNull() {
            addCriterion("product_registr_card is null");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardIsNotNull() {
            addCriterion("product_registr_card is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardEqualTo(String value) {
            addCriterion("product_registr_card =", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardNotEqualTo(String value) {
            addCriterion("product_registr_card <>", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardGreaterThan(String value) {
            addCriterion("product_registr_card >", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardGreaterThanOrEqualTo(String value) {
            addCriterion("product_registr_card >=", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardLessThan(String value) {
            addCriterion("product_registr_card <", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardLessThanOrEqualTo(String value) {
            addCriterion("product_registr_card <=", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardLike(String value) {
            addCriterion("product_registr_card like", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardNotLike(String value) {
            addCriterion("product_registr_card not like", value, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardIn(List<String> values) {
            addCriterion("product_registr_card in", values, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardNotIn(List<String> values) {
            addCriterion("product_registr_card not in", values, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardBetween(String value1, String value2) {
            addCriterion("product_registr_card between", value1, value2, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduct_registr_cardNotBetween(String value1, String value2) {
            addCriterion("product_registr_card not between", value1, value2, "product_registr_card");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseIsNull() {
            addCriterion("production_license is null");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseIsNotNull() {
            addCriterion("production_license is not null");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseEqualTo(String value) {
            addCriterion("production_license =", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseNotEqualTo(String value) {
            addCriterion("production_license <>", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseGreaterThan(String value) {
            addCriterion("production_license >", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseGreaterThanOrEqualTo(String value) {
            addCriterion("production_license >=", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseLessThan(String value) {
            addCriterion("production_license <", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseLessThanOrEqualTo(String value) {
            addCriterion("production_license <=", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseLike(String value) {
            addCriterion("production_license like", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseNotLike(String value) {
            addCriterion("production_license not like", value, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseIn(List<String> values) {
            addCriterion("production_license in", values, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseNotIn(List<String> values) {
            addCriterion("production_license not in", values, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseBetween(String value1, String value2) {
            addCriterion("production_license between", value1, value2, "production_license");
            return (Criteria) this;
        }

        public Criteria andProduction_licenseNotBetween(String value1, String value2) {
            addCriterion("production_license not between", value1, value2, "production_license");
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

        public Criteria andShipp_idIsNull() {
            addCriterion("shipp_id is null");
            return (Criteria) this;
        }

        public Criteria andShipp_idIsNotNull() {
            addCriterion("shipp_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipp_idEqualTo(String value) {
            addCriterion("shipp_id =", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idNotEqualTo(String value) {
            addCriterion("shipp_id <>", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idGreaterThan(String value) {
            addCriterion("shipp_id >", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idGreaterThanOrEqualTo(String value) {
            addCriterion("shipp_id >=", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idLessThan(String value) {
            addCriterion("shipp_id <", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idLessThanOrEqualTo(String value) {
            addCriterion("shipp_id <=", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idLike(String value) {
            addCriterion("shipp_id like", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idNotLike(String value) {
            addCriterion("shipp_id not like", value, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idIn(List<String> values) {
            addCriterion("shipp_id in", values, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idNotIn(List<String> values) {
            addCriterion("shipp_id not in", values, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idBetween(String value1, String value2) {
            addCriterion("shipp_id between", value1, value2, "shipp_id");
            return (Criteria) this;
        }

        public Criteria andShipp_idNotBetween(String value1, String value2) {
            addCriterion("shipp_id not between", value1, value2, "shipp_id");
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