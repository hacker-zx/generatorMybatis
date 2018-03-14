package com.zx.model;

public class Order_product extends Order_productKey {
    private Integer num;

    private Byte disabled;

    public Order_product(Integer orderId, Integer productId, Integer num, Byte disabled) {
        super(orderId, productId);
        this.num = num;
        this.disabled = disabled;
    }

    public Order_product() {
        super();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }
}