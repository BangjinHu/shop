package com.xidian.shop.mapper;

import com.xidian.shop.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAllUsers();

    User findUserById(Integer id);

    String findPassWordByUserName(String username);

    User queryUserByUserName(String username);

}
