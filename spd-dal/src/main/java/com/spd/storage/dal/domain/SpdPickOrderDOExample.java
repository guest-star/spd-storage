package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.List;

public class SpdPickOrderDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdPickOrderDOExample() {
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

        public Criteria andPick_idIsNull() {
            addCriterion("pick_id is null");
            return (Criteria) this;
        }

        public Criteria andPick_idIsNotNull() {
            addCriterion("pick_id is not null");
            return (Criteria) this;
        }

        public Criteria andPick_idEqualTo(String value) {
            addCriterion("pick_id =", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idNotEqualTo(String value) {
            addCriterion("pick_id <>", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idGreaterThan(String value) {
            addCriterion("pick_id >", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idGreaterThanOrEqualTo(String value) {
            addCriterion("pick_id >=", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idLessThan(String value) {
            addCriterion("pick_id <", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idLessThanOrEqualTo(String value) {
            addCriterion("pick_id <=", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idLike(String value) {
            addCriterion("pick_id like", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idNotLike(String value) {
            addCriterion("pick_id not like", value, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idIn(List<String> values) {
            addCriterion("pick_id in", values, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idNotIn(List<String> values) {
            addCriterion("pick_id not in", values, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idBetween(String value1, String value2) {
            addCriterion("pick_id between", value1, value2, "pick_id");
            return (Criteria) this;
        }

        public Criteria andPick_idNotBetween(String value1, String value2) {
            addCriterion("pick_id not between", value1, value2, "pick_id");
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

        public Criteria andCategory_numberIsNull() {
            addCriterion("category_number is null");
            return (Criteria) this;
        }

        public Criteria andCategory_numberIsNotNull() {
            addCriterion("category_number is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_numberEqualTo(String value) {
            addCriterion("category_number =", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotEqualTo(String value) {
            addCriterion("category_number <>", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberGreaterThan(String value) {
            addCriterion("category_number >", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberGreaterThanOrEqualTo(String value) {
            addCriterion("category_number >=", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberLessThan(String value) {
            addCriterion("category_number <", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberLessThanOrEqualTo(String value) {
            addCriterion("category_number <=", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberLike(String value) {
            addCriterion("category_number like", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotLike(String value) {
            addCriterion("category_number not like", value, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberIn(List<String> values) {
            addCriterion("category_number in", values, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotIn(List<String> values) {
            addCriterion("category_number not in", values, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberBetween(String value1, String value2) {
            addCriterion("category_number between", value1, value2, "category_number");
            return (Criteria) this;
        }

        public Criteria andCategory_numberNotBetween(String value1, String value2) {
            addCriterion("category_number not between", value1, value2, "category_number");
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