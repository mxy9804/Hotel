package com.hotel.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
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
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
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

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Double value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Double value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Double value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Double value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Double> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Double> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Double value1, Double value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCredateIsNull() {
            addCriterion("order_credate is null");
            return (Criteria) this;
        }

        public Criteria andOrderCredateIsNotNull() {
            addCriterion("order_credate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCredateEqualTo(Date value) {
            addCriterion("order_credate =", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateNotEqualTo(Date value) {
            addCriterion("order_credate <>", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateGreaterThan(Date value) {
            addCriterion("order_credate >", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_credate >=", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateLessThan(Date value) {
            addCriterion("order_credate <", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateLessThanOrEqualTo(Date value) {
            addCriterion("order_credate <=", value, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateIn(List<Date> values) {
            addCriterion("order_credate in", values, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateNotIn(List<Date> values) {
            addCriterion("order_credate not in", values, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateBetween(Date value1, Date value2) {
            addCriterion("order_credate between", value1, value2, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andOrderCredateNotBetween(Date value1, Date value2) {
            addCriterion("order_credate not between", value1, value2, "orderCredate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIsNull() {
            addCriterion("checkin_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIsNotNull() {
            addCriterion("checkin_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinDateEqualTo(Date value) {
            addCriterionForJDBCDate("checkin_date =", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkin_date <>", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkin_date >", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkin_date >=", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateLessThan(Date value) {
            addCriterionForJDBCDate("checkin_date <", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkin_date <=", value, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateIn(List<Date> values) {
            addCriterionForJDBCDate("checkin_date in", values, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkin_date not in", values, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkin_date between", value1, value2, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckinDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkin_date not between", value1, value2, "checkinDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateIsNull() {
            addCriterion("checkout_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateIsNotNull() {
            addCriterion("checkout_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateEqualTo(Date value) {
            addCriterionForJDBCDate("checkout_date =", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkout_date <>", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkout_date >", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkout_date >=", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateLessThan(Date value) {
            addCriterionForJDBCDate("checkout_date <", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkout_date <=", value, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateIn(List<Date> values) {
            addCriterionForJDBCDate("checkout_date in", values, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkout_date not in", values, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkout_date between", value1, value2, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCheckoutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkout_date not between", value1, value2, "checkoutDate");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNull() {
            addCriterion("customer_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNotNull() {
            addCriterion("customer_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberEqualTo(Integer value) {
            addCriterion("customer_number =", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotEqualTo(Integer value) {
            addCriterion("customer_number <>", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThan(Integer value) {
            addCriterion("customer_number >", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_number >=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThan(Integer value) {
            addCriterion("customer_number <", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("customer_number <=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIn(List<Integer> values) {
            addCriterion("customer_number in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotIn(List<Integer> values) {
            addCriterion("customer_number not in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberBetween(Integer value1, Integer value2) {
            addCriterion("customer_number between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_number not between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(Integer value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(Integer value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(Integer value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(Integer value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<Integer> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<Integer> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(Integer value1, Integer value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_order
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 08 17:23:00 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tab_order
     *
     * @mbg.generated Wed Jul 08 17:23:00 CST 2020
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