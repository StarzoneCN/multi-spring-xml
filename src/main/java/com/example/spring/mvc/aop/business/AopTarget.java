package com.example.spring.mvc.aop.business;

import com.example.spring.mvc.service.AopTargetService;
import org.springframework.stereotype.Service;

/**
 * @author: LiHongxing
 * @date: Create in 2018-01-23 11:19
 * @modefied:
 */
@Service
public class AopTarget implements AopTargetService {

    @Override
    public void method1() {
        System.out.println("AopTarget.method1");
    }
}
