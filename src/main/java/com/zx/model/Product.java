package com.zx.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer productId;

    private Integer typeId;

    private String productname;

    private String headimage;

    private BigDecimal baseprise;

    private BigDecimal saleprice;

    private Integer amount;

    private Byte commend;

    private Byte promotion;

    private Byte disabled;

    private Date saletime;

    private String productinfo;

    public Product(Integer productId, Integer typeId, String productname, String headimage, BigDecimal baseprise, BigDecimal saleprice, Integer amount, Byte commend, Byte promotion, Byte disabled, Date saletime, String productinfo) {
        this.productId = productId;
        this.typeId = typeId;
        this.productname = productname;
        this.headimage = headimage;
        this.baseprise = baseprise;
        this.saleprice = saleprice;
        this.amount = amount;
        this.commend = commend;
        this.promotion = promotion;
        this.disabled = disabled;
        this.saletime = saletime;
        this.productinfo = productinfo;
    }

    public Product() {
        super();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getHeadimage() {
        return headimage;
    }

    public void setHeadimage(String headimage) {
        this.headimage = headimage == null ? null : headimage.trim();
    }

    public BigDecimal getBaseprise() {
        return baseprise;
    }

    public void setBaseprise(BigDecimal baseprise) {
        this.baseprise = baseprise;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Byte getCommend() {
        return commend;
    }

    public void setCommend(Byte commend) {
        this.commend = commend;
    }

    public Byte getPromotion() {
        return promotion;
    }

    public void setPromotion(Byte promotion) {
        this.promotion = promotion;
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public String getProductinfo() {
        return productinfo;
    }

    public void setProductinfo(String productinfo) {
        this.productinfo = productinfo == null ? null : productinfo.trim();
    }
}