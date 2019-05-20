package com.xidian.shop.entity.auth;

import java.sql.Timestamp;

public class SysPermission {
    private Integer pid;
    private String pname;
    private String purl;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
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
        return "SysPermission{" + "pid=" + pid + ", pname='" + pname + '\'' + ", purl='" + purl + '\'' + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
