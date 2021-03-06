package com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

public class ReceptionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public ReceptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
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

        public Criteria andReceptionIdIsNull() {
            addCriterion("reception_id is null");
            return (Criteria) this;
        }

        public Criteria andReceptionIdIsNotNull() {
            addCriterion("reception_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionIdEqualTo(Integer value) {
            addCriterion("reception_id =", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdNotEqualTo(Integer value) {
            addCriterion("reception_id <>", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdGreaterThan(Integer value) {
            addCriterion("reception_id >", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reception_id >=", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdLessThan(Integer value) {
            addCriterion("reception_id <", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("reception_id <=", value, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdIn(List<Integer> values) {
            addCriterion("reception_id in", values, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdNotIn(List<Integer> values) {
            addCriterion("reception_id not in", values, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdBetween(Integer value1, Integer value2) {
            addCriterion("reception_id between", value1, value2, "receptionId");
            return (Criteria) this;
        }

        public Criteria andReceptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reception_id not between", value1, value2, "receptionId");
            return (Criteria) this;
        }

        public Criteria andStuffIdIsNull() {
            addCriterion("stuff_id is null");
            return (Criteria) this;
        }

        public Criteria andStuffIdIsNotNull() {
            addCriterion("stuff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuffIdEqualTo(Integer value) {
            addCriterion("stuff_id =", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotEqualTo(Integer value) {
            addCriterion("stuff_id <>", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThan(Integer value) {
            addCriterion("stuff_id >", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stuff_id >=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThan(Integer value) {
            addCriterion("stuff_id <", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdLessThanOrEqualTo(Integer value) {
            addCriterion("stuff_id <=", value, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdIn(List<Integer> values) {
            addCriterion("stuff_id in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotIn(List<Integer> values) {
            addCriterion("stuff_id not in", values, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdBetween(Integer value1, Integer value2) {
            addCriterion("stuff_id between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andStuffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stuff_id not between", value1, value2, "stuffId");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordIsNull() {
            addCriterion("reception_password is null");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordIsNotNull() {
            addCriterion("reception_password is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordEqualTo(String value) {
            addCriterion("reception_password =", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordNotEqualTo(String value) {
            addCriterion("reception_password <>", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordGreaterThan(String value) {
            addCriterion("reception_password >", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("reception_password >=", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordLessThan(String value) {
            addCriterion("reception_password <", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordLessThanOrEqualTo(String value) {
            addCriterion("reception_password <=", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordLike(String value) {
            addCriterion("reception_password like", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordNotLike(String value) {
            addCriterion("reception_password not like", value, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordIn(List<String> values) {
            addCriterion("reception_password in", values, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordNotIn(List<String> values) {
            addCriterion("reception_password not in", values, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordBetween(String value1, String value2) {
            addCriterion("reception_password between", value1, value2, "receptionPassword");
            return (Criteria) this;
        }

        public Criteria andReceptionPasswordNotBetween(String value1, String value2) {
            addCriterion("reception_password not between", value1, value2, "receptionPassword");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_reception
     *
     * @mbg.generated do_not_delete_during_merge Fri Jul 10 08:56:31 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_reception
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
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