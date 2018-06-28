package com.example.spring.mvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.spring.mvc.entity.User;
import com.example.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Li Hongxing
 * @description: user入口
 * @date: Created in 2017/12/20 19:50
 * @modified:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource private UserService userService;
    @Autowired private User user;

    @RequestMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        if (user != null) {
            return JSONObject.toJSONString(user);
        }
        return "null";
    }

    @RequestMapping("su")
    public String showUser(){
        user.setName("autowired");
        user.setAge(1);
        return user.toString();
    }
}
