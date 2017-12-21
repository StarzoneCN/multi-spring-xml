package com.example.spring.mvc.controller;

import com.example.spring.mvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author: Li Hongxing
 * @description: helloController
 * @date: Created in 2017/11/28 17:11
 * @modified:
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping
    public String index(){
        return "/hello";
    }
}
