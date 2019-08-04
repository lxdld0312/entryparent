package com.lxd.entry.controller;

import com.lxd.entry.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("get")
    @ResponseBody
    public User queryUserById(){
        User user = new User();
        user.setUsername("lxd");
        user.setNickname("刘贤德");
        user.setPassword("123456");
        return user;
    }
}
