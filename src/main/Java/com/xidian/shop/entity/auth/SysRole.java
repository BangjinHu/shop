package com.xidian.shop.entity.auth;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class SysRole {

    private Integer rid;
    private String rname;
    private Integer type;
    private Integer valid;
    private Timestamp createTime;
    private Timestamp updateTime;

    Set<SysPermission> permissions = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
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

    public Set<SysPermission> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "SysRole{" + "rid=" + rid + ", rname='" + rname + '\'' + ", type=" + type + ", valid=" + valid + ", createTime=" + createTime + ", updateTime=" + updateTime + ", permissions=" + permissions + '}';
    }
}
