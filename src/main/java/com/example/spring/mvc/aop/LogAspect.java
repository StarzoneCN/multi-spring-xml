package com.example.spring.mvc.aop;

import com.example.spring.mvc.annotation.RequestLogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    public LogAspect(){
        super();
        System.out.println("----------------------init LogAspect----------------------");
    }

    @Before("within(com.example.spring.mvc..*) && @annotation(rl)")
    public void beforeAdvice(JoinPoint joinPoint, RequestLogger rl){
        System.out.println(rl.description());;
        System.out.println("--------------beforeAdvice--------------");
    }
}
