package com.example.examenf.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.ObjectInputFilter;
import java.util.logging.Logger;
@Component
@Aspect
@Slf4j
public class config {
    private static final Logger logger = Logger.getLogger(config.class.getName());
    @AfterReturning("execution(* com.example.examenf.*.*.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        logger.info("hhhhhhhhhhhh " + methodName);
    }
}
