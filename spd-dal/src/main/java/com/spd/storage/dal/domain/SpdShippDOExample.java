package com.spd.storage.dal.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SpdShippDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpdShippDOExample() {
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

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIsNull() {
            addCriterion("receiver_address is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIsNotNull() {
            addCriterion("receiver_address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressEqualTo(String value) {
            addCriterion("receiver_address =", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotEqualTo(String value) {
            addCriterion("receiver_address <>", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThan(String value) {
            addCriterion("receiver_address >", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_address >=", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThan(String value) {
            addCriterion("receiver_address <", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLessThanOrEqualTo(String value) {
            addCriterion("receiver_address <=", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressLike(String value) {
            addCriterion("receiver_address like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotLike(String value) {
            addCriterion("receiver_address not like", value, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressIn(List<String> values) {
            addCriterion("receiver_address in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotIn(List<String> values) {
            addCriterion("receiver_address not in", values, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressBetween(String value1, String value2) {
            addCriterion("receiver_address between", value1, value2, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andReceiver_addressNotBetween(String value1, String value2) {
            addCriterion("receiver_address not between", value1, value2, "receiver_address");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andReceiver_phoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiver_phone");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameIsNull() {
            addCriterion("use_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameIsNotNull() {
            addCriterion("use_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameEqualTo(String value) {
            addCriterion("use_dept_name =", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameNotEqualTo(String value) {
            addCriterion("use_dept_name <>", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameGreaterThan(String value) {
            addCriterion("use_dept_name >", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameGreaterThanOrEqualTo(String value) {
            addCriterion("use_dept_name >=", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameLessThan(String value) {
            addCriterion("use_dept_name <", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameLessThanOrEqualTo(String value) {
            addCriterion("use_dept_name <=", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameLike(String value) {
            addCriterion("use_dept_name like", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameNotLike(String value) {
            addCriterion("use_dept_name not like", value, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameIn(List<String> values) {
            addCriterion("use_dept_name in", values, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameNotIn(List<String> values) {
            addCriterion("use_dept_name not in", values, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameBetween(String value1, String value2) {
            addCriterion("use_dept_name between", value1, value2, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andUse_dept_nameNotBetween(String value1, String value2) {
            addCriterion("use_dept_name not between", value1, value2, "use_dept_name");
            return (Criteria) this;
        }

        public Criteria andSender_phoneIsNull() {
            addCriterion("sender_phone is null");
            return (Criteria) this;
        }

        public Criteria andSender_phoneIsNotNull() {
            addCriterion("sender_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSender_phoneEqualTo(String value) {
            addCriterion("sender_phone =", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneNotEqualTo(String value) {
            addCriterion("sender_phone <>", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneGreaterThan(String value) {
            addCriterion("sender_phone >", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_phone >=", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneLessThan(String value) {
            addCriterion("sender_phone <", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneLessThanOrEqualTo(String value) {
            addCriterion("sender_phone <=", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneLike(String value) {
            addCriterion("sender_phone like", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneNotLike(String value) {
            addCriterion("sender_phone not like", value, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneIn(List<String> values) {
            addCriterion("sender_phone in", values, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneNotIn(List<String> values) {
            addCriterion("sender_phone not in", values, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneBetween(String value1, String value2) {
            addCriterion("sender_phone between", value1, value2, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andSender_phoneNotBetween(String value1, String value2) {
            addCriterion("sender_phone not between", value1, value2, "sender_phone");
            return (Criteria) this;
        }

        public Criteria andBilling_dateIsNull() {
            addCriterion("billing_date is null");
            return (Criteria) this;
        }

        public Criteria andBilling_dateIsNotNull() {
            addCriterion("billing_date is not null");
            return (Criteria) this;
        }

        public Criteria andBilling_dateEqualTo(Date value) {
            addCriterionForJDBCTime("billing_date =", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateNotEqualTo(Date value) {
            addCriterionForJDBCTime("billing_date <>", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateGreaterThan(Date value) {
            addCriterionForJDBCTime("billing_date >", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("billing_date >=", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateLessThan(Date value) {
            addCriterionForJDBCTime("billing_date <", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("billing_date <=", value, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateIn(List<Date> values) {
            addCriterionForJDBCTime("billing_date in", values, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateNotIn(List<Date> values) {
            addCriterionForJDBCTime("billing_date not in", values, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("billing_date between", value1, value2, "billing_date");
            return (Criteria) this;
        }

        public Criteria andBilling_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("billing_date not between", value1, value2, "billing_date");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalIsNull() {
            addCriterion("total_capital is null");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalIsNotNull() {
            addCriterion("total_capital is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalEqualTo(String value) {
            addCriterion("total_capital =", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalNotEqualTo(String value) {
            addCriterion("total_capital <>", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalGreaterThan(String value) {
            addCriterion("total_capital >", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalGreaterThanOrEqualTo(String value) {
            addCriterion("total_capital >=", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalLessThan(String value) {
            addCriterion("total_capital <", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalLessThanOrEqualTo(String value) {
            addCriterion("total_capital <=", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalLike(String value) {
            addCriterion("total_capital like", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalNotLike(String value) {
            addCriterion("total_capital not like", value, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalIn(List<String> values) {
            addCriterion("total_capital in", values, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalNotIn(List<String> values) {
            addCriterion("total_capital not in", values, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalBetween(String value1, String value2) {
            addCriterion("total_capital between", value1, value2, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_capitalNotBetween(String value1, String value2) {
            addCriterion("total_capital not between", value1, value2, "total_capital");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseIsNull() {
            addCriterion("total_lowercase is null");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseIsNotNull() {
            addCriterion("total_lowercase is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseEqualTo(Double value) {
            addCriterion("total_lowercase =", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseNotEqualTo(Double value) {
            addCriterion("total_lowercase <>", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseGreaterThan(Double value) {
            addCriterion("total_lowercase >", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseGreaterThanOrEqualTo(Double value) {
            addCriterion("total_lowercase >=", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseLessThan(Double value) {
            addCriterion("total_lowercase <", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseLessThanOrEqualTo(Double value) {
            addCriterion("total_lowercase <=", value, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseIn(List<Double> values) {
            addCriterion("total_lowercase in", values, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseNotIn(List<Double> values) {
            addCriterion("total_lowercase not in", values, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseBetween(Double value1, Double value2) {
            addCriterion("total_lowercase between", value1, value2, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andTotal_lowercaseNotBetween(Double value1, Double value2) {
            addCriterion("total_lowercase not between", value1, value2, "total_lowercase");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userIsNull() {
            addCriterion("receiver_accept_user is null");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userIsNotNull() {
            addCriterion("receiver_accept_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userEqualTo(String value) {
            addCriterion("receiver_accept_user =", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userNotEqualTo(String value) {
            addCriterion("receiver_accept_user <>", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userGreaterThan(String value) {
            addCriterion("receiver_accept_user >", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_accept_user >=", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userLessThan(String value) {
            addCriterion("receiver_accept_user <", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userLessThanOrEqualTo(String value) {
            addCriterion("receiver_accept_user <=", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userLike(String value) {
            addCriterion("receiver_accept_user like", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userNotLike(String value) {
            addCriterion("receiver_accept_user not like", value, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userIn(List<String> values) {
            addCriterion("receiver_accept_user in", values, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userNotIn(List<String> values) {
            addCriterion("receiver_accept_user not in", values, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userBetween(String value1, String value2) {
            addCriterion("receiver_accept_user between", value1, value2, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andReceiver_accept_userNotBetween(String value1, String value2) {
            addCriterion("receiver_accept_user not between", value1, value2, "receiver_accept_user");
            return (Criteria) this;
        }

        public Criteria andSend_dateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSend_dateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSend_dateEqualTo(Date value) {
            addCriterionForJDBCTime("send_date =", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateNotEqualTo(Date value) {
            addCriterionForJDBCTime("send_date <>", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateGreaterThan(Date value) {
            addCriterionForJDBCTime("send_date >", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("send_date >=", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateLessThan(Date value) {
            addCriterionForJDBCTime("send_date <", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("send_date <=", value, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateIn(List<Date> values) {
            addCriterionForJDBCTime("send_date in", values, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateNotIn(List<Date> values) {
            addCriterionForJDBCTime("send_date not in", values, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("send_date between", value1, value2, "send_date");
            return (Criteria) this;
        }

        public Criteria andSend_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("send_date not between", value1, value2, "send_date");
            return (Criteria) this;
        }

        public Criteria andReceipt_userIsNull() {
            addCriterion("receipt_user is null");
            return (Criteria) this;
        }

        public Criteria andReceipt_userIsNotNull() {
            addCriterion("receipt_user is not null");
            return (Criteria) this;
        }

        public Criteria andReceipt_userEqualTo(String value) {
            addCriterion("receipt_user =", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userNotEqualTo(String value) {
            addCriterion("receipt_user <>", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userGreaterThan(String value) {
            addCriterion("receipt_user >", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_user >=", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userLessThan(String value) {
            addCriterion("receipt_user <", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userLessThanOrEqualTo(String value) {
            addCriterion("receipt_user <=", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userLike(String value) {
            addCriterion("receipt_user like", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userNotLike(String value) {
            addCriterion("receipt_user not like", value, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userIn(List<String> values) {
            addCriterion("receipt_user in", values, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userNotIn(List<String> values) {
            addCriterion("receipt_user not in", values, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userBetween(String value1, String value2) {
            addCriterion("receipt_user between", value1, value2, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andReceipt_userNotBetween(String value1, String value2) {
            addCriterion("receipt_user not between", value1, value2, "receipt_user");
            return (Criteria) this;
        }

        public Criteria andAccept_dateIsNull() {
            addCriterion("accept_date is null");
            return (Criteria) this;
        }

        public Criteria andAccept_dateIsNotNull() {
            addCriterion("accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccept_dateEqualTo(Date value) {
            addCriterionForJDBCTime("accept_date =", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateNotEqualTo(Date value) {
            addCriterionForJDBCTime("accept_date <>", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateGreaterThan(Date value) {
            addCriterionForJDBCTime("accept_date >", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("accept_date >=", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateLessThan(Date value) {
            addCriterionForJDBCTime("accept_date <", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("accept_date <=", value, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateIn(List<Date> values) {
            addCriterionForJDBCTime("accept_date in", values, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateNotIn(List<Date> values) {
            addCriterionForJDBCTime("accept_date not in", values, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("accept_date between", value1, value2, "accept_date");
            return (Criteria) this;
        }

        public Criteria andAccept_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("accept_date not between", value1, value2, "accept_date");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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