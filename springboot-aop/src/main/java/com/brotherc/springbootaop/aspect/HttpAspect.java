package com.brotherc.springbootaop.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author: Brotherc
 * @date: 2019/7/15 18:05
 */
@Aspect
@Component
public class HttpAspect {
    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

/*    @Before("execution(public * com.brotherc.springbootaop.controller.CatController.save(..))")
    public void doBefore() {
        System.out.println("before...");
    }*/

/*    @After("execution(public * com.brotherc.springbootaop.controller.CatController.save(..))")
    public void doAfter() {
        System.out.println("after...");
    }*/

    @Pointcut("execution(public * com.brotherc.springbootaop.controller.CatController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // url
        logger.info("url={}", request.getRequestURL());
        // method
        logger.info("method={}", request.getMethod());
        // ip
        logger.info("ip={}", request.getRemoteAddr());
        // 类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // 参数
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("after...");
    }

    @AfterReturning(returning = "o", pointcut = "log()")
    public void doAfterReturning(Object o) {
        logger.info("response={}", o);
    }
}