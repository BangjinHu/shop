package com.xidian.shop.mapper;

import com.xidian.shop.entity.Admin;
import com.xidian.shop.entity.auth.SysUser;

public interface AdminMapper {

    Admin findAdminByUserName(String username);

    SysUser findSysUserByUserName(String username);

}
