package com.example.spring.mvc.controller;

import com.example.spring.mvc.annotation.RequestLogger;
import com.example.spring.mvc.service.AopTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("aop")
public class AopTestController {

    @Resource private AopTestService aopTestService;

    @RequestMapping
    @RequestLogger(description = "aopTestController.testAop()")
    public String testAop() {
        aopTestService.showAction();
        return "success";
    }
}
