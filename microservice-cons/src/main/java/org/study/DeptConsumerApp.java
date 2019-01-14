package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Kai.Chi
 * @date 2019/1/9 9:54
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class,args);
    }
}
