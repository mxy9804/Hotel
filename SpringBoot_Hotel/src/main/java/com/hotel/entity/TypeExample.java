package com.hotel.entity;

import java.util.ArrayList;
import java.util.List;

public class TypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public TypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
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
     * This method corresponds to the database table tab_type
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
     * This method corresponds to the database table tab_type
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_type
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
     * This class corresponds to the database table tab_type
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNull() {
            addCriterion("type_desc is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNotNull() {
            addCriterion("type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescEqualTo(String value) {
            addCriterion("type_desc =", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotEqualTo(String value) {
            addCriterion("type_desc <>", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThan(String value) {
            addCriterion("type_desc >", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("type_desc >=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThan(String value) {
            addCriterion("type_desc <", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThanOrEqualTo(String value) {
            addCriterion("type_desc <=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLike(String value) {
            addCriterion("type_desc like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotLike(String value) {
            addCriterion("type_desc not like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescIn(List<String> values) {
            addCriterion("type_desc in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotIn(List<String> values) {
            addCriterion("type_desc not in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescBetween(String value1, String value2) {
            addCriterion("type_desc between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotBetween(String value1, String value2) {
            addCriterion("type_desc not between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypePriceIsNull() {
            addCriterion("type_price is null");
            return (Criteria) this;
        }

        public Criteria andTypePriceIsNotNull() {
            addCriterion("type_price is not null");
            return (Criteria) this;
        }

        public Criteria andTypePriceEqualTo(Double value) {
            addCriterion("type_price =", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceNotEqualTo(Double value) {
            addCriterion("type_price <>", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceGreaterThan(Double value) {
            addCriterion("type_price >", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("type_price >=", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceLessThan(Double value) {
            addCriterion("type_price <", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceLessThanOrEqualTo(Double value) {
            addCriterion("type_price <=", value, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceIn(List<Double> values) {
            addCriterion("type_price in", values, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceNotIn(List<Double> values) {
            addCriterion("type_price not in", values, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceBetween(Double value1, Double value2) {
            addCriterion("type_price between", value1, value2, "typePrice");
            return (Criteria) this;
        }

        public Criteria andTypePriceNotBetween(Double value1, Double value2) {
            addCriterion("type_price not between", value1, value2, "typePrice");
            return (Criteria) this;
        }

        public Criteria andAvalNumberIsNull() {
            addCriterion("aval_number is null");
            return (Criteria) this;
        }

        public Criteria andAvalNumberIsNotNull() {
            addCriterion("aval_number is not null");
            return (Criteria) this;
        }

        public Criteria andAvalNumberEqualTo(Integer value) {
            addCriterion("aval_number =", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberNotEqualTo(Integer value) {
            addCriterion("aval_number <>", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberGreaterThan(Integer value) {
            addCriterion("aval_number >", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("aval_number >=", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberLessThan(Integer value) {
            addCriterion("aval_number <", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberLessThanOrEqualTo(Integer value) {
            addCriterion("aval_number <=", value, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberIn(List<Integer> values) {
            addCriterion("aval_number in", values, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberNotIn(List<Integer> values) {
            addCriterion("aval_number not in", values, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberBetween(Integer value1, Integer value2) {
            addCriterion("aval_number between", value1, value2, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andAvalNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("aval_number not between", value1, value2, "avalNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNull() {
            addCriterion("type_number is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNotNull() {
            addCriterion("type_number is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberEqualTo(Integer value) {
            addCriterion("type_number =", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotEqualTo(Integer value) {
            addCriterion("type_number <>", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThan(Integer value) {
            addCriterion("type_number >", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_number >=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThan(Integer value) {
            addCriterion("type_number <", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("type_number <=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIn(List<Integer> values) {
            addCriterion("type_number in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotIn(List<Integer> values) {
            addCriterion("type_number not in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberBetween(Integer value1, Integer value2) {
            addCriterion("type_number between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("type_number not between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNull() {
            addCriterion("type_status is null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNotNull() {
            addCriterion("type_status is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusEqualTo(Byte value) {
            addCriterion("type_status =", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotEqualTo(Byte value) {
            addCriterion("type_status <>", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThan(Byte value) {
            addCriterion("type_status >", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_status >=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThan(Byte value) {
            addCriterion("type_status <", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("type_status <=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIn(List<Byte> values) {
            addCriterion("type_status in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotIn(List<Byte> values) {
            addCriterion("type_status not in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusBetween(Byte value1, Byte value2) {
            addCriterion("type_status between", value1, value2, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("type_status not between", value1, value2, "typeStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_type
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
     * This class corresponds to the database table tab_type
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