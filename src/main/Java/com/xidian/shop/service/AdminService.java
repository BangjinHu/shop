package com.xidian.shop.service;

import com.xidian.shop.entity.Admin;
import com.xidian.shop.entity.auth.SysUser;

public interface AdminService {

    Admin findAdminByUserName(String username);

    SysUser findSysUserByUserName(String username);
}
