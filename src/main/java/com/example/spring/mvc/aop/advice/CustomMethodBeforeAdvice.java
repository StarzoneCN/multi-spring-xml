package com.example.spring.mvc.aop.advice;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

import java.lang.reflect.Method;

/**
 * 测试BeforeAdvice
 *
 * @author: LiHongxing
 * @date: Create in 2018-01-23 11:01
 * @modefied:
 */
public class CustomMethodBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
