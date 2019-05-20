package com.xidian.shop.entity.auth;

import com.xidian.shop.constant.SysUserTypeEnum;

import java.util.HashSet;
import java.util.Set;

public class SysUser {
    private String username;
    private SysUserTypeEnum userTypeEnum = SysUserTypeEnum.NONE;
    private Set<SysRole> roles = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SysUserTypeEnum getUserTypeEnum() {
        return userTypeEnum;
    }

    public void setUserTypeEnum(SysUserTypeEnum userTypeEnum) {
        this.userTypeEnum = userTypeEnum;
    }

    public Set<SysRole> getRoles() {
        return roles;
    }

}
