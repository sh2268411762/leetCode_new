/*
package com.gdpph.o1kuaixue.demo.chapter20.section5.section1;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

*/
/**
 * @author 零壹学堂
 *//*

@Aspect
@Component
public class WebLogAspect {

    private static final Logger LOGGER = Logger.getLogger(WebLogAspect.class);

    // 使用@Pointcut 注解定义execution切入点表达式，定义在com.demo.aop.controller包或者子包里的任意类的任意方法
    @Pointcut("execution(public * com.demo.aop.controller..*.*(..))")
    public void logPointCut(){}

    // 前置通知，在目标方法执行之前执行
    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest req = attributes.getRequest();

        // 打印请求信息
        LOGGER.info("url: " + req.getRequestURL().toString());
        LOGGER.info("http method: " + req.getMethod());
        LOGGER.info("invoke method: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        LOGGER.info("request params: " + Arrays.toString(joinPoint.getArgs()));
    }

    // 后置通知，在目标方法执行之后执行
    @AfterReturning(returning = "res", pointcut = "logPointCut()")
    public void doAfterReturning(Object res) {

        // 打印响应信息
        LOGGER.info("http response: " + res);
    }
}
*/
