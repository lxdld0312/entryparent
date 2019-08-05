package com.lxd.entry.service.impl;

import com.lxd.entry.mapper.UserMapper;
import com.lxd.entry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void queryUserById(String id) {

    }
}
