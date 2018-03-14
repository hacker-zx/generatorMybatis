package com.zx.model;

public class Admin {
    private Integer adminId;

    private String adminName;

    private String password;

    private Byte role;

    public Admin(Integer adminId, String adminName, String password, Byte role) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
        this.role = role;
    }

    public Admin() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }
}