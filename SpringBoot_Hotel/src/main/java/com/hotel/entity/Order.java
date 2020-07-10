package com.hotel.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.order_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.customer_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.room_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.reception_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer receptionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.roomtype_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer roomtypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.order_price
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Double orderPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.order_status
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Byte orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.order_credate
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date orderCredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.checkin_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date checkinDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.checkout_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date checkoutDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_order.customer_number
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    private Integer customerNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.order_id
     *
     * @return the value of tab_order.order_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.order_id
     *
     * @param orderId the value for tab_order.order_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.customer_id
     *
     * @return the value of tab_order.customer_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.customer_id
     *
     * @param customerId the value for tab_order.customer_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.room_id
     *
     * @return the value of tab_order.room_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.room_id
     *
     * @param roomId the value for tab_order.room_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.reception_id
     *
     * @return the value of tab_order.reception_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getReceptionId() {
        return receptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.reception_id
     *
     * @param receptionId the value for tab_order.reception_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setReceptionId(Integer receptionId) {
        this.receptionId = receptionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.roomtype_id
     *
     * @return the value of tab_order.roomtype_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getRoomtypeId() {
        return roomtypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.roomtype_id
     *
     * @param roomtypeId the value for tab_order.roomtype_id
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setRoomtypeId(Integer roomtypeId) {
        this.roomtypeId = roomtypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.order_price
     *
     * @return the value of tab_order.order_price
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Double getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.order_price
     *
     * @param orderPrice the value for tab_order.order_price
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.order_status
     *
     * @return the value of tab_order.order_status
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.order_status
     *
     * @param orderStatus the value for tab_order.order_status
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.order_credate
     *
     * @return the value of tab_order.order_credate
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Date getOrderCredate() {
        return orderCredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.order_credate
     *
     * @param orderCredate the value for tab_order.order_credate
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setOrderCredate(Date orderCredate) {
        this.orderCredate = orderCredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.checkin_date
     *
     * @return the value of tab_order.checkin_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Date getCheckinDate() {
        return checkinDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.checkin_date
     *
     * @param checkinDate the value for tab_order.checkin_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.checkout_date
     *
     * @return the value of tab_order.checkout_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Date getCheckoutDate() {
        return checkoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.checkout_date
     *
     * @param checkoutDate the value for tab_order.checkout_date
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_order.customer_number
     *
     * @return the value of tab_order.customer_number
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public Integer getCustomerNumber() {
        return customerNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_order.customer_number
     *
     * @param customerNumber the value for tab_order.customer_number
     *
     * @mbg.generated Fri Jul 10 08:56:31 CST 2020
     */
    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }
}