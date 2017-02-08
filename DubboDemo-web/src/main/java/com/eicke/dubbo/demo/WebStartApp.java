package com.eicke.dubbo.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liujinyan on 2017/2/8.
 */
@SpringBootApplication(scanBasePackages="com.eicke.dubbo.demo.controller")
@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
public class WebStartApp {
    private static Logger logger = Logger.getLogger(WebStartApp.class);
    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(WebStartApp.class, args);
        System.out.println("============= SpringBoot web Start Success =============");
    }
}
