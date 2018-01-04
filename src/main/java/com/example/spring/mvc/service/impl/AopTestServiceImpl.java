package com.example.spring.mvc.service.impl;

import com.example.spring.mvc.service.AopTestService;
import org.springframework.stereotype.Service;

@Service
public class AopTestServiceImpl implements AopTestService {
    @Override
    public void showAction() {
        System.out.println("this is showAction method!");
    }
}
