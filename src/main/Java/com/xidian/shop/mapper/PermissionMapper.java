package com.xidian.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<String> queryPermissionNameByUserName(String username);

}
