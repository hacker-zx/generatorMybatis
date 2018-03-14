package com.zx.model;

public class Address {
    private Integer addressId;

    private Integer userId;

    private String name;

    private String addressinfo;

    private String zip;

    private String tel;

    private Byte disabled;

    public Address(Integer addressId, Integer userId, String name, String addressinfo, String zip, String tel, Byte disabled) {
        this.addressId = addressId;
        this.userId = userId;
        this.name = name;
        this.addressinfo = addressinfo;
        this.zip = zip;
        this.tel = tel;
        this.disabled = disabled;
    }

    public Address() {
        super();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo == null ? null : addressinfo.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Byte getDisabled() {
        return disabled;
    }

    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }
}