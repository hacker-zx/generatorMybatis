package com.zx.model;

public class Order_productKey {
    private Integer orderId;

    private Integer productId;

    public Order_productKey(Integer orderId, Integer productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public Order_productKey() {
        super();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}