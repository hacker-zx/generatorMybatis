package com.zx.model;

public class CartKey {
    private Integer userId;

    private Integer productId;

    public CartKey(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public CartKey() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}