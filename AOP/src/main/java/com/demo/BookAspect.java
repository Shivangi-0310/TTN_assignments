package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class BookAspect {
    @Before("execution(void *(..))")
    void beforeAllMethods() {
        System.out.println("Running before all methods of Book class");
    }

    @Around("execution(void getCurrentDiscount())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before execution of method");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after executing method");
    }

    @AfterThrowing(pointcut = "execution(String ioException())", throwing = "ex")
    void afterReturningAdvice(IOException ex) {
        System.out.println("Running AfterThrowing Exception>>>>>>>>>>>>>> " + ex);
    }

    @Around("within(com.demo.Book)")
    void aroundAdvice1(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Within before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Within after");
    }

    @Around("bean(book)")
    void aroundAdvice2(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Bean before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Bean after");
    }

    @Around("args(int)")
    void aroundAdvice3(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Args before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Args after");
    }

    @Around("this(com.demo.Book)")
    void aroundAdvice4(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("This before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("This after");
    }

    @Pointcut("execution(String statement())")
    void displayPointcut() {
    }

    @After("displayPointcut()")
    void afterDisplayPointCut() {
        System.out.println("doing something on pointcut method");
    }

    @Before("execution(Float getNumber())")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Accessing the properties of jointCut before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
