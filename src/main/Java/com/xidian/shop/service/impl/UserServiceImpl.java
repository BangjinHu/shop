package com.xidian.shop.service.impl;

import com.xidian.shop.entity.User;
import com.xidian.shop.mapper.UserMapper;
import com.xidian.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public String findPassWordByUserName(String username) {
        return userMapper.findPassWordByUserName(username);
    }

    @Override
    public User queryUserByUserName(String username) {
        return userMapper.queryUserByUserName(username);
    }
}
