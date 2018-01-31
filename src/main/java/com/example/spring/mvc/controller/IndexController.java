package com.example.spring.mvc.controller;

import com.example.spring.mvc.aop.business.AopTarget;
import com.example.spring.mvc.service.AopTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * index controller of app
 *
 * @author: LiHongxing
 * @date: Create in 2018-01-23 11:05
 * @modefied:
 */
@RestController("index")
public class IndexController {

    @RequestMapping
    public String index() {
        AopTarget aopTarget = new AopTarget();
        aopTarget.method1();
        return "over";
    }
}
