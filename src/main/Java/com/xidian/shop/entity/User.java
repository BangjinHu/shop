package com.xidian.shop.entity;

public class User {
    private Integer id;
    private String account;
    private String address;
    private String password;
    private String phone;
    private Integer point;
    private String remark;
    private String spc;
    private String telPhone;
    private String userName;
    private String zipCode;
    private Long balance;
    private String slat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpc() {
        return spc;
    }

    public void setSpc(String spc) {
        this.spc = spc;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public String getSlat() {
        return slat;
    }

    public void setSlat(String slat) {
        this.slat = slat;
    }

    @Override
    public String toString() {
        return "SysUser{" + "id=" + id + ", account='" + account + '\'' + ", address='" + address + '\'' + ", password='" + password + '\'' + ", phone='" + phone + '\'' + ", point=" + point + ", remark='" + remark + '\'' + ", spc='" + spc + '\'' + ", telPhone='" + telPhone + '\'' + ", userName='" + userName + '\'' + ", zipCode='" + zipCode + '\'' + ", balance=" + balance + ", slat='" + slat + '\'' + '}';
    }
}
