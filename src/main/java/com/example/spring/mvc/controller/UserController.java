package com.example.spring.mvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.spring.mvc.entity.User;
import com.example.spring.mvc.jdbc.rdbms.CustomMappingQuery;
import com.example.spring.mvc.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

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
    @Resource private DataSource dataSource;

    @RequestMapping("/{id}")
    public String getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        if (user != null) {
            return JSONObject.toJSONString(user);
        }
        return "null";
    }

    @RequestMapping("msq")
    @ResponseBody
    public List<User> testMappingSqlQuery() {
        CustomMappingQuery customMappingQuery = new CustomMappingQuery(dataSource, "select * from user");
        customMappingQuery.compile();
        List<User> users = customMappingQuery.execute();
        if (users == null) {
            return new ArrayList<User>(2);
        }
        return users;
    }
}
