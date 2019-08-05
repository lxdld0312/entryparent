package com.lxd.entry.service;

import com.lxd.entry.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户编号查询用户
     * @param id
     */
    User queryUserById(String id);

    /**
     * 查询所有的用户
     * @return
     */
    List<User> queryUser();
}
