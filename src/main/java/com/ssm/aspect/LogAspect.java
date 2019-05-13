package com.ssm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/9/29 10:20
 *
 */
@Aspect
@Component
@Order(5)
public class LogAspect {
    //定义切点
    @Pointcut("execution(* com.ssm.service.*.*(..))")
    public void serviceAspect(){
    }

    @Before("serviceAspect()")
    public void before(){
        System.out.println("[Aspect2]: before advice...");
    }

    @After("serviceAspect()")
    public void after(){
        System.out.println("[Aspect2]: after advice...");
    }

    @Around("serviceAspect()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[Aspect2]: around advice begin...");
        Object result = joinPoint.proceed();
        System.out.println("[Aspect2]: around advice end...");
        return result;
    }

    @AfterReturning("serviceAspect()")
    public void myAfterReturningAdvice(){
        System.out.println("[Aspect2]: return advice...");
    }

    @AfterThrowing("serviceAspect()")
    public void myAfterThrowingAdvice(){
        System.out.println("[Aspect2]: throwing advice...");
    }
}
