package com.example.airline_reservation.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.System.out;

@Aspect
//@ControllerAdvice
@Component
public class advisor {

    @Pointcut("execution(public * com.example.airline_reservation.Web.AirlineController.save*(..))")
    public void h1() {
    }
    @Before("h1()")
    public void beginAdvise(JoinPoint joinPoint) {
        System.out.println("please provide Accurate information of "+joinPoint.getSignature().getName());
    }
    @After("h1()")  //<-- Links advice + Pointcuts = Advice
    public void EndAdvise(JoinPoint joinPoint) {
        System.out.println("Thank you Successfully Added..."+joinPoint.getTarget().getClass());

    }


}
