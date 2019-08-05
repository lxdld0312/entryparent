package com.lxd.entry.service.impl;

import com.lxd.entry.mapper.UserMapper;
import com.lxd.entry.pojo.User;
import com.lxd.entry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public List<User> queryUser() {
        return userMapper.queryUser();
    }
}
