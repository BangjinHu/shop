package com.xidian.shop.entity.auth;

import java.sql.Timestamp;

public class SysUserRole {

    private Integer urid;
    private String username;
    private Integer rid;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysUserRole{" + "urid=" + urid + ", username='" + username + '\'' + ", rid=" + rid + ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
