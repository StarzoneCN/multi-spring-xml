package com.example.multi.spring;

import com.example.spring.mvc.service.AopTestService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AopTest {

    public static void main(String[] args) {
        BeanFactory factory = new FileSystemXmlApplicationContext("E:\\ideaWorkDir\\test\\multi-spring-xml\\src\\main\\webapp\\WEB-INF/dispatcher-servlet.xml");
        AopTestService aopTestService = (AopTestService) factory.getBean("aopTestService");
        aopTestService.showAction();
    }
}
