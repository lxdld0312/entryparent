package com.lxd.entry.mapper;

import com.lxd.entry.pojo.User;

import java.util.List;

public interface UserMapper {

    User queryUserById(String id);

    List<User> queryUser();
}
