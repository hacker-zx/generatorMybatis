package com.zx.model;

public class Type {
    private Integer typeId;

    private String typename;

    public Type(Integer typeId, String typename) {
        this.typeId = typeId;
        this.typename = typename;
    }

    public Type() {
        super();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}