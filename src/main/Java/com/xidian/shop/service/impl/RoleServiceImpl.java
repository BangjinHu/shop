package com.xidian.shop.service.impl;

import com.xidian.shop.mapper.RoleMapper;
import com.xidian.shop.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<String> queryRoleNameByUserName(String username) {
        return roleMapper.queryRoleNameByUserName(username);
    }
}
