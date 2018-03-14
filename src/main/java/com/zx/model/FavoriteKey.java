package com.zx.model;

public class FavoriteKey {
    private Integer userId;

    private Integer productId;

    public FavoriteKey(Integer userId, Integer productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public FavoriteKey() {
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