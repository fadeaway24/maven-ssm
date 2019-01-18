package com.ssm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 　　* @Description: TODO
 * 　　* @author gebp
 * 　　* @date 2018/9/29 10:20
 *
 */
@Aspect
@Component
public class LogAspect {
    //定义切点
    @Pointcut("execution(* com.ssm.service.*.*(..))")
    public void serviceAspect(){
    }

    @Before("serviceAspect()")
    public void before(){
        System.out.println("前置通知");
    }

    @After("serviceAspect()")
    public void after(){
        System.out.println("后置通知");
    }

    @Around("serviceAspect()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("切面开始");
        Object result = joinPoint.proceed();
        System.out.println("切面结束");
        return result;
    }
}
