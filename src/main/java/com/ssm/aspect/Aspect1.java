package com.ssm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(6)
public class Aspect1 {

    //定义切点
    @Pointcut("execution(* com.ssm.service.*.*(..))")
    public void myPoint(){}

    //定义通知
    @Before("myPoint()")
    public void myBeforeAdvice(){
        System.out.println("[Aspect1]: before advice...");
    }

    @Around("myPoint()")
    public Object myAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[Aspect1]: around advice begin...");
        Object result = joinPoint.proceed();
        System.out.println("[Aspect1]: around advice end...");
        return result;
    }

    @After("myPoint()")
    public void myAfterAdvice(){
        System.out.println("[Aspect1]: after advice...");
    }

    @AfterReturning("myPoint()")
    public void myAfterReturningAdvice(){
        System.out.println("[Aspect1]: return advice...");
    }

    @AfterThrowing("myPoint()")
    public void myAfterThrowingAdvice(){
        System.out.println("[Aspect1]: throwing advice...");
    }
}
