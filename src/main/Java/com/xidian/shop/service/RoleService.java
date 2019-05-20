package com.xidian.shop.service;

import java.util.List;

public interface RoleService {
    List<String> queryRoleNameByUserName(String username);
}
