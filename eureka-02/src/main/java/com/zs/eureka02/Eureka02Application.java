package com.zs.eureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zs
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class Eureka02Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka02Application.class, args);
    }

}
