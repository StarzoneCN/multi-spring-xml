package com.example.spring.mvc.aop.interceptor;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;

/**
 * @author: LiHongxing
 * @date: Create in 2018-01-23 11:42
 * @modefied:
 */
public class CustomMethodBeforeAdviceInterceptor extends MethodBeforeAdviceInterceptor {
    /**
     * Create a new MethodBeforeAdviceInterceptor for the given advice.
     *
     * @param advice the MethodBeforeAdvice to wrap
     */
    public CustomMethodBeforeAdviceInterceptor(MethodBeforeAdvice advice) {
        super(advice);
    }
}
