package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpdPurchaseOrderDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdPurchaseOrderDOExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andDept_idIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDept_idEqualTo(String value) {
            addCriterion("dept_id =", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotEqualTo(String value) {
            addCriterion("dept_id <>", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThan(String value) {
            addCriterion("dept_id >", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThanOrEqualTo(String value) {
            addCriterion("dept_id >=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThan(String value) {
            addCriterion("dept_id <", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThanOrEqualTo(String value) {
            addCriterion("dept_id <=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLike(String value) {
            addCriterion("dept_id like", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotLike(String value) {
            addCriterion("dept_id not like", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIn(List<String> values) {
            addCriterion("dept_id in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotIn(List<String> values) {
            addCriterion("dept_id not in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idBetween(String value1, String value2) {
            addCriterion("dept_id between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotBetween(String value1, String value2) {
            addCriterion("dept_id not between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDep_nameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDep_nameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDep_nameEqualTo(String value) {
            addCriterion("dep_name =", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameGreaterThan(String value) {
            addCriterion("dep_name >", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLessThan(String value) {
            addCriterion("dep_name <", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameLike(String value) {
            addCriterion("dep_name like", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotLike(String value) {
            addCriterion("dep_name not like", value, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameIn(List<String> values) {
            addCriterion("dep_name in", values, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "dep_name");
            return (Criteria) this;
        }

        public Criteria andDep_nameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "dep_name");
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
            addCriterionForJDBCTime("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCTime("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCTime("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCTime("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCTime("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCTime("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("create_time not between", value1, value2, "create_time");
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

        public Criteria andPlan_numberIsNull() {
            addCriterion("plan_number is null");
            return (Criteria) this;
        }

        public Criteria andPlan_numberIsNotNull() {
            addCriterion("plan_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlan_numberEqualTo(Double value) {
            addCriterion("plan_number =", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberNotEqualTo(Double value) {
            addCriterion("plan_number <>", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberGreaterThan(Double value) {
            addCriterion("plan_number >", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberGreaterThanOrEqualTo(Double value) {
            addCriterion("plan_number >=", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberLessThan(Double value) {
            addCriterion("plan_number <", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberLessThanOrEqualTo(Double value) {
            addCriterion("plan_number <=", value, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberIn(List<Double> values) {
            addCriterion("plan_number in", values, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberNotIn(List<Double> values) {
            addCriterion("plan_number not in", values, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberBetween(Double value1, Double value2) {
            addCriterion("plan_number between", value1, value2, "plan_number");
            return (Criteria) this;
        }

        public Criteria andPlan_numberNotBetween(Double value1, Double value2) {
            addCriterion("plan_number not between", value1, value2, "plan_number");
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

        public Criteria andApproval_numberIsNull() {
            addCriterion("approval_number is null");
            return (Criteria) this;
        }

        public Criteria andApproval_numberIsNotNull() {
            addCriterion("approval_number is not null");
            return (Criteria) this;
        }

        public Criteria andApproval_numberEqualTo(Double value) {
            addCriterion("approval_number =", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberNotEqualTo(Double value) {
            addCriterion("approval_number <>", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberGreaterThan(Double value) {
            addCriterion("approval_number >", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberGreaterThanOrEqualTo(Double value) {
            addCriterion("approval_number >=", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberLessThan(Double value) {
            addCriterion("approval_number <", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberLessThanOrEqualTo(Double value) {
            addCriterion("approval_number <=", value, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberIn(List<Double> values) {
            addCriterion("approval_number in", values, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberNotIn(List<Double> values) {
            addCriterion("approval_number not in", values, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberBetween(Double value1, Double value2) {
            addCriterion("approval_number between", value1, value2, "approval_number");
            return (Criteria) this;
        }

        public Criteria andApproval_numberNotBetween(Double value1, Double value2) {
            addCriterion("approval_number not between", value1, value2, "approval_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberIsNull() {
            addCriterion("already_buy_number is null");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberIsNotNull() {
            addCriterion("already_buy_number is not null");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberEqualTo(Double value) {
            addCriterion("already_buy_number =", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberNotEqualTo(Double value) {
            addCriterion("already_buy_number <>", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberGreaterThan(Double value) {
            addCriterion("already_buy_number >", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberGreaterThanOrEqualTo(Double value) {
            addCriterion("already_buy_number >=", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberLessThan(Double value) {
            addCriterion("already_buy_number <", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberLessThanOrEqualTo(Double value) {
            addCriterion("already_buy_number <=", value, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberIn(List<Double> values) {
            addCriterion("already_buy_number in", values, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberNotIn(List<Double> values) {
            addCriterion("already_buy_number not in", values, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberBetween(Double value1, Double value2) {
            addCriterion("already_buy_number between", value1, value2, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andAlready_buy_numberNotBetween(Double value1, Double value2) {
            addCriterion("already_buy_number not between", value1, value2, "already_buy_number");
            return (Criteria) this;
        }

        public Criteria andPlan_dateIsNull() {
            addCriterion("plan_date is null");
            return (Criteria) this;
        }

        public Criteria andPlan_dateIsNotNull() {
            addCriterion("plan_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlan_dateEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date =", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <>", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("plan_date >", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date >=", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateLessThan(Date value) {
            addCriterionForJDBCDate("plan_date <", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("plan_date <=", value, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date in", values, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("plan_date not in", values, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date between", value1, value2, "plan_date");
            return (Criteria) this;
        }

        public Criteria andPlan_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("plan_date not between", value1, value2, "plan_date");
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