package com.xidian.shop.service.impl;

import com.xidian.shop.entity.Admin;
import com.xidian.shop.entity.auth.SysUser;
import com.xidian.shop.mapper.AdminMapper;
import com.xidian.shop.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findAdminByUserName(String username) {
        return adminMapper.findAdminByUserName(username);
    }

    @Override
    public SysUser findSysUserByUserName(String username) {
        return adminMapper.findSysUserByUserName(username);
    }
}
