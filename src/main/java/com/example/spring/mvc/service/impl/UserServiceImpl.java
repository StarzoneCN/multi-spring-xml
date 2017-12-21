package com.example.spring.mvc.service.impl;

import com.example.spring.mvc.entity.User;
import com.example.spring.mvc.mapper.UserMapper;
import com.example.spring.mvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Li Hongxing
 * @description: 数据库User表测试
 * @date: Created in 2017/12/20 19:32
 * @modified:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource private UserMapper userMapper;

    @Override
    public User getById(int id) {
        return userMapper.getById(id);
    }
}
