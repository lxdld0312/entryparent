package com.lxd.entry.controller;

import com.lxd.entry.pojo.User;
import com.lxd.entry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户编号查询网站用户
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/get{id}",method = RequestMethod.GET)
    public User queryUserById(@PathVariable("id")String id){
        userService.queryUserById(id);
        return new User();
    }
}
