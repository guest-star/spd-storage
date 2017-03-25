package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpdPickDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdPickDOExample() {
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

        public Criteria andReq_dept_idIsNull() {
            addCriterion("req_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idIsNotNull() {
            addCriterion("req_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idEqualTo(String value) {
            addCriterion("req_dept_id =", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idNotEqualTo(String value) {
            addCriterion("req_dept_id <>", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idGreaterThan(String value) {
            addCriterion("req_dept_id >", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idGreaterThanOrEqualTo(String value) {
            addCriterion("req_dept_id >=", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idLessThan(String value) {
            addCriterion("req_dept_id <", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idLessThanOrEqualTo(String value) {
            addCriterion("req_dept_id <=", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idLike(String value) {
            addCriterion("req_dept_id like", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idNotLike(String value) {
            addCriterion("req_dept_id not like", value, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idIn(List<String> values) {
            addCriterion("req_dept_id in", values, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idNotIn(List<String> values) {
            addCriterion("req_dept_id not in", values, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idBetween(String value1, String value2) {
            addCriterion("req_dept_id between", value1, value2, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_idNotBetween(String value1, String value2) {
            addCriterion("req_dept_id not between", value1, value2, "req_dept_id");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameIsNull() {
            addCriterion("req_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameIsNotNull() {
            addCriterion("req_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameEqualTo(String value) {
            addCriterion("req_dept_name =", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameNotEqualTo(String value) {
            addCriterion("req_dept_name <>", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameGreaterThan(String value) {
            addCriterion("req_dept_name >", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameGreaterThanOrEqualTo(String value) {
            addCriterion("req_dept_name >=", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameLessThan(String value) {
            addCriterion("req_dept_name <", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameLessThanOrEqualTo(String value) {
            addCriterion("req_dept_name <=", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameLike(String value) {
            addCriterion("req_dept_name like", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameNotLike(String value) {
            addCriterion("req_dept_name not like", value, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameIn(List<String> values) {
            addCriterion("req_dept_name in", values, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameNotIn(List<String> values) {
            addCriterion("req_dept_name not in", values, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameBetween(String value1, String value2) {
            addCriterion("req_dept_name between", value1, value2, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andReq_dept_nameNotBetween(String value1, String value2) {
            addCriterion("req_dept_name not between", value1, value2, "req_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idIsNull() {
            addCriterion("out_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idIsNotNull() {
            addCriterion("out_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idEqualTo(String value) {
            addCriterion("out_dept_id =", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idNotEqualTo(String value) {
            addCriterion("out_dept_id <>", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idGreaterThan(String value) {
            addCriterion("out_dept_id >", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idGreaterThanOrEqualTo(String value) {
            addCriterion("out_dept_id >=", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idLessThan(String value) {
            addCriterion("out_dept_id <", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idLessThanOrEqualTo(String value) {
            addCriterion("out_dept_id <=", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idLike(String value) {
            addCriterion("out_dept_id like", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idNotLike(String value) {
            addCriterion("out_dept_id not like", value, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idIn(List<String> values) {
            addCriterion("out_dept_id in", values, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idNotIn(List<String> values) {
            addCriterion("out_dept_id not in", values, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idBetween(String value1, String value2) {
            addCriterion("out_dept_id between", value1, value2, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_idNotBetween(String value1, String value2) {
            addCriterion("out_dept_id not between", value1, value2, "out_dept_id");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameIsNull() {
            addCriterion("out_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameIsNotNull() {
            addCriterion("out_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameEqualTo(String value) {
            addCriterion("out_dept_name =", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameNotEqualTo(String value) {
            addCriterion("out_dept_name <>", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameGreaterThan(String value) {
            addCriterion("out_dept_name >", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameGreaterThanOrEqualTo(String value) {
            addCriterion("out_dept_name >=", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameLessThan(String value) {
            addCriterion("out_dept_name <", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameLessThanOrEqualTo(String value) {
            addCriterion("out_dept_name <=", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameLike(String value) {
            addCriterion("out_dept_name like", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameNotLike(String value) {
            addCriterion("out_dept_name not like", value, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameIn(List<String> values) {
            addCriterion("out_dept_name in", values, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameNotIn(List<String> values) {
            addCriterion("out_dept_name not in", values, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameBetween(String value1, String value2) {
            addCriterion("out_dept_name between", value1, value2, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_dept_nameNotBetween(String value1, String value2) {
            addCriterion("out_dept_name not between", value1, value2, "out_dept_name");
            return (Criteria) this;
        }

        public Criteria andOut_usernameIsNull() {
            addCriterion("out_username is null");
            return (Criteria) this;
        }

        public Criteria andOut_usernameIsNotNull() {
            addCriterion("out_username is not null");
            return (Criteria) this;
        }

        public Criteria andOut_usernameEqualTo(String value) {
            addCriterion("out_username =", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameNotEqualTo(String value) {
            addCriterion("out_username <>", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameGreaterThan(String value) {
            addCriterion("out_username >", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("out_username >=", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameLessThan(String value) {
            addCriterion("out_username <", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameLessThanOrEqualTo(String value) {
            addCriterion("out_username <=", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameLike(String value) {
            addCriterion("out_username like", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameNotLike(String value) {
            addCriterion("out_username not like", value, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameIn(List<String> values) {
            addCriterion("out_username in", values, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameNotIn(List<String> values) {
            addCriterion("out_username not in", values, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameBetween(String value1, String value2) {
            addCriterion("out_username between", value1, value2, "out_username");
            return (Criteria) this;
        }

        public Criteria andOut_usernameNotBetween(String value1, String value2) {
            addCriterion("out_username not between", value1, value2, "out_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameIsNull() {
            addCriterion("req_username is null");
            return (Criteria) this;
        }

        public Criteria andReq_usernameIsNotNull() {
            addCriterion("req_username is not null");
            return (Criteria) this;
        }

        public Criteria andReq_usernameEqualTo(String value) {
            addCriterion("req_username =", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameNotEqualTo(String value) {
            addCriterion("req_username <>", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameGreaterThan(String value) {
            addCriterion("req_username >", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("req_username >=", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameLessThan(String value) {
            addCriterion("req_username <", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameLessThanOrEqualTo(String value) {
            addCriterion("req_username <=", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameLike(String value) {
            addCriterion("req_username like", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameNotLike(String value) {
            addCriterion("req_username not like", value, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameIn(List<String> values) {
            addCriterion("req_username in", values, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameNotIn(List<String> values) {
            addCriterion("req_username not in", values, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameBetween(String value1, String value2) {
            addCriterion("req_username between", value1, value2, "req_username");
            return (Criteria) this;
        }

        public Criteria andReq_usernameNotBetween(String value1, String value2) {
            addCriterion("req_username not between", value1, value2, "req_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameIsNull() {
            addCriterion("approval_username is null");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameIsNotNull() {
            addCriterion("approval_username is not null");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameEqualTo(String value) {
            addCriterion("approval_username =", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameNotEqualTo(String value) {
            addCriterion("approval_username <>", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameGreaterThan(String value) {
            addCriterion("approval_username >", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_username >=", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameLessThan(String value) {
            addCriterion("approval_username <", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameLessThanOrEqualTo(String value) {
            addCriterion("approval_username <=", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameLike(String value) {
            addCriterion("approval_username like", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameNotLike(String value) {
            addCriterion("approval_username not like", value, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameIn(List<String> values) {
            addCriterion("approval_username in", values, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameNotIn(List<String> values) {
            addCriterion("approval_username not in", values, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameBetween(String value1, String value2) {
            addCriterion("approval_username between", value1, value2, "approval_username");
            return (Criteria) this;
        }

        public Criteria andApproval_usernameNotBetween(String value1, String value2) {
            addCriterion("approval_username not between", value1, value2, "approval_username");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_priceEqualTo(Double value) {
            addCriterion("total_price =", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotEqualTo(Double value) {
            addCriterion("total_price <>", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceGreaterThan(Double value) {
            addCriterion("total_price >", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_price >=", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceLessThan(Double value) {
            addCriterion("total_price <", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceLessThanOrEqualTo(Double value) {
            addCriterion("total_price <=", value, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceIn(List<Double> values) {
            addCriterion("total_price in", values, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotIn(List<Double> values) {
            addCriterion("total_price not in", values, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceBetween(Double value1, Double value2) {
            addCriterion("total_price between", value1, value2, "total_price");
            return (Criteria) this;
        }

        public Criteria andTotal_priceNotBetween(Double value1, Double value2) {
            addCriterion("total_price not between", value1, value2, "total_price");
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