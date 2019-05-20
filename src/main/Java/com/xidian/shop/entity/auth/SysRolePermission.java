package com.xidian.shop.entity.auth;

import java.sql.Timestamp;

public class SysRolePermission {
    private Integer rpid;
    private Integer rid;
    private Integer pid;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
        return "SysRolePermission{" + "rpid=" + rpid + ", rid=" + rid + ", pid=" + pid + ", status=" + status + ", createTime=" + createTime + ", updateTime=" + updateTime + '}';
    }
}
