package com.xidian.shop.service;

import java.util.List;

public interface PermissionService {

    List<String> queryPermissionNameByUserName(String username);
}
