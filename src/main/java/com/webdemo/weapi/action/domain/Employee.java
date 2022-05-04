package com.webdemo.weapi.action.domain;

import javax.xml.crypto.Data;
import java.util.Date;

public class Employee {
    private Integer empId;

    private String userName;

    private String account;

    private String phone;

    private String pwd;


    private Date lastLoginTime;

    private String lastLoginIp;

    private Integer empState;

    private Date createTime;

    private Date updateTime;

    private Integer languageId;


    private String token;

    private Date tokenCreateTime;

    private Date tokenValidityTime;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Integer getEmpState() {
        return empState;
    }

    public void setEmpState(Integer empState) {
        this.empState = empState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getTokenCreateTime() {
        return tokenCreateTime;
    }

    public void setTokenCreateTime(Date tokenCreateTime) {
        this.tokenCreateTime = tokenCreateTime;
    }

    public Date getTokenValidityTime() {
        return tokenValidityTime;
    }

    public void setTokenValidityTime(Date tokenValidityTime) {
        this.tokenValidityTime = tokenValidityTime;
    }
}
