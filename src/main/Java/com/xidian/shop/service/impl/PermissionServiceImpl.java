package com.xidian.shop.service.impl;

import com.xidian.shop.mapper.PermissionMapper;
import com.xidian.shop.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<String> queryPermissionNameByUserName(String username) {
        return permissionMapper.queryPermissionNameByUserName(username);
    }
}
