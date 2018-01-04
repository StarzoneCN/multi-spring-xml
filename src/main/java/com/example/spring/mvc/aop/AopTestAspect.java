package com.example.spring.mvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AopTestAspect {

    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("--------------beforeAdvice--------------");
    }

    public void afterFinallyAdvice(JoinPoint joinPoint){
        System.out.println("--------------afterFinallyAdvice--------------");
    }

    public void aroundAdvice(ProceedingJoinPoint pjp){
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("--------------aroundAdvice--------------");
    }
}
