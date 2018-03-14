package com.zx.model;

public class Favorite extends FavoriteKey {
    private Byte disabled;

    public Favorite(Integer userId, Integer productId, Byte disabled) {
        super(userId, productId);
        this.disabled = disabled;
    }

    public Favorite() {
        super();
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }
}