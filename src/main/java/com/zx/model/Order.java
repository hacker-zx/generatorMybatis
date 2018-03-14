package com.zx.model;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private Integer addressId;

    private Byte payStatus;

    private Byte shipStatus;

    private Byte isDelivery;

    private Date date;

    public Order(Integer orderId, Integer userId, Integer addressId, Byte payStatus, Byte shipStatus, Byte isDelivery, Date date) {
        this.orderId = orderId;
        this.userId = userId;
        this.addressId = addressId;
        this.payStatus = payStatus;
        this.shipStatus = shipStatus;
        this.isDelivery = isDelivery;
        this.date = date;
    }

    public Order() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Byte getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(Byte shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Byte getIsDelivery() {
        return isDelivery;
    }

    public void setIsDelivery(Byte isDelivery) {
        this.isDelivery = isDelivery;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}