package com.zx.model;

public class Cart extends CartKey {
    private Byte disabled;

    public Cart(Integer userId, Integer productId, Byte disabled) {
        super(userId, productId);
        this.disabled = disabled;
    }

    public Cart() {
        super();
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }
}