package com.xidian.shop.service;

import com.xidian.shop.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Integer id);

    String findPassWordByUserName(String username);

    User queryUserByUserName(String username);

}
