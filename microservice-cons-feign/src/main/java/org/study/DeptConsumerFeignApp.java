package org.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Kai.Chi
 * @date 2019/1/9 9:54
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
/*
* */
@EnableFeignClients(basePackages = {"org.study"})

/**这里设置包扫描主要为了扫描DeptClientService
*
**/
@ComponentScan("org.study")
public class DeptConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp.class,args);
    }
}
