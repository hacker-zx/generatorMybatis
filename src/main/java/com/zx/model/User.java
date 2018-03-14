package com.zx.model;

public class User {
    private Integer userId;

    private String username;

    private String password;

    private String tel;

    private Byte level;

    public User(Integer userId, String username, String password, String tel, Byte level) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.level = level;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }
}