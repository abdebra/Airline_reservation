package com.example.airline_reservation;

import com.example.airline_reservation.AOP.config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AirlineReservationApplication {

    public static void main(String[] args) {

//        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);


        SpringApplication.run(AirlineReservationApplication.class, args);

        System.out.println("sfdsf");
    }

}
